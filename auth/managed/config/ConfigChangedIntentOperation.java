package com.google.android.gms.auth.managed.config;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.managed.intentoperations.SetupWorkProfileSettingsIntentOperation;
import com.google.android.gms.auth.managed.ui.SetupWorkProfileChimeraActivity;
import defpackage.abzx;
import defpackage.asqg;
import defpackage.dvlw;
import defpackage.dvmh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ConfigChangedIntentOperation extends IntentOperation {
    static final String a = asqg.f("com.google.android.gms.auth_managed");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        intent.getAction();
        intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        String action = intent.getAction();
        if (a.equals(action) || "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || ("com.google.android.gms.phenotype.COMMITTED".equals(action) && "com.google.android.gms.auth_managed".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")))) {
            dvlw.f(dvmh.a("com.google.android.gms.auth_managed"));
            SetupWorkProfileChimeraActivity.c(getBaseContext(), SetupWorkProfileSettingsIntentOperation.e(getBaseContext()));
            abzx.f().h(this);
        }
    }
}
