package com.google.android.gms.dynamiclinks.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.ethk;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DynamicLinksApiChimeraService extends bzot {
    public DynamicLinksApiChimeraService() {
        super(131, "com.google.firebase.dynamiclinks.service.START", new HashSet(), 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new ethk(this, l(), getServiceRequest.f, getServiceRequest.e));
    }
}
