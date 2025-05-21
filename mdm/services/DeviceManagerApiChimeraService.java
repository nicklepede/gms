package com.google.android.gms.mdm.services;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxhk;
import defpackage.bxhl;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DeviceManagerApiChimeraService extends Service {
    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.mdm.services.DeviceManagerApiService.START".equals(intent.getAction())) {
            return new bxhl(this, 37, ejck.a, 0, new bxhk() { // from class: ccuu
                @Override // defpackage.bxhk
                public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
                    bxgjVar.c(new ccts(getServiceRequest.e));
                }
            });
        }
        return null;
    }
}
