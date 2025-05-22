package com.google.android.gms.googlesettings.contrib.family;

import android.accounts.Account;
import defpackage.auid;
import defpackage.auiq;
import defpackage.ausn;
import defpackage.blwz;
import defpackage.btca;
import defpackage.btcc;
import defpackage.btce;
import defpackage.eluo;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class FamilyContextualCardIntentOperation extends btce {
    private static final ausn a = ausn.b("FAMILY_CONTEXTUAL_CARD", auid.FAMILY_CONTEXTUAL_CARD);

    public FamilyContextualCardIntentOperation() {
        super(auiq.DEFAULT_FAMILY);
    }

    @Override // defpackage.btce
    public final btca a(btcc btccVar) {
        Account account = btccVar.a;
        if (account == null) {
            ((eluo) a.j()).x("Cannot create FAMILY contextual card: no active account.");
            return btca.e;
        }
        String str = account.name;
        fxxm.e(str, "name");
        return new blwz(this, str);
    }
}
