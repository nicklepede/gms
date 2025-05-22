package com.google.android.gms.cast.intelligentsuggestions.api;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aoyl;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class DeviceSuggestionsApiService extends bzot {
    static {
        auid auidVar = auid.CAST_INTELLIGENT_DEVICE_SUGGESTIONS;
        int i = fxya.a;
        ausn.c("device_suggestions", auidVar, new fxxg(DeviceSuggestionsApiService.class).c());
    }

    public DeviceSuggestionsApiService() {
        super(432, "com.google.android.gms.cast.intelligentsuggestions.api.DeviceSuggestionsApiService.START", elpp.a, 3, 10);
    }

    @Override // defpackage.bzot
    public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        fxxm.f(getServiceRequest, "request");
        String str = getServiceRequest.f;
        aoyl.a(this);
        bzozVar.a(16, null);
    }
}
