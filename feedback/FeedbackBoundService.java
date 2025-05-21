package com.google.android.gms.feedback;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asej;
import defpackage.asot;
import defpackage.bapi;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FeedbackBoundService extends bxgd {
    public static final asot a = asot.b("gf_FeedbackService", asej.FEEDBACK);

    public FeedbackBoundService() {
        super(29, "com.google.android.gms.feedback.internal.IFeedbackService", ejck.a, 2, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new bapi(this, l(), getServiceRequest.f));
    }
}
