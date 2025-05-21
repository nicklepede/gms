package com.google.android.gms.auth.folsom.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.abfo;
import defpackage.abkm;
import defpackage.abnb;
import defpackage.abng;
import defpackage.fkyk;
import defpackage.fkzg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RecoverableKeyGeneratedIntentOperation extends IntentOperation {
    static {
        abng.b("RecoverableKeyGenerated");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fkyk.a.a().O() && abnb.a && "com.google.android.gms.auth.folsom.RECOVERABLE_KEY_GENERATED".equals(intent.getAction())) {
            abfo.b(false);
            if (fkzg.a.a().V()) {
                ((abkm) abkm.a.b()).g(true);
            }
        }
    }
}
