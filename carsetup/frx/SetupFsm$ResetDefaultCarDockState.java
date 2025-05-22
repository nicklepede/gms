package com.google.android.gms.carsetup.frx;

import defpackage.anwd;
import defpackage.anwr;
import defpackage.anws;
import defpackage.anwt;
import defpackage.eluq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@anwt(a = {@anws(a = SetupFsm$ResetDefaultCarDockState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @anws(a = SetupFsm$ResetDefaultCarDockState.class, c = SetupFsm$SetupDoneState.class, d = "EVENT_OK_STATE_SKIPPED"), @anws(a = SetupFsm$ResetDefaultCarDockState.class, c = SetupFsm$SetupDoneState.class, d = "EVENT_CAR_DOCK_CHOICE_RESET")})
/* loaded from: classes3.dex */
public class SetupFsm$ResetDefaultCarDockState extends anwr {
    @Override // defpackage.anwr
    public final int a() {
        return 45;
    }

    @Override // defpackage.anwr
    public final boolean b(String str, Object obj) {
        return ("EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_CAR_DOCK_CHOICE_RESET".equals(str)) ? false : true;
    }

    @Override // defpackage.anwr
    public final void c(String str) {
        eluq eluqVar = anwd.a;
        this.c.d("EVENT_OK_STATE_SKIPPED");
    }
}
