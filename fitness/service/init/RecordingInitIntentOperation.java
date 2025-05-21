package com.google.android.gms.fitness.service.init;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.arwb;
import defpackage.asqg;
import defpackage.bgsb;
import defpackage.bhaf;
import defpackage.dvlw;
import defpackage.dvmh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class RecordingInitIntentOperation extends IntentOperation {
    private static final String a;

    static {
        bhaf.a();
        a = asqg.f("com.google.android.gms.fitness");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        getClass().getSimpleName();
        String action = intent.getAction();
        if (arwb.b(action, a) || arwb.b(action, "com.google.android.gms.phenotype.COMMITTED")) {
            if (!arwb.b(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.fitness")) {
                return;
            } else {
                dvlw.f(dvmh.a("com.google.android.gms.fitness"));
            }
        }
        bgsb.p(getApplicationContext());
    }
}
