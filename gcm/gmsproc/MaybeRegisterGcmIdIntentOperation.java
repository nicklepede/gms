package com.google.android.gms.gcm.gmsproc;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.bkjx;
import defpackage.casd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class MaybeRegisterGcmIdIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Log.i("GCM", "Checking if the GCM ID is available and maybe schedule a task to register GMS if not.");
        bkjx.d(this, false, casd.a(this));
    }
}
