package com.google.android.gms.ads.cache;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class CacheBrokerChimeraService extends bzot {
    public CacheBrokerChimeraService() {
        super(123, "com.google.android.gms.ads.service.CACHE", elpp.a, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new j(getApplicationContext()));
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        com.google.android.gms.ads.internal.config.p.c(this);
        int i = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.d("Binding to the ad cache service.");
        return super.onBind(intent);
    }
}
