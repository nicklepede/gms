package com.google.android.gms.security.safebrowsing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asnz;
import defpackage.cytz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SafeBrowsingUpdateIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("EXTRA_PACKAGE_NAME");
            if (action == null || !action.equals("com.google.android.gms.security.safebrowsing.SAFE_BROWSING_UPDATE") || stringExtra == null) {
                return;
            }
            cytz a2 = cytz.a(getApplicationContext(), asnz.a);
            try {
                a2.e(stringExtra);
                if (a2 != null) {
                    a2.close();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }
}
