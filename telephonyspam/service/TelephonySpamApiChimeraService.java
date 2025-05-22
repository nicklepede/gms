package com.google.android.gms.telephonyspam.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dhos;
import defpackage.elhz;
import defpackage.fvge;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TelephonySpamApiChimeraService extends bzot {
    private static final elhz a = elhz.L("android.permission-group.PHONE", "android.permission-group.SMS", "android.permission-group.STORAGE");

    public TelephonySpamApiChimeraService() {
        super(150, "com.google.android.gms.telephonyspam.service.START", a, 0, 10, elhz.G(fvge.a.lK().l().b));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new dhos(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
