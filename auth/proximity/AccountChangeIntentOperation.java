package com.google.android.gms.auth.proximity;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.proximity.phonehub.UpdateCameraRollAccessStateIntentOperation;
import defpackage.fnum;
import defpackage.xgt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountChangeIntentOperation extends IntentOperation {
    public AccountChangeIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED") && fnum.a.lK().q()) {
            startService(BetterTogetherFeatureSupportIntentOperation.a(getBaseContext()).putExtra("com.google.android.gms.auth.proximity.FORCE_ENROLLMENT", true));
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            for (Account account : xgt.c(intent)) {
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
