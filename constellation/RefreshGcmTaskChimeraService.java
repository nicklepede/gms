package com.google.android.gms.constellation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.auad;
import defpackage.aupp;
import defpackage.aupq;
import defpackage.auzl;
import defpackage.avae;
import defpackage.avcg;
import defpackage.avcp;
import defpackage.avpz;
import defpackage.avqj;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.fpcw;
import defpackage.fpeg;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class RefreshGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final auad a = avqj.a("refresh_gcm_service");
    public avpz b;

    public static void d(Context context) {
        if (!avcg.e()) {
            a.j("Cellular network signals disabled.", new Object[0]);
            return;
        }
        long l = fpcw.a.lK().l();
        long j = (long) (l * 0.05d);
        long max = Math.max(0L, l - j);
        long max2 = Math.max(1 + max, j + l);
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.constellation.checker.RefreshGcmTaskService";
        catbVar.t("CELL_NETWORK");
        catbVar.e(max, max2);
        catbVar.v(1);
        casd.a(context).f(catbVar.b());
        a.j("Network signals listener scheduled with delay %ds.", Long.valueOf(l));
    }

    public static void e(Context context, long j, boolean z) {
        long max = Math.max(0L, (j - System.currentTimeMillis()) / 1000);
        long max2 = Math.max(1 + max, (fpeg.d() / 1000) + max);
        a.j("schedule refresh sync task. The service will be kicked off after %d seconds till %d seconds", Long.valueOf(max), Long.valueOf(max2));
        Bundle bundle = new Bundle();
        bundle.putBoolean("isRetrySync", z);
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.constellation.checker.RefreshGcmTaskService";
        catbVar.t("com.google.android.gms.constellation.checker.RefreshGcmTaskService.tag");
        catbVar.e(max, max2);
        catbVar.y(0, 1);
        catbVar.v(1);
        catbVar.p = true;
        catbVar.u = bundle;
        casd.a(context).f(catbVar.b());
    }

    public static void f(Context context) {
        avcp.i(context);
        if (avcp.j(context).isEmpty()) {
            a.j("Service state signals disabled for all subIds.", new Object[0]);
            return;
        }
        long r = fpcw.a.lK().r();
        long j = (long) (r * 0.05d);
        long max = Math.max(0L, r - j);
        long max2 = Math.max(1 + max, j + r);
        catb catbVar = new catb();
        catbVar.j = "com.google.android.gms.constellation.checker.RefreshGcmTaskService";
        catbVar.t("SERVICE_STATE");
        catbVar.e(max, max2);
        catbVar.v(1);
        casd.a(context).f(catbVar.b());
        a.j("Service state signals listener scheduled with delay %ds.", Long.valueOf(r));
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        char c;
        String str = caufVar.a;
        auad auadVar = a;
        auadVar.j("On run task %s", str);
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
            Bundle bundle = caufVar.b;
            boolean z = bundle != null && bundle.getBoolean("isRetrySync", false);
            auadVar.h("Running refresh sync", new Object[0]);
            this.b = avpz.a(this);
            UUID randomUUID = UUID.randomUUID();
            this.b.I(randomUUID, z ? 12 : 7);
            aupq aupqVar = new aupq(10);
            auzl.h();
            auzl.g(getApplicationContext(), randomUUID, true == z ? 10 : 2, new avae(this, new aupp(aupqVar), randomUUID, z));
        } else if (c == 1) {
            avcg.a().b();
            d(getApplicationContext());
        } else if (c == 2) {
            avcp.i(getApplicationContext()).e();
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
