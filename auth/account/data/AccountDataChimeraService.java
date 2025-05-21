package com.google.android.gms.auth.account.data;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;
import defpackage.uyy;
import defpackage.vge;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountDataChimeraService extends bxgd {
    public static final /* synthetic */ int a = 0;

    public AccountDataChimeraService() {
        super(153, "com.google.android.gms.auth.account.data.service.START", ejck.a, 1, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new vge(this, l(), new uyy()));
    }
}
