package com.google.android.gms.backup.g1.safetycenter;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ajif;
import defpackage.ajql;
import defpackage.ajwt;
import defpackage.atzb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class Bbg1SafetyCenterIntentOperation extends IntentOperation {
    private static final String a = "Bbg1SafetyCenterIntentOperation";

    static {
        ajwt.a(a);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        Context applicationContext = getApplicationContext();
        new ajif(applicationContext);
        atzb.s(applicationContext);
        new ajql(applicationContext);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
    }
}
