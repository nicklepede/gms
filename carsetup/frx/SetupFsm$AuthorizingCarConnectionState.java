package com.google.android.gms.carsetup.frx;

import com.google.android.gms.carsetup.frx.SetupFsm$AuthorizingCarConnectionState;
import defpackage.altc;
import defpackage.alus;
import defpackage.aluv;
import defpackage.alvg;
import defpackage.alvh;
import defpackage.alvi;
import defpackage.ejhh;
import defpackage.flwk;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@alvi(a = {@alvh(c = SetupFsm$CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @alvh(a = SetupFsm$AuthorizingCarConnectionState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @alvh(a = SetupFsm$AuthorizingCarConnectionState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @alvh(a = SetupFsm$AuthorizingCarConnectionState.class, c = SetupFsm$CheckPermissionsState.class, d = "EVENT_OK_STATE_SKIPPED"), @alvh(a = SetupFsm$AuthorizingCarConnectionState.class, c = SetupFsm$CheckPermissionsState.class, d = "EVENT_CAR_CONNECTION_ALLOWED"), @alvh(a = SetupFsm$AuthorizingCarConnectionState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_CONNECTION_DISALLOWED"), @alvh(a = SetupFsm$AuthorizingCarConnectionState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_CONNECTION_CANCELLED")})
/* loaded from: classes3.dex */
public class SetupFsm$AuthorizingCarConnectionState extends alvg {
    @Override // defpackage.alvg
    public final int a() {
        return 4;
    }

    @Override // defpackage.alvg
    public final boolean b(String str, Object obj) {
        aluv aluvVar = (aluv) this.c.k;
        if ("EVENT_CAR_DISCONNECTED".equals(str)) {
            ejhh ejhhVar = alus.a;
            aluvVar.M();
        }
        if ("EVENT_CAR_CONNECTION_ALLOWED".equals(str) || "EVENT_CAR_CONNECTION_DISALLOWED".equals(str) || "EVENT_CAR_CONNECTION_CANCELLED".equals(str)) {
            aluvVar.N();
        }
        return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_OK_STATE_SKIPPED".equals(str) || "EVENT_CAR_CONNECTION_ALLOWED".equals(str) || "EVENT_CAR_CONNECTION_DISALLOWED".equals(str) || "EVENT_CAR_CONNECTION_CANCELLED".equals(str)) ? false : true;
    }

    @Override // defpackage.alvg
    public final void c(String str) {
        aluv aluvVar = (aluv) this.c.k;
        if (aluvVar.R()) {
            this.c.d("EVENT_OK_STATE_SKIPPED");
            return;
        }
        if (aluvVar.U()) {
            this.c.j(altc.class);
            return;
        }
        alus.a.j().ah(2809).x("Exiting car setup: car is rejected - 'Add new cars to Android Auto' user setting is disabled.");
        this.c.d("EVENT_CAR_CONNECTION_DISALLOWED");
        if (flwk.a.a().a()) {
            ExecutorService C = aluvVar.C();
            C.execute(new Runnable() { // from class: alum
                @Override // java.lang.Runnable
                public final void run() {
                    aljw.l(SetupFsm$AuthorizingCarConnectionState.this.b, elws.ONLY_KNOWN_CARS);
                }
            });
            C.shutdown();
        }
    }
}
