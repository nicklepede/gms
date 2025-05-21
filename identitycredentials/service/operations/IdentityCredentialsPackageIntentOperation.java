package com.google.android.gms.identitycredentials.service.operations;

import android.content.Intent;
import defpackage.anyc;
import defpackage.bmuj;
import defpackage.fuyy;
import defpackage.fvbo;
import defpackage.fvgu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class IdentityCredentialsPackageIntentOperation extends anyc {
    public IdentityCredentialsPackageIntentOperation() {
        super(false);
    }

    @Override // defpackage.anyc
    protected final void a(String str, Intent intent) {
        fvbo.f(intent, "intent");
        fvgu.a(fuyy.a, new bmuj(str, null));
    }
}
