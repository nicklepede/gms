package com.google.android.gms.auth.config;

import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aaoa;
import defpackage.aaoc;
import defpackage.aaof;
import defpackage.adlm;
import defpackage.aqxd;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.cvzk;
import defpackage.cwal;
import defpackage.ejck;
import defpackage.ejdg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ConfigSyncApiChimeraService extends bxgd {
    public ConfigSyncApiChimeraService() {
        super(221, "com.google.android.gms.auth.config.service.START", ejck.a, 0, 9, new ejdg("com.google.android.setupwizard"));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgo l = l();
        aqxd aqxdVar = cvzk.a;
        bxgjVar.c(new aaoa(l, new aaof(new cwal(this), new adlm(), new aaoc(ModuleManager.get(this))), getServiceRequest.f));
    }
}
