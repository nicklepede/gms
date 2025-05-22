package com.google.android.gms.carsetup.frx;

import defpackage.anvq;
import defpackage.anwd;
import defpackage.anwg;
import defpackage.anwr;
import defpackage.anws;
import defpackage.anwt;
import defpackage.eluq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@anwt(a = {@anws(c = SetupFsm$CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @anws(a = SetupFsm$DownloadAppsState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @anws(a = SetupFsm$DownloadAppsState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @anws(a = SetupFsm$DownloadAppsState.class, c = SetupFsm$StartCarService.class, d = "EVENT_OK_STATE_SKIPPED"), @anws(a = SetupFsm$DownloadAppsState.class, c = SetupFsm$InstallingAppsState.class, d = "EVENT_APPLICATION_INSTALLATION_ALLOWED"), @anws(a = SetupFsm$DownloadAppsState.class, c = SetupFsm$DownloadRetryState.class, d = "EVENT_APPLICATION_INSTALLATION_CANCELLED")})
/* loaded from: classes3.dex */
public class SetupFsm$DownloadAppsState extends anwr {
    @Override // defpackage.anwr
    public final int a() {
        return 5;
    }

    @Override // defpackage.anwr
    public final boolean b(String str, Object obj) {
        return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_APPLICATION_INSTALLATION_ALLOWED".equals(str) || "EVENT_APPLICATION_INSTALLATION_CANCELLED".equals(str)) ? false : true;
    }

    @Override // defpackage.anwr
    public final void c(String str) {
        anwg anwgVar = (anwg) this.c.k;
        if (anwgVar.O()) {
            this.c.d("EVENT_OK_STATE_SKIPPED");
            return;
        }
        this.c.k(anvq.class, null, true);
        eluq eluqVar = anwd.a;
        anwgVar.F();
    }
}
