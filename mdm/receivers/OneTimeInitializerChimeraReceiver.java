package com.google.android.gms.mdm.receivers;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.mdm.services.OneTimeInitializerIntentOperation;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class OneTimeInitializerChimeraReceiver extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intent startIntent;
        if (!"com.google.android.onetimeinitializer.ONE_TIME_INITIALIZED".equals(intent.getAction()) || (startIntent = IntentOperation.getStartIntent(context, OneTimeInitializerIntentOperation.class, "com.google.android.gms.onetimeinitializer.ONE_TIME_INITIALIZED")) == null) {
            return;
        }
        context.startService(startIntent);
    }
}
