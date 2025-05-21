package com.google.android.gms.ads.httpcache;

import com.google.android.gms.ads.internal.httpcache.h;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class HttpAssetsCacheChimeraService extends bxgd {
    public HttpAssetsCacheChimeraService() {
        super(166, "com.google.android.gms.ads.service.HTTP", Collections.singleton("android.permission.INTERNET"), 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.d(new h(this), null);
    }
}
