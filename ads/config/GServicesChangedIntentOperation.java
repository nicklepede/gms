package com.google.android.gms.ads.config;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.client.h;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GServicesChangedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            p.c(this);
            if (com.google.android.gms.ads.internal.util.c.b()) {
                h.d("GServicesValues have changed.");
            }
            d.a(this);
        }
    }
}
