package com.google.android.gms.auth.api.credentials.fido.autoenroll;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.fkpj;
import defpackage.xct;
import defpackage.xgf;
import defpackage.xme;
import defpackage.xti;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CryptauthKeyAutoEnrollmentIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        boolean hasCategory;
        if (!fkpj.c() || intent == null || intent.getAction() == null) {
            return;
        }
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -177095062) {
            if (hashCode == 2019499159 && action.equals("com.google.android.gms.phenotype.UPDATE")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            hasCategory = intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED");
        } else if (c != 1) {
            return;
        } else {
            hasCategory = Objects.equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.auth.api.credentials");
        }
        if (hasCategory && xct.a()) {
            xti e = ((xti) xme.a.a()).e();
            e.t();
            e.l(xgf.a.v(), intent.getAction()).a();
        }
    }
}
