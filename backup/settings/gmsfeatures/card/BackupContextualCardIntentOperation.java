package com.google.android.gms.backup.settings.gmsfeatures.card;

import android.accounts.Account;
import defpackage.ahwd;
import defpackage.ajqp;
import defpackage.ajqu;
import defpackage.ajwk;
import defpackage.arxo;
import defpackage.asew;
import defpackage.bquj;
import defpackage.bqul;
import defpackage.bqun;
import defpackage.flom;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackupContextualCardIntentOperation extends bqun {
    private final arxo a;

    public BackupContextualCardIntentOperation() {
        super(asew.DEFAULT_BACKUP_SETTINGS);
        this.a = ahwd.a("BackupContextualCardIntentOperation");
    }

    @Override // defpackage.bqun
    public final bquj a(bqul bqulVar) {
        flom flomVar = flom.a;
        if (flomVar.a().e()) {
            this.a.d("Kill switch enabled - cancel contextual card fetcher.", new Object[0]);
            return bquj.e;
        }
        ajqp ajqpVar = flomVar.a().h() ? new ajqp(this) : null;
        if (ajqpVar != null && !ajqpVar.a()) {
            this.a.d("Backup settings item disabled - cancel contextual card fetcher.", new Object[0]);
            return bquj.e;
        }
        Account account = bqulVar.a;
        if (account != null) {
            return new ajqu(this, ajwk.f(this), account);
        }
        this.a.d("No account passed - cancel contextual card fetcher.", new Object[0]);
        return bquj.e;
    }
}
