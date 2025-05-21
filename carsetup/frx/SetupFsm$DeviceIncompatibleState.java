package com.google.android.gms.carsetup.frx;

import android.content.Intent;
import defpackage.altt;
import defpackage.altw;
import defpackage.alty;
import defpackage.aluv;
import defpackage.alvg;
import defpackage.alvh;
import defpackage.alvi;
import defpackage.alvt;
import defpackage.flvr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@alvi(a = {@alvh(c = SetupFsm$CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @alvh(a = SetupFsm$DeviceIncompatibleState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @alvh(a = SetupFsm$DeviceIncompatibleState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @alvh(a = SetupFsm$DeviceIncompatibleState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_INTRO_DECLINED"), @alvh(a = SetupFsm$DeviceIncompatibleState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_USER_EXIT"), @alvh(a = SetupFsm$DeviceIncompatibleState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_USE_VANAGON_CLICKED")})
/* loaded from: classes3.dex */
public class SetupFsm$DeviceIncompatibleState extends alvg {
    @Override // defpackage.alvg
    public final int a() {
        return 39;
    }

    @Override // defpackage.alvg
    public final boolean b(String str, Object obj) {
        aluv aluvVar = (aluv) this.c.k;
        if (!"EVENT_USE_VANAGON_CLICKED".equals(str)) {
            return ("EVENT_INTRO_DECLINED".equals(str) || "EVENT_USER_EXIT".equals(str) || "EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str)) ? false : true;
        }
        if (!aluvVar.S()) {
            Intent e = alvt.e(this.c.b, null);
            e.addFlags(268435456);
            this.b.startActivity(e);
        }
        return false;
    }

    @Override // defpackage.alvg
    public final void c(String str) {
        if (((aluv) this.c.k).x() != 5) {
            this.c.j(altw.class);
        } else if (flvr.c()) {
            this.c.j(altt.class);
        } else {
            this.c.j(alty.class);
        }
    }
}
