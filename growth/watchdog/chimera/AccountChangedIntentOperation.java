package com.google.android.gms.growth.watchdog.chimera;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bmrr;
import defpackage.bnfb;
import defpackage.bnfc;
import defpackage.bsup;
import defpackage.flni;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AccountChangedIntentOperation extends IntentOperation {
    bnfb a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        bnfc bnfcVar = new bnfc();
        bnfcVar.b(bmrr.a());
        bnfb f = bnfcVar.a().a.f();
        flni.d(f);
        this.a = f;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction())) {
            for (Account account : bsup.b(this).p("com.google.android.apps.tachyon")) {
                if (account.name.equals("Duo")) {
                    this.a.c();
                }
            }
        }
    }
}
