package com.google.android.gms.lockbox.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.lockbox.service.LockboxBrokerChimeraService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxhk;
import defpackage.bxhl;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LockboxBrokerChimeraService extends Service {
    public static final asot a = asot.b("LockboxBrokerService", asej.LOCKBOX);

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.lockbox.service.START".equals(intent.getAction())) {
            return new bxhl(this, 26, ejck.a, 1, new bxhk() { // from class: cbkv
                @Override // defpackage.bxhk
                public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
                    bxgjVar.c(new cbkg(LockboxBrokerChimeraService.this, getServiceRequest.f));
                }
            });
        }
        return null;
    }
}
