package com.google.android.gms.autofill.operation;

import android.accounts.Account;
import defpackage.agyr;
import defpackage.aihp;
import defpackage.auiq;
import defpackage.btcg;
import defpackage.btci;
import defpackage.btcn;
import defpackage.ekvi;
import defpackage.fnxj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AutofillFeatureStatusIntentOperation extends btcn {
    public AutofillFeatureStatusIntentOperation() {
        super(auiq.DEFAULT_AUTOFILL);
    }

    @Override // defpackage.btcn
    public final btcg a(btci btciVar) {
        Account account = btciVar.a;
        return (account != null || fnxj.a.lK().a()) ? new aihp(agyr.a(this, ekvi.i(account)).a()) : btcg.d;
    }

    @Override // defpackage.btbb
    protected final boolean b() {
        return fnxj.a.lK().e();
    }
}
