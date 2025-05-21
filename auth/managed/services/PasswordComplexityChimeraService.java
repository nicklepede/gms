package com.google.android.gms.auth.managed.services;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.absb;
import defpackage.abzu;
import defpackage.abzx;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.fecj;
import defpackage.fwbt;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class PasswordComplexityChimeraService extends bxgd {
    public PasswordComplexityChimeraService() {
        super(187, "com.google.android.gms.auth.managed.START_POLICY_SERVICE", Collections.EMPTY_SET, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (abzx.f().i()) {
            bxgjVar.c(new absb(l(), getServiceRequest.f));
            return;
        }
        bxgjVar.a(16, null);
        abzu a = abzu.a(this);
        fecj v = fwbt.a.v();
        String str = getServiceRequest.f;
        if (!v.b.L()) {
            v.U();
        }
        fwbt fwbtVar = (fwbt) v.b;
        str.getClass();
        fwbtVar.b |= 1;
        fwbtVar.c = str;
        int g = abzu.g(abzx.f().a());
        if (!v.b.L()) {
            v.U();
        }
        fwbt fwbtVar2 = (fwbt) v.b;
        fwbtVar2.f = g - 1;
        fwbtVar2.b |= 8;
        a.o(4, (fwbt) v.Q());
    }
}
