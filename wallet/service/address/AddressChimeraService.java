package com.google.android.gms.wallet.service.address;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.wallet.service.address.AddressChimeraService;
import defpackage.bxhk;
import defpackage.bxhl;
import defpackage.dikh;
import defpackage.dill;
import defpackage.djbg;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AddressChimeraService extends Service {
    public djbg a;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.identity.service.BIND".equals(intent.getAction())) {
            return new bxhl(this, 12, ejck.a, 3, new bxhk() { // from class: divf
                @Override // defpackage.bxhk
                public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
                    if (getServiceRequest.e <= 0) {
                        throw new IllegalArgumentException("clientVersion too old");
                    }
                    AddressChimeraService addressChimeraService = AddressChimeraService.this;
                    bxgjVar.c(new bmju(addressChimeraService, addressChimeraService.a, getServiceRequest.f));
                }
            });
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        this.a = new djbg(this, new dill(applicationContext), dikh.a(applicationContext));
    }
}
