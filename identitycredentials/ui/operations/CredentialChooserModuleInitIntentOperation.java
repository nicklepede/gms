package com.google.android.gms.identitycredentials.ui.operations;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auqx;
import defpackage.aura;
import defpackage.fryd;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialChooserModuleInitIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fxxm.f(intent, "intent");
        if ((fxxm.n("com.google.android.gms.chimera.container.CONTAINER_UPDATED", intent.getAction()) || fxxm.n(IntentOperation.ACTION_NEW_MODULE, intent.getAction())) && !auqx.v(getApplicationContext())) {
            aura.K("com.google.android.gms.identitycredentials.ui.CredentialChooserActivity", true);
        }
        if ((fxxm.n("com.google.android.gms.phenotype.COMMITTED", intent.getAction()) || fxxm.n("com.google.android.gms.phenotype.com.google.android.gms.identitycredentials#com.google.android.gms.COMMITTED", intent.getAction())) && !fxxm.n("com.google.android.gms.identitycredentials#com.google.android.gms", intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            return;
        }
        if (fryd.a.lK().g() || !auqx.v(getApplicationContext())) {
            aura.K("com.google.android.gms.identitycredentials.ui.CredentialChooserActivity", true);
        } else {
            aura.K("com.google.android.gms.identitycredentials.ui.CredentialChooserActivity", false);
        }
    }
}
