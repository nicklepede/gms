package com.google.android.gms.telephonyspam.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dfdm;
import defpackage.eiuu;
import defpackage.fsld;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TelephonySpamApiChimeraService extends bxgd {
    private static final eiuu a = eiuu.L("android.permission-group.PHONE", "android.permission-group.SMS", "android.permission-group.STORAGE");

    public TelephonySpamApiChimeraService() {
        super(150, "com.google.android.gms.telephonyspam.service.START", a, 0, 10, eiuu.G(fsld.a.a().l().b));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new dfdm(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
