package com.google.android.gms.matchstick.intent;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.ccgd;
import defpackage.fqah;
import defpackage.fqaz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MatchstickIntentHandler$OnPackageChangeOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        Uri data = intent.getData();
        String schemeSpecificPart = data == null ? "" : data.getSchemeSpecificPart();
        if ("android.intent.action.PACKAGE_REPLACED".equals(action) && getBaseContext().getPackageName().equals(schemeSpecificPart)) {
            ccgd.e(getBaseContext());
        }
        if (("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action) || "android.intent.action.PACKAGE_CHANGED".equals(action)) && fqah.c().contains(schemeSpecificPart)) {
            ccgd.d(getBaseContext());
        }
        if (fqaz.i() && "com.google.android.apps.messaging".equals(schemeSpecificPart) && ("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action) || "android.intent.action.PACKAGE_CHANGED".equals(action))) {
            ccgd.c(getBaseContext());
        }
        if (fqaz.g()) {
            ccgd.g(getBaseContext(), "com.google.android.gms.matchstick.ui.LighterEntryPointActivity", true);
        }
    }
}
