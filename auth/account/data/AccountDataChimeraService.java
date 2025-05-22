package com.google.android.gms.auth.account.data;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;
import defpackage.wuy;
import defpackage.xcf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountDataChimeraService extends bzot {
    public static final /* synthetic */ int a = 0;

    public AccountDataChimeraService() {
        super(153, "com.google.android.gms.auth.account.data.service.START", elpp.a, 1, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new xcf(this, l(), new wuy()));
    }
}
