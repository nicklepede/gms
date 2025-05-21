package com.google.android.gms.recaptcha;

import android.content.Intent;
import defpackage.anya;
import defpackage.asng;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RecaptchaModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if ((i & 4) == 0 && (i & 8) == 0) {
            return;
        }
        asng.H(this, "com.google.android.gms.recaptcha.RecaptchaActivity", true);
    }
}
