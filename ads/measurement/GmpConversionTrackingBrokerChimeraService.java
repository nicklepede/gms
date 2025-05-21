package com.google.android.gms.ads.measurement;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.measurement.service.b;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cdqa;
import defpackage.cdwd;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class GmpConversionTrackingBrokerChimeraService extends bxgd {
    public GmpConversionTrackingBrokerChimeraService() {
        super(95, "com.google.android.gms.ads.measurement.service.START", ejck.a, 1, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        b bVar;
        synchronized (b.a) {
            if (b.b == null) {
                b.b = new b(cdwd.a(this), cdqa.i(this));
            }
            bVar = b.b;
        }
        bxgjVar.c(bVar);
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        int i = c.a;
        h.d("Binding to the conversion tracking service");
        return super.onBind(intent);
    }
}
