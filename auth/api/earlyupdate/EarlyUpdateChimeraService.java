package com.google.android.gms.auth.api.earlyupdate;

import defpackage.bxgd;
import j$.util.DesugarCollections;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class EarlyUpdateChimeraService extends bxgd {
    static {
        DesugarCollections.synchronizedMap(new HashMap());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EarlyUpdateChimeraService() {
        /*
            r7 = this;
            java.util.Set r3 = java.util.Collections.EMPTY_SET
            eius r0 = new eius
            r0.<init>()
            java.lang.String r1 = "com.google.android.setupwizard"
            r0.c(r1)
            asnf r1 = defpackage.asng.a
            eiuu r6 = r0.g()
            r4 = 0
            r5 = 9
            r1 = 176(0xb0, float:2.47E-43)
            java.lang.String r2 = "com.google.android.gms.auth.api.earlyupdate.service.START"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.earlyupdate.EarlyUpdateChimeraService.<init>():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (defpackage.fkte.c() == false) goto L15;
     */
    @Override // defpackage.bxgd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a(defpackage.bxgj r6, com.google.android.gms.common.internal.GetServiceRequest r7) {
        /*
            r5 = this;
            java.lang.String r0 = r7.f
            java.lang.String r1 = "com.google.android.setupwizard"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "AuthEarlyUpdate"
            r3 = 0
            if (r1 != 0) goto L32
            java.lang.String r1 = "com.google.android.gms.auth.testapp.earlyupdate"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L32
            java.lang.String r1 = "com.google.android.gms.apitest.earlyupdate"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1e
            goto L32
        L1e:
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = "[EUChimeraService]Invalid call by alien app. Access denied to package: "
            java.lang.String r7 = r4.concat(r7)
            java.lang.String r7 = java.lang.String.format(r7, r1)
            android.util.Log.e(r2, r7)
            goto L54
        L32:
            aqup r1 = defpackage.aqup.d(r5)
            boolean r1 = r1.h(r0)
            if (r1 == 0) goto L3d
            goto L6e
        L3d:
            java.lang.String r1 = "[EUChimeraService]"
            java.lang.String r4 = " is not whitelisted."
            java.lang.String r1 = defpackage.a.a(r0, r1, r4)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r1 = java.lang.String.format(r1, r4)
            android.util.Log.w(r2, r1)
            boolean r1 = defpackage.fkte.c()
            if (r1 != 0) goto L6e
        L54:
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "[EUChimeraService]Package access denied: "
            java.lang.String r7 = r1.concat(r7)
            java.lang.String r7 = java.lang.String.format(r7, r0)
            android.util.Log.e(r2, r7)
            r7 = 16
            r0 = 0
            r6.a(r7, r0)
            return
        L6e:
            yzk r0 = new yzk
            bxgo r1 = r5.l()
            java.lang.String r2 = r7.f
            java.lang.String r7 = r7.p
            r0.<init>(r1, r2, r7)
            r6.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.earlyupdate.EarlyUpdateChimeraService.a(bxgj, com.google.android.gms.common.internal.GetServiceRequest):void");
    }
}
