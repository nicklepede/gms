package com.google.android.gms.matchstick.intent;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.ceox;
import defpackage.fsuf;
import defpackage.fsux;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MatchstickIntentHandler$OnPackageChangeOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        Uri data = intent.getData();
        String schemeSpecificPart = data == null ? "" : data.getSchemeSpecificPart();
        if ("android.intent.action.PACKAGE_REPLACED".equals(action) && getBaseContext().getPackageName().equals(schemeSpecificPart)) {
            ceox.e(getBaseContext());
        }
        if (("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action) || "android.intent.action.PACKAGE_CHANGED".equals(action)) && fsuf.c().contains(schemeSpecificPart)) {
            ceox.d(getBaseContext());
        }
        if (fsux.i() && "com.google.android.apps.messaging".equals(schemeSpecificPart) && ("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action) || "android.intent.action.PACKAGE_CHANGED".equals(action))) {
            ceox.c(getBaseContext());
        }
        if (fsux.g()) {
            ceox.g(getBaseContext(), "com.google.android.gms.matchstick.ui.LighterEntryPointActivity", true);
        }
    }
}
