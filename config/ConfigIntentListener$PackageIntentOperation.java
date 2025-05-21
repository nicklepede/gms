package com.google.android.gms.config;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.asts;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ConfigIntentListener$PackageIntentOperation extends IntentOperation {
    private static final String a(Intent intent) {
        return intent.getData().getSchemeSpecificPart();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String schemeSpecificPart;
        String a;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data == null || (schemeSpecificPart = data.getSchemeSpecificPart()) == null || schemeSpecificPart.isEmpty()) {
            return;
        }
        if ("android.intent.action.PACKAGE_DATA_CLEARED".equals(action)) {
            String a2 = a(intent);
            if (a2 != null) {
                asts.b();
                asts.a(this, "com.google.android.gms.config.ACTION_PACKAGE_DATA_CLEARED", a2);
                return;
            }
            return;
        }
        if (!"android.intent.action.PACKAGE_REMOVED".equals(action) || intent.getBooleanExtra("android.intent.extra.REPLACING", false) || (a = a(intent)) == null) {
            return;
        }
        asts.b();
        asts.a(this, "com.google.android.gms.config.ACTION_PACKAGE_FULLY_REMOVED", a);
    }
}
