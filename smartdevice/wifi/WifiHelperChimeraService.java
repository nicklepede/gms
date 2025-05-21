package com.google.android.gms.smartdevice.wifi;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.deoo;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WifiHelperChimeraService extends bxgd {
    public WifiHelperChimeraService() {
        super(159, "com.google.android.gms.smartdevice.wifi.START_WIFI_HELPER_SERVICE", ejck.a, 0, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if ("com.google.android.gms".equals(getServiceRequest.f)) {
            bxgjVar.c(new deoo(l(), getServiceRequest.f, getServiceRequest.p));
        } else {
            bxgjVar.a(16, null);
        }
    }
}
