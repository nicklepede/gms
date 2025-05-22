package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PackageAddedIntentOperation extends IntentOperation {
    private static final String a = "PackageAddedIntentOperation";
    private Context b;

    static {
        ausn.b(a, auid.SECURITY);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = getApplicationContext();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null && "android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
            Uri data = intent.getData();
            String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
            if (schemeSpecificPart != null) {
                Intent intent2 = new Intent("com.google.android.vending.verifier.ACTION_CHECK_VERIFY_INSTALL");
                intent2.setPackage("com.android.vending");
                intent2.putExtra("package_name", schemeSpecificPart);
                this.b.sendBroadcast(intent2);
            }
        }
    }
}
