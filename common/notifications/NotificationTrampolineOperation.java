package com.google.android.gms.common.notifications;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.notifications.NotificationTrampoline;
import defpackage.audq;
import defpackage.auec;
import defpackage.auid;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.fpqr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class NotificationTrampolineOperation extends IntentOperation {
    private static final ausn a = ausn.b("NotificationTrampolineOperation", auid.CORE);

    static final void a(Intent intent) {
        NotificationTrampoline notificationTrampoline = (NotificationTrampoline) intent.getParcelableExtra("com.google.android.gms.common.notifications.extra.NOTIFICATION_TRAMPOLINE");
        if (notificationTrampoline == null) {
            ((eluo) ((eluo) a.i()).ai((char) 3228)).B("Missing required extra: %s", "com.google.android.gms.common.notifications.extra.NOTIFICATION_TRAMPOLINE");
            return;
        }
        try {
            PendingIntent pendingIntent = notificationTrampoline.a;
            if (pendingIntent != null) {
                pendingIntent.send();
            }
            String action = intent.getAction();
            if ("com.google.android.gms.common.notifications.action.NOTIFICATION_CLICK".equals(action)) {
                if (fpqr.d()) {
                    b(notificationTrampoline).b(notificationTrampoline.h, notificationTrampoline.c, "gmscore_notification");
                    return;
                } else {
                    b(notificationTrampoline).b(notificationTrampoline.b, notificationTrampoline.c, notificationTrampoline.d);
                    return;
                }
            }
            if (!"com.google.android.gms.common.notifications.action.NOTIFICATION_DISMISS".equals(action)) {
                ((eluo) ((eluo) a.i()).ai((char) 3226)).B("Unexpected action: %s", action);
            } else if (fpqr.d()) {
                b(notificationTrampoline).c(notificationTrampoline.h, notificationTrampoline.c, "gmscore_notification");
            } else {
                b(notificationTrampoline).c(notificationTrampoline.b, notificationTrampoline.c, notificationTrampoline.d);
            }
        } catch (PendingIntent.CanceledException e) {
            ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 3227)).B("Error handling target intent: %s", notificationTrampoline);
        }
    }

    private static final auec b(NotificationTrampoline notificationTrampoline) {
        return new audq(notificationTrampoline.e, notificationTrampoline.f);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        getApplicationContext();
        a(intent);
    }
}
