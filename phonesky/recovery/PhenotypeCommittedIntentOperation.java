package com.google.android.gms.phonesky.recovery;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.cyrg;
import defpackage.cyrj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PhenotypeCommittedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            cyrg.b("Invalid phenotype committed intent", new Object[0]);
            return;
        }
        String stringExtra = intent.getExtras() != null ? intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME") : null;
        if (!TextUtils.isEmpty(stringExtra) && TextUtils.equals("com.google.android.gms.phonesky_recovery", stringExtra)) {
            cyrg.a("Experiments updated. Start recovery checks.", new Object[0]);
            new cyrj(this).a();
        }
    }
}
