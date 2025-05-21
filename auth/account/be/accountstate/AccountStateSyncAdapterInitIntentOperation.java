package com.google.android.gms.auth.account.be.accountstate;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.R;
import defpackage.anya;
import defpackage.asnd;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.fkcr;
import defpackage.fkcu;
import defpackage.fkkz;
import defpackage.fnck;
import defpackage.fncn;
import defpackage.uyo;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountStateSyncAdapterInitIntentOperation extends anya {
    private static void e(byjl byjlVar, String str, Bundle bundle, long j) {
        bykm bykmVar = new bykm();
        bykmVar.j = "com.google.android.gms.auth.account.be.accountstate.GcmTaskService";
        bykmVar.t(str);
        bykmVar.g(0);
        bykmVar.v(2);
        bykmVar.u = bundle;
        bykmVar.p = true;
        bykmVar.j(byki.a(j));
        byjlVar.f(bykmVar.b());
    }

    private static void f(byjl byjlVar, String str, Bundle bundle, bykv bykvVar) {
        byko bykoVar = new byko();
        bykoVar.j = "com.google.android.gms.auth.account.be.accountstate.GcmTaskService";
        bykoVar.t(str);
        bykoVar.u = bundle;
        bykoVar.v(2);
        bykoVar.l(true);
        bykoVar.a = bykvVar;
        byjlVar.f(bykoVar.b());
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        Log.w("Auth", String.format(Locale.US, "[PubsubPeriodicSyncherRuntimeInit] Initializing periodic tasks, IntentAction=%s, InitRuntimeState=%s", intent.getAction(), Integer.valueOf(i)));
        Context baseContext = getBaseContext();
        byjl a = byjl.a(baseContext);
        Bundle bundle = new Bundle();
        bundle.putBoolean("PERIODIC_ACCOUNT_SYNC_FOR_ALL", true);
        bundle.putString("EXTRA_ACTION", "CREDENTIAL_SYNC_ACTION");
        String a2 = uyo.a("CREDENTIAL_SYNC_ACTION", "PERIODIC_ACCOUNT_SYNC_FOR_ALL");
        if (fnck.g()) {
            f(a, a2, bundle, bykv.l);
        } else {
            e(a, a2, bundle, fkkz.a.a().n());
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("PERIODIC_ACCOUNT_SYNC_FOR_ALL", true);
        bundle2.putString("EXTRA_ACTION", "ACCOUNT_SYNC_ACTION");
        String a3 = uyo.a("ACCOUNT_SYNC_ACTION", "PERIODIC_ACCOUNT_SYNC_FOR_ALL");
        if (fnck.g()) {
            f(a, a3, bundle2, bykv.j);
        } else {
            e(a, a3, bundle2, fkkz.a.a().a());
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("EXTRA_ACTION", "PERIODIC_ACCOUNTS_SUMMARY_LOG");
        if (fncn.m()) {
            byko bykoVar = new byko();
            bykoVar.j = "com.google.android.gms.auth.account.be.accountstate.GcmTaskService";
            bykoVar.q("PERIODIC_ACCOUNTS_SUMMARY_LOG");
            bykoVar.u = bundle3;
            bykoVar.v(2);
            bykoVar.p = true;
            bykoVar.l(true);
            bykoVar.a = bykv.j;
            a.f(bykoVar.b());
        } else {
            e(a, "PERIODIC_ACCOUNTS_SUMMARY_LOG", bundle3, fkcr.a.a().b());
        }
        Bundle bundle4 = new Bundle();
        bundle4.putString("EXTRA_ACTION", "ACCOUNT_ID_PRIMARY_EMAIL_SYNC");
        if (fnck.g()) {
            f(a, "ACCOUNT_ID_PRIMARY_EMAIL_SYNC", bundle4, bykv.e((int) fkcu.a.a().b()));
        } else {
            e(a, "ACCOUNT_ID_PRIMARY_EMAIL_SYNC", bundle4, fkcu.a.a().c());
        }
        String string = baseContext.getString(R.string.auth_confirm_creds_authority);
        String string2 = baseContext.getString(R.string.auth_account_state_authority);
        for (Account account : asnd.h(baseContext, baseContext.getPackageName())) {
            ContentResolver.removePeriodicSync(account, string, Bundle.EMPTY);
            ContentResolver.removePeriodicSync(account, string2, Bundle.EMPTY);
        }
    }
}
