package com.google.android.gms.signin.service;

import android.content.Intent;
import defpackage.anya;
import defpackage.arxo;
import defpackage.asng;
import defpackage.dctl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SignInModuleInitIntentOperation extends anya {
    private static final arxo a = dctl.b("SignInModuleInitIntentOperation");

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        try {
            asng.H(getApplicationContext(), "com.google.android.gms.signin.activity.ConsentActivity", true);
        } catch (IllegalArgumentException unused) {
            a.f("com.google.android.gms.signin.activity.ConsentActivity not present yet.", new Object[0]);
        }
    }
}
