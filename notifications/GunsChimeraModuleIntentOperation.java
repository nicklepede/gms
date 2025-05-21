package com.google.android.gms.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.anya;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GunsChimeraModuleIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if ((i & 4) > 0 || (i & 8) > 0 || (i & 2) > 0) {
            Context applicationContext = getApplicationContext();
            Intent startIntent = IntentOperation.getStartIntent(applicationContext, GunsIntentOperation.class, "com.google.android.gms.notifications.intents.LOAD_NOTIFICATIONS_FROM_DB");
            if (intent != null) {
                startIntent.putExtras(intent);
            }
            applicationContext.startService(startIntent);
        }
    }
}
