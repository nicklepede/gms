package com.google.android.gms.googlehelp;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.asqg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PhenotypeFlagChangeListener extends IntentOperation {
    static final String a = asqg.f("com.google.android.gms.googlehelp");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) {
            TextUtils.isEmpty(intent.getExtras() != null ? intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME") : null);
        }
    }
}
