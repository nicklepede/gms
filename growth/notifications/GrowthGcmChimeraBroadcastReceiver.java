package com.google.android.gms.growth.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dhcb;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GrowthGcmChimeraBroadcastReceiver extends dhcb {
    private static final ausn b = ausn.b("GrowthNotifications", auid.GROWTH);

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            int i = GrowthNotificationsIntentOperation.e;
            WakefulBroadcastReceiver.startWakefulService(context, IntentOperation.getStartIntent(context, GrowthNotificationsIntentOperation.class, "com.google.android.gms.growth.notifications.NOTIFICATION_ACTION").putExtra("gcmIntent", intent));
        } catch (Exception e) {
            ((eluo) ((eluo) b.i()).s(e)).B("Failed to handle: %s", intent);
        }
    }
}
