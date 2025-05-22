package com.google.android.gms.ads.httpcache;

import com.google.android.gms.ads.internal.httpcache.h;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class HttpAssetsCacheChimeraService extends bzot {
    public HttpAssetsCacheChimeraService() {
        super(166, "com.google.android.gms.ads.service.HTTP", Collections.singleton("android.permission.INTERNET"), 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.d(new h(this), null);
    }
}
