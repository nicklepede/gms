package com.google.android.gms.fitness.service.init;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.fitness.disconnect.FitCleanupIntentOperation;
import defpackage.asot;
import defpackage.bgtn;
import defpackage.eihn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitnessIntentHandlers$OnPackageRemoveOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (eihn.a(intent.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
            intent.setAction("android.intent.action.PACKAGE_CHANGED");
        }
        asot asotVar = bgtn.a;
        FitCleanupIntentOperation.a(getApplicationContext(), intent);
    }
}
