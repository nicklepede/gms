package com.google.android.gms.auth.proximity;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.acex;
import defpackage.acqe;
import defpackage.arxo;
import defpackage.asnd;
import defpackage.fldd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FeatureEnabledStateReconcilerIntentOperation extends IntentOperation {
    private static final arxo a = new arxo("ProximityAuth", "FeatureEnabledStateReconciler");
    private final acqe b = new acqe();

    public FeatureEnabledStateReconcilerIntentOperation() {
    }

    public static Intent a(Context context, Account account) {
        Intent startIntent = IntentOperation.getStartIntent(context, FeatureEnabledStateReconcilerIntentOperation.class, "com.google.android.gms.auth.proximity.RECONCILE_FEATURE_STATE");
        startIntent.putExtra("EXTRA_ACCOUNT_NAME", account.name);
        return startIntent;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fldd.d() && intent != null && "com.google.android.gms.auth.proximity.RECONCILE_FEATURE_STATE".equals(intent.getAction())) {
            Account account = new Account(intent.getStringExtra("EXTRA_ACCOUNT_NAME"), "com.google");
            if (asnd.m(this, account)) {
                this.b.r(true != acex.a(this).f(account) ? 2 : 1);
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
