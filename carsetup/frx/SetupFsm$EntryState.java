package com.google.android.gms.carsetup.frx;

import defpackage.alus;
import defpackage.aluv;
import defpackage.alvg;
import defpackage.alvh;
import defpackage.alvi;
import defpackage.ejhh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@alvi(a = {@alvh(a = SetupFsm$EntryState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @alvh(a = SetupFsm$EntryState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @alvh(a = SetupFsm$EntryState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_COUNTRY_NOT_WHITELISTED"), @alvh(a = SetupFsm$EntryState.class, c = SetupFsm$DeviceIncompatibleState.class, d = "EVENT_PHONE_IN_BLACKLIST"), @alvh(a = SetupFsm$EntryState.class, c = SetupFsm$DeviceIncompatibleState.class, d = "EVENT_DEVICE_INCOMPATIBLE"), @alvh(a = SetupFsm$EntryState.class, c = SetupFsm$AutoIntroState.class, d = "EVENT_DEVICE_COMPATIBLE"), @alvh(a = SetupFsm$EntryState.class, c = SetupFsm$AutoIntroState.class, d = "EVENT_DEVICE_COMPATIBLE_WHITELIST_BYPASS")})
/* loaded from: classes3.dex */
public class SetupFsm$EntryState extends alvg {
    @Override // defpackage.alvg
    public final int a() {
        return 42;
    }

    @Override // defpackage.alvg
    public final boolean b(String str, Object obj) {
        if (!"EVENT_ACTIVITY_RESULT".equals(str)) {
            return ("EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_COUNTRY_NOT_WHITELISTED".equals(str) || "EVENT_PHONE_IN_BLACKLIST".equals(str) || "EVENT_DEVICE_INCOMPATIBLE".equals(str) || "EVENT_DEVICE_COMPATIBLE".equals(str) || "EVENT_DEVICE_COMPATIBLE_WHITELIST_BYPASS".equals(str)) ? false : true;
        }
        this.c.d("EVENT_CAR_DISCONNECTED");
        return true;
    }

    @Override // defpackage.alvg
    public final void c(String str) {
        int x = ((aluv) this.c.k).x();
        ejhh ejhhVar = alus.a;
        this.c.d(x != 0 ? x != 1 ? x != 2 ? x != 3 ? "EVENT_DEVICE_INCOMPATIBLE" : "EVENT_PHONE_IN_BLACKLIST" : "EVENT_COUNTRY_NOT_WHITELISTED" : "EVENT_DEVICE_COMPATIBLE_WHITELIST_BYPASS" : "EVENT_DEVICE_COMPATIBLE");
    }
}
