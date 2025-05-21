package com.google.android.gms.search.service;

import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cyos;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes6.dex */
public class SearchAuthChimeraService extends bxgd {
    public SearchAuthChimeraService() {
        super(73, "com.google.android.gms.search.service.SEARCH_AUTH_START", Collections.EMPTY_SET, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        Binder.getCallingUid();
        String str = getServiceRequest.f;
        String str2 = getServiceRequest.p;
        bxgjVar.c(new cyos());
    }
}
