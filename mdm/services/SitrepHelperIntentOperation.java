package com.google.android.gms.mdm.services;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.cfdn;
import defpackage.cfjb;
import defpackage.fkyc;
import defpackage.thb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SitrepHelperIntentOperation extends IntentOperation {
    public static fkyc a(Intent intent, String str) {
        fkyc b;
        return (!intent.hasExtra(str) || (b = fkyc.b(intent.getIntExtra(str, 0))) == null) ? fkyc.UNKNOWN : b;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Intent a;
        if (intent == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("force", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enabled", false);
        fkyc a2 = a(intent, "reason");
        if (!"com.google.android.gms.mdm.services.ACTION_DEVICE_ADMIN_CHANGED".equals(intent.getAction())) {
            if (!"com.google.android.gms.mdm.services.ACTION_DIALOG_DISMISSED".equals(intent.getAction()) || (a = cfdn.a(this, booleanExtra, a2)) == null) {
                return;
            }
            startService(a);
            return;
        }
        Intent b = cfdn.b(this, booleanExtra, a2, fkyc.UNKNOWN, booleanExtra2, cfjb.a(this));
        if (b != null) {
            int i = thb.a;
            startService(b);
        }
    }
}
