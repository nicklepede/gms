package com.google.android.gms.identitycredentials.ui.operations;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asnd;
import defpackage.asng;
import defpackage.fpev;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class CredentialChooserModuleInitIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fvbo.f(intent, "intent");
        if ((fvbo.n("com.google.android.gms.chimera.container.CONTAINER_UPDATED", intent.getAction()) || fvbo.n(IntentOperation.ACTION_NEW_MODULE, intent.getAction())) && !asnd.v(getApplicationContext())) {
            asng.K("com.google.android.gms.identitycredentials.ui.CredentialChooserActivity", true);
        }
        if ((fvbo.n("com.google.android.gms.phenotype.COMMITTED", intent.getAction()) || fvbo.n("com.google.android.gms.phenotype.com.google.android.gms.identitycredentials#com.google.android.gms.COMMITTED", intent.getAction())) && !fvbo.n("com.google.android.gms.identitycredentials#com.google.android.gms", intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            return;
        }
        if (fpev.a.a().g() || !asnd.v(getApplicationContext())) {
            asng.K("com.google.android.gms.identitycredentials.ui.CredentialChooserActivity", true);
        } else {
            asng.K("com.google.android.gms.identitycredentials.ui.CredentialChooserActivity", false);
        }
    }
}
