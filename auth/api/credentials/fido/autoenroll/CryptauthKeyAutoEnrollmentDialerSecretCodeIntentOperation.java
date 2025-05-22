package com.google.android.gms.auth.api.credentials.fido.autoenroll;

import android.content.Intent;
import defpackage.apzv;
import defpackage.fngi;
import defpackage.yzn;
import defpackage.zda;
import defpackage.zkb;
import defpackage.zrf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CryptauthKeyAutoEnrollmentDialerSecretCodeIntentOperation extends apzv {
    public CryptauthKeyAutoEnrollmentDialerSecretCodeIntentOperation() {
        super("3436375");
    }

    @Override // defpackage.apzv
    public final void a(Intent intent) {
        if (fngi.c() && yzn.a()) {
            zrf zrfVar = (zrf) zkb.a.lK();
            zrfVar.v();
            zrfVar.e().m(zda.a.v(), intent.getAction()).a();
        }
    }
}
