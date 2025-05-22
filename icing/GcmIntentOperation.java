package com.google.android.gms.icing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bnmo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        bnmo.d("Received gcm intent: %s extras: %s", intent, intent != null ? intent.getExtras() : "");
        if (intent == null || intent.hasExtra("mdh-pn-base64") || !intent.hasExtra("icing-gcm-msg-base64")) {
            return;
        }
        intent.setClassName(this, "com.google.android.gms.icing.service.IndexWorkerService");
        startService(intent);
    }
}
