package com.google.android.gms.backup.g1.backup;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.ajal;
import defpackage.arwm;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.eiuu;
import defpackage.flmm;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class G1BackupApiChimeraService extends bxgd {
    public G1BackupApiChimeraService() {
        super(182, "com.google.android.gms.backup.G1_BACKUP", Collections.EMPTY_SET, 0, 10, eiuu.G(flmm.j().b));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgo l = l();
        arwm.s(getServiceRequest);
        bxgjVar.c(new ajal(this, l, getServiceRequest, getServiceRequest.f, getServiceRequest.p));
    }
}
