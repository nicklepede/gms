package com.google.android.gms.auth.cryptauth.synckeys;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.Settings;
import com.google.android.gms.auth.cryptauth.synckeys.SyncKeysChimeraService;
import com.google.android.gms.chimera.modules.auth.cryptauth.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.acqo;
import defpackage.acqx;
import defpackage.acvu;
import defpackage.asxb;
import defpackage.asxc;
import defpackage.auad;
import defpackage.aupz;
import defpackage.bepb;
import defpackage.bepc;
import defpackage.cauf;
import defpackage.dhbt;
import defpackage.dhbu;
import defpackage.ekut;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.eqnp;
import defpackage.fnoz;
import defpackage.sqq;
import defpackage.sqr;
import defpackage.wkg;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SyncKeysChimeraService extends GmsTaskBoundService {
    private static final eqgo b = new aupz(Integer.MAX_VALUE, 9);
    public static final auad a = new auad(new String[]{"SyncKeysChimeraService"}, (byte[]) null);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        final Context a2 = AppContextProvider.a();
        final bepc b2 = bepb.b(a2);
        if (!fnoz.c()) {
            a.h("Phone theft sync feature has not been enabled yet.", new Object[0]);
            return eqgc.i(2);
        }
        boolean z = Settings.Secure.getInt(a2.getContentResolver(), "mandatory_biometrics", 0) != 0;
        final Bundle bundle = caufVar.b;
        if (bundle == null) {
            a.f("No task parameters found.", new Object[0]);
            b2.F(4, 2, z);
            return eqgc.i(2);
        }
        eqnp b3 = eqnp.b(bundle.getInt("invocation_reason"));
        eqnp eqnpVar = eqnp.FEATURE_TOGGLED;
        if (b3 == eqnpVar) {
            auad auadVar = a;
            auadVar.h("Setting toggled. Scheduling sync for all accounts.", new Object[0]);
            b2.B(eqnpVar);
            try {
                try {
                    Account[] n = wkg.n(a2);
                    if (n.length == 0) {
                        auadVar.h("No accounts found on device - no tasks scheduled.", new Object[0]);
                    }
                    for (Account account : n) {
                        acvu.b(account.name, eqnp.MANUAL);
                    }
                    b2.F(6, 0, z);
                    return eqgc.i(0);
                } catch (RemoteException | asxb | asxc e) {
                    a.g("Error scheduling tasks.", e, new Object[0]);
                    acvu.b("settingToggleRetry", eqnp.FEATURE_TOGGLED);
                    b2.F(4, 3, z);
                    return eqgc.i(2);
                }
            } finally {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("invocation_reason", 9);
                acvu.d(Settings.Secure.getUriFor("mandatory_biometrics"), bundle2);
            }
        }
        final String string = bundle.getString("account_name");
        if (string == null) {
            a.f("No account name provided.", new Object[0]);
            b2.F(4, 2, z);
            return eqgc.i(2);
        }
        final Account account2 = new Account(string, "com.google");
        final acqx acqxVar = new acqx(a2, account2);
        if (((int) acqxVar.a()) > acqxVar.c()) {
            a.m("Too many retries.", new Object[0]);
            acqxVar.e();
            acvu.b(string, eqnp.FAILURE_RECOVERY);
            b2.F(4, 4, z);
            return eqgc.i(2);
        }
        acqo acqoVar = new acqo(a2);
        auad auadVar2 = a;
        final sqr sqrVar = new sqr(acqoVar, new sqq(auadVar2), auadVar2);
        eqgo eqgoVar = b;
        final eqgl submit = eqgoVar.submit(new Callable() { // from class: acvo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                auad auadVar3 = SyncKeysChimeraService.a;
                return sqr.this.c(string);
            }
        });
        final eqgl g = eqdl.g(eqgoVar.submit(new Callable() { // from class: acvp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                auad auadVar3 = SyncKeysChimeraService.a;
                return ekvi.i(new acqr(a2).c(string));
            }
        }), new eqdv() { // from class: acvq
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                auad auadVar3 = SyncKeysChimeraService.a;
                return eqgc.i(acui.a(a2).a((List) ((ekvi) obj).f()).nD());
            }
        }, eqgoVar);
        final dhbt a3 = new dhbu(a2, 1, "CryptauthSync", null, "com.google.android.gms.auth.cryptauth.synckeys.SyncKeysChimeraService").a("Cryptauth Sync wakelock timed out", fnoz.a.lK().b());
        final boolean z2 = z;
        return eqcq.f(eqdl.f(eqgb.h(eqgc.b(submit, g).a(new Callable() { // from class: acvr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                auad auadVar3 = SyncKeysChimeraService.a;
                List list = (List) eqgc.r(eqgl.this);
                fgpr fgprVar = (fgpr) eqgc.r(g);
                eqnp b4 = eqnp.b(bundle.getInt("invocation_reason"));
                eqoc eqocVar = (eqoc) eqof.a.v();
                if (!eqocVar.b.L()) {
                    eqocVar.U();
                }
                ((eqof) eqocVar.b).c = "com.google.android.gms";
                if (!eqocVar.b.L()) {
                    eqocVar.U();
                }
                ((eqof) eqocVar.b).h = "1.0.0";
                fgrc v = eqnq.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                ((eqnq) v.b).b = b4.a();
                if (!eqocVar.b.L()) {
                    eqocVar.U();
                }
                eqof eqofVar = (eqof) eqocVar.b;
                eqnq eqnqVar = (eqnq) v.Q();
                eqnqVar.getClass();
                eqofVar.e = eqnqVar;
                eqofVar.b |= 2;
                if (!eqocVar.b.L()) {
                    eqocVar.U();
                }
                eqof eqofVar2 = (eqof) eqocVar.b;
                fgprVar.getClass();
                eqofVar2.f = fgprVar;
                Iterator it = list.iterator();
                while (true) {
                    Context context = a2;
                    if (!it.hasNext()) {
                        Account account3 = account2;
                        eqof eqofVar3 = (eqof) eqocVar.Q();
                        acud acudVar = new acud(context, account3, new actu(context, 0, 6));
                        try {
                            return acudVar.a(eqofVar3);
                        } finally {
                            acudVar.b();
                        }
                    }
                    sre sreVar = (sre) it.next();
                    String str = sreVar.a;
                    List list2 = sreVar.d;
                    eqod eqodVar = (eqod) eqoe.a.v();
                    if (!eqodVar.b.L()) {
                        eqodVar.U();
                    }
                    eqoe eqoeVar = (eqoe) eqodVar.b;
                    str.getClass();
                    eqoeVar.b = str;
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        eqodVar.a(fgpr.w(((srd) it2.next()).a));
                    }
                    byte[] a4 = new acqr(context).a(string, str);
                    if (a4 != null) {
                        fgpr w = fgpr.w(a4);
                        if (!eqodVar.b.L()) {
                            eqodVar.U();
                        }
                        ((eqoe) eqodVar.b).d = w;
                    }
                    eqocVar.a((eqoe) eqodVar.Q());
                }
            }
        }, eqgoVar)), new ekut() { // from class: acvs
            /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
            
                if (r7 != 3) goto L17;
             */
            @Override // defpackage.ekut
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 274
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.acvs.apply(java.lang.Object):java.lang.Object");
            }
        }, eqgoVar), Exception.class, new ekut() { // from class: acvt
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                SyncKeysChimeraService.a.g("Error while syncing.", (Exception) obj, new Object[0]);
                acqx.this.f();
                a3.a();
                b2.F(5, 5, z2);
                return 1;
            }
        }, eqgoVar);
    }
}
