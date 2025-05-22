package com.google.android.gms.icing.service;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.atzb;
import defpackage.bnmh;
import defpackage.bnmo;
import defpackage.bnmp;
import defpackage.bnzy;
import defpackage.boaf;
import defpackage.casd;
import defpackage.casw;
import defpackage.catn;
import defpackage.cato;
import defpackage.epyi;
import defpackage.frug;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class IndexWorkerChimeraService extends Service {
    public boaf a;

    static {
        TimeUnit.MINUTES.toMillis(10L);
    }

    public final SharedPreferences a() {
        atzb.j();
        return getSharedPreferences("IndexWorkerChimeraService_preferences", 0);
    }

    public final bnmh b() {
        atzb.s(this.a);
        return this.a.a();
    }

    public final casd c() {
        return casd.a(b().b);
    }

    public final void d(String str) {
        cato b = bnmp.b("maintenance", catn.j, false, false);
        bnmo.c("Scheduling maintenance at %s cadence=%d reason=%s", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US).format(Long.valueOf(System.currentTimeMillis())), Integer.valueOf(((casw) b).a.g), str);
        c().f(b);
        a().edit().putBoolean("maintenance_scheduled", true).apply();
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        bnmo.d("%s: Binding with intent %s", "main", intent);
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        bnmo.b("%s: IndexWorkerService onCreate", "main");
        if (frug.j()) {
            this.a = boaf.c(getApplicationContext());
        }
        super.onCreate();
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        bnmo.b("%s: IndexWorkerService onDestroy", "main");
        boaf boafVar = this.a;
        if (boafVar != null) {
            boafVar.b();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        bnmo.d("%s: IndexWorkerService: onStartCommand with %s", "main", intent);
        if (intent != null && "com.google.android.gms.icing.START_STICKY".equals(intent.getAction())) {
            return 1;
        }
        boaf boafVar = this.a;
        if (boafVar == null) {
            bnmo.a("IndexWorkerService is unavailable on this device");
            return 2;
        }
        boafVar.c.h(new bnzy(this, epyi.INDEX_WORKER, intent));
        return 2;
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        bnmo.b("%s: Unbind", "main");
        return false;
    }
}
