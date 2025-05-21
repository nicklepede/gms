package com.google.android.gms.clearcut.sampler;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aqch;
import defpackage.asmf;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eits;
import defpackage.ejck;
import defpackage.ensv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ClearcutLoggerSamplingChimeraService extends bxgd {
    public static final ensv a = new asmf(1, 10);

    public ClearcutLoggerSamplingChimeraService() {
        super(new int[]{414}, new String[]{"com.google.android.gms.clearcut.sampler.service.START"}, ejck.a, 1, a, (eits) null);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new aqch(this, l()));
    }
}
