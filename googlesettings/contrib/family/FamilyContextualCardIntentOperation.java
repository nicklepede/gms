package com.google.android.gms.googlesettings.contrib.family;

import android.accounts.Account;
import defpackage.asej;
import defpackage.asew;
import defpackage.asot;
import defpackage.bjqj;
import defpackage.bquj;
import defpackage.bqul;
import defpackage.bqun;
import defpackage.ejhf;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class FamilyContextualCardIntentOperation extends bqun {
    private static final asot a = asot.b("FAMILY_CONTEXTUAL_CARD", asej.FAMILY_CONTEXTUAL_CARD);

    public FamilyContextualCardIntentOperation() {
        super(asew.DEFAULT_FAMILY);
    }

    @Override // defpackage.bqun
    public final bquj a(bqul bqulVar) {
        Account account = bqulVar.a;
        if (account == null) {
            ((ejhf) a.j()).x("Cannot create FAMILY contextual card: no active account.");
            return bquj.e;
        }
        String str = account.name;
        fvbo.e(str, "name");
        return new bjqj(this, str);
    }
}
