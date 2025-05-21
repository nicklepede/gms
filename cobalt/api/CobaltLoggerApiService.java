package com.google.android.gms.cobalt.api;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aqnl;
import defpackage.aqnm;
import defpackage.aqno;
import defpackage.aqpi;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CobaltLoggerApiService extends aqno {
    public static final asot a = asot.b("CobaltLoggerImpl", asej.COBALT);
    public aqnm b;

    public CobaltLoggerApiService() {
        super(364, "com.google.android.gms.cobalt.api.CobaltLoggerApiService.START", ejck.a, 1, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        aqnl aqnlVar = this.b.a;
        bxgjVar.c(new aqpi((bxgo) aqnlVar.a.a(), aqnlVar.b, getServiceRequest.f));
    }
}
