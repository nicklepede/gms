package com.google.android.gms.wallet.service.address;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.wallet.service.address.AddressChimeraService;
import defpackage.bzqa;
import defpackage.bzqb;
import defpackage.dkvs;
import defpackage.dkww;
import defpackage.dlmz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AddressChimeraService extends Service {
    public dlmz a;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.identity.service.BIND".equals(intent.getAction())) {
            return new bzqb(this, 12, elpp.a, 3, new bzqa() { // from class: dlgq
                @Override // defpackage.bzqa
                public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
                    if (getServiceRequest.e <= 0) {
                        throw new IllegalArgumentException("clientVersion too old");
                    }
                    AddressChimeraService addressChimeraService = AddressChimeraService.this;
                    bzozVar.c(new boqn(addressChimeraService, addressChimeraService.a, getServiceRequest.f));
                }
            });
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        this.a = new dlmz(this, new dkww(applicationContext), dkvs.a(applicationContext));
    }
}
