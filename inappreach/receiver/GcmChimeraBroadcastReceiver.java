package com.google.android.gms.inappreach.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.asej;
import defpackage.asot;
import defpackage.deqy;
import defpackage.ejhf;
import defpackage.fpfb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GcmChimeraBroadcastReceiver extends deqy {
    private static final String b = "com.google.android.gms.inappreach.receiver.GcmChimeraBroadcastReceiver";
    private static final asot d = asot.b(GcmChimeraBroadcastReceiver.class.getName(), asej.INAPP_REACH);

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (fpfb.c()) {
            int i = PushIntentOperation.b;
            Intent startIntent = IntentOperation.getStartIntent(context, PushIntentOperation.class, "com.google.android.gms.inappreach.intents.HANDLE_GCM_PUSH");
            if (startIntent != null) {
                startIntent.putExtras(intent);
            }
            if (startIntent == null) {
                ((ejhf) ((ejhf) d.j()).ah(5179)).B("Failed creating service intent for '%s'", PushIntentOperation.a);
            } else {
                WakefulBroadcastReceiver.startWakefulService(context, startIntent);
            }
        }
    }
}
