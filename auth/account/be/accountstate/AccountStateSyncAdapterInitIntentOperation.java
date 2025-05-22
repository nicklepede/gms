package com.google.android.gms.auth.account.be.accountstate;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.R;
import defpackage.apzs;
import defpackage.auqx;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.fmtd;
import defpackage.fmtg;
import defpackage.fnbo;
import defpackage.fpuj;
import defpackage.fpum;
import defpackage.wuo;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountStateSyncAdapterInitIntentOperation extends apzs {
    private static void e(casd casdVar, String str, Bundle bundle, long j) {
        cate cateVar = new cate();
        cateVar.j = "com.google.android.gms.auth.account.be.accountstate.GcmTaskService";
        cateVar.t(str);
        cateVar.g(0);
        cateVar.v(2);
        cateVar.u = bundle;
        cateVar.p = true;
        cateVar.j(cata.a(j));
        casdVar.f(cateVar.b());
    }

    private static void f(casd casdVar, String str, Bundle bundle, catn catnVar) {
        catg catgVar = new catg();
        catgVar.j = "com.google.android.gms.auth.account.be.accountstate.GcmTaskService";
        catgVar.t(str);
        catgVar.u = bundle;
        catgVar.v(2);
        catgVar.l(true);
        catgVar.a = catnVar;
        casdVar.f(catgVar.b());
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        Log.w("Auth", String.format(Locale.US, "[PubsubPeriodicSyncherRuntimeInit] Initializing periodic tasks, IntentAction=%s, InitRuntimeState=%s", intent.getAction(), Integer.valueOf(i)));
        Context baseContext = getBaseContext();
        casd a = casd.a(baseContext);
        Bundle bundle = new Bundle();
        bundle.putBoolean("PERIODIC_ACCOUNT_SYNC_FOR_ALL", true);
        bundle.putString("EXTRA_ACTION", "CREDENTIAL_SYNC_ACTION");
        String a2 = wuo.a("CREDENTIAL_SYNC_ACTION", "PERIODIC_ACCOUNT_SYNC_FOR_ALL");
        if (fpuj.g()) {
            f(a, a2, bundle, catn.l);
        } else {
            e(a, a2, bundle, fnbo.a.lK().n());
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("PERIODIC_ACCOUNT_SYNC_FOR_ALL", true);
        bundle2.putString("EXTRA_ACTION", "ACCOUNT_SYNC_ACTION");
        String a3 = wuo.a("ACCOUNT_SYNC_ACTION", "PERIODIC_ACCOUNT_SYNC_FOR_ALL");
        if (fpuj.g()) {
            f(a, a3, bundle2, catn.j);
        } else {
            e(a, a3, bundle2, fnbo.a.lK().a());
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("EXTRA_ACTION", "PERIODIC_ACCOUNTS_SUMMARY_LOG");
        if (fpum.m()) {
            catg catgVar = new catg();
            catgVar.j = "com.google.android.gms.auth.account.be.accountstate.GcmTaskService";
            catgVar.q("PERIODIC_ACCOUNTS_SUMMARY_LOG");
            catgVar.u = bundle3;
            catgVar.v(2);
            catgVar.p = true;
            catgVar.l(true);
            catgVar.a = catn.j;
            a.f(catgVar.b());
        } else {
            e(a, "PERIODIC_ACCOUNTS_SUMMARY_LOG", bundle3, fmtd.a.lK().b());
        }
        Bundle bundle4 = new Bundle();
        bundle4.putString("EXTRA_ACTION", "ACCOUNT_ID_PRIMARY_EMAIL_SYNC");
        if (fpuj.g()) {
            f(a, "ACCOUNT_ID_PRIMARY_EMAIL_SYNC", bundle4, catn.e((int) fmtg.a.lK().b()));
        } else {
            e(a, "ACCOUNT_ID_PRIMARY_EMAIL_SYNC", bundle4, fmtg.a.lK().c());
        }
        String string = baseContext.getString(R.string.auth_confirm_creds_authority);
        String string2 = baseContext.getString(R.string.auth_account_state_authority);
        for (Account account : auqx.h(baseContext, baseContext.getPackageName())) {
            ContentResolver.removePeriodicSync(account, string, Bundle.EMPTY);
            ContentResolver.removePeriodicSync(account, string2, Bundle.EMPTY);
        }
    }
}
