package com.google.android.gms.drive.api;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asqs;
import defpackage.axlq;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ApiChimeraService extends bxgd {
    public ApiChimeraService() {
        super(new int[]{11}, new String[]{"com.google.android.gms.drive.ApiService.START", "com.google.android.gms.drive.ApiService.STOP", "com.google.android.gms.drive.ApiService.RESET_AFTER_BOOT"}, ejck.a, 3, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        l().c(new axlq(getServiceRequest.f, asqs.d(getServiceRequest.h), bxgjVar));
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
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
