package com.google.android.gms.mobiledataplan.notification;

import android.content.Intent;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.google.android.chimera.IntentOperation;
import defpackage.aued;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cgls;
import defpackage.dhpk;
import defpackage.eluo;
import defpackage.enul;
import defpackage.etry;
import defpackage.etrz;
import defpackage.fhvs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NotificationListenerIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("MobileDataPlan", auid.MOBILE_DATA_PLAN);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        long longExtra = intent.getLongExtra("NOTIFICATION_LOGGING_NOTIFICATION_ID", 0L);
        int intExtra = intent.getIntExtra("NOTIFICATION_ACTION", 0);
        if (intExtra == 0) {
            cgls.c().z(intent, enul.DISMISSED_BY_UESR, "MDP_Notification", fhvs.DISMISSED_BY_USER);
            return;
        }
        if (intExtra != 1) {
            eluo eluoVar = (eluo) a.j();
            Integer valueOf = Integer.valueOf(intExtra);
            etry etryVar = etry.NO_USER_DATA;
            eluoVar.P("Invalid background intent for notification action type %s. ID: %s", new etrz(etryVar, valueOf), new etrz(etryVar, Long.valueOf(longExtra)));
            return;
        }
        cgls.c().z(intent, enul.NOTIFICATION_ACTION_TAKEN, "MDP_UiAction", fhvs.NOTIFICATION_ACTION_TAKEN);
        aued f = aued.f(this);
        if (f == null || longExtra == 0) {
            return;
        }
        dhpk dhpkVar = dhpk.MOBILEDATAPLAN_NOTIFICATION;
        f.o("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG", (int) longExtra, dhpkVar);
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
            f.o("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG", 0, dhpkVar);
        }
    }
}
