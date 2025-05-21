package com.google.android.gms.update.control;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.arxo;
import defpackage.dhfe;
import defpackage.dhfx;
import defpackage.dhjt;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PersistentListenerReceiverIntentOperation extends IntentOperation {
    private static final arxo a = dhjt.d("PersistentListenerReceiverIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String stringExtra;
        if (!dhfe.b(this)) {
            a.h("System update management not enabled in this context. Ignoring intent: %s", intent);
            return;
        }
        if (Objects.equals(intent.getAction(), "com.google.android.gms.update.HANDLE_ACTION_BROADCAST") && (stringExtra = intent.getStringExtra("original_action")) != null) {
            dhfx dhfxVar = (dhfx) dhfx.b.b();
            if (stringExtra.equals("android.intent.action.SCREEN_ON")) {
                dhfxVar.a(13);
            } else {
                a.m("Received unexpected action broadcast: %s", stringExtra);
            }
        }
    }
}
