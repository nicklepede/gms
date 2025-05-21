package com.google.android.gms.growth.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.asej;
import defpackage.asot;
import defpackage.deqy;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GrowthGcmChimeraBroadcastReceiver extends deqy {
    private static final asot b = asot.b("GrowthNotifications", asej.GROWTH);

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            int i = GrowthNotificationsIntentOperation.e;
            WakefulBroadcastReceiver.startWakefulService(context, IntentOperation.getStartIntent(context, GrowthNotificationsIntentOperation.class, "com.google.android.gms.growth.notifications.NOTIFICATION_ACTION").putExtra("gcmIntent", intent));
        } catch (Exception e) {
            ((ejhf) ((ejhf) b.i()).s(e)).B("Failed to handle: %s", intent);
        }
    }
}
