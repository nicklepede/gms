package com.google.android.gms.adid.service;

import android.content.Intent;
import android.util.Log;
import defpackage.anya;
import defpackage.asng;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ModifyAdIdProviderServiceStateIntentOperation extends anya {
    private static final void e() {
        try {
            asng.M("com.google.android.gms.adid.service.AdIdProviderService", 0);
        } catch (IllegalArgumentException e) {
            Log.e("AdIdProviderService", "Exception caught when modifying AdIdProviderService state: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        e();
    }

    @Override // defpackage.anya, com.google.android.chimera.IntentOperation
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
