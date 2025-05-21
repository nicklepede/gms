package com.google.android.gms.smartdevice.notification;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.arxo;
import defpackage.asbo;
import defpackage.asit;
import defpackage.ddtg;
import defpackage.denq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PersistentNotificationCancellationIntentOperation extends IntentOperation {
    public static final arxo a = new denq(new String[]{"Notification", "PersistentNotificationCancellationIntentOperation"});

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        arxo arxoVar = a;
        arxoVar.d("Received intent: ".concat(String.valueOf(String.valueOf(intent))), new Object[0]);
        if (!"com.google.android.gms.smartdevice.notification.CANCEL".equals(intent.getAction())) {
            arxoVar.m("Unrecognized Intent action: ".concat(String.valueOf(intent.getAction())), new Object[0]);
        } else {
            if (!intent.hasExtra("tag") && !intent.hasExtra("id")) {
                arxoVar.m("ACTION_CANCEL_NOTIFICATION intent found without tag or id.", new Object[0]);
                return;
            }
            asbo f = asbo.f(this);
            f.getClass();
            arxo arxoVar2 = ddtg.a;
            new asit(this);
            ddtg.d(intent.getStringExtra("tag"), intent.getIntExtra("id", 0), f);
        }
    }
}
