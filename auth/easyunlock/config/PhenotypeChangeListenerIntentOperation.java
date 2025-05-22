package com.google.android.gms.auth.easyunlock.config;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.easyunlock.authorization.EasyUnlockChimeraService;
import defpackage.auua;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhenotypeChangeListenerIntentOperation extends IntentOperation {
    static final String a = auua.f("com.google.android.gms.auth.easyunlock");

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
