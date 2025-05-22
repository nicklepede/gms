package com.google.android.gms.auth.managed.config;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.managed.intentoperations.SetupWorkProfileSettingsIntentOperation;
import com.google.android.gms.auth.managed.ui.SetupWorkProfileChimeraActivity;
import defpackage.adzx;
import defpackage.auua;
import defpackage.dxwx;
import defpackage.dxxi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ConfigChangedIntentOperation extends IntentOperation {
    static final String a = auua.f("com.google.android.gms.auth_managed");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        intent.getAction();
        intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        String action = intent.getAction();
        if (a.equals(action) || "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || ("com.google.android.gms.phenotype.COMMITTED".equals(action) && "com.google.android.gms.auth_managed".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")))) {
            dxwx.f(dxxi.a("com.google.android.gms.auth_managed"));
            SetupWorkProfileChimeraActivity.c(getBaseContext(), SetupWorkProfileSettingsIntentOperation.e(getBaseContext()));
            adzx.f().h(this);
        }
    }
}
