package com.google.android.gms.auth.easyunlock.config;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.easyunlock.authorization.EasyUnlockChimeraService;
import defpackage.asqg;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhenotypeChangeListenerIntentOperation extends IntentOperation {
    static final String a = asqg.f("com.google.android.gms.auth.easyunlock");

    public PhenotypeChangeListenerIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ((Objects.equals(intent.getAction(), "com.google.android.gms.phenotype.COMMITTED") || a.equals(intent.getAction())) && Objects.equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.auth.easyunlock")) {
            startService(EasyUnlockSupportReporterIntentOperation.a(this));
            startService(EasyUnlockChimeraService.a(this));
        }
    }

    PhenotypeChangeListenerIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
