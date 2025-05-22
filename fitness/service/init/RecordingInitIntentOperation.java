package com.google.android.gms.fitness.service.init;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.atyq;
import defpackage.auua;
import defpackage.biwr;
import defpackage.bjev;
import defpackage.dxwx;
import defpackage.dxxi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class RecordingInitIntentOperation extends IntentOperation {
    private static final String a;

    static {
        bjev.a();
        a = auua.f("com.google.android.gms.fitness");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        getClass().getSimpleName();
        String action = intent.getAction();
        if (atyq.b(action, a) || atyq.b(action, "com.google.android.gms.phenotype.COMMITTED")) {
            if (!atyq.b(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.fitness")) {
                return;
            } else {
                dxwx.f(dxxi.a("com.google.android.gms.fitness"));
            }
        }
        biwr.p(getApplicationContext());
    }
}
