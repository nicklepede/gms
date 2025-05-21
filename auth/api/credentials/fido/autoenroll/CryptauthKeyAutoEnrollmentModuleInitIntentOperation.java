package com.google.android.gms.auth.api.credentials.fido.autoenroll;

import android.content.Intent;
import defpackage.anya;
import defpackage.fkpj;
import defpackage.xct;
import defpackage.xgf;
import defpackage.xme;
import defpackage.xti;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CryptauthKeyAutoEnrollmentModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (fkpj.c() && xct.a()) {
            xti e = ((xti) xme.a.a()).e();
            e.t();
            e.l(xgf.a.v(), intent.getAction()).a();
        }
    }
}
