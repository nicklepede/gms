package com.google.android.gms.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bkcz;
import defpackage.dhcb;
import defpackage.fthh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GcmChimeraBroadcastReceiver extends dhcb {
    static {
        ausn.b("GcmChimeraBroadcastReceiver", auid.GUNS);
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intent intent2;
        if (fthh.a.lK().q()) {
            return;
        }
        String action = intent.getAction();
        bkcz.a(context);
        if ("gcm".equals(bkcz.e(intent))) {
            intent2 = IntentOperation.getStartIntent(context, GunsIntentOperation.class, "com.google.android.gms.notifications.intents.HANDLE_GCM_PUSH");
            intent2.putExtras(intent);
        } else if ("com.google.android.gms.notifications.intents.SHOW_NOTIFICATION".equals(action)) {
            intent2 = IntentOperation.getStartIntent(context, GunsIntentOperation.class, "com.google.android.gms.notifications.intents.SHOW_NOTIFICATION");
            intent2.putExtras(intent);
        } else if ("com.google.android.gms.notifications.intents.HANDLE_NOTIFICATION_ACTION".equals(action)) {
            intent2 = IntentOperation.getStartIntent(context, GunsIntentOperation.class, "com.google.android.gms.notifications.intents.HANDLE_NOTIFICATION_ACTION");
            intent2.putExtras(intent);
        } else {
            intent2 = null;
        }
        if (intent2 != null) {
            WakefulBroadcastReceiver.startWakefulService(context, intent2);
        }
    }
}
