package com.google.android.gms.chimera.container.boundservice;

import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.chimera.container.boundservice.GmsApiChimeraService;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aocl;
import defpackage.bqps;
import defpackage.bxhk;
import defpackage.bxhl;
import defpackage.byhr;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.fmvi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsApiChimeraService extends GmsBoundBrokerChimeraService {
    public static final /* synthetic */ int e = 0;
    private static final eiuu f = eiuu.N("com.google.android.gms.wallet.service.ib.IIbService", "com.google.android.gms.wallet.service.ow.IOwInternalService", "com.google.android.gms.wallet.service.orchestration.IOrchestrationService", "com.google.android.gms.wallet.service.reauth.IReauthService", "com.google.android.gms.wallet.bender3.framework.actions.IActionExecutorService");
    private bxhl g;
    public final Handler d = new byhr(Looper.getMainLooper());
    private boolean h = false;

    public final IBinder f(Intent intent) {
        if (this.h) {
            return null;
        }
        return super.onBind(intent);
    }

    @Override // defpackage.prp, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        IBinder f2 = f(intent);
        if (f2 != null) {
            return f2;
        }
        String action = intent.getAction();
        Log.i("GmsApiChimeraSvc", "Handling missing api service for: ".concat(String.valueOf(action)));
        if (action == null || f.contains(action) || bqps.a(fmvi.a.a().c(), action)) {
            return null;
        }
        if (this.g == null) {
            this.g = new bxhl(this, 0, ejck.a, new bxhk() { // from class: aocj
                @Override // defpackage.bxhk
                public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
                    int i = GmsApiChimeraService.e;
                    bxgjVar.a(16, null);
                }
            });
        }
        return new aocl(this, intent, this.g);
    }

    @Override // defpackage.prp, com.google.android.chimera.Service
    public final void onDestroy() {
        this.h = true;
        super.onDestroy();
    }
}
