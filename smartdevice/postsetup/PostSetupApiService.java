package com.google.android.gms.smartdevice.postsetup;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dduv;
import defpackage.denf;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PostSetupApiService extends bxgd {
    private dduv a;

    public PostSetupApiService() {
        super(190, "com.google.android.gms.smartdevice.postsetup.PostSetupService.START", ejck.a, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        PostSetupApiService postSetupApiService;
        String str = getServiceRequest.f;
        int i = denf.a;
        getPackageManager();
        if (this.a == null) {
            postSetupApiService = this;
            postSetupApiService.a = new dduv(this.e, postSetupApiService, denf.b(str, this), str, getServiceRequest.p);
        } else {
            postSetupApiService = this;
        }
        bxgjVar.c(postSetupApiService.a);
    }
}
