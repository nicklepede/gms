package com.google.android.gms.locationsharingreporter.service.reporting.periodic;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cdec;
import defpackage.cdhg;
import defpackage.cdhh;
import defpackage.cdkc;
import defpackage.cdkf;
import defpackage.ektg;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.fsqm;
import defpackage.fsrb;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class PersistentDispatchingIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("LSR", auid.LOCATION_SHARING_REPORTER);

    private static void a(int i) {
        if (c()) {
            if (!fsrb.J()) {
                cdkf.a(null, i);
                return;
            }
            try {
                Iterator it = ((Set) ((eqcy) cdec.c().b()).v(fsqm.i(), TimeUnit.MILLISECONDS)).iterator();
                while (it.hasNext()) {
                    cdkf.a((String) it.next(), i);
                }
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
                ((eluo) ((eluo) ((eluo) b.j()).s(e)).ai((char) 5925)).x("Failed to fetch active accounts");
                cdkf.a(null, i);
            }
        }
    }

    private static void b() {
        if (c()) {
            if (!fsrb.J()) {
                cdkf.b(null);
                return;
            }
            try {
                Iterator it = ((Set) ((eqcy) cdec.c().b()).v(fsqm.i(), TimeUnit.MILLISECONDS)).iterator();
                while (it.hasNext()) {
                    cdkf.b((String) it.next());
                }
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
                ((eluo) ((eluo) ((eluo) b.j()).s(e)).ai((char) 5926)).x("Failed to fetch active accounts");
                cdkf.b(null);
            }
        }
    }

    private static boolean c() {
        try {
            cdhh a2 = cdhh.a();
            return ((Boolean) ((eqcy) a2.g(a2.e.a(), a2.f.b())).v(fsrb.m(), TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ((eluo) b.j()).s(e)).ai((char) 5932)).x("Failed to determine whether reporting should be enabled");
            return false;
        }
    }

    private static final void d(cdhg cdhgVar) {
        try {
            ((eqcy) cdhh.a().d(cdhgVar)).v(fsrb.m(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ((eluo) b.j()).s(e)).ai((char) 5930)).x("Failed to refresh periodic location reporting state");
        }
    }

    private static final void e(List list) {
        cdkc c = cdec.c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final Account account = (Account) it.next();
            try {
                ((eqcy) c.i(account, 5)).v(fsqm.i(), TimeUnit.MILLISECONDS);
                if (fsrb.w()) {
                    ((eqcy) c.h(account)).v(fsqm.i(), TimeUnit.MILLISECONDS);
                    ((eqcy) c.p(new ekut() { // from class: cdjw
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            cddp cddpVar = (cddp) obj;
                            ausn ausnVar = cdkc.a;
                            fgrc fgrcVar = (fgrc) cddpVar.iQ(5, null);
                            fgrcVar.X(cddpVar);
                            cddk cddkVar = (cddk) fgrcVar;
                            String str = account.name;
                            str.getClass();
                            if (!cddkVar.b.L()) {
                                cddkVar.U();
                            }
                            cddp cddpVar2 = (cddp) cddkVar.b;
                            cddp cddpVar3 = cddp.a;
                            cddpVar2.b().remove(str);
                            return (cddp) cddkVar.Q();
                        }
                    }, ektg.a)).v(fsqm.i(), TimeUnit.MILLISECONDS);
                }
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
                ((eluo) ((eluo) ((eluo) b.j()).s(e)).ai((char) 5931)).x("Failed to remove periodic requests and reporting state for account");
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        if (fsrb.D()) {
            if (intent == null) {
                ((eluo) ((eluo) b.j()).ai((char) 5929)).x("Received null intent, ignoring it");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                ((eluo) ((eluo) b.j()).ai((char) 5928)).x("Received intent with null action");
                return;
            }
            int hashCode = action.hashCode();
            if (hashCode != -1222518766) {
                if (hashCode == -1209546332 && action.equals("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_ACCOUNTS_REMOVED")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (action.equals("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_LSR_MODULE_INIT")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                ausn ausnVar = b;
                ((eluo) ((eluo) ausnVar.h()).ai((char) 5923)).x("Handling LSR module init in persistent process");
                if (!intent.hasExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.EXTRA_MODULE_INIT_FLAGS")) {
                    ((eluo) ((eluo) ausnVar.j()).ai((char) 5924)).x("Missing flags in init intent");
                    return;
                }
                if ((intent.getIntExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.EXTRA_MODULE_INIT_FLAGS", JGCastService.FLAG_USE_TDLS) & 2) != 0) {
                    b();
                }
                d(cdhg.FORCE);
                return;
            }
            if (c != 1) {
                ((eluo) ((eluo) b.j()).ai((char) 5927)).B("Received intent with unknown action: %s", action);
                return;
            }
            ausn ausnVar2 = b;
            ((eluo) ((eluo) ausnVar2.h()).ai((char) 5921)).x("Handling account change");
            if (!intent.hasExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.EXTRA_REMOVED_ACCOUNT_LIST")) {
                ((eluo) ((eluo) ausnVar2.j()).ai((char) 5922)).x("No accounts in change intent");
                return;
            }
            ekvi i = ekvi.i(intent.getParcelableArrayListExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.EXTRA_REMOVED_ACCOUNT_LIST"));
            if (i.h()) {
                a(((List) i.c()).size());
                e((List) i.c());
                d(cdhg.FORCE);
            }
        }
    }
}
