package com.google.android.gms.auth.folsom.operation;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.abkm;
import defpackage.abnb;
import defpackage.abng;
import defpackage.arxo;
import defpackage.asqg;
import defpackage.fkzg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GserviceChangeIntentOperation extends IntentOperation {
    static final String a = asqg.f("com.google.android.gms.auth.folsom");
    private static final arxo b = abng.a("GserviceChangeIntentOperation");

    public GserviceChangeIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || a.equals(intent.getAction())) && "com.google.android.gms.auth.folsom".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            b.d("Detected Phenotype flag update for auth_folsom", new Object[0]);
            if (abnb.b && fkzg.k()) {
                ((abkm) abkm.a.b()).f();
            }
        }
    }

    public GserviceChangeIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
