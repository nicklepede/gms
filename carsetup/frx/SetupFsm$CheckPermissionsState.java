package com.google.android.gms.carsetup.frx;

import com.google.android.gms.carsetup.fsm.impl.ActivityResult;
import defpackage.anwd;
import defpackage.anwg;
import defpackage.anwr;
import defpackage.anws;
import defpackage.anwt;
import defpackage.eluq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@anwt(a = {@anws(c = SetupFsm$CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @anws(a = SetupFsm$CheckPermissionsState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @anws(a = SetupFsm$CheckPermissionsState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @anws(a = SetupFsm$CheckPermissionsState.class, c = SetupFsm$DownloadAppsState.class, d = "EVENT_OK_STATE_SKIPPED"), @anws(a = SetupFsm$CheckPermissionsState.class, c = SetupFsm$ErrorState.class, d = "EVENT_PERMISSION_DENIED"), @anws(a = SetupFsm$CheckPermissionsState.class, c = SetupFsm$DownloadAppsState.class, d = "EVENT_ALL_PERMISSIONS_GRANTED")})
/* loaded from: classes3.dex */
public class SetupFsm$CheckPermissionsState extends anwr {
    @Override // defpackage.anwr
    public final int a() {
        return 13;
    }

    @Override // defpackage.anwr
    public final boolean b(String str, Object obj) {
        if (!"EVENT_ACTIVITY_RESULT".equals(str) || obj == null) {
            return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_PERMISSION_DENIED".equals(str) || "EVENT_ALL_PERMISSIONS_GRANTED".equals(str)) ? false : true;
        }
        eluq eluqVar = anwd.a;
        if (((ActivityResult) obj).a == -1) {
            this.c.d("EVENT_ALL_PERMISSIONS_GRANTED");
        } else {
            this.c.d("EVENT_PERMISSION_DENIED");
        }
        return true;
    }

    @Override // defpackage.anwr
    public final void c(String str) {
        if (((anwg) this.c.k).P()) {
            this.c.d("EVENT_OK_STATE_SKIPPED");
        } else {
            eluq eluqVar = anwd.a;
        }
    }
}
