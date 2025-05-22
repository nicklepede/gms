package com.google.android.gms.credential.manager.credentialexchange;

import android.content.Intent;
import defpackage.awhy;
import defpackage.awin;
import defpackage.awnm;
import defpackage.fpyr;
import defpackage.fxuw;
import defpackage.fxxm;
import defpackage.fycs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialExchangeIntentOperation extends awnm {
    public awin a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fxxm.f(intent, "intent");
        if (fpyr.c()) {
            fycs.a(fxuw.a, new awhy(this, null));
        }
    }
}
