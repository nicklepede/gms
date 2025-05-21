package com.google.android.gms.auth.frp.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aboq;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eiuu;
import defpackage.fkgo;
import defpackage.vbb;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FactoryResetProtectionChimeraService extends bxgd {
    public static final asot a = vbb.b("FactoryResetProtectionService");

    public FactoryResetProtectionChimeraService() {
        super(341, "com.google.android.gms.auth.frp.service.START", Collections.EMPTY_SET, 0, 9, eiuu.G(fkgo.a.a().b().b));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new aboq(l()));
    }
}
