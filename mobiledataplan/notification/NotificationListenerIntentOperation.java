package com.google.android.gms.mobiledataplan.notification;

import android.content.Intent;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.google.android.chimera.IntentOperation;
import defpackage.asbo;
import defpackage.asej;
import defpackage.asot;
import defpackage.cecl;
import defpackage.dfee;
import defpackage.ejhf;
import defpackage.elgy;
import defpackage.erdc;
import defpackage.erdd;
import defpackage.ffgu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class NotificationListenerIntentOperation extends IntentOperation {
    private static final asot a = asot.b("MobileDataPlan", asej.MOBILE_DATA_PLAN);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        long longExtra = intent.getLongExtra("NOTIFICATION_LOGGING_NOTIFICATION_ID", 0L);
        int intExtra = intent.getIntExtra("NOTIFICATION_ACTION", 0);
        if (intExtra == 0) {
            cecl.c().z(intent, elgy.DISMISSED_BY_UESR, "MDP_Notification", ffgu.DISMISSED_BY_USER);
            return;
        }
        if (intExtra != 1) {
            ejhf ejhfVar = (ejhf) a.j();
            Integer valueOf = Integer.valueOf(intExtra);
            erdc erdcVar = erdc.NO_USER_DATA;
            ejhfVar.P("Invalid background intent for notification action type %s. ID: %s", new erdd(erdcVar, valueOf), new erdd(erdcVar, Long.valueOf(longExtra)));
            return;
        }
        cecl.c().z(intent, elgy.NOTIFICATION_ACTION_TAKEN, "MDP_UiAction", ffgu.NOTIFICATION_ACTION_TAKEN);
        asbo f = asbo.f(this);
        if (f == null || longExtra == 0) {
            return;
        }
        dfee dfeeVar = dfee.MOBILEDATAPLAN_NOTIFICATION;
        f.o("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG", (int) longExtra, dfeeVar);
        if (Build.VERSION.SDK_INT >= 24) {
            boolean z = false;
            for (StatusBarNotification statusBarNotification : f.B()) {
                if (statusBarNotification.getId() != longExtra && statusBarNotification.getId() != 0) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            f.o("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG", 0, dfeeVar);
        }
    }
}
