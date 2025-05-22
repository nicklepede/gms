package com.google.android.gms.clearcut.sampler;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asey;
import defpackage.aupz;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elgx;
import defpackage.elpp;
import defpackage.eqgo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ClearcutLoggerSamplingChimeraService extends bzot {
    public static final eqgo a = new aupz(1, 10);

    public ClearcutLoggerSamplingChimeraService() {
        super(new int[]{414}, new String[]{"com.google.android.gms.clearcut.sampler.service.START"}, elpp.a, 1, a, (elgx) null);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new asey(this, l()));
    }
}
