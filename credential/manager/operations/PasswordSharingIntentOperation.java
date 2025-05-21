package com.google.android.gms.credential.manager.operations;

import android.content.Intent;
import defpackage.asej;
import defpackage.asot;
import defpackage.avnp;
import defpackage.avnt;
import defpackage.avwp;
import defpackage.ejhf;
import defpackage.fuyy;
import defpackage.fvbo;
import defpackage.fvgu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class PasswordSharingIntentOperation extends avnt {
    private static final asot b = asot.b("PasswordSharingIntentOperation", asej.CREDENTIAL_MANAGER);
    public avwp a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fvbo.f(intent, "intent");
        if (!fvbo.n(intent.getAction(), "com.google.android.gms.credential.manager.operations.PROCESS_INCOMING_PASSWORD_SHARING_INVITATIONS")) {
            ((ejhf) b.j()).x("Unsupported action in the intent.");
            return;
        }
        String stringExtra = intent.getStringExtra("account_name");
        if (stringExtra == null) {
            ((ejhf) b.j()).x("Account is missing from the intent.");
        } else {
            fvgu.a(fuyy.a, new avnp(this, stringExtra, null));
        }
    }
}
