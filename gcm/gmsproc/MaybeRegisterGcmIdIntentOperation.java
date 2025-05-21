package com.google.android.gms.gcm.gmsproc;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.bifi;
import defpackage.byjl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class MaybeRegisterGcmIdIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Log.i("GCM", "Checking if the GCM ID is available and maybe schedule a task to register GMS if not.");
        bifi.d(this, false, byjl.a(this));
    }
}
