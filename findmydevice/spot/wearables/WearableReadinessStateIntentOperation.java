package com.google.android.gms.findmydevice.spot.wearables;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ausn;
import defpackage.bgda;
import defpackage.bhff;
import defpackage.bhfl;
import defpackage.dzmi;
import defpackage.eluo;
import defpackage.fqsy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class WearableReadinessStateIntentOperation extends IntentOperation {
    private static final ausn a = bhfl.a("WearableReadinessStateIntentOperation");

    /* JADX WARN: Type inference failed for: r4v6, types: [bhim, java.lang.Object] */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (bhff.b(intent, "com.google.android.gms.wearable.READY_STATE")) {
            if (!fqsy.g()) {
                ((eluo) ((eluo) a.h()).ai((char) 4587)).x("Wearable provisioning is disabled.");
            } else if (!intent.getBooleanExtra("isReady", false)) {
                ((eluo) ((eluo) a.h()).ai((char) 4586)).x("Wearable API isn't ready.");
            } else {
                ((eluo) ((eluo) a.h()).ai((char) 4585)).x("Wearable API is ready.");
                dzmi.a(((bgda) bgda.a()).M().a(), "announceFinderWearableDeviceCompanionCapability", new Object[0]);
            }
        }
    }
}
