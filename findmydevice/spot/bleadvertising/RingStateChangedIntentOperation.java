package com.google.android.gms.findmydevice.spot.bleadvertising;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bczp;
import defpackage.bebo;
import defpackage.bebp;
import defpackage.bfdp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class RingStateChangedIntentOperation extends IntentOperation {
    private final bczp a;

    public RingStateChangedIntentOperation() {
        this(bebo.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!bfdp.b(intent, "com.google.android.gms.mdm.services.ACTION_CHROMEBOOK_RING_STATE_CHANGED") || intent.getBooleanExtra("com.google.android.gms.mdm.services.EXTRA_RING_STATE", true)) {
            return;
        }
        this.a.a();
    }

    public RingStateChangedIntentOperation(bebp bebpVar) {
        this.a = bebpVar.d();
    }
}
