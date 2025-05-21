package com.google.android.gms.auth.folsom.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.abfo;
import defpackage.abnb;
import defpackage.abng;
import defpackage.arxo;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FolsomAccountsChangedIntentOperation extends IntentOperation {
    private static final arxo a = abng.a("RecoverableKeyStoreAccountChangeIntentOperation");

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
        abfo.a(this, UUID.randomUUID().toString());
        if (abnb.c()) {
            abfo.c(false);
        }
    }
}
