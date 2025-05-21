package com.google.android.gms.findmydevice.spot.management;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bect;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eijj;
import defpackage.eipl;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.ejdg;
import defpackage.fobb;
import defpackage.fobx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ManagementApiChimeraService extends bxgd {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [eiuu] */
    public ManagementApiChimeraService() {
        super(284, "com.google.android.gms.findmydevice.spot.service.management.START", ejck.a, 0, 9, fobx.d().isEmpty() ? (eiuu) eijj.e(',').k(fobb.a.a().b()).collect(eipl.b) : new ejdg(fobx.d()));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new bect(l()));
    }
}
