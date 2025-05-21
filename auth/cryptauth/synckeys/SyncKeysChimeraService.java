package com.google.android.gms.auth.cryptauth.synckeys;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.Settings;
import com.google.android.gms.auth.cryptauth.synckeys.SyncKeysChimeraService;
import com.google.android.gms.chimera.modules.auth.cryptauth.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aaqo;
import defpackage.aaqx;
import defpackage.aavu;
import defpackage.aqum;
import defpackage.aqun;
import defpackage.arxo;
import defpackage.asmf;
import defpackage.bcno;
import defpackage.bcnp;
import defpackage.byln;
import defpackage.deqq;
import defpackage.deqr;
import defpackage.eiho;
import defpackage.enox;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.ensv;
import defpackage.enzw;
import defpackage.fkxu;
import defpackage.qxm;
import defpackage.qxn;
import defpackage.uoh;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SyncKeysChimeraService extends GmsTaskBoundService {
    private static final ensv b = new asmf(Integer.MAX_VALUE, 9);
    public static final arxo a = new arxo(new String[]{"SyncKeysChimeraService"}, (byte[]) null);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        final Context a2 = AppContextProvider.a();
        final bcnp b2 = bcno.b(a2);
        if (!fkxu.c()) {
            a.h("Phone theft sync feature has not been enabled yet.", new Object[0]);
            return ensj.i(2);
        }
        boolean z = Settings.Secure.getInt(a2.getContentResolver(), "mandatory_biometrics", 0) != 0;
        final Bundle bundle = bylnVar.b;
        if (bundle == null) {
            a.f("No task parameters found.", new Object[0]);
            b2.F(4, 2, z);
            return ensj.i(2);
        }
        enzw b3 = enzw.b(bundle.getInt("invocation_reason"));
        enzw enzwVar = enzw.FEATURE_TOGGLED;
        if (b3 == enzwVar) {
            arxo arxoVar = a;
            arxoVar.h("Setting toggled. Scheduling sync for all accounts.", new Object[0]);
            b2.B(enzwVar);
            try {
                try {
                    Account[] p = uoh.p(a2);
                    if (p.length == 0) {
                        arxoVar.h("No accounts found on device - no tasks scheduled.", new Object[0]);
                    }
                    for (Account account : p) {
                        aavu.b(account.name, enzw.MANUAL);
                    }
                    b2.F(6, 0, z);
                    return ensj.i(0);
                } catch (RemoteException | aqum | aqun e) {
                    a.g("Error scheduling tasks.", e, new Object[0]);
                    aavu.b("settingToggleRetry", enzw.FEATURE_TOGGLED);
                    b2.F(4, 3, z);
                    return ensj.i(2);
                }
            } finally {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("invocation_reason", 9);
                aavu.d(Settings.Secure.getUriFor("mandatory_biometrics"), bundle2);
            }
        }
        final String string = bundle.getString("account_name");
        if (string == null) {
            a.f("No account name provided.", new Object[0]);
            b2.F(4, 2, z);
            return ensj.i(2);
        }
        final Account account2 = new Account(string, "com.google");
        final aaqx aaqxVar = new aaqx(a2, account2);
        if (((int) aaqxVar.a()) > aaqxVar.c()) {
            a.m("Too many retries.", new Object[0]);
            aaqxVar.e();
            aavu.b(string, enzw.FAILURE_RECOVERY);
            b2.F(4, 4, z);
            return ensj.i(2);
        }
        aaqo aaqoVar = new aaqo(a2);
        arxo arxoVar2 = a;
        final qxn qxnVar = new qxn(aaqoVar, new qxm(arxoVar2), arxoVar2);
        ensv ensvVar = b;
        final enss submit = ensvVar.submit(new Callable() { // from class: aavo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                arxo arxoVar3 = SyncKeysChimeraService.a;
                return qxn.this.c(string);
            }
        });
        final enss g = enps.g(ensvVar.submit(new Callable() { // from class: aavp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                arxo arxoVar3 = SyncKeysChimeraService.a;
                return eiid.i(new aaqr(a2).c(string));
            }
        }), new enqc() { // from class: aavq
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                arxo arxoVar3 = SyncKeysChimeraService.a;
                return ensj.i(aaui.a(a2).a((List) ((eiid) obj).f()).ng());
            }
        }, ensvVar);
        final deqq a3 = new deqr(a2, 1, "CryptauthSync", null, "com.google.android.gms.auth.cryptauth.synckeys.SyncKeysChimeraService").a("Cryptauth Sync wakelock timed out", fkxu.a.a().b());
        final boolean z2 = z;
        return enox.f(enps.f(ensi.h(ensj.b(submit, g).a(new Callable() { // from class: aavr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                arxo arxoVar3 = SyncKeysChimeraService.a;
                List list = (List) ensj.r(enss.this);
                feay feayVar = (feay) ensj.r(g);
                enzw b4 = enzw.b(bundle.getInt("invocation_reason"));
                eoaj eoajVar = (eoaj) eoam.a.v();
                if (!eoajVar.b.L()) {
                    eoajVar.U();
                }
                ((eoam) eoajVar.b).c = "com.google.android.gms";
                if (!eoajVar.b.L()) {
                    eoajVar.U();
                }
                ((eoam) eoajVar.b).h = "1.0.0";
                fecj v = enzx.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                ((enzx) v.b).b = b4.a();
                if (!eoajVar.b.L()) {
                    eoajVar.U();
                }
                eoam eoamVar = (eoam) eoajVar.b;
                enzx enzxVar = (enzx) v.Q();
                enzxVar.getClass();
                eoamVar.e = enzxVar;
                eoamVar.b |= 2;
                if (!eoajVar.b.L()) {
                    eoajVar.U();
                }
                eoam eoamVar2 = (eoam) eoajVar.b;
                feayVar.getClass();
                eoamVar2.f = feayVar;
                Iterator it = list.iterator();
                while (true) {
                    Context context = a2;
                    if (!it.hasNext()) {
                        Account account3 = account2;
                        eoam eoamVar3 = (eoam) eoajVar.Q();
                        aaud aaudVar = new aaud(context, account3, new aatu(context, 0, 6));
                        try {
                            return aaudVar.a(eoamVar3);
                        } finally {
                            aaudVar.b();
                        }
                    }
                    qya qyaVar = (qya) it.next();
                    String str = qyaVar.a;
                    List list2 = qyaVar.d;
                    eoak eoakVar = (eoak) eoal.a.v();
                    if (!eoakVar.b.L()) {
                        eoakVar.U();
                    }
                    eoal eoalVar = (eoal) eoakVar.b;
                    str.getClass();
                    eoalVar.b = str;
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        eoakVar.a(feay.w(((qxz) it2.next()).a));
                    }
                    byte[] a4 = new aaqr(context).a(string, str);
                    if (a4 != null) {
                        feay w = feay.w(a4);
                        if (!eoakVar.b.L()) {
                            eoakVar.U();
                        }
                        ((eoal) eoakVar.b).d = w;
                    }
                    eoajVar.a((eoal) eoakVar.Q());
                }
            }
        }, ensvVar)), new eiho() { // from class: aavs
            /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
            
                if (r7 != 3) goto L17;
             */
            @Override // defpackage.eiho
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 274
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aavs.apply(java.lang.Object):java.lang.Object");
            }
        }, ensvVar), Exception.class, new eiho() { // from class: aavt
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                SyncKeysChimeraService.a.g("Error while syncing.", (Exception) obj, new Object[0]);
                aaqx.this.f();
                a3.a();
                b2.F(5, 5, z2);
                return 1;
            }
        }, ensvVar);
    }
}
