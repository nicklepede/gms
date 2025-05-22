package com.google.android.gms.fido.authenticator.autoenroll;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bddo;
import defpackage.beow;
import defpackage.fqpm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class UserPresenceIntentOperation extends IntentOperation {
    private static final beow a = new beow("UserPresenceIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        a.j("Received %s event", intent.getAction());
        if (fqpm.a.lK().b() && intent.getAction().equals("android.intent.action.USER_PRESENT")) {
            ((bddo) bddo.a.b()).b();
        }
    }
}
