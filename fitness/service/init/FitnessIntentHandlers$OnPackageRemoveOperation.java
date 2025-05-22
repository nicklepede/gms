package com.google.android.gms.fitness.service.init;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.fitness.disconnect.FitCleanupIntentOperation;
import defpackage.ausn;
import defpackage.biyd;
import defpackage.ekus;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitnessIntentHandlers$OnPackageRemoveOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (ekus.a(intent.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
            intent.setAction("android.intent.action.PACKAGE_CHANGED");
        }
        ausn ausnVar = biyd.a;
        FitCleanupIntentOperation.a(getApplicationContext(), intent);
    }
}
