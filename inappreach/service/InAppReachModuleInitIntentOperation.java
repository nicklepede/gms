package com.google.android.gms.inappreach.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.inappreach.service.rps.FetchAccountMessagesTaskBoundService;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.fpfb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class InAppReachModuleInitIntentOperation extends anya {
    static {
        asot.b("InAppReachModuleInit", asej.INAPP_REACH);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (fpfb.d()) {
            Context applicationContext = getApplicationContext();
            String str = FetchAccountMessagesTaskBoundService.a;
            byjl a = byjl.a(applicationContext);
            bykm bykmVar = new bykm();
            bykmVar.j(byki.a(fpfb.a.a().a()));
            bykmVar.w(FetchAccountMessagesTaskBoundService.a);
            bykmVar.t("PERIODIC_FETCH_TASK");
            bykmVar.g(1);
            bykmVar.v(1);
            a.f(bykmVar.b());
        }
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
    }
}
