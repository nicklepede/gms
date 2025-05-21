package com.google.android.gms.auth.account.service;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asng;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.vah;
import defpackage.vbz;
import java.util.Collections;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class WorkAccountApiService extends bxgd {
    private vah a;
    private vbz b;

    public WorkAccountApiService() {
        super(120, "com.google.android.gms.auth.account.workaccount.START", Collections.EMPTY_SET, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        if (asng.X(this)) {
            bxgjVar.c(this.b);
        } else if (str != null && this.a.e(str)) {
            bxgjVar.c(this.b);
        } else {
            Log.e("Auth", String.format(Locale.US, "[WorkAccountApiService] Caller can't manage work accounts %s", str));
            bxgjVar.a(13, Bundle.EMPTY);
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        this.b = new vbz(this, this.e);
        this.a = (vah) vah.a.b();
    }
}
