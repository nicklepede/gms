package com.google.android.gms.accountsettings.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.fvbo;
import defpackage.rtl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AccountSettingsApiService extends bxgd {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AccountSettingsApiService() {
        /*
            r7 = this;
            fuwy r3 = defpackage.fuwy.a
            fjue r0 = defpackage.fjue.a
            fjuf r0 = r0.a()
            femw r0 = r0.t()
            fedh r0 = r0.b
            java.lang.String r1 = "getElementList(...)"
            defpackage.fvbo.e(r0, r1)
            eiuu r6 = defpackage.eitd.c(r0)
            r4 = 0
            r5 = 9
            r1 = 109(0x6d, float:1.53E-43)
            java.lang.String r2 = "com.google.android.gms.accountsettings.api.START"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.accountsettings.service.AccountSettingsApiService.<init>():void");
    }

    @Override // defpackage.bxgd
    public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        fvbo.f(getServiceRequest, "request");
        bxgo l = l();
        String str = getServiceRequest.f;
        fvbo.e(str, "getCallingPackage(...)");
        bxgjVar.c(new rtl(this, l, str, getServiceRequest.p));
    }
}
