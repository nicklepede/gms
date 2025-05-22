package com.google.android.gms.search.service;

import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dayq;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes6.dex */
public class SearchAuthChimeraService extends bzot {
    public SearchAuthChimeraService() {
        super(73, "com.google.android.gms.search.service.SEARCH_AUTH_START", Collections.EMPTY_SET, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        Binder.getCallingUid();
        String str = getServiceRequest.f;
        String str2 = getServiceRequest.p;
        bzozVar.c(new dayq());
    }
}
