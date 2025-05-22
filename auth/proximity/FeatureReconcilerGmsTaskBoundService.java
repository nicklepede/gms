package com.google.android.gms.auth.proximity;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.acns;
import defpackage.auad;
import defpackage.auqx;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.fnum;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FeatureReconcilerGmsTaskBoundService extends GmsTaskBoundService {
    private static final auad a = new auad("ProximityAuth", "FeatureReconcilerGmsTaskBoundService");

    public static void d(Context context, Account account) {
        int a2 = (int) fnum.a.lK().a();
        Bundle bundle = new Bundle();
        bundle.putString("ACCOUNT_NAME", account.name);
        casd a3 = casd.a(context);
        catb catbVar = new catb();
        catbVar.u = bundle;
        catbVar.w(FeatureReconcilerGmsTaskBoundService.class.getName());
        catbVar.t("FeatureReconcilerGmsTaskBoundService_retry_" + account.name.hashCode());
        catbVar.e((long) (a2 / 2), (long) a2);
        catbVar.v(1);
        catbVar.p = true;
        a3.f(catbVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (fnum.g()) {
            Bundle bundle = caufVar.b;
            if (bundle == null || !bundle.containsKey("ACCOUNT_NAME")) {
                a.m("Missing account name", new Object[0]);
                return 2;
            }
            String string = bundle.getString("ACCOUNT_NAME");
            Account account = null;
            if (string != null) {
                for (Account account2 : auqx.h(this, getPackageName())) {
                    if (true == acns.a(account2.name).equals(acns.a(string))) {
                        account = account2;
                    }
                }
            }
            if (account == null) {
                a.m("Null account retrieved from account name.", new Object[0]);
                return 2;
            }
            if (caufVar.a.startsWith("FeatureReconcilerGmsTaskBoundService_retry_")) {
                getApplicationContext().startService(FeatureEnabledStateReconcilerIntentOperation.a(this, account));
                return 0;
            }
        }
        return 2;
    }
}
