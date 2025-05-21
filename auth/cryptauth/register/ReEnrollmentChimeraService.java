package com.google.android.gms.auth.cryptauth.register;

import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.aaql;
import defpackage.aaqo;
import defpackage.aaqr;
import defpackage.aaqx;
import defpackage.aaqz;
import defpackage.aarp;
import defpackage.aatt;
import defpackage.aatu;
import defpackage.aaud;
import defpackage.aauf;
import defpackage.aauh;
import defpackage.aaui;
import defpackage.arxo;
import defpackage.aseu;
import defpackage.asnd;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.byln;
import defpackage.deqr;
import defpackage.eiif;
import defpackage.eijr;
import defpackage.ejck;
import defpackage.enzw;
import defpackage.fkwv;
import defpackage.qxr;
import defpackage.qxt;
import defpackage.qxv;
import defpackage.qxw;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ReEnrollmentChimeraService extends GmsTaskChimeraService {
    private static final arxo a = new arxo(new String[]{"ReEnrollmentChimeraService"}, (byte[]) null);

    public ReEnrollmentChimeraService() {
        this(new aatt(), new aaui());
    }

    static final void d(Account account, aaqx aaqxVar, aauf aaufVar) {
        aaqxVar.e();
        long j = aaqxVar.b.getLong(aaqxVar.d("checkinafter"), fkwv.b());
        aaufVar.a(account.name, j, j + fkwv.e(), aaql.a(aaqxVar.b()));
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        ArrayList arrayList;
        int i;
        String string = bylnVar.b.getString("account");
        Context applicationContext = getApplicationContext();
        if (eiif.c(string) || !asnd.m(applicationContext, new Account(string, "com.google"))) {
            a.m("Account doesn't exist on device", new Object[0]);
            return 2;
        }
        Account account = new Account(string, "com.google");
        Context applicationContext2 = getApplicationContext();
        aauf aaufVar = new aauf(applicationContext2);
        String str = bylnVar.a;
        arxo arxoVar = a;
        arxoVar.d("Performing re-enrollment with tag=%s", str);
        aaqx aaqxVar = new aaqx(applicationContext2, account);
        int a2 = (int) aaqxVar.a();
        aatu aatuVar = new aatu(applicationContext2, a2, str.startsWith("OneTimeTag_") ? 3 : str.startsWith("NonImmediateTag_") ? 5 : str.startsWith("ClientDirectiveTag_") ? 2 : 1);
        if (a2 > aaqxVar.c()) {
            arxoVar.m("Number of retries exceeded allowed number of retries.", new Object[0]);
            aaqxVar.e();
            d(account, aaqxVar, aaufVar);
            return 2;
        }
        aaqz aaqzVar = new aaqz(applicationContext2);
        Set<String> stringSet = aaqzVar.b.getStringSet(string, ejck.a);
        if (stringSet.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(stringSet);
        }
        aaqr aaqrVar = new aaqr(applicationContext2);
        try {
            byte[] r = aaui.a(applicationContext2).a(aaqrVar.c(string)).r();
            aatuVar.d = 6;
            aaud aaudVar = new aaud(applicationContext2, account, aatuVar);
            qxr qxrVar = new qxr();
            qxrVar.b(account.name);
            qxrVar.c();
            qxrVar.c = r;
            qxrVar.a = enzw.PERIODIC;
            qxrVar.i = new aaqo(applicationContext2);
            qxrVar.k = new aaql(applicationContext2, account);
            qxrVar.h = aaqrVar;
            qxrVar.m = new arxo(new String[]{"ReEnrollmentCryptauthFramework"}, (byte[]) null);
            qxrVar.e(true);
            qxrVar.j = aaudVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                qxrVar.d(arrayList);
            }
            deqr deqrVar = new deqr(applicationContext2, 1, "CryptauthEnroller", null, "com.google.android.gms");
            deqrVar.c(30000L);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                try {
                    arxoVar.d("Starting ReEnrollment", new Object[0]);
                    eijr eijrVar = bqqe.a;
                    bqqa.a(aseu.CRYPTAUTH_REENROLLMENT);
                    qxw a3 = aauh.a(qxrVar.a());
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    aatuVar.b = a3.a.p;
                    aatuVar.a(2, elapsedRealtime2);
                    synchronized (aaqzVar.a) {
                        aaqzVar.b.edit().remove(string).commit();
                    }
                    if (deqrVar.l()) {
                        deqrVar.g();
                    }
                    aaudVar.b();
                    return 0;
                } catch (qxt e) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    qxv qxvVar = e.a;
                    aatuVar.b = qxvVar.p;
                    aatuVar.a(2, elapsedRealtime3);
                    if (qxvVar.q) {
                        aaqxVar.f();
                        i = 1;
                    } else {
                        d(account, aaqxVar, aaufVar);
                        i = 2;
                    }
                    if (deqrVar.l()) {
                        deqrVar.g();
                    }
                    aaudVar.b();
                    return i;
                }
            } catch (Throwable th) {
                if (deqrVar.l()) {
                    deqrVar.g();
                }
                aaudVar.b();
                throw th;
            }
        } catch (aarp unused) {
            a.f("Error while creating client metadata.", new Object[0]);
            return 1;
        }
    }

    public ReEnrollmentChimeraService(aatt aattVar, aaui aauiVar) {
    }
}
