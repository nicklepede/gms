package com.google.android.gms.carsetup.frx;

import defpackage.anup;
import defpackage.anwr;
import defpackage.anws;
import defpackage.anwt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@anwt(a = {@anws(a = SetupFsm$CarMovingState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @anws(a = SetupFsm$CarMovingState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @anws(a = SetupFsm$CarMovingState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_USER_EXIT"), @anws(a = SetupFsm$CarMovingState.class, d = "EVENT_CAR_PARKED")})
/* loaded from: classes3.dex */
public class SetupFsm$CarMovingState extends anwr {
    @Override // defpackage.anwr
    public final int a() {
        return 9;
    }

    @Override // defpackage.anwr
    public final boolean b(String str, Object obj) {
        return ("EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_USER_EXIT".equals(str) || "EVENT_CAR_PARKED".equals(str)) ? false : true;
    }

    @Override // defpackage.anwr
    public final void c(String str) {
        this.c.j(anup.class);
    }
}
