package com.google.android.gms.carsetup.frx;

import defpackage.alte;
import defpackage.alvg;
import defpackage.alvh;
import defpackage.alvi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@alvi(a = {@alvh(a = SetupFsm$CarMovingState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @alvh(a = SetupFsm$CarMovingState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @alvh(a = SetupFsm$CarMovingState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_USER_EXIT"), @alvh(a = SetupFsm$CarMovingState.class, d = "EVENT_CAR_PARKED")})
/* loaded from: classes3.dex */
public class SetupFsm$CarMovingState extends alvg {
    @Override // defpackage.alvg
    public final int a() {
        return 9;
    }

    @Override // defpackage.alvg
    public final boolean b(String str, Object obj) {
        return ("EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_USER_EXIT".equals(str) || "EVENT_CAR_PARKED".equals(str)) ? false : true;
    }

    @Override // defpackage.alvg
    public final void c(String str) {
        this.c.j(alte.class);
    }
}
