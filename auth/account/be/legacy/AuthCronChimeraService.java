package com.google.android.gms.auth.account.be.legacy;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.asmf;
import defpackage.brup;
import defpackage.byjl;
import defpackage.bykm;
import defpackage.bykx;
import defpackage.byky;
import defpackage.byln;
import defpackage.dvni;
import defpackage.edkl;
import defpackage.edkm;
import defpackage.ejxz;
import defpackage.ejya;
import defpackage.ejyc;
import defpackage.enss;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fkkz;
import defpackage.vba;
import defpackage.vdx;
import defpackage.vdy;
import defpackage.vfv;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthCronChimeraService extends GmsTaskChimeraService {
    static void d(edkl edklVar, edkm edkmVar, String str) {
        edkmVar.b(str);
        edklVar.e(str);
    }

    public static final void e(Context context) {
        byjl a = byjl.a(context);
        dvni dvniVar = vfv.a;
        long c = fkkz.c();
        byky a2 = bykx.a(0, 30, (int) fkkz.b());
        bykm bykmVar = new bykm();
        bykmVar.j = "com.google.android.gms.auth.account.be.legacy.AuthCronService";
        bykmVar.a = c;
        bykmVar.t("auth_droidguard_recurring_run");
        bykmVar.b = (-1) + c;
        bykmVar.v(2);
        bykmVar.p = true;
        bykmVar.t = a2;
        bykmVar.x(0, 1);
        bykmVar.g(0);
        a.f(bykmVar.b());
    }

    public static final void f(long j, int i) {
        fecj v = ejya.a.v();
        ejxz ejxzVar = ejxz.AUTH_CRON_SERVICE_EVENT;
        if (!v.b.L()) {
            v.U();
        }
        ejya ejyaVar = (ejya) v.b;
        ejyaVar.e = ejxzVar.aw;
        ejyaVar.b |= 1;
        fecj v2 = ejyc.a.v();
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        ejyc ejycVar = (ejyc) fecpVar;
        ejycVar.b |= 2;
        ejycVar.d = elapsedRealtime;
        if (!fecpVar.L()) {
            v2.U();
        }
        ejyc ejycVar2 = (ejyc) v2.b;
        ejycVar2.c = i - 1;
        ejycVar2.b |= 1;
        ejyc ejycVar3 = (ejyc) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        ejya ejyaVar2 = (ejya) v.b;
        ejycVar3.getClass();
        ejyaVar2.u = ejycVar3;
        ejyaVar2.b |= 1048576;
        brup.v().f((ejya) v.Q());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        String str = bylnVar.a;
        if ("buffered_logs_update".equals(str)) {
            getApplicationContext();
            d(edkl.a(getApplicationContext()), new edkm(getApplicationContext(), "ANDROID_AUTH"), vba.b(getApplicationContext()));
            getApplicationContext();
            d(edkl.a(getApplicationContext()), new edkm(getApplicationContext(), "KIDS_SUPERVISION"), vba.c(getApplicationContext()));
            return 0;
        }
        if (!"auth_droidguard_recurring_run".equals(str)) {
            Log.w("Auth", String.format(Locale.US, "[AuthCronChimeraService] Unknown tag %s", str));
            return 2;
        }
        enss submit = new asmf(1, 9).submit(new vdx(this));
        try {
            dvni dvniVar = vfv.a;
            return ((Integer) submit.get((int) fkkz.a.a().c(), TimeUnit.SECONDS)).intValue();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return 1;
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
        vdy.a.b(this);
    }
}
