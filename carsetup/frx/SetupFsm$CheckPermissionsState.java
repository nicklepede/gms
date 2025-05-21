package com.google.android.gms.carsetup.frx;

import com.google.android.gms.carsetup.fsm.impl.ActivityResult;
import defpackage.alus;
import defpackage.aluv;
import defpackage.alvg;
import defpackage.alvh;
import defpackage.alvi;
import defpackage.ejhh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@alvi(a = {@alvh(c = SetupFsm$CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @alvh(a = SetupFsm$CheckPermissionsState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @alvh(a = SetupFsm$CheckPermissionsState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @alvh(a = SetupFsm$CheckPermissionsState.class, c = SetupFsm$DownloadAppsState.class, d = "EVENT_OK_STATE_SKIPPED"), @alvh(a = SetupFsm$CheckPermissionsState.class, c = SetupFsm$ErrorState.class, d = "EVENT_PERMISSION_DENIED"), @alvh(a = SetupFsm$CheckPermissionsState.class, c = SetupFsm$DownloadAppsState.class, d = "EVENT_ALL_PERMISSIONS_GRANTED")})
/* loaded from: classes3.dex */
public class SetupFsm$CheckPermissionsState extends alvg {
    @Override // defpackage.alvg
    public final int a() {
        return 13;
    }

    @Override // defpackage.alvg
    public final boolean b(String str, Object obj) {
        if (!"EVENT_ACTIVITY_RESULT".equals(str) || obj == null) {
            return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_PERMISSION_DENIED".equals(str) || "EVENT_ALL_PERMISSIONS_GRANTED".equals(str)) ? false : true;
        }
        ejhh ejhhVar = alus.a;
        if (((ActivityResult) obj).a == -1) {
            this.c.d("EVENT_ALL_PERMISSIONS_GRANTED");
        } else {
            this.c.d("EVENT_PERMISSION_DENIED");
        }
        return true;
    }

    @Override // defpackage.alvg
    public final void c(String str) {
        if (((aluv) this.c.k).P()) {
            this.c.d("EVENT_OK_STATE_SKIPPED");
        } else {
            ejhh ejhhVar = alus.a;
        }
    }
}
