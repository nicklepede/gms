package com.google.android.gms.auth.cryptauth.register;

import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.acql;
import defpackage.acqo;
import defpackage.acqr;
import defpackage.acqx;
import defpackage.acqz;
import defpackage.acrp;
import defpackage.actt;
import defpackage.actu;
import defpackage.acud;
import defpackage.acuf;
import defpackage.acuh;
import defpackage.acui;
import defpackage.acum;
import defpackage.auad;
import defpackage.auio;
import defpackage.auqx;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.cauf;
import defpackage.dhbu;
import defpackage.ekvk;
import defpackage.ekww;
import defpackage.elpp;
import defpackage.fnoa;
import defpackage.sqv;
import defpackage.sqx;
import defpackage.sqz;
import defpackage.sra;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ReEnrollmentChimeraService extends GmsTaskChimeraService {
    private static final auad a = new auad(new String[]{"ReEnrollmentChimeraService"}, (byte[]) null);

    public ReEnrollmentChimeraService() {
        this(new actt(), new acui());
    }

    static final void d(Account account, acqx acqxVar, acuf acufVar) {
        acqxVar.e();
        long j = acqxVar.b.getLong(acqxVar.d("checkinafter"), fnoa.b());
        acufVar.a(account.name, j, j + fnoa.e(), acql.a(acqxVar.b()));
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        ArrayList arrayList;
        int i;
        String string = caufVar.b.getString("account");
        Context applicationContext = getApplicationContext();
        if (ekvk.c(string) || !auqx.m(applicationContext, new Account(string, "com.google"))) {
            a.m("Account doesn't exist on device", new Object[0]);
            return 2;
        }
        Account account = new Account(string, "com.google");
        Context applicationContext2 = getApplicationContext();
        acuf acufVar = new acuf(applicationContext2);
        String str = caufVar.a;
        auad auadVar = a;
        auadVar.d("Performing re-enrollment with tag=%s", str);
        acqx acqxVar = new acqx(applicationContext2, account);
        int a2 = (int) acqxVar.a();
        actu actuVar = new actu(applicationContext2, a2, str.startsWith("OneTimeTag_") ? 3 : str.startsWith("NonImmediateTag_") ? 5 : str.startsWith("ClientDirectiveTag_") ? 2 : 1);
        if (a2 > acqxVar.c()) {
            auadVar.m("Number of retries exceeded allowed number of retries.", new Object[0]);
            acqxVar.e();
            d(account, acqxVar, acufVar);
            return 2;
        }
        acqz acqzVar = new acqz(applicationContext2);
        Set<String> stringSet = acqzVar.b.getStringSet(string, elpp.a);
        if (stringSet.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(stringSet);
        }
        acqr acqrVar = new acqr(applicationContext2);
        try {
            byte[] r = acui.a(applicationContext2).a(acqrVar.c(string)).r();
            actuVar.d = 6;
            acud acudVar = new acud(applicationContext2, account, actuVar);
            sqv sqvVar = new sqv();
            sqvVar.b(account.name);
            sqvVar.c();
            sqvVar.c = r;
            sqvVar.a = acum.a(2);
            sqvVar.i = new acqo(applicationContext2);
            sqvVar.k = new acql(applicationContext2, account);
            sqvVar.h = acqrVar;
            sqvVar.m = new auad(new String[]{"ReEnrollmentCryptauthFramework"}, (byte[]) null);
            sqvVar.e(true);
            sqvVar.j = acudVar;
            if (arrayList != null && !arrayList.isEmpty()) {
                sqvVar.d(arrayList);
            }
            dhbu dhbuVar = new dhbu(applicationContext2, 1, "CryptauthEnroller", null, "com.google.android.gms");
            dhbuVar.c(30000L);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                try {
                    auadVar.d("Starting ReEnrollment", new Object[0]);
                    ekww ekwwVar = bsxv.a;
                    bsxr.a(auio.CRYPTAUTH_REENROLLMENT);
                    sra a3 = acuh.a(sqvVar.a());
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    actuVar.b = a3.a.p;
                    actuVar.a(2, elapsedRealtime2);
                    synchronized (acqzVar.a) {
                        acqzVar.b.edit().remove(string).commit();
                    }
                    if (dhbuVar.l()) {
                        dhbuVar.g();
                    }
                    acudVar.b();
                    return 0;
                } catch (sqx e) {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    sqz sqzVar = e.a;
                    actuVar.b = sqzVar.p;
                    actuVar.a(2, elapsedRealtime3);
                    if (sqzVar.q) {
                        acqxVar.f();
                        i = 1;
                    } else {
                        d(account, acqxVar, acufVar);
                        i = 2;
                    }
                    if (dhbuVar.l()) {
                        dhbuVar.g();
                    }
                    acudVar.b();
                    return i;
                }
            } catch (Throwable th) {
                if (dhbuVar.l()) {
                    dhbuVar.g();
                }
                acudVar.b();
                throw th;
            }
        } catch (acrp unused) {
            a.f("Error while creating client metadata.", new Object[0]);
            return 1;
        }
    }

    public ReEnrollmentChimeraService(actt acttVar, acui acuiVar) {
    }
}
