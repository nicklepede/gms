package com.google.android.gms.matchstick.intent;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ccgd;
import defpackage.doqw;
import defpackage.fqaz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MatchstickIntentHandler$OnFlagChangeOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            doqw.a("IntentHandler", "Intent is null", new Object[0]);
            return;
        }
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || ccgd.a.equals(action)) && "com.google.android.gms.matchstick".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            ccgd.a(getBaseContext());
            if (fqaz.g()) {
                ccgd.g(getBaseContext(), "com.google.android.gms.matchstick.ui.LighterEntryPointActivity", true);
            }
        }
    }
}
