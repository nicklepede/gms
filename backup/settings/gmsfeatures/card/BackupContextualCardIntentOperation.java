package com.google.android.gms.backup.settings.gmsfeatures.card;

import android.accounts.Account;
import defpackage.ajwt;
import defpackage.alri;
import defpackage.alrn;
import defpackage.alxi;
import defpackage.auad;
import defpackage.auiq;
import defpackage.btca;
import defpackage.btcc;
import defpackage.btce;
import defpackage.fofw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackupContextualCardIntentOperation extends btce {
    private final auad a;

    public BackupContextualCardIntentOperation() {
        super(auiq.DEFAULT_BACKUP_SETTINGS);
        this.a = ajwt.a("BackupContextualCardIntentOperation");
    }

    @Override // defpackage.btce
    public final btca a(btcc btccVar) {
        fofw fofwVar = fofw.a;
        if (fofwVar.lK().e()) {
            this.a.d("Kill switch enabled - cancel contextual card fetcher.", new Object[0]);
            return btca.e;
        }
        alri alriVar = fofwVar.lK().h() ? new alri(this) : null;
        if (alriVar != null && !alriVar.a()) {
            this.a.d("Backup settings item disabled - cancel contextual card fetcher.", new Object[0]);
            return btca.e;
        }
        Account account = btccVar.a;
        if (account != null) {
            return new alrn(this, alxi.f(this), account);
        }
        this.a.d("No account passed - cancel contextual card fetcher.", new Object[0]);
        return btca.e;
    }
}
