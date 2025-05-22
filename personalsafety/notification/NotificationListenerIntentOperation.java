package com.google.android.gms.personalsafety.notification;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ausn;
import defpackage.cxzc;
import defpackage.cxze;
import defpackage.cxzf;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class NotificationListenerIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || intent.getAction() == null || !Objects.equals(intent.getAction(), "com.google.android.gms.personalsafety.NOTIFICATION_DISMISS")) {
            return;
        }
        long longExtra = intent.getLongExtra("NOTIFICATION_EXPIRY_MILLIS", -1L);
        if (longExtra == -1 || longExtra > System.currentTimeMillis()) {
            ausn ausnVar = cxze.a;
            cxzf.b(longExtra);
            cxzf.b(System.currentTimeMillis());
            cxzc.a(getApplicationContext()).p(10);
            return;
        }
        ausn ausnVar2 = cxze.a;
        cxzf.b(longExtra);
        cxzf.b(System.currentTimeMillis());
        cxzc.a(getApplicationContext()).p(11);
    }
}
