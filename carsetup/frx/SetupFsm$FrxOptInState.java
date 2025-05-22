package com.google.android.gms.carsetup.frx;

import android.content.Intent;
import com.google.android.gms.carsetup.fsm.impl.ActivityResult;
import defpackage.anwd;
import defpackage.anwg;
import defpackage.anwr;
import defpackage.anws;
import defpackage.anwt;
import defpackage.eluq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@anwt(a = {@anws(a = SetupFsm$FrxOptInState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @anws(a = SetupFsm$FrxOptInState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @anws(a = SetupFsm$FrxOptInState.class, c = SetupFsm$ResetDefaultCarDockState.class, d = "EVENT_FRX_OPT_IN_ACCEPTED"), @anws(a = SetupFsm$FrxOptInState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_FRX_OPT_IN_CANCELLED")})
/* loaded from: classes3.dex */
public class SetupFsm$FrxOptInState extends anwr {
    @Override // defpackage.anwr
    public final int a() {
        return 8;
    }

    @Override // defpackage.anwr
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
        eluq eluqVar = anwd.a;
        intent.toUri(0);
        int i = activityResult.a;
        if (intent.getBooleanExtra("EXTRA_FRX_HAS_ERROR", false)) {
            anwd.a.i().ai(2829).x("Critical error: frx error");
            this.c.d("EVENT_ERROR");
            return true;
        }
        if (i == -1) {
            this.c.d("EVENT_FRX_OPT_IN_ACCEPTED");
            return true;
        }
        anwd.a.i().ai(2828).x("Critical error: opt in cancelled");
        this.c.d("EVENT_FRX_OPT_IN_CANCELLED");
        return true;
    }

    @Override // defpackage.anwr
    public final void c(String str) {
        anwg anwgVar = (anwg) this.c.k;
        this.b.getPackageManager();
        Intent W = anwgVar.W();
        if (W.resolveActivity(this.b.getPackageManager()) != null) {
            this.c.i(W);
        } else {
            this.c.d("EVENT_ERROR");
        }
    }
}
