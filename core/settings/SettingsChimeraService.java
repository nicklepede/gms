package com.google.android.gms.core.settings;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.atsz;
import defpackage.attb;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SettingsChimeraService extends bxgd {
    public SettingsChimeraService() {
        super(329, "com.google.android.gms.core.settings.service.START", ejck.a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new attb(l(), new atsz(this), getServiceRequest.f, getServiceRequest.p));
    }
}
