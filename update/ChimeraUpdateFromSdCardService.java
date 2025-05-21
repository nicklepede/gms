package com.google.android.gms.update;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.asej;
import defpackage.asot;
import defpackage.ctbd;
import defpackage.dhcn;
import defpackage.dhdc;
import defpackage.ejhf;
import defpackage.iln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ChimeraUpdateFromSdCardService extends Service {
    public static final asot a = asot.b("CmaUpdateFromSdCardS", asej.OTA);
    private static final ctbd d = ctbd.b();
    public StateWatcher b;
    public volatile int c;
    private dhdc e;

    public final void a() {
        sendBroadcast(new Intent("com.google.android.gms.update.UpdateFromSdCard.STATUS_CHANGED"));
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!intent.getAction().equals("com.google.android.gms.update.BIND_SDCARD_SERVICE")) {
            ((ejhf) ((ejhf) a.j()).ah((char) 11974)).x("onBind for sdcard is called with an unexpected intent, returning null.");
            return null;
        }
        dhdc dhdcVar = this.e;
        dhdcVar.asBinder();
        return dhdcVar;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        StateWatcher stateWatcher = new StateWatcher(this, new dhcn(this));
        this.c = 1;
        this.b = stateWatcher;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("com.google.android.checkin.CHECKIN_COMPLETE");
        Context context = stateWatcher.a;
        iln.b(context, stateWatcher, intentFilter, 2);
        context.getSharedPreferences("update", 0).edit().putInt("battery_state", stateWatcher.b).apply();
        this.e = new dhdc(this);
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
                    ((ejhf) ((ejhf) a.i()).ah((char) 11978)).x("Unknown battery state, cannot handle!");
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
