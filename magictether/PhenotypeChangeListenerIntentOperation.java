package com.google.android.gms.magictether;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asqg;
import defpackage.cbkz;
import defpackage.cbla;
import defpackage.cbpu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PhenotypeChangeListenerIntentOperation extends IntentOperation {
    static final String a = asqg.f("com.google.android.gms.magictether");

    public PhenotypeChangeListenerIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (cbpu.a(this)) {
            return;
        }
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && "com.google.android.gms.magictether".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            cbkz.a(getBaseContext(), false);
            cbla.a(getBaseContext(), false);
        }
    }

    PhenotypeChangeListenerIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
