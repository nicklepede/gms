package com.google.android.gms.smartdevice.setup.auth;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auvg;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dgqv;
import defpackage.dgyt;
import defpackage.elgx;
import defpackage.elpp;
import defpackage.eqgv;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SecondDeviceAuthChimeraService extends bzot {
    public static final dgyt a = new dgyt(new String[]{"setup", "SecondDeviceAuthChimeraService"});
    private dgqv b;

    public SecondDeviceAuthChimeraService() {
        super(new int[]{275}, new String[]{"com.google.android.gms.smartdevice.setup.auth.SecondDeviceAuth.START"}, elpp.a, 0, eqgv.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new auvg("SecondDeviceAuthChimeraService", -2))), (elgx) null);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        a.d("onGetService().", new Object[0]);
        if (this.b == null) {
            this.b = new dgqv(this, l(), getServiceRequest.f, getServiceRequest.p);
        }
        bzozVar.c(this.b);
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        dgqv dgqvVar = this.b;
        if (dgqvVar != null) {
            dgqvVar.a.d();
            this.b = null;
        }
        super.onDestroy();
    }
}
