package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.bhvo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ServiceChimeraAutoStarter extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bhvo.i(context);
        if (bhvo.p()) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.setClassName(context, "com.google.android.gms.gcm.GcmService");
            context.startService(intent);
        }
    }
}
