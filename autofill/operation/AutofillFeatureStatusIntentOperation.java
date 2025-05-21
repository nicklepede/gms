package com.google.android.gms.autofill.operation;

import android.accounts.Account;
import defpackage.aeye;
import defpackage.aggz;
import defpackage.asew;
import defpackage.bqup;
import defpackage.bqur;
import defpackage.bquw;
import defpackage.eiid;
import defpackage.flfw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AutofillFeatureStatusIntentOperation extends bquw {
    public AutofillFeatureStatusIntentOperation() {
        super(asew.DEFAULT_AUTOFILL);
    }

    @Override // defpackage.bquw
    public final bqup a(bqur bqurVar) {
        Account account = bqurVar.a;
        return (account != null || flfw.a.a().a()) ? new aggz(aeye.a(this, eiid.i(account)).a()) : bqup.d;
    }

    @Override // defpackage.bqtk
    protected final boolean b() {
        return flfw.a.a().e();
    }
}
