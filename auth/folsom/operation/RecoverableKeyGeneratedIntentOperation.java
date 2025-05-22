package com.google.android.gms.auth.folsom.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.adfo;
import defpackage.adkm;
import defpackage.adnb;
import defpackage.adng;
import defpackage.fnpr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class RecoverableKeyGeneratedIntentOperation extends IntentOperation {
    static {
        adng.b("RecoverableKeyGenerated");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fnpr.a.lK().N() && adnb.a && "com.google.android.gms.auth.folsom.RECOVERABLE_KEY_GENERATED".equals(intent.getAction())) {
            adfo.b(false);
            ((adkm) adkm.a.b()).g(true);
        }
    }
}
