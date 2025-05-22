package com.google.android.gms.lockbox.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.lockbox.service.LockboxBrokerChimeraService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzqa;
import defpackage.bzqb;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LockboxBrokerChimeraService extends Service {
    public static final ausn a = ausn.b("LockboxBrokerService", auid.LOCKBOX);

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.lockbox.service.START".equals(intent.getAction())) {
            return new bzqb(this, 26, elpp.a, 1, new bzqa() { // from class: cdtn
                @Override // defpackage.bzqa
                public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
                    bzozVar.c(new cdsy(LockboxBrokerChimeraService.this, getServiceRequest.f));
                }
            });
        }
        return null;
    }
}
