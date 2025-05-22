package com.google.android.gms.security.snet;

import android.content.Intent;
import com.google.android.gms.security.safebrowsing.chromesync.SafeBrowsingChromeSyncIntentOperation;
import defpackage.apzs;
import defpackage.aura;
import defpackage.funm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SecurityModuleInitIntentOperation extends apzs {
    private static final String[] a = {"com.google.android.gms.security.provider.SecurityProvider", "com.google.android.gms.security.recaptcha.RecaptchaActivity", "com.google.android.gms.security.settings.VerifyAppsSettingsActivity"};

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        Intent a2;
        boolean z = (i & 8) != 0;
        boolean z2 = (i & 4) != 0;
        if (z2 || z) {
            String[] strArr = a;
            for (int i2 = 0; i2 < 3; i2++) {
                aura.H(this, strArr[i2], true);
            }
        }
        if (funm.a.lK().g()) {
            int i3 = i & 2;
            if ((z2 || z || i3 != 0) && (a2 = SafeBrowsingChromeSyncIntentOperation.a(this)) != null) {
                startService(a2);
            }
        }
    }
}
