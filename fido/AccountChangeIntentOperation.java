package com.google.android.gms.fido;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bazq;
import defpackage.bcnj;
import defpackage.bcno;
import defpackage.enzw;
import defpackage.fkpj;
import defpackage.fkxu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AccountChangeIntentOperation extends IntentOperation {
    private static final bcnj a = new bcnj("AccountChangeIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        a.h("Received onHandleIntent() call: %s", intent);
        if (fkpj.c() || !intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            return;
        }
        if (fkxu.c()) {
            bcno.b(getApplicationContext()).B(enzw.CHANGED_ACCOUNT);
        }
        ((bazq) bazq.a.b()).a();
    }
}
