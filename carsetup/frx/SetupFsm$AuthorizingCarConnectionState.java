package com.google.android.gms.carsetup.frx;

import com.google.android.gms.carsetup.frx.SetupFsm$AuthorizingCarConnectionState;
import defpackage.anun;
import defpackage.anwd;
import defpackage.anwg;
import defpackage.anwr;
import defpackage.anws;
import defpackage.anwt;
import defpackage.eluq;
import defpackage.font;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@anwt(a = {@anws(c = SetupFsm$CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @anws(a = SetupFsm$AuthorizingCarConnectionState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @anws(a = SetupFsm$AuthorizingCarConnectionState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @anws(a = SetupFsm$AuthorizingCarConnectionState.class, c = SetupFsm$CheckPermissionsState.class, d = "EVENT_OK_STATE_SKIPPED"), @anws(a = SetupFsm$AuthorizingCarConnectionState.class, c = SetupFsm$CheckPermissionsState.class, d = "EVENT_CAR_CONNECTION_ALLOWED"), @anws(a = SetupFsm$AuthorizingCarConnectionState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_CONNECTION_DISALLOWED"), @anws(a = SetupFsm$AuthorizingCarConnectionState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_CONNECTION_CANCELLED")})
/* loaded from: classes3.dex */
public class SetupFsm$AuthorizingCarConnectionState extends anwr {
    @Override // defpackage.anwr
    public final int a() {
        return 4;
    }

    @Override // defpackage.anwr
    public final boolean b(String str, Object obj) {
        anwg anwgVar = (anwg) this.c.k;
        if ("EVENT_CAR_DISCONNECTED".equals(str)) {
            eluq eluqVar = anwd.a;
            anwgVar.M();
        }
        if ("EVENT_CAR_CONNECTION_ALLOWED".equals(str) || "EVENT_CAR_CONNECTION_DISALLOWED".equals(str) || "EVENT_CAR_CONNECTION_CANCELLED".equals(str)) {
            anwgVar.N();
        }
        return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_CAR_CONNECTION_ALLOWED".equals(str) || "EVENT_CAR_CONNECTION_DISALLOWED".equals(str) || "EVENT_CAR_CONNECTION_CANCELLED".equals(str)) ? false : true;
    }

    @Override // defpackage.anwr
    public final void c(String str) {
        anwg anwgVar = (anwg) this.c.k;
        if (anwgVar.R()) {
            this.c.d("EVENT_OK_STATE_SKIPPED");
            return;
        }
        if (anwgVar.U()) {
            this.c.j(anun.class);
            return;
        }
        anwd.a.j().ai(2813).x("Exiting car setup: car is rejected - 'Add new cars to Android Auto' user setting is disabled.");
        this.c.d("EVENT_CAR_CONNECTION_DISALLOWED");
        if (font.a.lK().a()) {
            ExecutorService C = anwgVar.C();
            C.execute(new Runnable() { // from class: anvx
                @Override // java.lang.Runnable
                public final void run() {
                    anlh.l(SetupFsm$AuthorizingCarConnectionState.this.b, eokg.ONLY_KNOWN_CARS);
                }
            });
            C.shutdown();
        }
    }
}
