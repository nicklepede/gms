package com.google.android.gms.common.appdoctor;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.apzs;
import defpackage.atjv;
import defpackage.eqcy;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AppDoctorInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        AppDoctorChimeraProvider.a(this);
        try {
            ((eqcy) atjv.a().f(this)).u();
        } catch (InterruptedException | ExecutionException e) {
            Log.w("AppDoctorInit", "Failed to reset Uri Permissions", e);
        }
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        AppDoctorChimeraProvider.a(this);
        Intent startIntent = IntentOperation.getStartIntent(this, AppDoctorConfigChangedIntentOperation.class, AppDoctorConfigChangedIntentOperation.a);
        if (startIntent != null) {
            startIntent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", "com.google.android.gms.appdoctor");
            startService(startIntent);
        }
    }
}
