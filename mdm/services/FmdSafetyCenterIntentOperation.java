package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.eiig;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class FmdSafetyCenterIntentOperation extends IntentOperation {
    private static final String a = "FmdSafetyCenterIntentOperation";

    static {
        asot.b(a, asej.SECURITY);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        getApplicationContext();
        eiig.x(applicationContext);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
    }
}
