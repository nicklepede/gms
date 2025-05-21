package com.google.android.gms.carsetup.frx;

import defpackage.altl;
import defpackage.alvg;
import defpackage.alvh;
import defpackage.alvi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@alvi(a = {@alvh(a = SetupFsm$ErrorState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @alvh(a = SetupFsm$ErrorState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_USER_EXIT")})
/* loaded from: classes3.dex */
public class SetupFsm$ErrorState extends alvg {
    @Override // defpackage.alvg
    public final int a() {
        return 10;
    }

    @Override // defpackage.alvg
    public final boolean b(String str, Object obj) {
        return ("EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_USER_EXIT".equals(str)) ? false : true;
    }

    @Override // defpackage.alvg
    public final void c(String str) {
        this.c.j(altl.class);
    }
}
