package com.google.android.gms.common.battery;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.atni;
import defpackage.atnj;
import defpackage.atnk;
import defpackage.fpxf;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class UnexpectedBatteryIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fxxm.f(intent, "intent");
        if (fpxf.d()) {
            String action = intent.getAction();
            atnj atnjVar = atnk.a;
            Context applicationContext = getApplicationContext();
            fxxm.e(applicationContext, "getApplicationContext(...)");
            atnk a = atnjVar.a(applicationContext);
            if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action) || "android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                atni.a(a);
            }
        }
    }
}
