package com.google.android.gms.auth.proximity;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aans;
import defpackage.arxo;
import defpackage.asnd;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.fldd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FeatureReconcilerGmsTaskBoundService extends GmsTaskBoundService {
    private static final arxo a = new arxo("ProximityAuth", "FeatureReconcilerGmsTaskBoundService");

    public static void d(Context context, Account account) {
        int a2 = (int) fldd.a.a().a();
        Bundle bundle = new Bundle();
        bundle.putString("ACCOUNT_NAME", account.name);
        byjl a3 = byjl.a(context);
        bykj bykjVar = new bykj();
        bykjVar.u = bundle;
        bykjVar.w(FeatureReconcilerGmsTaskBoundService.class.getName());
        bykjVar.t("FeatureReconcilerGmsTaskBoundService_retry_" + account.name.hashCode());
        bykjVar.e((long) (a2 / 2), (long) a2);
        bykjVar.v(1);
        bykjVar.p = true;
        a3.f(bykjVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (fldd.g()) {
            Bundle bundle = bylnVar.b;
            if (bundle == null || !bundle.containsKey("ACCOUNT_NAME")) {
                a.m("Missing account name", new Object[0]);
                return 2;
            }
            String string = bundle.getString("ACCOUNT_NAME");
            Account account = null;
            if (string != null) {
                for (Account account2 : asnd.h(this, getPackageName())) {
                    if (true == aans.a(account2.name).equals(aans.a(string))) {
                        account = account2;
                    }
                }
            }
            if (account == null) {
                a.m("Null account retrieved from account name.", new Object[0]);
                return 2;
            }
            if (bylnVar.a.startsWith("FeatureReconcilerGmsTaskBoundService_retry_")) {
                getApplicationContext().startService(FeatureEnabledStateReconcilerIntentOperation.a(this, account));
                return 0;
            }
        }
        return 2;
    }
}
