package com.google.android.gms.matchstick.intent;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import defpackage.ceox;
import defpackage.fsux;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MatchstickIntentHandler$TriggerRegistrationIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!TextUtils.equals("com.google.gservices.intent.action.GSERVICES_CHANGED", intent.getAction())) {
            if (TextUtils.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE", intent.getAction())) {
                SilentRegisterIntentOperation.d(new Intent("com.google.android.gms.matchstick.register_intent_google_account_change"), getBaseContext());
            }
        } else {
            ceox.b(getBaseContext());
            ceox.d(getBaseContext());
            if (fsux.g()) {
                ceox.g(getBaseContext(), "com.google.android.gms.matchstick.ui.LighterEntryPointActivity", true);
            }
        }
    }
}
