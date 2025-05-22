package com.google.android.gms.security.ota;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OtaSafetyCenterIntentOperation extends IntentOperation {
    private static final String a = "OtaSafetyCenterIntentOperation";

    static {
        ausn.b(a, auid.SECURITY);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        getApplicationContext();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
    }
}
