package com.google.android.gms.credential.manager.operations;

import android.content.Intent;
import defpackage.asej;
import defpackage.asot;
import defpackage.avnm;
import defpackage.avns;
import defpackage.avoo;
import defpackage.ejhf;
import defpackage.fngj;
import defpackage.fuyy;
import defpackage.fvbo;
import defpackage.fvgu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class PasswordChangesIntentOperation extends avns {
    private static final asot b = asot.b("PasswordChangesIntentOperation", asej.CREDENTIAL_MANAGER);
    public avoo a;

    public final avoo a() {
        avoo avooVar = this.a;
        if (avooVar != null) {
            return avooVar;
        }
        fvbo.j("passwordChangesProcessor");
        return null;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fvbo.f(intent, "intent");
        if (fngj.f()) {
            if (!fvbo.n(intent.getAction(), "com.google.android.gms.credential.manager.operations.PASSWORDS_UPDATED")) {
                ((ejhf) b.j()).x("Unsupported action in the intent.");
                return;
            }
            String stringExtra = intent.getStringExtra("account_name");
            if (stringExtra == null) {
                ((ejhf) b.j()).x("Account is missing from the intent.");
            } else {
                fvgu.a(fuyy.a, new avnm(stringExtra, this, null));
            }
        }
    }
}
