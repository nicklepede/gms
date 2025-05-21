package com.google.android.gms.appset.service;

import android.content.Intent;
import defpackage.anya;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ModifyAppSetIdProviderServiceStateIntentOperation extends anya {
    @Override // defpackage.anya, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && "com.google.android.gms.ads".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            return;
        }
        super.onHandleIntent(intent);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
    }
}
