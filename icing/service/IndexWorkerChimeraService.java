package com.google.android.gms.icing.service;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.arwm;
import defpackage.blfp;
import defpackage.blfw;
import defpackage.blfx;
import defpackage.bltg;
import defpackage.bltn;
import defpackage.byjl;
import defpackage.byke;
import defpackage.bykv;
import defpackage.bykw;
import defpackage.enkr;
import defpackage.fpaz;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class IndexWorkerChimeraService extends Service {
    public bltn a;

    static {
        TimeUnit.MINUTES.toMillis(10L);
    }

    public final SharedPreferences a() {
        arwm.j();
        return getSharedPreferences("IndexWorkerChimeraService_preferences", 0);
    }

    public final blfp b() {
        arwm.s(this.a);
        return this.a.a();
    }

    public final byjl c() {
        return byjl.a(b().b);
    }

    public final void d(String str) {
        bykw b = blfx.b("maintenance", bykv.j, false, false);
        blfw.c("Scheduling maintenance at %s cadence=%d reason=%s", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US).format(Long.valueOf(System.currentTimeMillis())), Integer.valueOf(((byke) b).a.g), str);
        c().f(b);
        a().edit().putBoolean("maintenance_scheduled", true).apply();
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        blfw.d("%s: Binding with intent %s", "main", intent);
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        blfw.b("%s: IndexWorkerService onCreate", "main");
        if (fpaz.j()) {
            this.a = bltn.c(getApplicationContext());
        }
        super.onCreate();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        blfw.b("%s: IndexWorkerService onDestroy", "main");
        bltn bltnVar = this.a;
        if (bltnVar != null) {
            bltnVar.b();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        blfw.d("%s: IndexWorkerService: onStartCommand with %s", "main", intent);
        if (intent != null && "com.google.android.gms.icing.START_STICKY".equals(intent.getAction())) {
            return 1;
        }
        bltn bltnVar = this.a;
        if (bltnVar == null) {
            blfw.a("IndexWorkerService is unavailable on this device");
            return 2;
        }
        bltnVar.c.h(new bltg(this, enkr.INDEX_WORKER, intent));
        return 2;
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        blfw.b("%s: Unbind", "main");
        return false;
    }
}
