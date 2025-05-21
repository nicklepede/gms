package com.google.android.gms.smartdevice.quickstart.api;

import android.content.Intent;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arxo;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ddym;
import defpackage.denq;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.fsfu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TargetQuickStartApiService extends bxgd {
    public static final arxo a = new denq(new String[]{"TargetQuickStartApiService"});
    private ddym b;

    public TargetQuickStartApiService() {
        super(243, "com.google.android.gms.smartdevice.quickstart.api.TargetQuickStartApiService.START", ejck.a, 0, 9, eiuu.G(fsfu.a.a().a().b));
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        arxo arxoVar = a;
        arxoVar.d("onGetService()", new Object[0]);
        if (this.b == null) {
            arxoVar.d("Creating new instance ", new Object[0]);
            this.b = new ddym(this, l(), getServiceRequest.f, getServiceRequest.p);
        }
        bxgjVar.c(this.b);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        a.d("onCreate()", new Object[0]);
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        super.onDestroy();
        a.d("onDestroy()", new Object[0]);
        ddym ddymVar = this.b;
        if (ddymVar != null) {
            ddymVar.f();
        }
        this.b = null;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final boolean onUnbind(Intent intent) {
        a.d("onUnbind()", new Object[0]);
        return false;
    }
}
