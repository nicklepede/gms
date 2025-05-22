package com.google.android.gms.auth.managed.services;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.adsb;
import defpackage.adzu;
import defpackage.adzx;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.fgrc;
import defpackage.fyxv;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class PasswordComplexityChimeraService extends bzot {
    public PasswordComplexityChimeraService() {
        super(187, "com.google.android.gms.auth.managed.START_POLICY_SERVICE", Collections.EMPTY_SET, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (adzx.f().i()) {
            bzozVar.c(new adsb(l(), getServiceRequest.f));
            return;
        }
        bzozVar.a(16, null);
        adzu a = adzu.a(this);
        fgrc v = fyxv.a.v();
        String str = getServiceRequest.f;
        if (!v.b.L()) {
            v.U();
        }
        fyxv fyxvVar = (fyxv) v.b;
        str.getClass();
        fyxvVar.b |= 1;
        fyxvVar.c = str;
        int g = adzu.g(adzx.f().a());
        if (!v.b.L()) {
            v.U();
        }
        fyxv fyxvVar2 = (fyxv) v.b;
        fyxvVar2.f = g - 1;
        fyxvVar2.b |= 8;
        a.o(4, (fyxv) v.Q());
    }
}
