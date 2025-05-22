package com.google.android.gms.credential.manager.operations;

import android.accounts.Account;
import android.content.Intent;
import defpackage.axru;
import defpackage.ayis;
import defpackage.fxxm;
import defpackage.xgt;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PromoCardInteractionsDataStoreIntentOperation extends axru {
    public ayis a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fxxm.f(intent, "intent");
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            List<Account> c = xgt.c(intent);
            fxxm.e(c, "getRemovedWithRenamedAccounts(...)");
            for (Account account : c) {
                ayis ayisVar = this.a;
                if (ayisVar == null) {
                    fxxm.j("promoCardInteractionsDataStoreFileCreator");
                    ayisVar = null;
                }
                String str = account.name;
                fxxm.e(str, "name");
                ayisVar.a(str).delete();
            }
        }
    }
}
