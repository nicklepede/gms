package com.google.android.gms.checkin;

import android.content.Intent;
import defpackage.fpls;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class InfraPriorityCheckinIntentOperationService extends CheckinIntentOperationService {
    @Override // defpackage.apzs, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fpls.c() == 700) {
            super.onHandleIntent(intent);
        }
    }
}
