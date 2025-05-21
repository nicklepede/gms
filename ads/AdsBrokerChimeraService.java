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
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxhc;
import defpackage.ejck;
import defpackage.tdg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AdsBrokerChimeraService extends bxgd {
    public static final /* synthetic */ int a = 0;

    public AdsBrokerChimeraService() {
        super(8, "com.google.android.gms.ads.service.ADS", ejck.a, 3, 9);
    }

    private final void c() {
        b.a(this).a();
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        p.c(this);
        c();
        tdg.a(this);
        bxgjVar.c(new bxhc() { // from class: tcg
            @Override // android.os.IInterface
            public final IBinder asBinder() {
                int i = AdsBrokerChimeraService.a;
                return new q();
            }
        });
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        p.c(this);
        c();
        int i = c.a;
        h.d("Binding to the Ads Service.");
        return super.onBind(intent);
    }
}
