package com.google.android.gms.fido;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bddm;
import defpackage.bddo;
import defpackage.beow;
import defpackage.fngi;
import defpackage.fqpj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PhenotypeUpdateIntentOperation extends IntentOperation {
    public static final beow a = new beow("PhenotypeUpdateIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !"com.google.android.gms.phenotype.UPDATE".equals(intent.getAction()) || !"com.google.android.gms.fido".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            a.d("Received invalid intent: %s", intent);
            return;
        }
        if (fqpj.a.lK().g()) {
            bddm.d(getApplicationContext(), getPackageName());
        }
        if (fngi.c()) {
            return;
        }
        ((bddo) bddo.a.b()).a();
    }
}
