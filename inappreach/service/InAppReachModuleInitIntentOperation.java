package com.google.android.gms.inappreach.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.inappreach.service.rps.FetchAccountMessagesTaskBoundService;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.fryl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class InAppReachModuleInitIntentOperation extends apzs {
    static {
        ausn.b("InAppReachModuleInit", auid.INAPP_REACH);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (fryl.e()) {
            Context applicationContext = getApplicationContext();
            String str = FetchAccountMessagesTaskBoundService.a;
            casd a = casd.a(applicationContext);
            cate cateVar = new cate();
            cateVar.j(cata.a(fryl.a.lK().a()));
            cateVar.w(FetchAccountMessagesTaskBoundService.a);
            cateVar.t("PERIODIC_FETCH_TASK");
            cateVar.g(1);
            cateVar.v(1);
            a.f(cateVar.b());
        }
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
    }
}
