package com.google.android.gms.smartdevice.d2d;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.smartdevice.d2d.TargetDeviceChimeraService;
import defpackage.auad;
import defpackage.bzqa;
import defpackage.bzqb;
import defpackage.caqj;
import defpackage.dfoo;
import defpackage.dfph;
import defpackage.dgfw;
import defpackage.dgyb;
import defpackage.dgyt;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TargetDeviceChimeraService extends Service {
    private static final auad e = new dgyt(new String[]{"D2D", "TargetDeviceChimeraService"});
    public Handler a;
    public LifecycleSynchronizer b;
    public dfph c;
    public dgfw d;
    private bzqb f;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        e.j("onBind()", new Object[0]);
        if ("com.google.android.gms.smartdevice.d2d.TargetDeviceService.START".equals(intent.getAction())) {
            return this.f;
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        e.j("onCreate()", new Object[0]);
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("TargetDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.b = new LifecycleSynchronizer(this);
        this.a = new caqj(handlerThread.getLooper());
        this.f = new bzqb(this, 76, elpp.a, 3, new bzqa() { // from class: dfns
            @Override // defpackage.bzqa
            public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
                String str = getServiceRequest.f;
                int i = dgyi.a;
                TargetDeviceChimeraService targetDeviceChimeraService = TargetDeviceChimeraService.this;
                PackageManager packageManager = targetDeviceChimeraService.getPackageManager();
                targetDeviceChimeraService.getPackageManager();
                fvae.n();
                new atwv(str).a();
                Feature[] featureArr = getServiceRequest.k;
                if (featureArr == null || featureArr.length == 0) {
                    if (targetDeviceChimeraService.c == null) {
                        targetDeviceChimeraService.c = new dfph(targetDeviceChimeraService.b, targetDeviceChimeraService, targetDeviceChimeraService.a, dgyi.b(str, targetDeviceChimeraService), dgyi.c(str, packageManager), str, getServiceRequest.p);
                    }
                    bzozVar.c(targetDeviceChimeraService.c);
                } else if (featureArr[0].equals(dffo.a)) {
                    if (targetDeviceChimeraService.d == null) {
                        targetDeviceChimeraService.d = new dgfw(targetDeviceChimeraService.b, targetDeviceChimeraService, dgyi.b(str, targetDeviceChimeraService), str, getServiceRequest.p);
                    }
                    bzozVar.c(targetDeviceChimeraService.d);
                }
            }
        });
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        e.j("onDestroy()", new Object[0]);
        dfph dfphVar = this.c;
        if (dfphVar != null) {
            dfph.a.h("onDestroy()", new Object[0]);
            dfphVar.g();
            dfphVar.b.post(new dfoo(dfphVar));
        }
        dgyb.a(this.a);
        super.onDestroy();
    }
}
