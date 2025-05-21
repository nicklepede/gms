package com.google.android.gms.findmydevice.spot.wearables;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asot;
import defpackage.bebo;
import defpackage.bfdp;
import defpackage.bfdv;
import defpackage.dxai;
import defpackage.ejhf;
import defpackage.fobe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class WearableReadinessStateIntentOperation extends IntentOperation {
    private static final asot a = bfdv.a("WearableReadinessStateIntentOperation");

    /* JADX WARN: Type inference failed for: r4v6, types: [bfgw, java.lang.Object] */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (bfdp.b(intent, "com.google.android.gms.wearable.READY_STATE")) {
            if (!fobe.g()) {
                ((ejhf) ((ejhf) a.h()).ah((char) 4577)).x("Wearable provisioning is disabled.");
            } else if (!intent.getBooleanExtra("isReady", false)) {
                ((ejhf) ((ejhf) a.h()).ah((char) 4576)).x("Wearable API isn't ready.");
            } else {
                ((ejhf) ((ejhf) a.h()).ah((char) 4575)).x("Wearable API is ready.");
                dxai.a(((bebo) bebo.a()).M().a(), "announceFinderWearableDeviceCompanionCapability", new Object[0]);
            }
        }
    }
}
