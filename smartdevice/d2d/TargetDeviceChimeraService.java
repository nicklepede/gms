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
import defpackage.arxo;
import defpackage.bxhk;
import defpackage.bxhl;
import defpackage.byhr;
import defpackage.dddj;
import defpackage.ddec;
import defpackage.ddur;
import defpackage.demy;
import defpackage.denq;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TargetDeviceChimeraService extends Service {
    private static final arxo e = new denq(new String[]{"D2D", "TargetDeviceChimeraService"});
    public Handler a;
    public LifecycleSynchronizer b;
    public ddec c;
    public ddur d;
    private bxhl f;

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
        this.a = new byhr(handlerThread.getLooper());
        this.f = new bxhl(this, 76, ejck.a, 3, new bxhk() { // from class: ddcn
            @Override // defpackage.bxhk
            public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
                String str = getServiceRequest.f;
                int i = denf.a;
                TargetDeviceChimeraService targetDeviceChimeraService = TargetDeviceChimeraService.this;
                PackageManager packageManager = targetDeviceChimeraService.getPackageManager();
                targetDeviceChimeraService.getPackageManager();
                fsfh.o();
                new arug(str).a();
                Feature[] featureArr = getServiceRequest.k;
                if (featureArr == null || featureArr.length == 0) {
                    if (targetDeviceChimeraService.c == null) {
                        targetDeviceChimeraService.c = new ddec(targetDeviceChimeraService.b, targetDeviceChimeraService, targetDeviceChimeraService.a, denf.b(str, targetDeviceChimeraService), denf.c(str, packageManager), str, getServiceRequest.p);
                    }
                    bxgjVar.c(targetDeviceChimeraService.c);
                } else if (featureArr[0].equals(dcuj.a)) {
                    if (targetDeviceChimeraService.d == null) {
                        targetDeviceChimeraService.d = new ddur(targetDeviceChimeraService.b, targetDeviceChimeraService, denf.b(str, targetDeviceChimeraService), str, getServiceRequest.p);
                    }
                    bxgjVar.c(targetDeviceChimeraService.d);
                }
            }
        });
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        e.j("onDestroy()", new Object[0]);
        ddec ddecVar = this.c;
        if (ddecVar != null) {
            ddec.a.h("onDestroy()", new Object[0]);
            ddecVar.g();
            ddecVar.b.post(new dddj(ddecVar));
        }
        demy.a(this.a);
        super.onDestroy();
    }
}
