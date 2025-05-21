package com.google.android.gms.credential.manager.operations;

import android.accounts.Account;
import android.content.Intent;
import defpackage.avnu;
import defpackage.awes;
import defpackage.fvbo;
import defpackage.vks;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class PromoCardInteractionsDataStoreIntentOperation extends avnu {
    public awes a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fvbo.f(intent, "intent");
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            List<Account> c = vks.c(intent);
            fvbo.e(c, "getRemovedWithRenamedAccounts(...)");
            for (Account account : c) {
                awes awesVar = this.a;
                if (awesVar == null) {
                    fvbo.j("promoCardInteractionsDataStoreFileCreator");
                    awesVar = null;
                }
                String str = account.name;
                fvbo.e(str, "name");
                awesVar.a(str).delete();
            }
        }
    }
}
