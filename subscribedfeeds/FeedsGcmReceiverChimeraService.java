package com.google.android.gms.subscribedfeeds;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Pair;
import com.google.android.chimera.Service;
import com.google.android.gms.subscribedfeeds.FeedsGcmReceiverChimeraService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auvf;
import defpackage.caqb;
import defpackage.caqh;
import defpackage.dhfi;
import defpackage.dzzw;
import defpackage.fvfp;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FeedsGcmReceiverChimeraService extends Service {
    public static final ausn a = ausn.b("SubscribedFeeds", auid.SUBSCRIBED_FEEDS);
    private dhfi d;
    private int e;
    private final Executor b = caqb.b.c(new auvf("SubscribedFeeds-messages"), caqh.HIGH_SPEED);
    private final ScheduledExecutorService c = caqb.b.i(new auvf("SubscribedFeeds-timeout"), caqh.LOW_POWER);
    private int f = 0;

    public final synchronized void a() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            stopSelf(this.e);
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.d = new dhfi(this.c, new dzzw(this, "STREAMZ_SUBSCRIBEDFEEDS"));
        if (fvfp.a.lK().d()) {
            this.d.a(fvfp.b());
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this) {
            this.e = i2;
            this.f++;
        }
        this.b.execute(new Runnable() { // from class: dhfj
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent2 = intent;
                String stringExtra = intent2.getStringExtra("collapse_key");
                String stringExtra2 = intent2.getStringExtra("sync_hint");
                boolean isEmpty = TextUtils.isEmpty(stringExtra);
                FeedsGcmReceiverChimeraService feedsGcmReceiverChimeraService = FeedsGcmReceiverChimeraService.this;
                if (!isEmpty) {
                    String[] split = TextUtils.split(stringExtra, "_");
                    Pair pair = null;
                    if (split.length == 2) {
                        try {
                            pair = Pair.create(split[0], Integer.valueOf(Integer.parseInt(split[1])));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    if (pair != null) {
                        ContentResolver contentResolver = feedsGcmReceiverChimeraService.getContentResolver();
                        Uri uri = dhgm.a;
                        Cursor query = contentResolver.query(uri, null, "_id=?", new String[]{((Integer) pair.second).toString()}, null);
                        if (query != null) {
                            while (query.moveToNext()) {
                                try {
                                    String string = query.getString(query.getColumnIndexOrThrow("authority"));
                                    String string2 = query.getString(query.getColumnIndexOrThrow("feed"));
                                    String string3 = query.getString(query.getColumnIndexOrThrow("_sync_account"));
                                    String string4 = query.getString(query.getColumnIndexOrThrow("_sync_account_type"));
                                    Account account = new Account(string3, string4);
                                    EventLog.writeEvent(2742, string);
                                    if (ContentResolver.getMasterSyncAutomatically() && ContentResolver.getSyncAutomatically(account, string)) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("feed", string2);
                                        if (stringExtra2 != null) {
                                            bundle.putString("hint", stringExtra2);
                                        }
                                        ContentResolver.requestSync(account, string, bundle);
                                    }
                                    ((eluo) ((eluo) FeedsGcmReceiverChimeraService.a.j()).ai(11010)).P("received tickle for a disabled feed, removing feed and forcing a subscribedfeeds sync: account %s, feed %s", string3, string2);
                                    feedsGcmReceiverChimeraService.getContentResolver().delete(uri, "_sync_account=? and _sync_account_type=? and authority=?", new String[]{string3, string4, string});
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putBoolean("ignore_settings", true);
                                    ContentResolver.requestSync(account, "com.google.android.gms.subscribedfeeds", bundle2);
                                } finally {
                                    query.close();
                                }
                            }
                        } else {
                            ((eluo) ((eluo) FeedsGcmReceiverChimeraService.a.j()).ai((char) 11012)).B("received tickle for non-existent feed: %s", stringExtra);
                            EventLog.writeEvent(2742, "unknown");
                        }
                    }
                }
                feedsGcmReceiverChimeraService.a();
            }
        });
        return 3;
    }
}
