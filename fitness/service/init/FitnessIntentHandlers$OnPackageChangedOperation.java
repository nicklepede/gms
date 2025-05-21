package com.google.android.gms.fitness.service.init;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.fitness.service.recording.FitRecordingChimeraBroker;
import defpackage.bgar;
import defpackage.bgtn;
import defpackage.eihn;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitnessIntentHandlers$OnPackageChangedOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (eihn.a(intent.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
            intent.setAction("android.intent.action.PACKAGE_CHANGED");
        }
        ((ejhf) ((ejhf) bgtn.a.h()).ah((char) 4793)).B("OnPackageChangedOperation got intent: %s", intent);
        Context applicationContext = getApplicationContext();
        int i = FitRecordingChimeraBroker.i;
        Intent intent2 = new Intent("com.google.android.gms.fitness.PACKAGE_CHANGED");
        intent2.setClassName(applicationContext, "com.google.android.gms.fitness.service.recording.FitRecordingBroker");
        intent2.putExtra("PACKAGE_NAME", bgar.b(intent));
        applicationContext.startService(intent2);
    }
}
