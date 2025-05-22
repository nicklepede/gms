package com.google.android.gms.drive.api;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auum;
import defpackage.azpq;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ApiChimeraService extends bzot {
    public ApiChimeraService() {
        super(new int[]{11}, new String[]{"com.google.android.gms.drive.ApiService.START", "com.google.android.gms.drive.ApiService.STOP", "com.google.android.gms.drive.ApiService.RESET_AFTER_BOOT"}, elpp.a, 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        l().c(new azpq(getServiceRequest.f, auum.d(getServiceRequest.h), bzozVar));
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.gms.drive.ApiService.STOP".equals(action) || "com.google.android.gms.drive.ApiService.RESET_AFTER_BOOT".equals(action)) {
                return null;
            }
        }
        return super.onBind(intent);
    }
}
