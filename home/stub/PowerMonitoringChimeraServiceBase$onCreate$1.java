package com.google.android.gms.home.stub;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.asot;
import defpackage.blbk;
import defpackage.blbl;
import defpackage.blbm;
import defpackage.ejhf;
import defpackage.fvbo;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class PowerMonitoringChimeraServiceBase$onCreate$1 extends TracingBroadcastReceiver {
    final /* synthetic */ blbk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PowerMonitoringChimeraServiceBase$onCreate$1(blbk blbkVar, Context context) {
        super(context);
        this.a = blbkVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        fvbo.f(context, "context");
        fvbo.f(intent, "intent");
        String action = intent.getAction();
        if (!Objects.equals(action, "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED") && !Objects.equals(action, "android.os.action.LOW_POWER_STANDBY_POLICY_CHANGED")) {
            ((ejhf) blbk.b.j()).x("Energy mode BroadcastReceiver got unknown Intent");
            return;
        }
        asot asotVar = blbm.a;
        blbk blbkVar = this.a;
        Context baseContext = blbkVar.getBaseContext();
        fvbo.e(baseContext, "getBaseContext(...)");
        String a = blbl.a(baseContext);
        ((ejhf) blbk.b.h()).B("Energy mode change to: %s", a);
        blbkVar.b(a);
    }
}
