package com.google.android.gms.common.battery;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.arkt;
import defpackage.arku;
import defpackage.arkv;
import defpackage.fnfg;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class UnexpectedBatteryIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fvbo.f(intent, "intent");
        if (fnfg.d()) {
            String action = intent.getAction();
            arku arkuVar = arkv.a;
            Context applicationContext = getApplicationContext();
            fvbo.e(applicationContext, "getApplicationContext(...)");
            arkv a = arkuVar.a(applicationContext);
            if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action) || "android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                arkt.a(a);
            }
        }
    }
}
