package com.google.android.gms.learning.training;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bqix;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eiig;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GmsTrainerApiService extends bxgd {
    public GmsTrainerApiService() {
        super(139, "com.google.android.gms.learning.trainer.v2.START", Collections.EMPTY_SET, 2, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        eiig.x(getServiceRequest);
        bxgjVar.c(new bqix(l(), getServiceRequest));
    }
}
