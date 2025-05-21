package com.google.android.gms.credential.manager.credentialexchange;

import android.content.Intent;
import defpackage.audw;
import defpackage.auel;
import defpackage.aujm;
import defpackage.fngr;
import defpackage.fuyy;
import defpackage.fvbo;
import defpackage.fvgu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CredentialExchangeIntentOperation extends aujm {
    public auel a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fvbo.f(intent, "intent");
        if (fngr.c()) {
            fvgu.a(fuyy.a, new audw(this, null));
        }
    }
}
