package com.google.android.gms.auth.account.be.legacy;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aupz;
import defpackage.buck;
import defpackage.casd;
import defpackage.cate;
import defpackage.catp;
import defpackage.catq;
import defpackage.cauf;
import defpackage.dxyi;
import defpackage.efxh;
import defpackage.efxi;
import defpackage.emlk;
import defpackage.emll;
import defpackage.emln;
import defpackage.eqgl;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fnbo;
import defpackage.wxa;
import defpackage.wzy;
import defpackage.wzz;
import defpackage.xbw;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthCronChimeraService extends GmsTaskChimeraService {
    static void d(efxh efxhVar, efxi efxiVar, String str) {
        efxiVar.b(str);
        efxhVar.e(str);
    }

    public static final void e(Context context) {
        casd a = casd.a(context);
        dxyi dxyiVar = xbw.a;
        long c = fnbo.c();
        catq a2 = catp.a(0, 30, (int) fnbo.b());
        cate cateVar = new cate();
        cateVar.j = "com.google.android.gms.auth.account.be.legacy.AuthCronService";
        cateVar.a = c;
        cateVar.t("auth_droidguard_recurring_run");
        cateVar.b = (-1) + c;
        cateVar.v(2);
        cateVar.p = true;
        cateVar.t = a2;
        cateVar.x(0, 1);
        cateVar.g(0);
        a.f(cateVar.b());
    }

    public static final void f(long j, int i) {
        fgrc v = emll.a.v();
        emlk emlkVar = emlk.AUTH_CRON_SERVICE_EVENT;
        if (!v.b.L()) {
            v.U();
        }
        emll emllVar = (emll) v.b;
        emllVar.e = emlkVar.ar;
        emllVar.b |= 1;
        fgrc v2 = emln.a.v();
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        emln emlnVar = (emln) fgriVar;
        emlnVar.b |= 2;
        emlnVar.d = elapsedRealtime;
        if (!fgriVar.L()) {
            v2.U();
        }
        emln emlnVar2 = (emln) v2.b;
        emlnVar2.c = i - 1;
        emlnVar2.b |= 1;
        emln emlnVar3 = (emln) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        emll emllVar2 = (emll) v.b;
        emlnVar3.getClass();
        emllVar2.u = emlnVar3;
        emllVar2.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        buck.v().f((emll) v.Q());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        String str = caufVar.a;
        if ("buffered_logs_update".equals(str)) {
            getApplicationContext();
            d(efxh.a(getApplicationContext()), new efxi(getApplicationContext(), "ANDROID_AUTH"), wxa.b(getApplicationContext()));
            getApplicationContext();
            d(efxh.a(getApplicationContext()), new efxi(getApplicationContext(), "KIDS_SUPERVISION"), wxa.c(getApplicationContext()));
            return 0;
        }
        if (!"auth_droidguard_recurring_run".equals(str)) {
            Log.w("Auth", String.format(Locale.US, "[AuthCronChimeraService] Unknown tag %s", str));
            return 2;
        }
        eqgl submit = new aupz(1, 9).submit(new wzy(this));
        try {
            dxyi dxyiVar = xbw.a;
            return ((Integer) submit.get((int) fnbo.a.lK().c(), TimeUnit.SECONDS)).intValue();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return 1;
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        wzz.a.b(this);
    }
}
