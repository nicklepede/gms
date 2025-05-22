package com.google.android.gms.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.apzs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GunsChimeraModuleIntentOperation extends apzs {
    @Override // defpackage.apzs
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
