package com.google.android.gms.icing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.blfw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        blfw.d("Received gcm intent: %s extras: %s", intent, intent != null ? intent.getExtras() : "");
        if (intent == null || intent.hasExtra("mdh-pn-base64") || !intent.hasExtra("icing-gcm-msg-base64")) {
            return;
        }
        intent.setClassName(this, "com.google.android.gms.icing.service.IndexWorkerService");
        startService(intent);
    }
}
