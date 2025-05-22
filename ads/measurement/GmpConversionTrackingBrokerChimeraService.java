package com.google.android.gms.ads.measurement;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.measurement.service.b;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.cfyy;
import defpackage.cgfd;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class GmpConversionTrackingBrokerChimeraService extends bzot {
    public GmpConversionTrackingBrokerChimeraService() {
        super(95, "com.google.android.gms.ads.measurement.service.START", elpp.a, 1, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        b bVar;
        synchronized (b.a) {
            if (b.b == null) {
                b.b = new b(cgfd.a(this), cfyy.i(this));
            }
            bVar = b.b;
        }
        bzozVar.c(bVar);
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        int i = c.a;
        h.d("Binding to the conversion tracking service");
        return super.onBind(intent);
    }
}
