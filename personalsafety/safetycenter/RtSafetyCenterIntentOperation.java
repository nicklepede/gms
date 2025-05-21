package com.google.android.gms.personalsafety.safetycenter;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.fmzp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RtSafetyCenterIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        getApplicationContext();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fmzp.ai();
    }
}
