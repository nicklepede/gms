package com.google.android.gms.fitness.service.init;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.fitness.service.recording.FitRecordingChimeraBroker;
import defpackage.bifh;
import defpackage.biyd;
import defpackage.ekus;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitnessIntentHandlers$OnPackageChangedOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (ekus.a(intent.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
            intent.setAction("android.intent.action.PACKAGE_CHANGED");
        }
        ((eluo) ((eluo) biyd.a.h()).ai((char) 4803)).B("OnPackageChangedOperation got intent: %s", intent);
        Context applicationContext = getApplicationContext();
        int i = FitRecordingChimeraBroker.i;
        Intent intent2 = new Intent("com.google.android.gms.fitness.PACKAGE_CHANGED");
        intent2.setClassName(applicationContext, "com.google.android.gms.fitness.service.recording.FitRecordingBroker");
        intent2.putExtra("PACKAGE_NAME", bifh.b(intent));
        applicationContext.startService(intent2);
    }
}
