package com.google.android.gms.auth.proximity;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.proximity.phonehub.UpdateCameraRollAccessStateIntentOperation;
import defpackage.fldd;
import defpackage.vks;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountChangeIntentOperation extends IntentOperation {
    public AccountChangeIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED") && fldd.a.a().q()) {
            startService(BetterTogetherFeatureSupportIntentOperation.a(getBaseContext()).putExtra("com.google.android.gms.auth.proximity.FORCE_ENROLLMENT", true));
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            for (Account account : vks.c(intent)) {
                if ("com.google".equals(account.type)) {
                    startService(UpdateCameraRollAccessStateIntentOperation.a(getBaseContext(), account.name, false));
                }
            }
        }
    }

    AccountChangeIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
