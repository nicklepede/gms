package com.google.android.gms.smartdevice.directtransfer;

import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.a;
import defpackage.arxo;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.byhr;
import defpackage.ddrx;
import defpackage.ddsc;
import defpackage.demy;
import defpackage.denf;
import defpackage.denq;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.fsds;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TargetDirectTransferApiService extends bxgd {
    private static final arxo b = new denq(new String[]{"D2D", "TargetDirectTransferApiService"});
    Handler a;
    private ddsc c;

    public TargetDirectTransferApiService() {
        super(211, "com.google.android.gms.smartdevice.directtransfer.TargetDirectTransferService.START", ejck.a, 3, 9);
    }

    @Override // defpackage.bxgd
    public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        TargetDirectTransferApiService targetDirectTransferApiService;
        String str = getServiceRequest.f;
        int i = denf.a;
        PackageManager packageManager = getPackageManager();
        boolean b2 = denf.b(str, this);
        boolean a = denf.a(str, eiuu.H(fsds.c().split(",")), packageManager);
        if (fsds.h() && !b2 && !a) {
            b.f(a.a(str, "callingPackage: ", " is not authorized"), new Object[0]);
            throw new SecurityException(String.valueOf(str).concat(" is not authorized"));
        }
        if (this.c == null) {
            targetDirectTransferApiService = this;
            targetDirectTransferApiService.c = new ddsc(this.e, targetDirectTransferApiService, this.a, b2, denf.c(str, packageManager), str, getServiceRequest.p);
        } else {
            targetDirectTransferApiService = this;
        }
        bxgjVar.c(targetDirectTransferApiService.c);
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
        ddsc ddscVar = this.c;
        if (ddscVar != null) {
            ddsc.a.h("onDestroy()", new Object[0]);
            ddscVar.c();
            ddscVar.b.post(new ddrx(ddscVar));
        }
        demy.a(this.a);
        super.onDestroy();
    }
}
