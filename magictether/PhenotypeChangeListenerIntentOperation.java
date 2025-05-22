package com.google.android.gms.magictether;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auua;
import defpackage.cdtr;
import defpackage.cdts;
import defpackage.cdym;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PhenotypeChangeListenerIntentOperation extends IntentOperation {
    static final String a = auua.f("com.google.android.gms.magictether");

    public PhenotypeChangeListenerIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (cdym.a(this)) {
            return;
        }
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && "com.google.android.gms.magictether".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            cdtr.a(getBaseContext(), false);
            cdts.a(getBaseContext(), false);
        }
    }

    PhenotypeChangeListenerIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
