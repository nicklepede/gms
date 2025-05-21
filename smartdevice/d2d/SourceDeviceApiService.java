package com.google.android.gms.smartdevice.d2d;

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
import defpackage.ddas;
import defpackage.ddui;
import defpackage.demy;
import defpackage.denf;
import defpackage.denq;
import defpackage.ejck;
import defpackage.fsew;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SourceDeviceApiService extends bxgd {
    private static final arxo b = new denq(new String[]{"D2D", "SourceDeviceApiService"});
    Handler a;
    private ddas c;
    private ddui d;

    public SourceDeviceApiService() {
        super(75, "com.google.android.gms.smartdevice.d2d.SourceDeviceService.START", ejck.a, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        SourceDeviceApiService sourceDeviceApiService;
        b.h("onGetService.", new Object[0]);
        String str = getServiceRequest.f;
        int i = denf.a;
        boolean c = denf.c(str, getPackageManager());
        new arug(str).a();
        Feature[] featureArr = getServiceRequest.k;
        if (featureArr == null || featureArr.length == 0) {
            if (this.c == null) {
                this.c = new ddas(this.e, this, this.a, c, str, getServiceRequest.p);
            }
            bxgjVar.c(this.c);
        } else if (featureArr[0].equals(dcuj.a)) {
            if (this.d == null) {
                sourceDeviceApiService = this;
                sourceDeviceApiService.d = new ddui(this.e, sourceDeviceApiService, denf.b(str, this), str, getServiceRequest.p);
            } else {
                sourceDeviceApiService = this;
            }
            bxgjVar.c(sourceDeviceApiService.d);
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        b.j("onCreate()", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("SourceDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.a = new byhr(handlerThread.getLooper());
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        b.j("onDestroy()", new Object[0]);
        ddas ddasVar = this.c;
        if (ddasVar != null) {
            ddasVar.p();
        }
        fsew.c();
        demy.a(this.a);
        super.onDestroy();
    }
}
