package com.google.android.gms.carsetup.frx;

import defpackage.alus;
import defpackage.alvg;
import defpackage.alvh;
import defpackage.alvi;
import defpackage.ejhh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@alvi(a = {@alvh(a = SetupFsm$ResetDefaultCarDockState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @alvh(a = SetupFsm$ResetDefaultCarDockState.class, c = SetupFsm$SetupDoneState.class, d = "EVENT_OK_STATE_SKIPPED"), @alvh(a = SetupFsm$ResetDefaultCarDockState.class, c = SetupFsm$SetupDoneState.class, d = "EVENT_CAR_DOCK_CHOICE_RESET")})
/* loaded from: classes3.dex */
public class SetupFsm$ResetDefaultCarDockState extends alvg {
    @Override // defpackage.alvg
    public final int a() {
        return 45;
    }

    @Override // defpackage.alvg
    public final boolean b(String str, Object obj) {
        return ("EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_CAR_DOCK_CHOICE_RESET".equals(str)) ? false : true;
    }

    @Override // defpackage.alvg
    public final void c(String str) {
        ejhh ejhhVar = alus.a;
        this.c.d("EVENT_OK_STATE_SKIPPED");
    }
}
