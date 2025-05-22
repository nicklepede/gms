package com.google.android.gms.stats.controlledevents;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.dhcg;
import defpackage.dxwx;
import defpackage.dxxi;
import defpackage.fvdd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ControlledEventsPhenotypeUpdateOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fvdd.d() && "com.google.android.gms.phenotype.com.google.android.metrics.COMMITTED".equals(intent.getAction()) && "com.google.android.metrics".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            dxwx.f(dxxi.a("com.google.android.metrics"));
            dhcg.c();
        }
    }
}
