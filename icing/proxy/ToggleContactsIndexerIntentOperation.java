package com.google.android.gms.icing.proxy;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.blrh;
import defpackage.blrv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ToggleContactsIndexerIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        blrv.j("Handling global search source toggled intent");
        if ("com.google.android.gms.icing.GlobalSearchSourceToggled".equals(intent.getAction()) && "contacts_contact_id".equals(intent.getStringExtra("SourceName"))) {
            boolean booleanExtra = intent.getBooleanExtra("Enabled", false);
            synchronized (blrh.a) {
                blrh.b = Boolean.valueOf(booleanExtra);
            }
        }
    }
}
