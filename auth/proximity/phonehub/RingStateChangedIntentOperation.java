package com.google.android.gms.auth.proximity.phonehub;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aeur;
import defpackage.aewb;
import defpackage.fnuf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class RingStateChangedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fnuf.C() && "com.google.android.gms.mdm.services.ACTION_CHROMEBOOK_RING_STATE_CHANGED".equals(intent.getAction())) {
            aeur.a = intent.getBooleanExtra("com.google.android.gms.mdm.services.EXTRA_RING_STATE", false);
            aewb.b().f();
        }
    }
}
