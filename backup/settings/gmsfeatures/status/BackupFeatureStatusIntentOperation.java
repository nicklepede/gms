package com.google.android.gms.backup.settings.gmsfeatures.status;

import android.accounts.Account;
import defpackage.alrq;
import defpackage.alrt;
import defpackage.alxc;
import defpackage.alxi;
import defpackage.auiq;
import defpackage.bszf;
import defpackage.bszh;
import defpackage.btcg;
import defpackage.btci;
import defpackage.btcn;
import defpackage.fgrc;
import defpackage.fofw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackupFeatureStatusIntentOperation extends btcn {
    public BackupFeatureStatusIntentOperation() {
        super(auiq.DEFAULT_BACKUP_SETTINGS);
    }

    @Override // defpackage.btcn
    public final btcg a(btci btciVar) {
        bszf bszfVar;
        fofw fofwVar = fofw.a;
        if (!fofwVar.lK().g()) {
            if (fofwVar.lK().f()) {
                alxc f = alxi.f(this);
                Account account = btciVar.a;
                bszh bszhVar = btciVar.b;
                if (bszhVar == null) {
                    fgrc v = bszf.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    ((bszf) v.b).b = true;
                    bszfVar = (bszf) v.Q();
                } else {
                    if (bszhVar.b != 1) {
                        throw new IllegalArgumentException("Missing `backup` fetcher param");
                    }
                    bszfVar = (bszf) bszhVar.c;
                }
                return new alrt(f, account, bszfVar);
            }
            Account account2 = btciVar.a;
            if (account2 != null) {
                return new alrq(alxi.f(this), account2);
            }
        }
        return btcg.d;
    }
}
