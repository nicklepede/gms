package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aery;
import defpackage.afjq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AutofillFlagChangeIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action;
        char c;
        if (!AutofillModuleInitIntentOperation.e() || intent == null || (action = intent.getAction()) == null) {
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != -544318258) {
            if (hashCode == -335680806 && action.equals("com.google.android.gms.phenotype.com.google.android.gms.autofill.COMMITTED")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.gms.phenotype.COMMITTED")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0 || (c == 1 && "com.google.android.gms.autofill".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")))) {
            afjq.a(aery.a(this));
        }
    }
}
