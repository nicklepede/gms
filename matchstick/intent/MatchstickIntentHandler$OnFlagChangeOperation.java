package com.google.android.gms.matchstick.intent;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ceox;
import defpackage.drbf;
import defpackage.fsux;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MatchstickIntentHandler$OnFlagChangeOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            drbf.a("IntentHandler", "Intent is null", new Object[0]);
            return;
        }
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || ceox.a.equals(action)) && "com.google.android.gms.matchstick".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            ceox.a(getBaseContext());
            if (fsux.g()) {
                ceox.g(getBaseContext(), "com.google.android.gms.matchstick.ui.LighterEntryPointActivity", true);
            }
        }
    }
}
