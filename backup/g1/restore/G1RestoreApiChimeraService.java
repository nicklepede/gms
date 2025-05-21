package com.google.android.gms.backup.g1.restore;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.ajdo;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eiuu;
import defpackage.flmm;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class G1RestoreApiChimeraService extends bxgd {
    public G1RestoreApiChimeraService() {
        super(181, "com.google.android.gms.backup.G1_RESTORE", Collections.EMPTY_SET, 0, 10, eiuu.G(flmm.j().b));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new ajdo(this, l(), getServiceRequest.f, getServiceRequest.p));
    }
}
