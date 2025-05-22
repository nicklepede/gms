package com.google.android.gms.smartdevice.directtransfer;

import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.a;
import defpackage.auad;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.caqj;
import defpackage.dfwe;
import defpackage.dgdb;
import defpackage.dgyb;
import defpackage.dgyi;
import defpackage.dgyt;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.fuyp;
import defpackage.fuzt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SourceDirectTransferApiService extends bzot {
    private static final auad b = new dgyt(new String[]{"DirectTransfer", "SourceDirectTransferApiService"});
    Handler a;
    private dgdb c;

    public SourceDirectTransferApiService() {
        super(210, "com.google.android.gms.smartdevice.directtransfer.SourceDirectTransferService.START", elpp.a, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        SourceDirectTransferApiService sourceDirectTransferApiService;
        auad auadVar = b;
        auadVar.h("onGetService.", new Object[0]);
        String str = getServiceRequest.f;
        int i = dgyi.a;
        PackageManager packageManager = getPackageManager();
        boolean b2 = dgyi.b(str, this);
        boolean a = dgyi.a(str, elhz.H(fuyp.c().split(",")), packageManager);
        if (fuyp.h() && !b2 && !a) {
            auadVar.f(a.a(str, "callingPackage: ", " is not authorized"), new Object[0]);
            throw new SecurityException(String.valueOf(str).concat(" is not authorized"));
        }
        if (this.c == null) {
            sourceDirectTransferApiService = this;
            sourceDirectTransferApiService.c = new dgdb(this.e, sourceDirectTransferApiService, this.a, b2, dgyi.c(str, packageManager), str, getServiceRequest.p);
        } else {
            sourceDirectTransferApiService = this;
        }
        bzozVar.c(sourceDirectTransferApiService.c);
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
        b.h("onDestroy()", new Object[0]);
        dgdb dgdbVar = this.c;
        if (dgdbVar != null) {
            dgdb.a.h("onDestroy()", new Object[0]);
            dfwe dfweVar = dgdbVar.b;
            if (dfweVar != null) {
                dgdb.d(dfweVar, dgdbVar.c);
            }
            dgdbVar.c();
        }
        fuzt.c();
        dgyb.a(this.a);
        super.onDestroy();
    }
}
