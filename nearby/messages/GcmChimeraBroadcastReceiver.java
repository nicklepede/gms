package com.google.android.gms.nearby.messages;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.asot;
import defpackage.cexg;
import defpackage.deqy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GcmChimeraBroadcastReceiver extends deqy {
    public static final /* synthetic */ int b = 0;

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        asot asotVar = cexg.a;
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.google.android.gms.nearby.messages.service.NearbyMessagesService");
        intent.putExtra("isCopresenceGcm", true);
        WakefulBroadcastReceiver.startWakefulService(context, intent.setComponent(componentName));
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }
}
