package com.google.android.gms.fido;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bddo;
import defpackage.beow;
import defpackage.bepb;
import defpackage.eqnp;
import defpackage.fngi;
import defpackage.fnoz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AccountChangeIntentOperation extends IntentOperation {
    private static final beow a = new beow("AccountChangeIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        a.h("Received onHandleIntent() call: %s", intent);
        if (fngi.c() || !intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            return;
        }
        if (fnoz.c()) {
            bepb.b(getApplicationContext()).B(eqnp.CHANGED_ACCOUNT);
        }
        ((bddo) bddo.a.b()).a();
    }
}
