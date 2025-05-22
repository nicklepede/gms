package com.google.android.gms.findmydevice.spot.bleadvertising;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bfbb;
import defpackage.bgda;
import defpackage.bgdb;
import defpackage.bhff;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class RingStateChangedIntentOperation extends IntentOperation {
    private final bfbb a;

    public RingStateChangedIntentOperation() {
        this(bgda.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!bhff.b(intent, "com.google.android.gms.mdm.services.ACTION_CHROMEBOOK_RING_STATE_CHANGED") || intent.getBooleanExtra("com.google.android.gms.mdm.services.EXTRA_RING_STATE", true)) {
            return;
        }
        this.a.a();
    }

    public RingStateChangedIntentOperation(bgdb bgdbVar) {
        this.a = bgdbVar.d();
    }
}
