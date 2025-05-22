package com.google.android.gms.checkin;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aprr;
import defpackage.apuv;
import defpackage.auad;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.elqn;
import defpackage.fous;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CheckinApiChimeraService extends bzot {
    private static final auad a = apuv.a("CheckinApiChimeraService");
    private static final elhz b = new elqn("org.chromium.arc.gms");

    public CheckinApiChimeraService() {
        super(130, "com.google.android.gms.checkin.START", elpp.a, 1, true != fous.c() ? 9 : 0, b);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        a.h("onGetService", new Object[0]);
        bzozVar.c(new aprr(this, l()));
    }
}
