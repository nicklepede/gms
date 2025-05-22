package com.google.android.gms.identitycredentials.service.operations;

import android.content.Intent;
import defpackage.apzu;
import defpackage.bpbq;
import defpackage.fxuw;
import defpackage.fxxm;
import defpackage.fycs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class IdentityCredentialsPackageIntentOperation extends apzu {
    public IdentityCredentialsPackageIntentOperation() {
        super(false);
    }

    @Override // defpackage.apzu
    protected final void a(String str, Intent intent) {
        fxxm.f(intent, "intent");
        fycs.a(fxuw.a, new bpbq(str, null));
    }
}
