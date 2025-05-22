package com.google.android.gms.update.control;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auad;
import defpackage.djqk;
import defpackage.djrd;
import defpackage.djuz;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PersistentListenerReceiverIntentOperation extends IntentOperation {
    private static final auad a = djuz.d("PersistentListenerReceiverIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String stringExtra;
        if (!djqk.b(this)) {
            a.h("System update management not enabled in this context. Ignoring intent: %s", intent);
            return;
        }
        if (Objects.equals(intent.getAction(), "com.google.android.gms.update.HANDLE_ACTION_BROADCAST") && (stringExtra = intent.getStringExtra("original_action")) != null) {
            djrd djrdVar = (djrd) djrd.b.b();
            if (stringExtra.equals("android.intent.action.SCREEN_ON")) {
                djrdVar.a(13);
            } else {
                a.m("Received unexpected action broadcast: %s", stringExtra);
            }
        }
    }
}
