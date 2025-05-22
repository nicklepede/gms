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
import defpackage.dgdc;
import defpackage.dgdh;
import defpackage.dgyb;
import defpackage.dgyi;
import defpackage.dgyt;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.fuyp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TargetDirectTransferApiService extends bzot {
    private static final auad b = new dgyt(new String[]{"D2D", "TargetDirectTransferApiService"});
    Handler a;
    private dgdh c;

    public TargetDirectTransferApiService() {
        super(211, "com.google.android.gms.smartdevice.directtransfer.TargetDirectTransferService.START", elpp.a, 3, 9);
    }

    @Override // defpackage.bzot
    public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        TargetDirectTransferApiService targetDirectTransferApiService;
        String str = getServiceRequest.f;
        int i = dgyi.a;
        PackageManager packageManager = getPackageManager();
        boolean b2 = dgyi.b(str, this);
        boolean a = dgyi.a(str, elhz.H(fuyp.c().split(",")), packageManager);
        if (fuyp.h() && !b2 && !a) {
            b.f(a.a(str, "callingPackage: ", " is not authorized"), new Object[0]);
            throw new SecurityException(String.valueOf(str).concat(" is not authorized"));
        }
        if (this.c == null) {
            targetDirectTransferApiService = this;
            targetDirectTransferApiService.c = new dgdh(this.e, targetDirectTransferApiService, this.a, b2, dgyi.c(str, packageManager), str, getServiceRequest.p);
        } else {
            targetDirectTransferApiService = this;
        }
        bzozVar.c(targetDirectTransferApiService.c);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        b.j("onCreate()", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TargetDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.a = new caqj(handlerThread.getLooper());
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        b.j("onDestroy()", new Object[0]);
        dgdh dgdhVar = this.c;
        if (dgdhVar != null) {
            dgdh.a.h("onDestroy()", new Object[0]);
            dgdhVar.c();
            dgdhVar.b.post(new dgdc(dgdhVar));
        }
        dgyb.a(this.a);
        super.onDestroy();
    }
}
