package com.google.android.gms.mobiledataplan.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ceau;
import defpackage.ceav;
import defpackage.ceaw;
import defpackage.cecb;
import defpackage.ceci;
import defpackage.ceqi;
import defpackage.eiuu;
import defpackage.fqhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MobileDataPlanApiChimeraService extends bxgd {
    private static final eiuu b = eiuu.K("android.permission-group.PHONE", "android.permission-group.STORAGE");
    private static final asot c = asot.b("MobileDataPlan", asej.MOBILE_DATA_PLAN);
    public static final eiuu a = eiuu.N("com.google.android.youtube", "com.google.android.apps.youtube.unplugged", "com.google.android.apps.subscriptions.red", "com.android.vending", "com.google.android.apps.youtube.music");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MobileDataPlanApiChimeraService() {
        /*
            r7 = this;
            eiuu r3 = com.google.android.gms.mobiledataplan.service.MobileDataPlanApiChimeraService.b
            eiuu r6 = com.google.android.gms.mobiledataplan.service.MobileDataPlanApiChimeraService.a
            r4 = 0
            r5 = 10
            r1 = 158(0x9e, float:2.21E-43)
            java.lang.String r2 = "com.google.android.gms.mobiledataplan.service.START"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            asot r0 = com.google.android.gms.mobiledataplan.service.MobileDataPlanApiChimeraService.c
            java.util.logging.Level r1 = defpackage.ceqi.h()
            ejhf r1 = r0.f(r1)
            java.lang.String r2 = "Service is created."
            r1.x(r2)
            java.util.logging.Level r1 = defpackage.ceqi.h()
            ejhf r0 = r0.f(r1)
            java.lang.String r1 = "Service visibility is: %d, with allowList: %s"
            r2 = 0
            r0.G(r1, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mobiledataplan.service.MobileDataPlanApiChimeraService.<init>():void");
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        if (fqhf.G()) {
            cecb.a().c(this);
        }
        bxgjVar.c(new ceci(l(), getServiceRequest.f, getServiceRequest.p));
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        c.f(ceqi.h()).x("Service is being destroyed.");
        ceau c2 = ceau.c();
        synchronized (ceau.b) {
            ceav ceavVar = c2.d;
            synchronized (ceavVar.b) {
                ceaw ceawVar = ceavVar.a;
                ceawVar.getDatabaseName();
                ceawVar.close();
            }
            ceau.a = null;
        }
        super.onDestroy();
    }
}
