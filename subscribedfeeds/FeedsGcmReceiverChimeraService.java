package com.google.android.gms.subscribedfeeds;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Pair;
import com.google.android.chimera.Service;
import com.google.android.gms.subscribedfeeds.FeedsGcmReceiverChimeraService;
import defpackage.asej;
import defpackage.asot;
import defpackage.asrl;
import defpackage.byhj;
import defpackage.byhp;
import defpackage.deuf;
import defpackage.dxnw;
import defpackage.fskq;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class FeedsGcmReceiverChimeraService extends Service {
    public static final asot a = asot.b("SubscribedFeeds", asej.SUBSCRIBED_FEEDS);
    private deuf d;
    private int e;
    private final Executor b = byhj.b.c(new asrl("SubscribedFeeds-messages"), byhp.HIGH_SPEED);
    private final ScheduledExecutorService c = byhj.b.i(new asrl("SubscribedFeeds-timeout"), byhp.LOW_POWER);
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
        this.d = new deuf(this.c, new dxnw(this, "STREAMZ_SUBSCRIBEDFEEDS"));
        if (fskq.a.a().d()) {
            this.d.a(fskq.b());
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this) {
            this.e = i2;
            this.f++;
        }
        this.b.execute(new Runnable() { // from class: deug
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
                        Cursor query = feedsGcmReceiverChimeraService.getContentResolver().query(devj.a, null, "_id=?", new String[]{((Integer) pair.second).toString()}, null);
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
                                    ((ejhf) ((ejhf) FeedsGcmReceiverChimeraService.a.j()).ah(11007)).P("received tickle for a disabled feed, removing feed and forcing a subscribedfeeds sync: account %s, feed %s", string3, string2);
                                    feedsGcmReceiverChimeraService.getContentResolver().delete(devj.a, "_sync_account=? and _sync_account_type=? and authority=?", new String[]{string3, string4, string});
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putBoolean("ignore_settings", true);
                                    ContentResolver.requestSync(account, "com.google.android.gms.subscribedfeeds", bundle2);
                                } finally {
                                    query.close();
                                }
                            }
                        } else {
                            ((ejhf) ((ejhf) FeedsGcmReceiverChimeraService.a.j()).ah((char) 11009)).B("received tickle for non-existent feed: %s", stringExtra);
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
