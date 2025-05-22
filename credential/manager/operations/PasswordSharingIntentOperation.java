package com.google.android.gms.credential.manager.operations;

import android.content.Intent;
import defpackage.auid;
import defpackage.ausn;
import defpackage.axrp;
import defpackage.axrt;
import defpackage.ayap;
import defpackage.eluo;
import defpackage.fxuw;
import defpackage.fxxm;
import defpackage.fycs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PasswordSharingIntentOperation extends axrt {
    private static final ausn b = ausn.b("PasswordSharingIntentOperation", auid.CREDENTIAL_MANAGER);
    public ayap a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fxxm.f(intent, "intent");
        if (!fxxm.n(intent.getAction(), "com.google.android.gms.credential.manager.operations.PROCESS_INCOMING_PASSWORD_SHARING_INVITATIONS")) {
            ((eluo) b.j()).x("Unsupported action in the intent.");
            return;
        }
        String stringExtra = intent.getStringExtra("account_name");
        if (stringExtra == null) {
            ((eluo) b.j()).x("Account is missing from the intent.");
        } else {
            fycs.a(fxuw.a, new axrp(this, stringExtra, null));
        }
    }
}
