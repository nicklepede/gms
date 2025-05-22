package com.google.android.gms.icing.proxy;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bnxz;
import defpackage.bnyn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ToggleContactsIndexerIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        bnyn.j("Handling global search source toggled intent");
        if ("com.google.android.gms.icing.GlobalSearchSourceToggled".equals(intent.getAction()) && "contacts_contact_id".equals(intent.getStringExtra("SourceName"))) {
            boolean booleanExtra = intent.getBooleanExtra("Enabled", false);
            synchronized (bnxz.a) {
                bnxz.b = Boolean.valueOf(booleanExtra);
            }
        }
    }
}
