package com.google.android.gms.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.asej;
import defpackage.asot;
import defpackage.bhyk;
import defpackage.deqy;
import defpackage.fqnl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GcmChimeraBroadcastReceiver extends deqy {
    static {
        asot.b("GcmChimeraBroadcastReceiver", asej.GUNS);
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intent intent2;
        if (fqnl.a.a().q()) {
            return;
        }
        String action = intent.getAction();
        bhyk.a(context);
        if ("gcm".equals(bhyk.e(intent))) {
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
