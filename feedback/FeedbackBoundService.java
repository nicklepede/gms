package com.google.android.gms.feedback;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bcte;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FeedbackBoundService extends bzot {
    public static final ausn a = ausn.b("gf_FeedbackService", auid.FEEDBACK);

    public FeedbackBoundService() {
        super(29, "com.google.android.gms.feedback.internal.IFeedbackService", elpp.a, 2, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new bcte(this, l(), getServiceRequest.f));
    }
}
