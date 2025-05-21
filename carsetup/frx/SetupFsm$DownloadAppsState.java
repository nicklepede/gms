package com.google.android.gms.carsetup.frx;

import defpackage.aluf;
import defpackage.alus;
import defpackage.aluv;
import defpackage.alvg;
import defpackage.alvh;
import defpackage.alvi;
import defpackage.ejhh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@alvi(a = {@alvh(c = SetupFsm$CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @alvh(a = SetupFsm$DownloadAppsState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @alvh(a = SetupFsm$DownloadAppsState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @alvh(a = SetupFsm$DownloadAppsState.class, c = SetupFsm$StartCarService.class, d = "EVENT_OK_STATE_SKIPPED"), @alvh(a = SetupFsm$DownloadAppsState.class, c = SetupFsm$InstallingAppsState.class, d = "EVENT_APPLICATION_INSTALLATION_ALLOWED"), @alvh(a = SetupFsm$DownloadAppsState.class, c = SetupFsm$DownloadRetryState.class, d = "EVENT_APPLICATION_INSTALLATION_CANCELLED")})
/* loaded from: classes3.dex */
public class SetupFsm$DownloadAppsState extends alvg {
    @Override // defpackage.alvg
    public final int a() {
        return 5;
    }

    @Override // defpackage.alvg
    public final boolean b(String str, Object obj) {
        return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_APPLICATION_INSTALLATION_ALLOWED".equals(str) || "EVENT_APPLICATION_INSTALLATION_CANCELLED".equals(str)) ? false : true;
    }

    @Override // defpackage.alvg
    public final void c(String str) {
        aluv aluvVar = (aluv) this.c.k;
        if (aluvVar.O()) {
            this.c.d("EVENT_OK_STATE_SKIPPED");
            return;
        }
        this.c.k(aluf.class, null, true);
        ejhh ejhhVar = alus.a;
        aluvVar.F();
    }
}
