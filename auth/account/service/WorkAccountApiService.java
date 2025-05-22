package com.google.android.gms.auth.account.service;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aura;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.wwh;
import defpackage.wxz;
import java.util.Collections;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class WorkAccountApiService extends bzot {
    private wwh a;
    private wxz b;

    public WorkAccountApiService() {
        super(120, "com.google.android.gms.auth.account.workaccount.START", Collections.EMPTY_SET, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        if (aura.X(this)) {
            bzozVar.c(this.b);
        } else if (str != null && this.a.e(str)) {
            bzozVar.c(this.b);
        } else {
            Log.e("Auth", String.format(Locale.US, "[WorkAccountApiService] Caller can't manage work accounts %s", str));
            bzozVar.a(13, Bundle.EMPTY);
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        this.b = new wxz(this, this.e);
        this.a = (wwh) wwh.a.b();
    }
}
