package com.google.android.gms.stats.controlledevents;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.derd;
import defpackage.dvlw;
import defpackage.dvmh;
import defpackage.fsif;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ControlledEventsPhenotypeUpdateOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fsif.d() && "com.google.android.gms.phenotype.com.google.android.metrics.COMMITTED".equals(intent.getAction()) && "com.google.android.metrics".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            dvlw.f(dvmh.a("com.google.android.metrics"));
            derd.c();
        }
    }
}
