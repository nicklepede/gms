package com.google.android.gms.smartdevice.postsetup;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dgga;
import defpackage.dgyi;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PostSetupApiService extends bzot {
    private dgga a;

    public PostSetupApiService() {
        super(190, "com.google.android.gms.smartdevice.postsetup.PostSetupService.START", elpp.a, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        PostSetupApiService postSetupApiService;
        String str = getServiceRequest.f;
        int i = dgyi.a;
        getPackageManager();
        if (this.a == null) {
            postSetupApiService = this;
            postSetupApiService.a = new dgga(this.e, postSetupApiService, dgyi.b(str, this), str, getServiceRequest.p);
        } else {
            postSetupApiService = this;
        }
        bzozVar.c(postSetupApiService.a);
    }
}
