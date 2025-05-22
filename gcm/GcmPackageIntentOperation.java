package com.google.android.gms.gcm;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.bker;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmPackageIntentOperation extends IntentOperation {
    public static bker a(Intent intent, int i) {
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
        if (TextUtils.isEmpty(schemeSpecificPart)) {
            return null;
        }
        return new bker(schemeSpecificPart, i);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.PACKAGE_ADDED") && intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            return;
        }
        GcmProxyIntentOperation.a(this, intent);
    }
}
