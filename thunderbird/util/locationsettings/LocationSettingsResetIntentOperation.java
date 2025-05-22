package com.google.android.gms.thunderbird.util.locationsettings;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.dilu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LocationSettingsResetIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("thunderbird.intent.action.LOCATION_SETTINGS_RESET".equals(intent.getAction())) {
            dilu.a().c(this, intent);
        }
    }
}
