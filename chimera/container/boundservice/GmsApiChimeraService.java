package com.google.android.gms.chimera.container.boundservice;

import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.chimera.container.boundservice.GmsApiChimeraService;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aqed;
import defpackage.bsxj;
import defpackage.bzqa;
import defpackage.bzqb;
import defpackage.caqj;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.fpng;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GmsApiChimeraService extends GmsBoundBrokerChimeraService {
    public static final /* synthetic */ int e = 0;
    private static final elhz f = elhz.O("com.google.android.gms.wallet.service.ib.IIbService", "com.google.android.gms.wallet.service.ib.UpdatePaymentDetailsService", "com.google.android.gms.wallet.service.ow.IOwInternalService", "com.google.android.gms.wallet.service.orchestration.IOrchestrationService", "com.google.android.gms.wallet.service.reauth.IReauthService", "com.google.android.gms.wallet.bender3.framework.actions.IActionExecutorService", "org.chromium.intent.action.UPDATE_PAYMENT_DETAILS");
    private bzqb g;
    public final Handler d = new caqj(Looper.getMainLooper());
    private boolean h = false;

    public final IBinder f(Intent intent) {
        if (this.h) {
            return null;
        }
        return super.onBind(intent);
    }

    @Override // defpackage.rkt, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        IBinder f2 = f(intent);
        if (f2 != null) {
            return f2;
        }
        String action = intent.getAction();
        Log.i("GmsApiChimeraSvc", "Handling missing api service for: ".concat(String.valueOf(action)));
        if (action == null || f.contains(action) || bsxj.a(fpng.a.lK().c(), action)) {
            return null;
        }
        if (this.g == null) {
            this.g = new bzqb(this, 0, elpp.a, new bzqa() { // from class: aqeb
                @Override // defpackage.bzqa
                public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
                    int i = GmsApiChimeraService.e;
                    bzozVar.a(16, null);
                }
            });
        }
        return new aqed(this, intent, this.g);
    }

    @Override // defpackage.rkt, com.google.android.chimera.Service
    public final void onDestroy() {
        this.h = true;
        super.onDestroy();
    }
}
