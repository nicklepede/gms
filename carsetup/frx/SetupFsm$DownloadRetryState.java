package com.google.android.gms.carsetup.frx;

import defpackage.alth;
import defpackage.aluv;
import defpackage.alvg;
import defpackage.alvh;
import defpackage.alvi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@alvi(a = {@alvh(c = SetupFsm$CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @alvh(a = SetupFsm$DownloadRetryState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @alvh(a = SetupFsm$DownloadRetryState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @alvh(a = SetupFsm$DownloadRetryState.class, c = SetupFsm$StartCarService.class, d = "EVENT_OK_STATE_SKIPPED"), @alvh(a = SetupFsm$DownloadRetryState.class, c = SetupFsm$InstallingAppsState.class, d = "EVENT_APPLICATION_INSTALLATION_ALLOWED"), @alvh(a = SetupFsm$DownloadRetryState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_APPLICATION_INSTALLATION_CANCELLED")})
/* loaded from: classes3.dex */
public class SetupFsm$DownloadRetryState extends alvg {
    @Override // defpackage.alvg
    public final int a() {
        return 6;
    }

    @Override // defpackage.alvg
    public final boolean b(String str, Object obj) {
        return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_APPLICATION_INSTALLATION_ALLOWED".equals(str) || "EVENT_APPLICATION_INSTALLATION_CANCELLED".equals(str)) ? false : true;
    }

    @Override // defpackage.alvg
    public final void c(String str) {
        if (((aluv) this.c.k).O()) {
            this.c.d("EVENT_OK_STATE_SKIPPED");
        } else {
            this.c.j(alth.class);
        }
    }
}
