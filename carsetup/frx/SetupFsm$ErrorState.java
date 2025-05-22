package com.google.android.gms.carsetup.frx;

import defpackage.anuw;
import defpackage.anwr;
import defpackage.anws;
import defpackage.anwt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@anwt(a = {@anws(a = SetupFsm$ErrorState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @anws(a = SetupFsm$ErrorState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_USER_EXIT")})
/* loaded from: classes3.dex */
public class SetupFsm$ErrorState extends anwr {
    @Override // defpackage.anwr
    public final int a() {
        return 10;
    }

    @Override // defpackage.anwr
    public final boolean b(String str, Object obj) {
        return ("EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_USER_EXIT".equals(str)) ? false : true;
    }

    @Override // defpackage.anwr
    public final void c(String str) {
        this.c.j(anuw.class);
    }
}
