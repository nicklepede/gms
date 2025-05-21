package com.google.android.gms.backup.settings.gmsfeatures.status;

import android.accounts.Account;
import defpackage.ajqx;
import defpackage.ajra;
import defpackage.ajwe;
import defpackage.ajwk;
import defpackage.asew;
import defpackage.bqro;
import defpackage.bqrq;
import defpackage.bqup;
import defpackage.bqur;
import defpackage.bquw;
import defpackage.fecj;
import defpackage.flom;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackupFeatureStatusIntentOperation extends bquw {
    public BackupFeatureStatusIntentOperation() {
        super(asew.DEFAULT_BACKUP_SETTINGS);
    }

    @Override // defpackage.bquw
    public final bqup a(bqur bqurVar) {
        bqro bqroVar;
        if (!flom.a.a().g()) {
            if (flom.a.a().f()) {
                ajwe f = ajwk.f(this);
                Account account = bqurVar.a;
                bqrq bqrqVar = bqurVar.b;
                if (bqrqVar == null) {
                    fecj v = bqro.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    ((bqro) v.b).b = true;
                    bqroVar = (bqro) v.Q();
                } else {
                    if (bqrqVar.b != 1) {
                        throw new IllegalArgumentException("Missing `backup` fetcher param");
                    }
                    bqroVar = (bqro) bqrqVar.c;
                }
                return new ajra(f, account, bqroVar);
            }
            Account account2 = bqurVar.a;
            if (account2 != null) {
                return new ajqx(ajwk.f(this), account2);
            }
        }
        return bqup.d;
    }
}
