package com.google.android.gms.accountsettings.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.fxxm;
import defpackage.tmu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AccountSettingsApiService extends bzot {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AccountSettingsApiService() {
        /*
            r7 = this;
            fxsw r3 = defpackage.fxsw.a
            fmkf r0 = defpackage.fmkf.a
            fmkg r0 = r0.lK()
            fhbp r0 = r0.t()
            fgsa r0 = r0.b
            java.lang.String r1 = "getElementList(...)"
            defpackage.fxxm.e(r0, r1)
            elhz r6 = defpackage.elgi.c(r0)
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

    @Override // defpackage.bzot
    public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        fxxm.f(getServiceRequest, "request");
        bzpe l = l();
        String str = getServiceRequest.f;
        fxxm.e(str, "getCallingPackage(...)");
        bzozVar.c(new tmu(this, l, str, getServiceRequest.p));
    }
}
