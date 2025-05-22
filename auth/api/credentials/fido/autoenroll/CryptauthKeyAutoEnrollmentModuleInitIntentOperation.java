package com.google.android.gms.auth.api.credentials.fido.autoenroll;

import android.content.Intent;
import defpackage.apzs;
import defpackage.fngi;
import defpackage.yzn;
import defpackage.zda;
import defpackage.zkb;
import defpackage.zrf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CryptauthKeyAutoEnrollmentModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (fngi.c() && yzn.a()) {
            zrf e = ((zrf) zkb.a.lK()).e();
            e.v();
            e.m(zda.a.v(), intent.getAction()).a();
        }
    }
}
