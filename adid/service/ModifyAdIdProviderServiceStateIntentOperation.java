package com.google.android.gms.adid.service;

import android.content.Intent;
import android.util.Log;
import defpackage.apzs;
import defpackage.aura;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ModifyAdIdProviderServiceStateIntentOperation extends apzs {
    private static final void e() {
        try {
            aura.M("com.google.android.gms.adid.service.AdIdProviderService", 0);
        } catch (IllegalArgumentException e) {
            Log.e("AdIdProviderService", "Exception caught when modifying AdIdProviderService state: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        e();
    }

    @Override // defpackage.apzs, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (action == null || !action.equals("com.google.android.gms.phenotype.com.google.android.gms.adsidentity.COMMITTED")) {
                super.onHandleIntent(intent);
            } else {
                e();
            }
        }
    }
}
