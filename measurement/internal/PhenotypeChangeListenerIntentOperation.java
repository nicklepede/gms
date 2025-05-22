package com.google.android.gms.measurement.internal;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auua;
import defpackage.cfyy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PhenotypeChangeListenerIntentOperation extends IntentOperation {
    private static final String a = auua.f("com.google.android.gms.measurement");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || a.equals(intent.getAction())) && "com.google.android.gms.measurement".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            cfyy.i(this).aK().k.a("Measurement Phenotype flag(s) updated");
        }
    }
}
