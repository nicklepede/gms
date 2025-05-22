package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.bkad;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ServiceChimeraAutoStarter extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bkad.i(context);
        if (bkad.p()) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.setClassName(context, "com.google.android.gms.gcm.GcmService");
            context.startService(intent);
        }
    }
}
