package com.google.android.gms.smartdevice.d2d;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arug;
import defpackage.arxo;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.byhr;
import defpackage.dcuj;
import defpackage.dddi;
import defpackage.ddec;
import defpackage.ddur;
import defpackage.demy;
import defpackage.denf;
import defpackage.denq;
import defpackage.ejck;
import defpackage.fsfh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TargetDeviceApiService extends bxgd {
    private static final arxo b = new denq(new String[]{"D2D", "TargetDeviceApiService"});
    Handler a;
    private ddec c;
    private ddur d;

    public TargetDeviceApiService() {
        super(76, "com.google.android.gms.smartdevice.d2d.TargetDeviceService.START", ejck.a, 3, 9);
    }

    @Override // defpackage.bxgd
    public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        TargetDeviceApiService targetDeviceApiService;
        String str = getServiceRequest.f;
        int i = denf.a;
        PackageManager packageManager = getPackageManager();
        getPackageManager();
        fsfh.o();
        new arug(str).a();
        Feature[] featureArr = getServiceRequest.k;
        if (featureArr != null && featureArr.length != 0) {
            if (featureArr[0].equals(dcuj.a)) {
                if (this.d == null) {
                    targetDeviceApiService = this;
                    targetDeviceApiService.d = new ddur(this.e, this, denf.b(str, this), str, getServiceRequest.p);
                } else {
                    targetDeviceApiService = this;
                }
                bxgjVar.c(targetDeviceApiService.d);
                return;
            }
            return;
        }
        TargetDeviceApiService targetDeviceApiService2 = this;
        if (targetDeviceApiService2.c == null) {
            b.d("Creating targetDeviceServiceDelegate.", new Object[0]);
            ddec ddecVar = new ddec(targetDeviceApiService2.e, targetDeviceApiService2, targetDeviceApiService2.a, denf.b(str, this), denf.c(str, packageManager), str, getServiceRequest.p);
            targetDeviceApiService2 = targetDeviceApiService2;
            targetDeviceApiService2.c = ddecVar;
        } else {
            b.d("Set client info after new onGetService call from calling package: ".concat(String.valueOf(str)), new Object[0]);
            targetDeviceApiService2.c.u(str, denf.b(str, this), denf.c(str, packageManager));
        }
        bxgjVar.c(targetDeviceApiService2.c);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        b.j("onCreate()", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TargetDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.a = new byhr(handlerThread.getLooper());
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        b.j("onDestroy()", new Object[0]);
        ddec ddecVar = this.c;
        if (ddecVar != null) {
            ddec.a.h("onDestroyWithoutLogging()", new Object[0]);
            ddecVar.b.post(new dddi(ddecVar));
        }
        demy.a(this.a);
        super.onDestroy();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onRebind(Intent intent) {
        b.j("onRebind", new Object[0]);
        ddec ddecVar = this.c;
        if (ddecVar != null) {
            ddecVar.t();
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final boolean onUnbind(Intent intent) {
        b.j("onUnbind", new Object[0]);
        if (!"com.google.android.gms.smartdevice.d2d.TargetDeviceService.START".equals(intent.getAction())) {
            return false;
        }
        ddec ddecVar = this.c;
        if (ddecVar == null) {
            return true;
        }
        ddecVar.g();
        return true;
    }
}
