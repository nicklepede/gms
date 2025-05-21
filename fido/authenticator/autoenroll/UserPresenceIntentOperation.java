package com.google.android.gms.fido.authenticator.autoenroll;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bazq;
import defpackage.bcnj;
import defpackage.fnxk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class UserPresenceIntentOperation extends IntentOperation {
    private static final bcnj a = new bcnj("UserPresenceIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        a.j("Received %s event", intent.getAction());
        if (fnxk.a.a().b() && intent.getAction().equals("android.intent.action.USER_PRESENT")) {
            ((bazq) bazq.a.b()).b();
        }
    }
}
