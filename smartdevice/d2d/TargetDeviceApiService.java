package com.google.android.gms.smartdevice.d2d;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.atwv;
import defpackage.auad;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.caqj;
import defpackage.dffo;
import defpackage.dfon;
import defpackage.dfph;
import defpackage.dgfw;
import defpackage.dgyb;
import defpackage.dgyi;
import defpackage.dgyt;
import defpackage.elpp;
import defpackage.fvae;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TargetDeviceApiService extends bzot {
    private static final auad b = new dgyt(new String[]{"D2D", "TargetDeviceApiService"});
    Handler a;
    private dfph c;
    private dgfw d;

    public TargetDeviceApiService() {
        super(76, "com.google.android.gms.smartdevice.d2d.TargetDeviceService.START", elpp.a, 3, 9);
    }

    @Override // defpackage.bzot
    public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        TargetDeviceApiService targetDeviceApiService;
        String str = getServiceRequest.f;
        int i = dgyi.a;
        PackageManager packageManager = getPackageManager();
        getPackageManager();
        fvae.n();
        new atwv(str).a();
        Feature[] featureArr = getServiceRequest.k;
        if (featureArr != null && featureArr.length != 0) {
            if (featureArr[0].equals(dffo.a)) {
                if (this.d == null) {
                    targetDeviceApiService = this;
                    targetDeviceApiService.d = new dgfw(this.e, this, dgyi.b(str, this), str, getServiceRequest.p);
                } else {
                    targetDeviceApiService = this;
                }
                bzozVar.c(targetDeviceApiService.d);
                return;
            }
            return;
        }
        TargetDeviceApiService targetDeviceApiService2 = this;
        if (targetDeviceApiService2.c == null) {
            b.d("Creating targetDeviceServiceDelegate.", new Object[0]);
            dfph dfphVar = new dfph(targetDeviceApiService2.e, targetDeviceApiService2, targetDeviceApiService2.a, dgyi.b(str, this), dgyi.c(str, packageManager), str, getServiceRequest.p);
            targetDeviceApiService2 = targetDeviceApiService2;
            targetDeviceApiService2.c = dfphVar;
        } else {
            b.d("Set client info after new onGetService call from calling package: ".concat(String.valueOf(str)), new Object[0]);
            targetDeviceApiService2.c.u(str, dgyi.b(str, this), dgyi.c(str, packageManager));
        }
        bzozVar.c(targetDeviceApiService2.c);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        b.j("onCreate()", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TargetDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.a = new caqj(handlerThread.getLooper());
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        b.j("onDestroy()", new Object[0]);
        dfph dfphVar = this.c;
        if (dfphVar != null) {
            dfph.a.h("onDestroyWithoutLogging()", new Object[0]);
            dfphVar.b.post(new dfon(dfphVar));
        }
        dgyb.a(this.a);
        super.onDestroy();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onRebind(Intent intent) {
        b.j("onRebind", new Object[0]);
        dfph dfphVar = this.c;
        if (dfphVar != null) {
            dfphVar.t();
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final boolean onUnbind(Intent intent) {
        b.j("onUnbind", new Object[0]);
        if (!"com.google.android.gms.smartdevice.d2d.TargetDeviceService.START".equals(intent.getAction())) {
            return false;
        }
        dfph dfphVar = this.c;
        if (dfphVar == null) {
            return true;
        }
        dfphVar.g();
        return true;
    }
}
