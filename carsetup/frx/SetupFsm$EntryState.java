package com.google.android.gms.carsetup.frx;

import defpackage.anwd;
import defpackage.anwg;
import defpackage.anwr;
import defpackage.anws;
import defpackage.anwt;
import defpackage.eluq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@anwt(a = {@anws(a = SetupFsm$EntryState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @anws(a = SetupFsm$EntryState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @anws(a = SetupFsm$EntryState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_COUNTRY_NOT_WHITELISTED"), @anws(a = SetupFsm$EntryState.class, c = SetupFsm$DeviceIncompatibleState.class, d = "EVENT_PHONE_IN_BLACKLIST"), @anws(a = SetupFsm$EntryState.class, c = SetupFsm$DeviceIncompatibleState.class, d = "EVENT_DEVICE_INCOMPATIBLE"), @anws(a = SetupFsm$EntryState.class, c = SetupFsm$AutoIntroState.class, d = "EVENT_DEVICE_COMPATIBLE"), @anws(a = SetupFsm$EntryState.class, c = SetupFsm$AutoIntroState.class, d = "EVENT_DEVICE_COMPATIBLE_WHITELIST_BYPASS")})
/* loaded from: classes3.dex */
public class SetupFsm$EntryState extends anwr {
    @Override // defpackage.anwr
    public final int a() {
        return 42;
    }

    @Override // defpackage.anwr
    public final boolean b(String str, Object obj) {
        if (!"EVENT_ACTIVITY_RESULT".equals(str)) {
            return ("EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_COUNTRY_NOT_WHITELISTED".equals(str) || "EVENT_PHONE_IN_BLACKLIST".equals(str) || "EVENT_DEVICE_INCOMPATIBLE".equals(str) || "EVENT_DEVICE_COMPATIBLE".equals(str) || "EVENT_DEVICE_COMPATIBLE_WHITELIST_BYPASS".equals(str)) ? false : true;
        }
        this.c.d("EVENT_CAR_DISCONNECTED");
        return true;
    }

    @Override // defpackage.anwr
    public final void c(String str) {
        int x = ((anwg) this.c.k).x();
        eluq eluqVar = anwd.a;
        this.c.d(x != 0 ? x != 1 ? x != 2 ? x != 3 ? "EVENT_DEVICE_INCOMPATIBLE" : "EVENT_PHONE_IN_BLACKLIST" : "EVENT_COUNTRY_NOT_WHITELISTED" : "EVENT_DEVICE_COMPATIBLE_WHITELIST_BYPASS" : "EVENT_DEVICE_COMPATIBLE");
    }
}
