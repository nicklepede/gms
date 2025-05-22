package com.google.android.gms.auth.api.credentials.fido.autoenroll;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.fngi;
import defpackage.yzn;
import defpackage.zda;
import defpackage.zkb;
import defpackage.zrf;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CryptauthKeyAutoEnrollmentIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        boolean hasCategory;
        if (!fngi.c() || intent == null || intent.getAction() == null) {
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
        if (hasCategory && yzn.a()) {
            zrf e = ((zrf) zkb.a.lK()).e();
            e.v();
            e.m(zda.a.v(), intent.getAction()).a();
        }
    }
}
