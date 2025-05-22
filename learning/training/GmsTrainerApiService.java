package com.google.android.gms.learning.training;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bsqm;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.ekvl;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class GmsTrainerApiService extends bzot {
    public GmsTrainerApiService() {
        super(139, "com.google.android.gms.learning.trainer.v2.START", Collections.EMPTY_SET, 2, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        ekvl.y(getServiceRequest);
        bzozVar.c(new bsqm(l(), getServiceRequest));
    }
}
