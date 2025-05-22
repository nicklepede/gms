package com.google.android.gms.fitness.service.init;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.apzs;
import defpackage.ausn;
import defpackage.biwr;
import defpackage.biyd;
import defpackage.ekvl;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitnessIntentHandlers$FitnessInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        ausn ausnVar = biyd.a;
        Context applicationContext = getApplicationContext();
        try {
            Intent startIntent = IntentOperation.getStartIntent(applicationContext, "com.google.android.gms.fitness.service.init.PersistentInitIntentOperation", "com.google.android.gms.fitness.START_INIT_ACTION");
            ekvl.z(startIntent, "Error getting intent operation.");
            applicationContext.startService(startIntent);
        } catch (RuntimeException e) {
            ((eluo) ((eluo) ((eluo) biyd.a.i()).s(e)).ai((char) 4802)).B("Failed to init required services %s", intent);
        }
        biwr.p(applicationContext);
    }
}
