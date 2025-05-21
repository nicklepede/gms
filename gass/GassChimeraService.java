package com.google.android.gms.gass;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.gass.GassChimeraService;
import defpackage.apta;
import defpackage.bhsj;
import defpackage.bhso;
import defpackage.bxhk;
import defpackage.bxhl;
import defpackage.ejck;
import defpackage.fogy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GassChimeraService extends Service {
    public bhso a;
    public bhsj b;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.gass.START")) {
            return new bxhl(this, 116, ejck.a, 3, new bxhk() { // from class: bhsk
                @Override // defpackage.bxhk
                public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
                    GassChimeraService gassChimeraService = GassChimeraService.this;
                    bxgjVar.c(new bhtv(gassChimeraService.a, gassChimeraService.b));
                }
            });
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        if (fogy.e()) {
            Context applicationContext = getApplicationContext();
            this.a = new bhso(applicationContext, apta.k(applicationContext, "GLINE"));
        }
        this.b = bhsj.a(getApplicationContext());
    }
}
