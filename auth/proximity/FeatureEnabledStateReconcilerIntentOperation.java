package com.google.android.gms.auth.proximity;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aeex;
import defpackage.aeqe;
import defpackage.auad;
import defpackage.auqx;
import defpackage.fnum;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FeatureEnabledStateReconcilerIntentOperation extends IntentOperation {
    private static final auad a = new auad("ProximityAuth", "FeatureEnabledStateReconciler");
    private final aeqe b = new aeqe();

    public FeatureEnabledStateReconcilerIntentOperation() {
    }

    public static Intent a(Context context, Account account) {
        Intent startIntent = IntentOperation.getStartIntent(context, FeatureEnabledStateReconcilerIntentOperation.class, "com.google.android.gms.auth.proximity.RECONCILE_FEATURE_STATE");
        startIntent.putExtra("EXTRA_ACCOUNT_NAME", account.name);
        return startIntent;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fnum.d() && intent != null && "com.google.android.gms.auth.proximity.RECONCILE_FEATURE_STATE".equals(intent.getAction())) {
            Account account = new Account(intent.getStringExtra("EXTRA_ACCOUNT_NAME"), "com.google");
            if (auqx.m(this, account)) {
                this.b.r(true != aeex.a(this).f(account) ? 2 : 1);
            } else {
                a.m("Invalid account: %s", account.name);
                this.b.r(0);
            }
        }
    }

    public FeatureEnabledStateReconcilerIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
