package com.google.android.gms.gass;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.gass.GassChimeraService;
import defpackage.arvr;
import defpackage.bjwy;
import defpackage.bjxd;
import defpackage.bzqa;
import defpackage.bzqb;
import defpackage.elpp;
import defpackage.fqzo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GassChimeraService extends Service {
    public bjxd a;
    public bjwy b;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.gass.START")) {
            return new bzqb(this, 116, elpp.a, 3, new bzqa() { // from class: bjwz
                @Override // defpackage.bzqa
                public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
                    GassChimeraService gassChimeraService = GassChimeraService.this;
                    bzozVar.c(new bjyk(gassChimeraService.a, gassChimeraService.b));
                }
            });
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        if (fqzo.e()) {
            Context applicationContext = getApplicationContext();
            this.a = new bjxd(applicationContext, arvr.k(applicationContext, "GLINE"));
        }
        this.b = bjwy.a(getApplicationContext());
    }
}
