package com.google.android.gms.personalsafety.notification;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asot;
import defpackage.cvpm;
import defpackage.cvpo;
import defpackage.cvpp;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class NotificationListenerIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || intent.getAction() == null || !Objects.equals(intent.getAction(), "com.google.android.gms.personalsafety.NOTIFICATION_DISMISS")) {
            return;
        }
        long longExtra = intent.getLongExtra("NOTIFICATION_EXPIRY_MILLIS", -1L);
        if (longExtra == -1 || longExtra > System.currentTimeMillis()) {
            asot asotVar = cvpo.a;
            cvpp.b(longExtra);
            cvpp.b(System.currentTimeMillis());
            cvpm.a(getApplicationContext()).p(10);
            return;
        }
        asot asotVar2 = cvpo.a;
        cvpp.b(longExtra);
        cvpp.b(System.currentTimeMillis());
        cvpm.a(getApplicationContext()).p(11);
    }
}
