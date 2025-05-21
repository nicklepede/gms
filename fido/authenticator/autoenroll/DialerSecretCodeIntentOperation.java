package com.google.android.gms.fido.authenticator.autoenroll;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.anyd;
import defpackage.bazq;
import defpackage.bcnj;
import defpackage.bcno;
import defpackage.enzw;
import defpackage.fkpj;
import defpackage.fkxu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DialerSecretCodeIntentOperation extends anyd {
    public static final bcnj b = new bcnj("DialerSecretCodeIntentOperation");

    public DialerSecretCodeIntentOperation() {
        super("3436375");
    }

    @Override // defpackage.anyd
    public final void a(Intent intent) {
        if (fkpj.c()) {
            return;
        }
        b.h("Secret code activated, intent=%s", intent);
        Context applicationContext = getApplicationContext();
        if (fkxu.c()) {
            bcno.b(applicationContext).B(enzw.MANUAL);
        }
        applicationContext.startService(IntentOperation.getStartIntent(applicationContext, FidoEnrollmentIntentOperation.class, "com.google.android.gms.fido.authenticator.autoenroll.FIDO_ENROLLMENT_CHECK_DELAY_COMPLETE"));
        ((bazq) bazq.a.b()).a();
    }
}
