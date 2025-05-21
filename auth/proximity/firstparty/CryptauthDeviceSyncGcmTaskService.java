package com.google.android.gms.auth.proximity.firstparty;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.aans;
import defpackage.aapt;
import defpackage.acel;
import defpackage.acem;
import defpackage.acen;
import defpackage.aclr;
import defpackage.acls;
import defpackage.aclt;
import defpackage.aclv;
import defpackage.aclw;
import defpackage.acqe;
import defpackage.arxo;
import defpackage.asnd;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.bykx;
import defpackage.byky;
import defpackage.byln;
import defpackage.flcg;
import defpackage.flcj;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CryptauthDeviceSyncGcmTaskService extends GmsTaskChimeraService {
    private static final arxo a = new arxo("ProximityAuth", "CryptauthDeviceSyncGcmTaskService");

    public static void d(Context context, Account account, aclr aclrVar) {
        byjl.a(context).d(l(account.name), "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService");
        byjl.a(context).d(k(account.name), "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService");
        aclrVar.c(account.name);
    }

    public static void e(Context context, Account account, aclr aclrVar) {
        byjl.a(context).d(m(account.name), "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService");
        aclrVar.c(account.name);
    }

    public static void f(Context context) {
        List<Account> h = asnd.h(context.getApplicationContext(), context.getPackageName());
        acls aclsVar = new acls(context);
        aclt acltVar = new aclt(context);
        for (Account account : h) {
            if (flcj.j()) {
                o(context, account, acltVar, m(account.name));
            } else {
                e(context, account, acltVar);
            }
            if (!flcg.j() || flcj.g()) {
                d(context, account, aclsVar);
            } else {
                o(context, account, aclsVar, l(account.name));
            }
        }
    }

    public static void g(Context context, Account account) {
        int b = (int) flcg.b();
        Bundle bundle = new Bundle();
        bundle.putString("ACCOUNT_NAME", account.name);
        byjl a2 = byjl.a(context);
        bykj bykjVar = new bykj();
        bykjVar.u = bundle;
        bykjVar.j = "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService";
        bykjVar.t(k(account.name));
        bykjVar.e(b / 2, b);
        bykjVar.v(1);
        bykjVar.p = true;
        bykjVar.t = j(b, (int) flcg.d());
        a2.f(bykjVar.b());
    }

    private final Account h(String str) {
        int i;
        acqe acqeVar = new acqe();
        Account account = null;
        if (str == null) {
            acqeVar.j(2);
            return null;
        }
        Iterator it = asnd.h(this, getPackageName()).iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            Account account2 = (Account) it.next();
            if (true == aans.a(account2.name).equals(aans.a(str))) {
                account = account2;
            }
        }
        if (account == null) {
            a.m("Invalid account: %s", str);
        } else {
            i = 0;
        }
        acqeVar.j(i);
        return account;
    }

    private static byky j(int i, int i2) {
        return bykx.a(0, i, i2);
    }

    private static String k(String str) {
        return "CryptauthDeviceSyncGcmTaskService_retry_" + str.hashCode();
    }

    private static String l(String str) {
        return "CryptauthDeviceSyncGcmTaskService_periodic_" + str.hashCode();
    }

    private static String m(String str) {
        return "CryptauthDeviceSyncGcmTaskService_v2_" + str.hashCode();
    }

    private final void n(Account account, aclr aclrVar, String str) {
        long currentTimeMillis = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(flcg.e());
        o(getApplicationContext(), account, aclrVar, str);
        aclrVar.d(account.name, currentTimeMillis);
    }

    private static void o(Context context, Account account, aclr aclrVar, String str) {
        boolean z;
        long e = flcg.e();
        long e2 = flcg.a.a().e();
        int b = (int) flcg.b();
        int d = (int) flcg.d();
        String str2 = account.name;
        Long valueOf = Long.valueOf(e);
        Long valueOf2 = Long.valueOf(e2);
        Long valueOf3 = Long.valueOf(b);
        Long valueOf4 = Long.valueOf(d);
        int hash = Objects.hash(valueOf, valueOf2, valueOf3, valueOf4);
        String a2 = aclrVar.a(str2);
        Context context2 = aclrVar.a;
        if (hash == context2.getSharedPreferences("com.google.android.gms.auth.proximity.firstparty.DEVICE_SYNC_CONFIG_PREFERENCE_FILE", 0).getInt(a2, 0)) {
            z = false;
        } else {
            context2.getSharedPreferences("com.google.android.gms.auth.proximity.firstparty.DEVICE_SYNC_CONFIG_PREFERENCE_FILE", 0).edit().putInt(aclrVar.a(account.name), Objects.hash(valueOf, valueOf2, valueOf3, valueOf4)).apply();
            aclrVar.c(account.name);
            z = true;
        }
        long j = context2.getSharedPreferences("com.google.android.gms.auth.proximity.firstparty.DEVICE_SYNC_CONFIG_PREFERENCE_FILE", 0).getLong(aclrVar.b(account.name), -1L);
        long max = Math.max(60L, j == -1 ? (long) (Math.random() * e) : TimeUnit.MILLISECONDS.toSeconds(j - System.currentTimeMillis()));
        aclrVar.d(account.name, System.currentTimeMillis() + max);
        Bundle bundle = new Bundle();
        bundle.putString("ACCOUNT_NAME", account.name);
        byjl a3 = byjl.a(context);
        bykj bykjVar = new bykj();
        bykjVar.u = bundle;
        bykjVar.j = "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService";
        bykjVar.t(str);
        bykjVar.e(max, max + e2);
        bykjVar.u(z);
        bykjVar.p = true;
        bykjVar.x(0, 1);
        bykjVar.t = j(b, d);
        a3.f(bykjVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        String str = bylnVar.a;
        int i = 5;
        if (str.startsWith("CryptauthDeviceSyncGcmTaskService_v2_")) {
            acqe acqeVar = new acqe();
            aclt acltVar = new aclt(this);
            if (!flcj.j()) {
                Iterator it = asnd.h(getApplicationContext(), getPackageName()).iterator();
                while (it.hasNext()) {
                    e(this, (Account) it.next(), acltVar);
                }
                a.m("Running v2 task with flag switched off!", new Object[0]);
                acqeVar.l(1);
                return 2;
            }
            Bundle bundle = bylnVar.b;
            if (bundle == null || !bundle.containsKey("ACCOUNT_NAME")) {
                a.m("Missing account name", new Object[0]);
                acqeVar.l(4);
                return 2;
            }
            Account h = h(bundle.getString("ACCOUNT_NAME"));
            if (h == null) {
                a.m("Null account retrieved from account name.", new Object[0]);
                acqeVar.l(3);
                return 2;
            }
            try {
                new acen(new aapt(this), new acel()).a(this, h, 15);
                i = 0;
            } catch (acem e) {
                a.n("Failed periodic device sync", e, new Object[0]);
            }
            acqeVar.l(i);
            n(h, acltVar, bylnVar.a);
            return 0;
        }
        acqe acqeVar2 = new acqe();
        acls aclsVar = new acls(this);
        if (!flcg.j()) {
            Iterator it2 = asnd.h(getApplicationContext(), getPackageName()).iterator();
            while (it2.hasNext()) {
                d(this, (Account) it2.next(), aclsVar);
            }
            acqeVar2.k(2);
            return 2;
        }
        boolean startsWith = str.startsWith("CryptauthDeviceSyncGcmTaskService_periodic_");
        boolean startsWith2 = str.startsWith("CryptauthDeviceSyncGcmTaskService_retry_");
        if (!startsWith && !startsWith2) {
            acqeVar2.k(3);
            return 2;
        }
        Bundle bundle2 = bylnVar.b;
        if (bundle2 == null || !bundle2.containsKey("ACCOUNT_NAME")) {
            acqeVar2.k(5);
            return 2;
        }
        String string = bundle2.getString("ACCOUNT_NAME");
        Account h2 = h(string);
        if (h2 == null) {
            acqeVar2.k(4);
            return 2;
        }
        try {
            aclv.a(this).a(h2, 15);
            byjl.a(getApplicationContext()).d(k(string), "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService");
            if (startsWith) {
                n(h2, aclsVar, bylnVar.a);
            }
            acqeVar2.k(0);
            return 0;
        } catch (aclw unused) {
            acqeVar2.k(1);
            return 1;
        }
    }
}
