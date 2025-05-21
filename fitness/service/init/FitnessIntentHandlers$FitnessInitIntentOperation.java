package com.google.android.gms.fitness.service.init;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.anya;
import defpackage.asot;
import defpackage.bgsb;
import defpackage.bgtn;
import defpackage.eiig;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitnessIntentHandlers$FitnessInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        asot asotVar = bgtn.a;
        Context applicationContext = getApplicationContext();
        try {
            Intent startIntent = IntentOperation.getStartIntent(applicationContext, "com.google.android.gms.fitness.service.init.PersistentInitIntentOperation", "com.google.android.gms.fitness.START_INIT_ACTION");
            eiig.y(startIntent, "Error getting intent operation.");
            applicationContext.startService(startIntent);
        } catch (RuntimeException e) {
            ((ejhf) ((ejhf) ((ejhf) bgtn.a.i()).s(e)).ah((char) 4792)).B("Failed to init required services %s", intent);
        }
        bgsb.p(applicationContext);
    }
}
