package com.google.android.gms.scheduler;

import android.content.Intent;
import defpackage.fpls;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class CriticalPrioritySchedulerModuleInitIntentOperation extends SchedulerModuleInitIntentOperation {
    @Override // defpackage.apzs, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fpls.g() == 1000) {
            super.onHandleIntent(intent);
        }
    }
}
