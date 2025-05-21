package com.google.android.gms.backup.g1.safetycenter;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ahhp;
import defpackage.ahpv;
import defpackage.ahwd;
import defpackage.arwm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class Bbg1SafetyCenterIntentOperation extends IntentOperation {
    private static final String a = "Bbg1SafetyCenterIntentOperation";

    static {
        ahwd.a(a);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        new ahhp(applicationContext);
        arwm.s(applicationContext);
        new ahpv(applicationContext);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
    }
}
