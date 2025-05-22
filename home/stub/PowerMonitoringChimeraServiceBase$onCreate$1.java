package com.google.android.gms.home.stub;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.ausn;
import defpackage.bnic;
import defpackage.bnid;
import defpackage.bnie;
import defpackage.eluo;
import defpackage.fxxm;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PowerMonitoringChimeraServiceBase$onCreate$1 extends TracingBroadcastReceiver {
    final /* synthetic */ bnic a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PowerMonitoringChimeraServiceBase$onCreate$1(bnic bnicVar, Context context) {
        super(context);
        this.a = bnicVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        fxxm.f(context, "context");
        fxxm.f(intent, "intent");
        String action = intent.getAction();
        if (!Objects.equals(action, "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED") && !Objects.equals(action, "android.os.action.LOW_POWER_STANDBY_POLICY_CHANGED")) {
            ((eluo) bnic.b.j()).x("Energy mode BroadcastReceiver got unknown Intent");
            return;
        }
        ausn ausnVar = bnie.a;
        bnic bnicVar = this.a;
        Context baseContext = bnicVar.getBaseContext();
        fxxm.e(baseContext, "getBaseContext(...)");
        String a = bnid.a(baseContext);
        ((eluo) bnic.b.h()).B("Energy mode change to: %s", a);
        bnicVar.b(a);
    }
}
