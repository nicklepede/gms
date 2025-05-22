package com.google.android.gms.smartdevice.wifi;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dgzr;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WifiHelperChimeraService extends bzot {
    public WifiHelperChimeraService() {
        super(159, "com.google.android.gms.smartdevice.wifi.START_WIFI_HELPER_SERVICE", elpp.a, 0, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if ("com.google.android.gms".equals(getServiceRequest.f)) {
            bzozVar.c(new dgzr(l(), getServiceRequest.f, getServiceRequest.p));
        } else {
            bzozVar.a(16, null);
        }
    }
}
