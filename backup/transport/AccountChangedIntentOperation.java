package com.google.android.gms.backup.transport;

import android.accounts.Account;
import android.content.Intent;
import defpackage.ajif;
import defpackage.ajqj;
import defpackage.ajql;
import defpackage.ajru;
import defpackage.ajwt;
import defpackage.akfz;
import defpackage.amcx;
import defpackage.amdb;
import defpackage.amfe;
import defpackage.amne;
import defpackage.elhz;
import defpackage.fogi;
import defpackage.fohg;
import defpackage.oiu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AccountChangedIntentOperation extends ajru {
    public static final ajwt a = new ajwt("AccountChangedIO");
    private static final elhz b = elhz.L("android.accounts.LOGIN_ACCOUNTS_CHANGED", "android.intent.action.BOOT_COMPLETED", "com.google.android.gms.backup.BackupAccountChanged");
    private oiu c;
    private oiu d;
    private ajif e;
    private ajql f;

    @Override // defpackage.ajru
    public final void a(Intent intent) {
        String action = intent.getAction();
        ajwt ajwtVar = a;
        ajwtVar.j("Received intent, action = %s", action);
        String stringExtra = intent.getStringExtra("authAccount");
        String stringExtra2 = intent.getStringExtra("accountType");
        if (fogi.a.lK().aw() && "android.accounts.action.ACCOUNT_REMOVED".equals(action) && stringExtra != null && stringExtra2 != null) {
            ajqj.a(getApplicationContext(), new Account(stringExtra, stringExtra2)).edit().clear().apply();
            return;
        }
        if (!b.contains(action) || ((!fohg.a.lK().b() && !akfz.a()) || !amfe.b())) {
            ajwtVar.j("Ignoring received intent", new Object[0]);
            return;
        }
        this.c.b(0L);
        this.d.b(0L);
        this.e.a();
        this.f.g(BackupTransportChimeraService.b(), new amcx(this, this.e));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        amdb amdbVar = new amdb(this);
        oiu a2 = amne.a(this);
        ajif ajifVar = new ajif(this);
        ajql ajqlVar = new ajql(this);
        this.c = amdbVar;
        this.d = a2;
        this.e = ajifVar;
        this.f = ajqlVar;
    }
}
