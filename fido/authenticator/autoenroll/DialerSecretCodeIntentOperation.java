package com.google.android.gms.fido.authenticator.autoenroll;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.apzv;
import defpackage.bddo;
import defpackage.beow;
import defpackage.bepb;
import defpackage.eqnp;
import defpackage.fngi;
import defpackage.fnoz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DialerSecretCodeIntentOperation extends apzv {
    public static final beow b = new beow("DialerSecretCodeIntentOperation");

    public DialerSecretCodeIntentOperation() {
        super("3436375");
    }

    @Override // defpackage.apzv
    public final void a(Intent intent) {
        if (fngi.c()) {
            return;
        }
        b.h("Secret code activated, intent=%s", intent);
        Context applicationContext = getApplicationContext();
        if (fnoz.c()) {
            bepb.b(applicationContext).B(eqnp.MANUAL);
        }
        applicationContext.startService(IntentOperation.getStartIntent(applicationContext, FidoEnrollmentIntentOperation.class, "com.google.android.gms.fido.authenticator.autoenroll.FIDO_ENROLLMENT_CHECK_DELAY_COMPLETE"));
        ((bddo) bddo.a.b()).a();
    }
}
