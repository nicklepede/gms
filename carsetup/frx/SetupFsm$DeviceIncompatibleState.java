package com.google.android.gms.carsetup.frx;

import android.content.Intent;
import defpackage.anve;
import defpackage.anvh;
import defpackage.anvj;
import defpackage.anwg;
import defpackage.anwr;
import defpackage.anws;
import defpackage.anwt;
import defpackage.anxe;
import defpackage.fona;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@anwt(a = {@anws(c = SetupFsm$CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @anws(a = SetupFsm$DeviceIncompatibleState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @anws(a = SetupFsm$DeviceIncompatibleState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @anws(a = SetupFsm$DeviceIncompatibleState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_INTRO_DECLINED"), @anws(a = SetupFsm$DeviceIncompatibleState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_USER_EXIT"), @anws(a = SetupFsm$DeviceIncompatibleState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_USE_VANAGON_CLICKED")})
/* loaded from: classes3.dex */
public class SetupFsm$DeviceIncompatibleState extends anwr {
    @Override // defpackage.anwr
    public final int a() {
        return 39;
    }

    @Override // defpackage.anwr
    public final boolean b(String str, Object obj) {
        anwg anwgVar = (anwg) this.c.k;
        if (!"EVENT_USE_VANAGON_CLICKED".equals(str)) {
            return ("EVENT_INTRO_DECLINED".equals(str) || "EVENT_USER_EXIT".equals(str) || "EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str)) ? false : true;
        }
        if (!anwgVar.S()) {
            Intent e = anxe.e(this.c.b, null);
            e.addFlags(268435456);
            this.b.startActivity(e);
        }
        return false;
    }

    @Override // defpackage.anwr
    public final void c(String str) {
        if (((anwg) this.c.k).x() != 5) {
            this.c.j(anvh.class);
        } else if (fona.c()) {
            this.c.j(anve.class);
        } else {
            this.c.j(anvj.class);
        }
    }
}
