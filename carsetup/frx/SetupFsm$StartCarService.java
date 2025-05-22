package com.google.android.gms.carsetup.frx;

import defpackage.anwg;
import defpackage.anwr;
import defpackage.anws;
import defpackage.anwt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@anwt(a = {@anws(a = SetupFsm$StartCarService.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @anws(a = SetupFsm$StartCarService.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @anws(c = SetupFsm$CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @anws(a = SetupFsm$StartCarService.class, c = SetupFsm$FrxOptInState.class, d = "EVENT_CAR_SERVICE_STARTED")})
/* loaded from: classes3.dex */
public class SetupFsm$StartCarService extends anwr {
    @Override // defpackage.anwr
    public final int a() {
        return 44;
    }

    @Override // defpackage.anwr
    public final boolean b(String str, Object obj) {
        return ("EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_CAR_SERVICE_STARTED".equals(str)) ? false : true;
    }

    @Override // defpackage.anwr
    public final void c(String str) {
        if (((anwg) this.c.k).V()) {
            this.c.d("EVENT_CAR_SERVICE_STARTED");
        }
    }
}
