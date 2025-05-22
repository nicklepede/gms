package com.google.android.gms.mobiledataplan.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.cgkb;
import defpackage.cgkc;
import defpackage.cgkd;
import defpackage.cgli;
import defpackage.cglp;
import defpackage.cgzp;
import defpackage.elhz;
import defpackage.ftax;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MobileDataPlanApiChimeraService extends bzot {
    private static final elhz b = elhz.K("android.permission-group.PHONE", "android.permission-group.STORAGE");
    private static final ausn c = ausn.b("MobileDataPlan", auid.MOBILE_DATA_PLAN);
    public static final elhz a = elhz.N("com.google.android.youtube", "com.google.android.apps.youtube.unplugged", "com.google.android.apps.subscriptions.red", "com.android.vending", "com.google.android.apps.youtube.music");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MobileDataPlanApiChimeraService() {
        /*
            r7 = this;
            elhz r3 = com.google.android.gms.mobiledataplan.service.MobileDataPlanApiChimeraService.b
            elhz r6 = com.google.android.gms.mobiledataplan.service.MobileDataPlanApiChimeraService.a
            r4 = 0
            r5 = 10
            r1 = 158(0x9e, float:2.21E-43)
            java.lang.String r2 = "com.google.android.gms.mobiledataplan.service.START"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            ausn r0 = com.google.android.gms.mobiledataplan.service.MobileDataPlanApiChimeraService.c
            java.util.logging.Level r1 = defpackage.cgzp.h()
            eluo r1 = r0.f(r1)
            java.lang.String r2 = "Service is created."
            r1.x(r2)
            java.util.logging.Level r1 = defpackage.cgzp.h()
            eluo r0 = r0.f(r1)
            java.lang.String r1 = "Service visibility is: %d, with allowList: %s"
            r2 = 0
            r0.G(r1, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mobiledataplan.service.MobileDataPlanApiChimeraService.<init>():void");
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        if (ftax.G()) {
            cgli.a().c(this);
        }
        bzozVar.c(new cglp(l(), getServiceRequest.f, getServiceRequest.p));
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        c.f(cgzp.h()).x("Service is being destroyed.");
        cgkb c2 = cgkb.c();
        synchronized (cgkb.b) {
            cgkc cgkcVar = c2.d;
            synchronized (cgkcVar.b) {
                cgkd cgkdVar = cgkcVar.a;
                cgkdVar.getDatabaseName();
                cgkdVar.close();
            }
            cgkb.a = null;
        }
        super.onDestroy();
    }
}
