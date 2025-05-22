package com.google.android.gms.auth.proximity.firstparty;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.acns;
import defpackage.acpt;
import defpackage.aeel;
import defpackage.aeem;
import defpackage.aeen;
import defpackage.aelr;
import defpackage.aels;
import defpackage.aelt;
import defpackage.aelv;
import defpackage.aelw;
import defpackage.aeqe;
import defpackage.auad;
import defpackage.auqx;
import defpackage.casd;
import defpackage.catb;
import defpackage.catp;
import defpackage.catq;
import defpackage.cauf;
import defpackage.fntp;
import defpackage.fnts;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CryptauthDeviceSyncGcmTaskService extends GmsTaskChimeraService {
    private static final auad a = new auad("ProximityAuth", "CryptauthDeviceSyncGcmTaskService");

    public static void d(Context context, Account account, aelr aelrVar) {
        casd.a(context).d(l(account.name), "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService");
        casd.a(context).d(k(account.name), "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService");
        aelrVar.c(account.name);
    }

    public static void e(Context context, Account account, aelr aelrVar) {
        casd.a(context).d(m(account.name), "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService");
        aelrVar.c(account.name);
    }

    public static void f(Context context) {
        List<Account> h = auqx.h(context.getApplicationContext(), context.getPackageName());
        aels aelsVar = new aels(context);
        aelt aeltVar = new aelt(context);
        for (Account account : h) {
            if (fnts.j()) {
                o(context, account, aeltVar, m(account.name));
            } else {
                e(context, account, aeltVar);
            }
            if (!fntp.i() || fnts.g()) {
                d(context, account, aelsVar);
            } else {
                o(context, account, aelsVar, l(account.name));
            }
        }
    }

    public static void g(Context context, Account account) {
        int b = (int) fntp.b();
        Bundle bundle = new Bundle();
        bundle.putString("ACCOUNT_NAME", account.name);
        casd a2 = casd.a(context);
        catb catbVar = new catb();
        catbVar.u = bundle;
        catbVar.j = "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService";
        catbVar.t(k(account.name));
        catbVar.e(b / 2, b);
        catbVar.v(1);
        catbVar.p = true;
        catbVar.t = j(b, (int) fntp.d());
        a2.f(catbVar.b());
    }

    private final Account h(String str) {
        int i;
        aeqe aeqeVar = new aeqe();
        Account account = null;
        if (str == null) {
            aeqeVar.j(2);
            return null;
        }
        Iterator it = auqx.h(this, getPackageName()).iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            Account account2 = (Account) it.next();
            if (true == acns.a(account2.name).equals(acns.a(str))) {
                account = account2;
            }
        }
        if (account == null) {
            a.m("Invalid account: %s", str);
        } else {
            i = 0;
        }
        aeqeVar.j(i);
        return account;
    }

    private static catq j(int i, int i2) {
        return catp.a(0, i, i2);
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

    private final void n(Account account, aelr aelrVar, String str) {
        long currentTimeMillis = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(fntp.e());
        o(getApplicationContext(), account, aelrVar, str);
        aelrVar.d(account.name, currentTimeMillis);
    }

    private static void o(Context context, Account account, aelr aelrVar, String str) {
        boolean z;
        long e = fntp.e();
        long e2 = fntp.a.lK().e();
        int b = (int) fntp.b();
        int d = (int) fntp.d();
        String str2 = account.name;
        Long valueOf = Long.valueOf(e);
        Long valueOf2 = Long.valueOf(e2);
        Long valueOf3 = Long.valueOf(b);
        Long valueOf4 = Long.valueOf(d);
        int hash = Objects.hash(valueOf, valueOf2, valueOf3, valueOf4);
        String a2 = aelrVar.a(str2);
        Context context2 = aelrVar.a;
        if (hash == context2.getSharedPreferences("com.google.android.gms.auth.proximity.firstparty.DEVICE_SYNC_CONFIG_PREFERENCE_FILE", 0).getInt(a2, 0)) {
            z = false;
        } else {
            context2.getSharedPreferences("com.google.android.gms.auth.proximity.firstparty.DEVICE_SYNC_CONFIG_PREFERENCE_FILE", 0).edit().putInt(aelrVar.a(account.name), Objects.hash(valueOf, valueOf2, valueOf3, valueOf4)).apply();
            aelrVar.c(account.name);
            z = true;
        }
        long j = context2.getSharedPreferences("com.google.android.gms.auth.proximity.firstparty.DEVICE_SYNC_CONFIG_PREFERENCE_FILE", 0).getLong(aelrVar.b(account.name), -1L);
        long max = Math.max(60L, j == -1 ? (long) (Math.random() * e) : TimeUnit.MILLISECONDS.toSeconds(j - System.currentTimeMillis()));
        aelrVar.d(account.name, System.currentTimeMillis() + max);
        Bundle bundle = new Bundle();
        bundle.putString("ACCOUNT_NAME", account.name);
        casd a3 = casd.a(context);
        catb catbVar = new catb();
        catbVar.u = bundle;
        catbVar.j = "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService";
        catbVar.t(str);
        catbVar.e(max, max + e2);
        catbVar.u(z);
        catbVar.p = true;
        catbVar.x(0, 1);
        catbVar.t = j(b, d);
        a3.f(catbVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        String str = caufVar.a;
        int i = 5;
        if (str.startsWith("CryptauthDeviceSyncGcmTaskService_v2_")) {
            aeqe aeqeVar = new aeqe();
            aelt aeltVar = new aelt(this);
            if (!fnts.j()) {
                Iterator it = auqx.h(getApplicationContext(), getPackageName()).iterator();
                while (it.hasNext()) {
                    e(this, (Account) it.next(), aeltVar);
                }
                a.m("Running v2 task with flag switched off!", new Object[0]);
                aeqeVar.l(1);
                return 2;
            }
            Bundle bundle = caufVar.b;
            if (bundle == null || !bundle.containsKey("ACCOUNT_NAME")) {
                a.m("Missing account name", new Object[0]);
                aeqeVar.l(4);
                return 2;
            }
            Account h = h(bundle.getString("ACCOUNT_NAME"));
            if (h == null) {
                a.m("Null account retrieved from account name.", new Object[0]);
                aeqeVar.l(3);
                return 2;
            }
            try {
                new aeen(new acpt(this), new aeel()).a(this, h, 15);
                i = 0;
            } catch (aeem e) {
                a.n("Failed periodic device sync", e, new Object[0]);
            }
            aeqeVar.l(i);
            n(h, aeltVar, caufVar.a);
            return 0;
        }
        aeqe aeqeVar2 = new aeqe();
        aels aelsVar = new aels(this);
        if (!fntp.i()) {
            Iterator it2 = auqx.h(getApplicationContext(), getPackageName()).iterator();
            while (it2.hasNext()) {
                d(this, (Account) it2.next(), aelsVar);
            }
            aeqeVar2.k(2);
            return 2;
        }
        boolean startsWith = str.startsWith("CryptauthDeviceSyncGcmTaskService_periodic_");
        boolean startsWith2 = str.startsWith("CryptauthDeviceSyncGcmTaskService_retry_");
        if (!startsWith && !startsWith2) {
            aeqeVar2.k(3);
            return 2;
        }
        Bundle bundle2 = caufVar.b;
        if (bundle2 == null || !bundle2.containsKey("ACCOUNT_NAME")) {
            aeqeVar2.k(5);
            return 2;
        }
        String string = bundle2.getString("ACCOUNT_NAME");
        Account h2 = h(string);
        if (h2 == null) {
            aeqeVar2.k(4);
            return 2;
        }
        try {
            aelv.a(this).a(h2, 15);
            casd.a(getApplicationContext()).d(k(string), "com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncService");
            if (startsWith) {
                n(h2, aelsVar, caufVar.a);
            }
            aeqeVar2.k(0);
            return 0;
        } catch (aelw unused) {
            aeqeVar2.k(1);
            return 1;
        }
    }
}
