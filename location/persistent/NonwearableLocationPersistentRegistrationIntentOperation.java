package com.google.android.gms.location.persistent;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.location.settings.LocationOffWarningIntentOperation;
import defpackage.came;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class NonwearableLocationPersistentRegistrationIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.location.persistent.REGISTER".equals(intent.getAction())) {
            int i = LocationOffWarningIntentOperation.b;
            LocationPersistentChimeraService.a("LOWD", new came());
        }
    }
}
