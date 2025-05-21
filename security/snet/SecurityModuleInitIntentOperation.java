package com.google.android.gms.security.snet;

import android.content.Intent;
import com.google.android.gms.security.safebrowsing.chromesync.SafeBrowsingChromeSyncIntentOperation;
import defpackage.anya;
import defpackage.asng;
import defpackage.frsy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SecurityModuleInitIntentOperation extends anya {
    private static final String[] a = {"com.google.android.gms.security.provider.SecurityProvider", "com.google.android.gms.security.recaptcha.RecaptchaActivity", "com.google.android.gms.security.settings.VerifyAppsSettingsActivity"};

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        Intent a2;
        boolean z = (i & 8) != 0;
        boolean z2 = (i & 4) != 0;
        if (z2 || z) {
            String[] strArr = a;
            for (int i2 = 0; i2 < 3; i2++) {
                asng.H(this, strArr[i2], true);
            }
        }
        if (frsy.a.a().g()) {
            int i3 = i & 2;
            if ((z2 || z || i3 != 0) && (a2 = SafeBrowsingChromeSyncIntentOperation.a(this)) != null) {
                startService(a2);
            }
        }
    }
}
