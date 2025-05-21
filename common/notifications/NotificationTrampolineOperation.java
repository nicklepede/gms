package com.google.android.gms.common.notifications;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.notifications.NotificationTrampoline;
import defpackage.asbb;
import defpackage.asbn;
import defpackage.asej;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.fmys;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class NotificationTrampolineOperation extends IntentOperation {
    private static final asot a = asot.b("NotificationTrampolineOperation", asej.CORE);

    static final void a(Intent intent) {
        NotificationTrampoline notificationTrampoline = (NotificationTrampoline) intent.getParcelableExtra("com.google.android.gms.common.notifications.extra.NOTIFICATION_TRAMPOLINE");
        if (notificationTrampoline == null) {
            ((ejhf) ((ejhf) a.i()).ah((char) 3224)).B("Missing required extra: %s", "com.google.android.gms.common.notifications.extra.NOTIFICATION_TRAMPOLINE");
            return;
        }
        try {
            PendingIntent pendingIntent = notificationTrampoline.a;
            if (pendingIntent != null) {
                pendingIntent.send();
            }
            String action = intent.getAction();
            if ("com.google.android.gms.common.notifications.action.NOTIFICATION_CLICK".equals(action)) {
                if (fmys.d()) {
                    b(notificationTrampoline).b(notificationTrampoline.h, notificationTrampoline.c, "gmscore_notification");
                    return;
                } else {
                    b(notificationTrampoline).b(notificationTrampoline.b, notificationTrampoline.c, notificationTrampoline.d);
                    return;
                }
            }
            if (!"com.google.android.gms.common.notifications.action.NOTIFICATION_DISMISS".equals(action)) {
                ((ejhf) ((ejhf) a.i()).ah((char) 3222)).B("Unexpected action: %s", action);
            } else if (fmys.d()) {
                b(notificationTrampoline).c(notificationTrampoline.h, notificationTrampoline.c, "gmscore_notification");
            } else {
                b(notificationTrampoline).c(notificationTrampoline.b, notificationTrampoline.c, notificationTrampoline.d);
            }
        } catch (PendingIntent.CanceledException e) {
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 3223)).B("Error handling target intent: %s", notificationTrampoline);
        }
    }

    private static final asbn b(NotificationTrampoline notificationTrampoline) {
        return new asbb(notificationTrampoline.e, notificationTrampoline.f);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        getApplicationContext();
        a(intent);
    }
}
