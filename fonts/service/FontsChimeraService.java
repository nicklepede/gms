package com.google.android.gms.fonts.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bjgz;
import defpackage.bjhc;
import defpackage.bjif;
import defpackage.bzot;
import defpackage.bzoz;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FontsChimeraService extends bzot {
    public FontsChimeraService() {
        super(132, "com.google.android.gms.fonts.service.START", Collections.EMPTY_SET, 3, 10);
        bjhc.c("FontsChimeraService", "ctor", new Object[0]);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        bjhc.c("FontsChimeraService", "onGetService (from %s)", str);
        bzozVar.c(new bjgz(l(), str));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        bjhc.c("FontsChimeraService", "onCreate::begin", new Object[0]);
        bjif.a.g(getApplicationContext());
        bjhc.e("FontsChimeraService", "onCreate::success", new Object[0]);
    }
}
