package com.google.android.gms.gcm;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.biac;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmPackageIntentOperation extends IntentOperation {
    public static biac a(Intent intent, int i) {
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
        if (TextUtils.isEmpty(schemeSpecificPart)) {
            return null;
        }
        return new biac(schemeSpecificPart, i);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.PACKAGE_ADDED") && intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            return;
        }
        GcmProxyIntentOperation.a(this, intent);
    }
}
