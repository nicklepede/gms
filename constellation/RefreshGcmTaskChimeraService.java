package com.google.android.gms.constellation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.arxo;
import defpackage.aslv;
import defpackage.aslw;
import defpackage.asvp;
import defpackage.aswf;
import defpackage.asyd;
import defpackage.asym;
import defpackage.atlw;
import defpackage.atmg;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.fmlf;
import defpackage.fmml;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class RefreshGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final arxo a = atmg.a("refresh_gcm_service");
    public atlw b;

    public static void d(Context context) {
        if (!asyd.e()) {
            a.j("Cellular network signals disabled.", new Object[0]);
            return;
        }
        long l = fmlf.a.a().l();
        long j = (long) (l * 0.05d);
        long max = Math.max(0L, l - j);
        long max2 = Math.max(1 + max, j + l);
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.constellation.checker.RefreshGcmTaskService";
        bykjVar.t("CELL_NETWORK");
        bykjVar.e(max, max2);
        bykjVar.v(1);
        byjl.a(context).f(bykjVar.b());
        a.j("Network signals listener scheduled with delay %ds.", Long.valueOf(l));
    }

    public static void e(Context context, long j, boolean z) {
        long max = Math.max(0L, (j - System.currentTimeMillis()) / 1000);
        long max2 = Math.max(1 + max, (fmml.d() / 1000) + max);
        a.j("schedule refresh sync task. The service will be kicked off after %d seconds till %d seconds", Long.valueOf(max), Long.valueOf(max2));
        Bundle bundle = new Bundle();
        bundle.putBoolean("isRetrySync", z);
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.constellation.checker.RefreshGcmTaskService";
        bykjVar.t("com.google.android.gms.constellation.checker.RefreshGcmTaskService.tag");
        bykjVar.e(max, max2);
        bykjVar.y(0, 1);
        bykjVar.v(1);
        bykjVar.p = true;
        bykjVar.u = bundle;
        byjl.a(context).f(bykjVar.b());
    }

    public static void f(Context context) {
        asym.i(context);
        if (asym.j(context).isEmpty()) {
            a.j("Service state signals disabled for all subIds.", new Object[0]);
            return;
        }
        long r = fmlf.a.a().r();
        long j = (long) (r * 0.05d);
        long max = Math.max(0L, r - j);
        long max2 = Math.max(1 + max, j + r);
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.constellation.checker.RefreshGcmTaskService";
        bykjVar.t("SERVICE_STATE");
        bykjVar.e(max, max2);
        bykjVar.v(1);
        byjl.a(context).f(bykjVar.b());
        a.j("Service state signals listener scheduled with delay %ds.", Long.valueOf(r));
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        char c;
        String str = bylnVar.a;
        arxo arxoVar = a;
        arxoVar.j("On run task %s", str);
        int hashCode = str.hashCode();
        if (hashCode == -1986036153) {
            if (str.equals("SERVICE_STATE")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != -1222098358) {
            if (hashCode == -729969615 && str.equals("CELL_NETWORK")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("com.google.android.gms.constellation.checker.RefreshGcmTaskService.tag")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            Bundle bundle = bylnVar.b;
            boolean z = bundle != null && bundle.getBoolean("isRetrySync", false);
            arxoVar.h("Running refresh sync", new Object[0]);
            this.b = atlw.a(this);
            UUID randomUUID = UUID.randomUUID();
            this.b.I(randomUUID, z ? 12 : 7);
            aslw aslwVar = new aslw(10);
            asvp.h();
            asvp.g(getApplicationContext(), randomUUID, true == z ? 10 : 2, new aswf(this, new aslv(aslwVar), randomUUID, z));
        } else if (c == 1) {
            asyd.a().b();
            d(getApplicationContext());
        } else if (c == 2) {
            asym.i(getApplicationContext()).e();
            f(getApplicationContext());
        }
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        a.j("onCreate", new Object[0]);
        super.onCreate();
    }
}
