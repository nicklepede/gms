package com.google.android.gms.identity.accounts.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.blzz;
import defpackage.bmaa;
import defpackage.bxgd;
import defpackage.bxgj;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class AccountDataApiService extends bxgd {
    private static final bmaa a = new blzz();
    private final bmaa b;

    public AccountDataApiService() {
        this(a);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(this.b.a(this));
    }

    public AccountDataApiService(bmaa bmaaVar) {
        super(9, "com.google.android.gms.accounts.ACCOUNT_SERVICE", Collections.EMPTY_SET, 1, 10);
        this.b = bmaaVar;
    }
}
