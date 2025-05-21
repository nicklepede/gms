package com.google.android.gms.chimera.container.moduleinstall;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aoer;
import defpackage.arzh;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eits;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ModuleInstallService extends bxgd {
    public ModuleInstallService() {
        super(new int[]{308}, new String[]{"com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START"}, ejck.a, 3, 9, 10, (eits) null);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new arzh(l(), new aoer(this), getServiceRequest.f));
    }
}
