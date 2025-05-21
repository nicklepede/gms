package com.google.android.gms.carsetup.frx;

import android.content.Intent;
import com.google.android.gms.carsetup.fsm.impl.ActivityResult;
import defpackage.alus;
import defpackage.aluv;
import defpackage.alvg;
import defpackage.alvh;
import defpackage.alvi;
import defpackage.ejhh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@alvi(a = {@alvh(a = SetupFsm$FrxOptInState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @alvh(a = SetupFsm$FrxOptInState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @alvh(a = SetupFsm$FrxOptInState.class, c = SetupFsm$ResetDefaultCarDockState.class, d = "EVENT_FRX_OPT_IN_ACCEPTED"), @alvh(a = SetupFsm$FrxOptInState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_FRX_OPT_IN_CANCELLED")})
/* loaded from: classes3.dex */
public class SetupFsm$FrxOptInState extends alvg {
    @Override // defpackage.alvg
    public final int a() {
        return 8;
    }

    @Override // defpackage.alvg
    public final boolean b(String str, Object obj) {
        if (!"EVENT_ACTIVITY_RESULT".equals(str) || obj == null) {
            return ("EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_FRX_OPT_IN_ACCEPTED".equals(str) || "EVENT_FRX_OPT_IN_CANCELLED".equals(str)) ? false : true;
        }
        ActivityResult activityResult = (ActivityResult) obj;
        Intent intent = activityResult.b;
        if (intent == null) {
            this.c.d("EVENT_FRX_OPT_IN_CANCELLED");
            return true;
        }
        ejhh ejhhVar = alus.a;
        intent.toUri(0);
        int i = activityResult.a;
        if (intent.getBooleanExtra("EXTRA_FRX_HAS_ERROR", false)) {
            alus.a.i().ah(2825).x("Critical error: frx error");
            this.c.d("EVENT_ERROR");
            return true;
        }
        if (i == -1) {
            this.c.d("EVENT_FRX_OPT_IN_ACCEPTED");
            return true;
        }
        alus.a.i().ah(2824).x("Critical error: opt in cancelled");
        this.c.d("EVENT_FRX_OPT_IN_CANCELLED");
        return true;
    }

    @Override // defpackage.alvg
    public final void c(String str) {
        aluv aluvVar = (aluv) this.c.k;
        this.b.getPackageManager();
        Intent W = aluvVar.W();
        if (W.resolveActivity(this.b.getPackageManager()) != null) {
            this.c.i(W);
        } else {
            this.c.d("EVENT_ERROR");
        }
    }
}
