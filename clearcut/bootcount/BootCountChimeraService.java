package com.google.android.gms.clearcut.bootcount;

import android.content.Intent;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aqbg;
import defpackage.bxgd;
import defpackage.bxgj;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BootCountChimeraService extends bxgd {
    public BootCountChimeraService() {
        super(124, "com.google.android.gms.clearcut.bootcount.service.START", Collections.EMPTY_SET, 2, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new aqbg(this));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final boolean onUnbind(Intent intent) {
        return true;
    }
}
