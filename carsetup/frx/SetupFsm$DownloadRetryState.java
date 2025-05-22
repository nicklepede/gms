package com.google.android.gms.carsetup.frx;

import defpackage.anus;
import defpackage.anwg;
import defpackage.anwr;
import defpackage.anws;
import defpackage.anwt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@anwt(a = {@anws(c = SetupFsm$CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @anws(a = SetupFsm$DownloadRetryState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @anws(a = SetupFsm$DownloadRetryState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @anws(a = SetupFsm$DownloadRetryState.class, c = SetupFsm$StartCarService.class, d = "EVENT_OK_STATE_SKIPPED"), @anws(a = SetupFsm$DownloadRetryState.class, c = SetupFsm$InstallingAppsState.class, d = "EVENT_APPLICATION_INSTALLATION_ALLOWED"), @anws(a = SetupFsm$DownloadRetryState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_APPLICATION_INSTALLATION_CANCELLED")})
/* loaded from: classes3.dex */
public class SetupFsm$DownloadRetryState extends anwr {
    @Override // defpackage.anwr
    public final int a() {
        return 6;
    }

    @Override // defpackage.anwr
    public final boolean b(String str, Object obj) {
        return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_APPLICATION_INSTALLATION_ALLOWED".equals(str) || "EVENT_APPLICATION_INSTALLATION_CANCELLED".equals(str)) ? false : true;
    }

    @Override // defpackage.anwr
    public final void c(String str) {
        if (((anwg) this.c.k).O()) {
            this.c.d("EVENT_OK_STATE_SKIPPED");
        } else {
            this.c.j(anus.class);
        }
    }
}
