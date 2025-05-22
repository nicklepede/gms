package com.google.android.gms.ads;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.ads.AdsBrokerChimeraService;
import com.google.android.gms.ads.eventattestation.b;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.nonagon.load.service.q;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzps;
import defpackage.elpp;
import defpackage.uzg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AdsBrokerChimeraService extends bzot {
    public static final /* synthetic */ int a = 0;

    public AdsBrokerChimeraService() {
        super(8, "com.google.android.gms.ads.service.ADS", elpp.a, 3, 9);
    }

    private final void c() {
        b.a(this).a();
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        p.c(this);
        c();
        uzg.a(this);
        bzozVar.c(new bzps() { // from class: uyg
            @Override // android.os.IInterface
            public final IBinder asBinder() {
                int i = AdsBrokerChimeraService.a;
                return new q();
            }
        });
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        p.c(this);
        c();
        int i = c.a;
        h.d("Binding to the Ads Service.");
        return super.onBind(intent);
    }
}
