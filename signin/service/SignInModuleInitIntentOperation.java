package com.google.android.gms.signin.service;

import android.content.Intent;
import defpackage.apzs;
import defpackage.auad;
import defpackage.aura;
import defpackage.dfeq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SignInModuleInitIntentOperation extends apzs {
    private static final auad a = dfeq.b("SignInModuleInitIntentOperation");

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        try {
            aura.H(getApplicationContext(), "com.google.android.gms.signin.activity.ConsentActivity", true);
        } catch (IllegalArgumentException unused) {
            a.f("com.google.android.gms.signin.activity.ConsentActivity not present yet.", new Object[0]);
        }
    }
}
