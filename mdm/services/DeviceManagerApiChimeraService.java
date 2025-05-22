package com.google.android.gms.mdm.services;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzqa;
import defpackage.bzqb;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DeviceManagerApiChimeraService extends Service {
    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.mdm.services.DeviceManagerApiService.START".equals(intent.getAction())) {
            return new bzqb(this, 37, elpp.a, 0, new bzqa() { // from class: cfdo
                @Override // defpackage.bzqa
                public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
                    bzozVar.c(new cfcm(getServiceRequest.e));
                }
            });
        }
        return null;
    }
}
