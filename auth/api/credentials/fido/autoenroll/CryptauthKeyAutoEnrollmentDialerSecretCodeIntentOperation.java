package com.google.android.gms.auth.api.credentials.fido.autoenroll;

import android.content.Intent;
import defpackage.anyd;
import defpackage.fkpj;
import defpackage.xct;
import defpackage.xgf;
import defpackage.xme;
import defpackage.xti;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CryptauthKeyAutoEnrollmentDialerSecretCodeIntentOperation extends anyd {
    public CryptauthKeyAutoEnrollmentDialerSecretCodeIntentOperation() {
        super("3436375");
    }

    @Override // defpackage.anyd
    public final void a(Intent intent) {
        if (fkpj.c() && xct.a()) {
            xti xtiVar = (xti) xme.a.a();
            xtiVar.t();
            xtiVar.e().l(xgf.a.v(), intent.getAction()).a();
        }
    }
}
