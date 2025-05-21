package com.google.android.gms.smartdevice.d2d;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.smartdevice.d2d.SourceDeviceChimeraService;
import defpackage.arxo;
import defpackage.bxhk;
import defpackage.bxhl;
import defpackage.byhr;
import defpackage.ddas;
import defpackage.ddui;
import defpackage.demy;
import defpackage.denq;
import defpackage.ejck;
import defpackage.fsew;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SourceDeviceChimeraService extends Service {
    private static final arxo e = new denq(new String[]{"D2D", "SourceDeviceChimeraService"});
    public Handler a;
    public LifecycleSynchronizer b;
    public ddas c;
    public ddui d;
    private bxhl f;

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        e.j("onBind()", new Object[0]);
        if ("com.google.android.gms.smartdevice.d2d.SourceDeviceService.START".equals(intent.getAction())) {
            return this.f;
        }
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        e.j("onCreate()", new Object[0]);
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("SourceDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.a = new byhr(handlerThread.getLooper());
        this.f = new bxhl(this, 75, ejck.a, 3, new bxhk() { // from class: dcyx
            @Override // defpackage.bxhk
            public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
                String str = getServiceRequest.f;
                int i = denf.a;
                SourceDeviceChimeraService sourceDeviceChimeraService = SourceDeviceChimeraService.this;
                boolean c = denf.c(str, sourceDeviceChimeraService.getPackageManager());
                new arug(str).a();
                Feature[] featureArr = getServiceRequest.k;
                if (featureArr == null || featureArr.length == 0) {
                    if (sourceDeviceChimeraService.c == null) {
                        sourceDeviceChimeraService.c = new ddas(sourceDeviceChimeraService.b, sourceDeviceChimeraService, sourceDeviceChimeraService.a, c, getServiceRequest.f, getServiceRequest.p);
                    }
                    bxgjVar.c(sourceDeviceChimeraService.c);
                } else if (featureArr[0].equals(dcuj.a)) {
                    if (sourceDeviceChimeraService.d == null) {
                        sourceDeviceChimeraService.d = new ddui(sourceDeviceChimeraService.b, sourceDeviceChimeraService, denf.b(str, sourceDeviceChimeraService), getServiceRequest.f, getServiceRequest.p);
                    }
                    bxgjVar.c(sourceDeviceChimeraService.d);
                }
            }
        });
        this.b = new LifecycleSynchronizer(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        e.j("onDestroy()", new Object[0]);
        ddas ddasVar = this.c;
        if (ddasVar != null) {
            ddasVar.p();
        }
        fsew.c();
        demy.a(this.a);
        super.onDestroy();
    }
}
