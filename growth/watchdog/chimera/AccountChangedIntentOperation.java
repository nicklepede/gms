package com.google.android.gms.growth.watchdog.chimera;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bklb;
import defpackage.bkyk;
import defpackage.bkyl;
import defpackage.bqna;
import defpackage.fixl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AccountChangedIntentOperation extends IntentOperation {
    bkyk a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        bkyl bkylVar = new bkyl();
        bkylVar.b(bklb.a());
        bkyk f = bkylVar.a().a.f();
        fixl.d(f);
        this.a = f;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction())) {
            for (Account account : bqna.b(this).p("com.google.android.apps.tachyon")) {
                if (account.name.equals("Duo")) {
                    this.a.c();
                }
            }
        }
    }
}
