package com.google.android.gms.ads.cache;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class CacheBrokerChimeraService extends bxgd {
    public CacheBrokerChimeraService() {
        super(123, "com.google.android.gms.ads.service.CACHE", ejck.a, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new j(getApplicationContext()));
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        com.google.android.gms.ads.internal.config.p.c(this);
        int i = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.d("Binding to the ad cache service.");
        return super.onBind(intent);
    }
}
