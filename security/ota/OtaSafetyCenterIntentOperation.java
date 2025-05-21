package com.google.android.gms.security.ota;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OtaSafetyCenterIntentOperation extends IntentOperation {
    private static final String a = "OtaSafetyCenterIntentOperation";

    static {
        asot.b(a, asej.SECURITY);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        getApplicationContext();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
    }
}
