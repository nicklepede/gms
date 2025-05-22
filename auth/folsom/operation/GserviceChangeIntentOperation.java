package com.google.android.gms.auth.folsom.operation;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.adkm;
import defpackage.adnb;
import defpackage.adng;
import defpackage.auad;
import defpackage.auua;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GserviceChangeIntentOperation extends IntentOperation {
    static final String a = auua.f("com.google.android.gms.auth.folsom");
    private static final auad b = adng.a("GserviceChangeIntentOperation");

    public GserviceChangeIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || a.equals(intent.getAction())) && "com.google.android.gms.auth.folsom".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            b.d("Detected Phenotype flag update for auth_folsom", new Object[0]);
            if (adnb.b) {
                ((adkm) adkm.a.b()).f();
            }
        }
    }

    public GserviceChangeIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
