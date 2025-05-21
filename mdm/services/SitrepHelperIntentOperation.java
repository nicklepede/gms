package com.google.android.gms.mdm.services;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ccut;
import defpackage.cdab;
import defpackage.fiif;
import defpackage.rnx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SitrepHelperIntentOperation extends IntentOperation {
    public static fiif a(Intent intent, String str) {
        fiif b;
        return (!intent.hasExtra(str) || (b = fiif.b(intent.getIntExtra(str, 0))) == null) ? fiif.UNKNOWN : b;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Intent a;
        if (intent == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("force", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enabled", false);
        fiif a2 = a(intent, "reason");
        if (!"com.google.android.gms.mdm.services.ACTION_DEVICE_ADMIN_CHANGED".equals(intent.getAction())) {
            if (!"com.google.android.gms.mdm.services.ACTION_DIALOG_DISMISSED".equals(intent.getAction()) || (a = ccut.a(this, booleanExtra, a2)) == null) {
                return;
            }
            startService(a);
            return;
        }
        Intent b = ccut.b(this, booleanExtra, a2, fiif.UNKNOWN, booleanExtra2, cdab.a(this));
        if (b != null) {
            int i = rnx.a;
            startService(b);
        }
    }
}
