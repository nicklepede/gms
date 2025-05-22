package com.google.android.gms.appset.service;

import android.content.Intent;
import defpackage.apzs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ModifyAppSetIdProviderServiceStateIntentOperation extends apzs {
    @Override // defpackage.apzs, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && "com.google.android.gms.ads".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            return;
        }
        super.onHandleIntent(intent);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
    }
}
