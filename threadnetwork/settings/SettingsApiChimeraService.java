package com.google.android.gms.threadnetwork.settings;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.dftq;
import defpackage.ejck;
import defpackage.fsmk;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class SettingsApiChimeraService extends bxgd {
    public SettingsApiChimeraService() {
        super(431, "com.google.android.gms.threadnetwork.settings.service.START", ejck.a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        fvbo.f(getServiceRequest, "request");
        if (!fsmk.a.a().d()) {
            bxgjVar.a(16, null);
            return;
        }
        bxgo l = l();
        String str = getServiceRequest.f;
        fvbo.e(str, "getCallingPackage(...)");
        bxgjVar.c(new dftq(l, str, getServiceRequest.p));
    }
}
