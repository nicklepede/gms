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
import defpackage.ddkz;
import defpackage.ddrw;
import defpackage.demy;
import defpackage.denf;
import defpackage.denq;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.fsds;
import defpackage.fsew;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SourceDirectTransferApiService extends bxgd {
    private static final arxo b = new denq(new String[]{"DirectTransfer", "SourceDirectTransferApiService"});
    Handler a;
    private ddrw c;

    public SourceDirectTransferApiService() {
        super(210, "com.google.android.gms.smartdevice.directtransfer.SourceDirectTransferService.START", ejck.a, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        SourceDirectTransferApiService sourceDirectTransferApiService;
        arxo arxoVar = b;
        arxoVar.h("onGetService.", new Object[0]);
        String str = getServiceRequest.f;
        int i = denf.a;
        PackageManager packageManager = getPackageManager();
        boolean b2 = denf.b(str, this);
        boolean a = denf.a(str, eiuu.H(fsds.c().split(",")), packageManager);
        if (fsds.h() && !b2 && !a) {
            arxoVar.f(a.a(str, "callingPackage: ", " is not authorized"), new Object[0]);
            throw new SecurityException(String.valueOf(str).concat(" is not authorized"));
        }
        if (this.c == null) {
            sourceDirectTransferApiService = this;
            sourceDirectTransferApiService.c = new ddrw(this.e, sourceDirectTransferApiService, this.a, b2, denf.c(str, packageManager), str, getServiceRequest.p);
        } else {
            sourceDirectTransferApiService = this;
        }
        bxgjVar.c(sourceDirectTransferApiService.c);
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
        b.h("onDestroy()", new Object[0]);
        ddrw ddrwVar = this.c;
        if (ddrwVar != null) {
            ddrw.a.h("onDestroy()", new Object[0]);
            ddkz ddkzVar = ddrwVar.b;
            if (ddkzVar != null) {
                ddrw.d(ddkzVar, ddrwVar.c);
            }
            ddrwVar.c();
        }
        fsew.c();
        demy.a(this.a);
        super.onDestroy();
    }
}
