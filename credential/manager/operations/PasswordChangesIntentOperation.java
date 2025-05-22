package com.google.android.gms.credential.manager.operations;

import android.content.Intent;
import defpackage.auid;
import defpackage.ausn;
import defpackage.axrm;
import defpackage.axrs;
import defpackage.axso;
import defpackage.eluo;
import defpackage.fpyj;
import defpackage.fxuw;
import defpackage.fxxm;
import defpackage.fycs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PasswordChangesIntentOperation extends axrs {
    private static final ausn b = ausn.b("PasswordChangesIntentOperation", auid.CREDENTIAL_MANAGER);
    public axso a;

    public final axso a() {
        axso axsoVar = this.a;
        if (axsoVar != null) {
            return axsoVar;
        }
        fxxm.j("passwordChangesProcessor");
        return null;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fxxm.f(intent, "intent");
        if (fpyj.f()) {
            if (!fxxm.n(intent.getAction(), "com.google.android.gms.credential.manager.operations.PASSWORDS_UPDATED")) {
                ((eluo) b.j()).x("Unsupported action in the intent.");
                return;
            }
            String stringExtra = intent.getStringExtra("account_name");
            if (stringExtra == null) {
                ((eluo) b.j()).x("Account is missing from the intent.");
            } else {
                fycs.a(fxuw.a, new axrm(stringExtra, this, null));
            }
        }
    }
}
