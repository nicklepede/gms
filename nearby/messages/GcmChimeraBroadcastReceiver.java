package com.google.android.gms.nearby.messages;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.ausn;
import defpackage.cher;
import defpackage.dhcb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class GcmChimeraBroadcastReceiver extends dhcb {
    public static final /* synthetic */ int b = 0;

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ausn ausnVar = cher.a;
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.google.android.gms.nearby.messages.service.NearbyMessagesService");
        intent.putExtra("isCopresenceGcm", true);
        WakefulBroadcastReceiver.startWakefulService(context, intent.setComponent(componentName));
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }
}
