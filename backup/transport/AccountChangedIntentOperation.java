package com.google.android.gms.backup.transport;

import android.accounts.Account;
import android.content.Intent;
import defpackage.ahhp;
import defpackage.ahpt;
import defpackage.ahpv;
import defpackage.ahre;
import defpackage.ahwd;
import defpackage.aifj;
import defpackage.akbz;
import defpackage.akcd;
import defpackage.akeh;
import defpackage.akmb;
import defpackage.eiuu;
import defpackage.floy;
import defpackage.flpw;
import defpackage.mqm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AccountChangedIntentOperation extends ahre {
    public static final ahwd a = new ahwd("AccountChangedIO");
    private static final eiuu b = eiuu.L("android.accounts.LOGIN_ACCOUNTS_CHANGED", "android.intent.action.BOOT_COMPLETED", "com.google.android.gms.backup.BackupAccountChanged");
    private mqm c;
    private mqm d;
    private ahhp e;
    private ahpv f;

    @Override // defpackage.ahre
    public final void a(Intent intent) {
        String action = intent.getAction();
        ahwd ahwdVar = a;
        ahwdVar.j("Received intent, action = %s", action);
        String stringExtra = intent.getStringExtra("authAccount");
        String stringExtra2 = intent.getStringExtra("accountType");
        if (floy.a.a().aD() && "android.accounts.action.ACCOUNT_REMOVED".equals(action) && stringExtra != null && stringExtra2 != null) {
            ahpt.a(getApplicationContext(), new Account(stringExtra, stringExtra2)).edit().clear().apply();
            return;
        }
        if (!b.contains(action) || ((!flpw.a.a().b() && !aifj.a()) || !akeh.b())) {
            ahwdVar.j("Ignoring received intent", new Object[0]);
            return;
        }
        this.c.d(0L);
        this.d.d(0L);
        this.e.a();
        this.f.h(BackupTransportChimeraService.b(), new akbz(this, this.e));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        akcd akcdVar = new akcd(this);
        mqm a2 = akmb.a(this);
        ahhp ahhpVar = new ahhp(this);
        ahpv ahpvVar = new ahpv(this);
        this.c = akcdVar;
        this.d = a2;
        this.e = ahhpVar;
        this.f = ahpvVar;
    }
}
