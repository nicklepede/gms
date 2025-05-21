package com.google.android.gms.auth.proximity.firstparty;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.acpd;
import defpackage.bxgd;
import defpackage.bxgj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DeviceSyncApiChimeraService extends bxgd {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DeviceSyncApiChimeraService() {
        /*
            r8 = this;
            java.lang.String r0 = "android.permission-group.CONTACTS"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.HashSet r4 = defpackage.ejdf.i(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.String r1 = "com.google.android.gmscore.integ.modules.auth.proximity.mobly.snippet"
            r0.add(r1)
            asnf r1 = defpackage.asng.a
            eiuu r7 = defpackage.eiuu.G(r0)
            r5 = 0
            r6 = 10
            r2 = 142(0x8e, float:1.99E-43)
            java.lang.String r3 = "com.google.android.gms.auth.proximity.devicesyncservice.START"
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.proximity.firstparty.DeviceSyncApiChimeraService.<init>():void");
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new acpd(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
