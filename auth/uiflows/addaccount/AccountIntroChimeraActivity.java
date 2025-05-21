package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.aant;
import defpackage.adea;
import defpackage.adeb;
import defpackage.adek;
import defpackage.adip;
import defpackage.adir;
import defpackage.adle;
import defpackage.adlg;
import defpackage.arka;
import defpackage.asej;
import defpackage.asop;
import defpackage.asot;
import defpackage.edeq;
import defpackage.edgl;
import defpackage.edjc;
import defpackage.edjs;
import defpackage.fkdk;
import defpackage.fkdo;
import defpackage.qfn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountIntroChimeraActivity extends qfn {
    static {
        asot.c("Auth", asej.AUTH_ACCOUNT_DATA, "AccountIntroChimeraActivity");
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fkdk.d()) {
            int i = edjs.a;
            if (edeq.z(this)) {
                edjc.e(getContainerActivity(), 3);
            }
        }
        Intent intent = getIntent();
        adip adipVar = (adip) adir.c.j(intent);
        Context a = AppContextProvider.a();
        adea a2 = adeb.a();
        a2.d(a);
        a2.a = new aant(AppContextProvider.a());
        a2.b = new adek(AppContextProvider.a());
        AppContextProvider.a();
        a2.h(arka.g());
        a2.c = adipVar.b;
        a2.d = adipVar.a;
        a2.j(adipVar.v);
        a2.f(adipVar.w);
        a2.b(adipVar.d);
        a2.p(adipVar.e);
        a2.l(adipVar.g);
        a2.g = adipVar.h;
        a2.h = adipVar.i;
        a2.i = adipVar.j;
        a2.c(adipVar.k);
        a2.e = adipVar.l;
        a2.j = adipVar.m;
        a2.i(adipVar.n);
        a2.n(adipVar.o);
        a2.m(adipVar.p);
        a2.k(adipVar.q);
        a2.k = adipVar.r;
        a2.l = adipVar.s;
        a2.m = adipVar.t;
        a2.o(adipVar.u);
        a2.f = adipVar.f;
        a2.e(adipVar.z);
        a2.g(adipVar.A);
        if (asop.c(fkdo.a.a().a())) {
            a2.j(edgl.b(intent));
        }
        AddAccountController addAccountController = new AddAccountController(a2.a(), true, null, null, false, null, null, false, false, false, false, null, false, null);
        adle a3 = addAccountController.a(null);
        Intent intent2 = a3.b;
        edgl.a(getIntent(), intent2);
        adlg.y(intent2, addAccountController, a3.a);
        startActivity(intent2.addFlags(33554432));
        finish();
    }
}
