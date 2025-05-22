package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.acnt;
import defpackage.afec;
import defpackage.afed;
import defpackage.afem;
import defpackage.afiv;
import defpackage.afix;
import defpackage.afll;
import defpackage.afln;
import defpackage.atmp;
import defpackage.atzb;
import defpackage.auid;
import defpackage.ausj;
import defpackage.ausn;
import defpackage.efrl;
import defpackage.eftg;
import defpackage.efvx;
import defpackage.efwn;
import defpackage.fmtw;
import defpackage.fmua;
import defpackage.ryr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountIntroChimeraActivity extends ryr {
    static {
        ausn.c("Auth", auid.AUTH_ACCOUNT_DATA, "AccountIntroChimeraActivity");
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fmtw.d()) {
            int i = efwn.a;
            if (efrl.z(this)) {
                efvx.e(getContainerActivity(), 3);
            }
        }
        Intent intent = getIntent();
        afiv afivVar = (afiv) afix.c.j(intent);
        Context a = AppContextProvider.a();
        afec a2 = afed.a();
        a2.d(a);
        a2.a = new acnt(AppContextProvider.a());
        a2.b = new afem(AppContextProvider.a());
        AppContextProvider.a();
        a2.h(atmp.g());
        a2.c = afivVar.b;
        a2.d = afivVar.a;
        a2.j(afivVar.v);
        a2.f(afivVar.w);
        a2.b(afivVar.d);
        a2.p(afivVar.e);
        a2.l(afivVar.g);
        a2.g = afivVar.h;
        a2.h = afivVar.i;
        a2.i = afivVar.j;
        a2.c(afivVar.k);
        a2.e = afivVar.l;
        a2.j = afivVar.m;
        a2.i(afivVar.n);
        a2.n(afivVar.o);
        a2.m(afivVar.p);
        a2.k(afivVar.q);
        a2.k = afivVar.r;
        a2.l = afivVar.s;
        a2.m = afivVar.t;
        a2.o(afivVar.u);
        a2.f = afivVar.f;
        a2.e(afivVar.z);
        a2.g(afivVar.A);
        if (ausj.c(fmua.a.lK().a())) {
            a2.j(eftg.b(intent));
        }
        AddAccountController addAccountController = new AddAccountController(a2.a(), true, null, null, false, null, null, false, false, false, false, null, false, null);
        afll a3 = addAccountController.a(null);
        Intent intent2 = a3.b;
        Intent intent3 = getIntent();
        atzb.s(intent2);
        eftg.a(intent3, intent2);
        afln.y(intent2, addAccountController, a3.a);
        startActivity(intent2.addFlags(33554432));
        finish();
    }
}
