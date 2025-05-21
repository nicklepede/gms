package com.google.android.gms.measurement.internal;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asqg;
import defpackage.cdqa;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PhenotypeChangeListenerIntentOperation extends IntentOperation {
    private static final String a = asqg.f("com.google.android.gms.measurement");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || a.equals(intent.getAction())) && "com.google.android.gms.measurement".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            cdqa.i(this).aJ().k.a("Measurement Phenotype flag(s) updated");
        }
    }
}
