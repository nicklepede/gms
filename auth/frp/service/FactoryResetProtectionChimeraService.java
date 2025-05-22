package com.google.android.gms.auth.frp.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.adoq;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elhz;
import defpackage.fmxa;
import defpackage.wxb;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FactoryResetProtectionChimeraService extends bzot {
    public static final ausn a = wxb.b("FactoryResetProtectionService");

    public FactoryResetProtectionChimeraService() {
        super(341, "com.google.android.gms.auth.frp.service.START", Collections.EMPTY_SET, 0, 9, elhz.G(fmxa.a.lK().b().b));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new adoq(l()));
    }
}
