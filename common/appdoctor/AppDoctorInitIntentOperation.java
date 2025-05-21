package com.google.android.gms.common.appdoctor;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.anya;
import defpackage.arhg;
import defpackage.enpf;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AppDoctorInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        AppDoctorChimeraProvider.a(this);
        try {
            ((enpf) arhg.a().f(this)).u();
        } catch (InterruptedException | ExecutionException e) {
            Log.w("AppDoctorInit", "Failed to reset Uri Permissions", e);
        }
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        AppDoctorChimeraProvider.a(this);
        Intent startIntent = IntentOperation.getStartIntent(this, AppDoctorConfigChangedIntentOperation.class, AppDoctorConfigChangedIntentOperation.a);
        if (startIntent != null) {
            startIntent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", "com.google.android.gms.appdoctor");
            startService(startIntent);
        }
    }
}
