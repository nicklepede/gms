package com.google.android.gms.update;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cvkh;
import defpackage.djnt;
import defpackage.djoi;
import defpackage.eluo;
import defpackage.ind;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ChimeraUpdateFromSdCardService extends Service {
    public static final ausn a = ausn.b("CmaUpdateFromSdCardS", auid.OTA);
    private static final cvkh d = cvkh.b();
    public StateWatcher b;
    public volatile int c;
    private djoi e;

    public final void a() {
        sendBroadcast(new Intent("com.google.android.gms.update.UpdateFromSdCard.STATUS_CHANGED"));
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!intent.getAction().equals("com.google.android.gms.update.BIND_SDCARD_SERVICE")) {
            ((eluo) ((eluo) a.j()).ai((char) 11977)).x("onBind for sdcard is called with an unexpected intent, returning null.");
            return null;
        }
        djoi djoiVar = this.e;
        djoiVar.asBinder();
        return djoiVar;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        StateWatcher stateWatcher = new StateWatcher(this, new djnt(this));
        this.c = 1;
        this.b = stateWatcher;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("com.google.android.checkin.CHECKIN_COMPLETE");
        Context context = stateWatcher.a;
        ind.b(context, stateWatcher, intentFilter, 2);
        context.getSharedPreferences("update", 0).edit().putInt("battery_state", stateWatcher.b).apply();
        this.e = new djoi(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        StateWatcher stateWatcher = this.b;
        stateWatcher.a.unregisterReceiver(stateWatcher);
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        if (d.a() > 0) {
            stopSelf();
            return 2;
        }
        if (intent == null || !"com.google.android.gms.update.UpdateFromSdCard.VERIFIER_RESULT_CHANGED".equals(intent.getAction())) {
            this.c = 1;
        } else {
            if (intent.getBooleanExtra("verifier_task_result", false)) {
                int i4 = this.b.b;
                if (i4 == 0) {
                    i3 = 4;
                } else if (i4 == 1 || i4 == 2) {
                    i3 = 1040;
                } else {
                    ((eluo) ((eluo) a.i()).ai((char) 11981)).x("Unknown battery state, cannot handle!");
                }
            } else {
                i3 = 263;
            }
            this.c = i3;
        }
        a();
        stopSelf();
        return 2;
    }
}
