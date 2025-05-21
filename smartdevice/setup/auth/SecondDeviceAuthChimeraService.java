package com.google.android.gms.smartdevice.setup.auth;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asrm;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.defs;
import defpackage.denq;
import defpackage.eits;
import defpackage.ejck;
import defpackage.entc;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SecondDeviceAuthChimeraService extends bxgd {
    public static final denq a = new denq(new String[]{"setup", "SecondDeviceAuthChimeraService"});
    private defs b;

    public SecondDeviceAuthChimeraService() {
        super(new int[]{275}, new String[]{"com.google.android.gms.smartdevice.setup.auth.SecondDeviceAuth.START"}, ejck.a, 0, entc.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new asrm("SecondDeviceAuthChimeraService", -2))), (eits) null);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        a.d("onGetService().", new Object[0]);
        if (this.b == null) {
            this.b = new defs(this, l(), getServiceRequest.f, getServiceRequest.p);
        }
        bxgjVar.c(this.b);
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        defs defsVar = this.b;
        if (defsVar != null) {
            defsVar.a.d();
            this.b = null;
        }
        super.onDestroy();
    }
}
