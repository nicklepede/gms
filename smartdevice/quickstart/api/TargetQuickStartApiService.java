package com.google.android.gms.smartdevice.quickstart.api;

import android.content.Intent;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auad;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dgjq;
import defpackage.dgyt;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.fvar;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TargetQuickStartApiService extends bzot {
    public static final auad a = new dgyt(new String[]{"TargetQuickStartApiService"});
    private dgjq b;

    public TargetQuickStartApiService() {
        super(243, "com.google.android.gms.smartdevice.quickstart.api.TargetQuickStartApiService.START", elpp.a, 0, 9, elhz.G(fvar.a.lK().a().b));
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        auad auadVar = a;
        auadVar.d("onGetService()", new Object[0]);
        if (this.b == null) {
            auadVar.d("Creating new instance ", new Object[0]);
            this.b = new dgjq(this, l(), getServiceRequest.f, getServiceRequest.p);
        }
        bzozVar.c(this.b);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        a.d("onCreate()", new Object[0]);
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        super.onDestroy();
        a.d("onDestroy()", new Object[0]);
        dgjq dgjqVar = this.b;
        if (dgjqVar != null) {
            dgjqVar.f();
        }
        this.b = null;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final boolean onUnbind(Intent intent) {
        a.d("onUnbind()", new Object[0]);
        return false;
    }
}
