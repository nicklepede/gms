package com.google.android.gms.magictether;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.cdts;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class AccountChangeIntentOperation extends IntentOperation {
    public AccountChangeIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            return;
        }
        cdts.a(this, true);
    }

    AccountChangeIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
