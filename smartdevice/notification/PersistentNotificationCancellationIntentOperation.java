package com.google.android.gms.smartdevice.notification;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auad;
import defpackage.aued;
import defpackage.aumn;
import defpackage.dgel;
import defpackage.dgyt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PersistentNotificationCancellationIntentOperation extends IntentOperation {
    public static final auad a = new dgyt(new String[]{"Notification", "PersistentNotificationCancellationIntentOperation"});

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        auad auadVar = a;
        auadVar.d("Received intent: ".concat(String.valueOf(String.valueOf(intent))), new Object[0]);
        if (!"com.google.android.gms.smartdevice.notification.CANCEL".equals(intent.getAction())) {
            auadVar.m("Unrecognized Intent action: ".concat(String.valueOf(intent.getAction())), new Object[0]);
        } else {
            if (!intent.hasExtra("tag") && !intent.hasExtra("id")) {
                auadVar.m("ACTION_CANCEL_NOTIFICATION intent found without tag or id.", new Object[0]);
                return;
            }
            aued f = aued.f(this);
            f.getClass();
            auad auadVar2 = dgel.a;
            new aumn(this);
            dgel.d(intent.getStringExtra("tag"), intent.getIntExtra("id", 0), f);
        }
    }
}
