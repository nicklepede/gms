package com.google.android.gms.recaptcha;

import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RecaptchaModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if ((i & 4) == 0 && (i & 8) == 0) {
            return;
        }
        aura.H(this, "com.google.android.gms.recaptcha.RecaptchaActivity", true);
    }
}
