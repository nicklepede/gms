package com.google.android.gms.auth.folsom.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.adfo;
import defpackage.adnb;
import defpackage.adng;
import defpackage.auad;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FolsomAccountsChangedIntentOperation extends IntentOperation {
    private static final auad a = adng.a("RecoverableKeyStoreAccountChangeIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            a.d("Intent received was null.", new Object[0]);
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            a.d("Intent action was null.", new Object[0]);
            return;
        }
        if (!"android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(action)) {
            a.d("Unsupported intent operation action=%s", action);
            return;
        }
        adfo.a(this, UUID.randomUUID().toString());
        if (adnb.c()) {
            adfo.c(false);
        }
    }
}
