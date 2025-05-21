package com.google.android.gms.magictether;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.cbla;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class AccountChangeIntentOperation extends IntentOperation {
    public AccountChangeIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            return;
        }
        cbla.a(this, true);
    }

    AccountChangeIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
