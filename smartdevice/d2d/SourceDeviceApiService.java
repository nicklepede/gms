package com.google.android.gms.smartdevice.d2d;

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
import defpackage.dflx;
import defpackage.dgfn;
import defpackage.dgyb;
import defpackage.dgyi;
import defpackage.dgyt;
import defpackage.elpp;
import defpackage.fuzt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SourceDeviceApiService extends bzot {
    private static final auad b = new dgyt(new String[]{"D2D", "SourceDeviceApiService"});
    Handler a;
    private dflx c;
    private dgfn d;

    public SourceDeviceApiService() {
        super(75, "com.google.android.gms.smartdevice.d2d.SourceDeviceService.START", elpp.a, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        SourceDeviceApiService sourceDeviceApiService;
        b.h("onGetService.", new Object[0]);
        String str = getServiceRequest.f;
        int i = dgyi.a;
        boolean c = dgyi.c(str, getPackageManager());
        new atwv(str).a();
        Feature[] featureArr = getServiceRequest.k;
        if (featureArr == null || featureArr.length == 0) {
            if (this.c == null) {
                this.c = new dflx(this.e, this, this.a, c, str, getServiceRequest.p);
            }
            bzozVar.c(this.c);
        } else if (featureArr[0].equals(dffo.a)) {
            if (this.d == null) {
                sourceDeviceApiService = this;
                sourceDeviceApiService.d = new dgfn(this.e, sourceDeviceApiService, dgyi.b(str, this), str, getServiceRequest.p);
            } else {
                sourceDeviceApiService = this;
            }
            bzozVar.c(sourceDeviceApiService.d);
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        b.j("onCreate()", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("SourceDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.a = new caqj(handlerThread.getLooper());
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        b.j("onDestroy()", new Object[0]);
        dflx dflxVar = this.c;
        if (dflxVar != null) {
            dflxVar.p();
        }
        fuzt.c();
        dgyb.a(this.a);
        super.onDestroy();
    }
}
