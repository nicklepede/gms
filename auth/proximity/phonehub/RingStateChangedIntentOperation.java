package com.google.android.gms.auth.proximity.phonehub;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.acur;
import defpackage.acwb;
import defpackage.flcw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RingStateChangedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (flcw.C() && "com.google.android.gms.mdm.services.ACTION_CHROMEBOOK_RING_STATE_CHANGED".equals(intent.getAction())) {
            acur.a = intent.getBooleanExtra("com.google.android.gms.mdm.services.EXTRA_RING_STATE", false);
            acwb.b().f();
        }
    }
}
