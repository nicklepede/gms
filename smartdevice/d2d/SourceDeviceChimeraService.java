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
import defpackage.auad;
import defpackage.bzqa;
import defpackage.bzqb;
import defpackage.caqj;
import defpackage.dflx;
import defpackage.dgfn;
import defpackage.dgyb;
import defpackage.dgyt;
import defpackage.elpp;
import defpackage.fuzt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SourceDeviceChimeraService extends Service {
    private static final auad e = new dgyt(new String[]{"D2D", "SourceDeviceChimeraService"});
    public Handler a;
    public LifecycleSynchronizer b;
    public dflx c;
    public dgfn d;
    private bzqb f;

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
        this.a = new caqj(handlerThread.getLooper());
        this.f = new bzqb(this, 75, elpp.a, 3, new bzqa() { // from class: dfkc
            @Override // defpackage.bzqa
            public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
                String str = getServiceRequest.f;
                int i = dgyi.a;
                SourceDeviceChimeraService sourceDeviceChimeraService = SourceDeviceChimeraService.this;
                boolean c = dgyi.c(str, sourceDeviceChimeraService.getPackageManager());
                new atwv(str).a();
                Feature[] featureArr = getServiceRequest.k;
                if (featureArr == null || featureArr.length == 0) {
                    if (sourceDeviceChimeraService.c == null) {
                        sourceDeviceChimeraService.c = new dflx(sourceDeviceChimeraService.b, sourceDeviceChimeraService, sourceDeviceChimeraService.a, c, getServiceRequest.f, getServiceRequest.p);
                    }
                    bzozVar.c(sourceDeviceChimeraService.c);
                } else if (featureArr[0].equals(dffo.a)) {
                    if (sourceDeviceChimeraService.d == null) {
                        sourceDeviceChimeraService.d = new dgfn(sourceDeviceChimeraService.b, sourceDeviceChimeraService, dgyi.b(str, sourceDeviceChimeraService), getServiceRequest.f, getServiceRequest.p);
                    }
                    bzozVar.c(sourceDeviceChimeraService.d);
                }
            }
        });
        this.b = new LifecycleSynchronizer(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        e.j("onDestroy()", new Object[0]);
        dflx dflxVar = this.c;
        if (dflxVar != null) {
            dflxVar.p();
        }
        fuzt.c();
        dgyb.a(this.a);
        super.onDestroy();
    }
}
