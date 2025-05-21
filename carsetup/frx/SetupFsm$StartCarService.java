package com.google.android.gms.carsetup.frx;

import defpackage.aluv;
import defpackage.alvg;
import defpackage.alvh;
import defpackage.alvi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@alvi(a = {@alvh(a = SetupFsm$StartCarService.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @alvh(a = SetupFsm$StartCarService.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @alvh(c = SetupFsm$CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @alvh(a = SetupFsm$StartCarService.class, c = SetupFsm$FrxOptInState.class, d = "EVENT_CAR_SERVICE_STARTED")})
/* loaded from: classes3.dex */
public class SetupFsm$StartCarService extends alvg {
    @Override // defpackage.alvg
    public final int a() {
        return 44;
    }

    @Override // defpackage.alvg
    public final boolean b(String str, Object obj) {
        return ("EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_CAR_SERVICE_STARTED".equals(str)) ? false : true;
    }

    @Override // defpackage.alvg
    public final void c(String str) {
        if (((aluv) this.c.k).V()) {
            this.c.d("EVENT_CAR_SERVICE_STARTED");
        }
    }
}
