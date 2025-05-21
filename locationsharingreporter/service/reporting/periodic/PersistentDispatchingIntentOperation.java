package com.google.android.gms.locationsharingreporter.service.reporting.periodic;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.cavm;
import defpackage.cayl;
import defpackage.caym;
import defpackage.cbbk;
import defpackage.cbbn;
import defpackage.eigb;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.fpws;
import defpackage.fpxh;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class PersistentDispatchingIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("LSR", asej.LOCATION_SHARING_REPORTER);

    private static void a(int i) {
        if (c()) {
            if (!fpxh.L()) {
                cbbn.a(null, i);
                return;
            }
            try {
                Iterator it = ((Set) ((enpf) cavm.c().b()).v(fpws.i(), TimeUnit.MILLISECONDS)).iterator();
                while (it.hasNext()) {
                    cbbn.a((String) it.next(), i);
                }
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
                ((ejhf) ((ejhf) ((ejhf) b.j()).s(e)).ah((char) 5906)).x("Failed to fetch active accounts");
                cbbn.a(null, i);
            }
        }
    }

    private static void b() {
        if (c()) {
            if (!fpxh.L()) {
                cbbn.b(null);
                return;
            }
            try {
                Iterator it = ((Set) ((enpf) cavm.c().b()).v(fpws.i(), TimeUnit.MILLISECONDS)).iterator();
                while (it.hasNext()) {
                    cbbn.b((String) it.next());
                }
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
                ((ejhf) ((ejhf) ((ejhf) b.j()).s(e)).ah((char) 5907)).x("Failed to fetch active accounts");
                cbbn.b(null);
            }
        }
    }

    private static boolean c() {
        try {
            caym a2 = caym.a();
            return ((Boolean) ((enpf) a2.g(a2.e.a(), a2.f.b())).v(fpxh.l(), TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) b.j()).s(e)).ah((char) 5913)).x("Failed to determine whether reporting should be enabled");
            return false;
        }
    }

    private static final void d(cayl caylVar) {
        try {
            ((enpf) caym.a().d(caylVar)).v(fpxh.l(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) b.j()).s(e)).ah((char) 5911)).x("Failed to refresh periodic location reporting state");
        }
    }

    private static final void e(List list) {
        cbbk c = cavm.c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final Account account = (Account) it.next();
            try {
                ((enpf) c.i(account, 5)).v(fpws.i(), TimeUnit.MILLISECONDS);
                if (fpxh.w()) {
                    ((enpf) c.h(account)).v(fpws.i(), TimeUnit.MILLISECONDS);
                    ((enpf) c.p(new eiho() { // from class: cbbe
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            cauz cauzVar = (cauz) obj;
                            asot asotVar = cbbk.a;
                            fecj fecjVar = (fecj) cauzVar.iB(5, null);
                            fecjVar.X(cauzVar);
                            cauu cauuVar = (cauu) fecjVar;
                            String str = account.name;
                            str.getClass();
                            if (!cauuVar.b.L()) {
                                cauuVar.U();
                            }
                            cauz cauzVar2 = (cauz) cauuVar.b;
                            cauz cauzVar3 = cauz.a;
                            cauzVar2.b().remove(str);
                            return (cauz) cauuVar.Q();
                        }
                    }, eigb.a)).v(fpws.i(), TimeUnit.MILLISECONDS);
                }
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
                ((ejhf) ((ejhf) ((ejhf) b.j()).s(e)).ah((char) 5912)).x("Failed to remove periodic requests and reporting state for account");
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        if (fpxh.E()) {
            if (intent == null) {
                ((ejhf) ((ejhf) b.j()).ah((char) 5910)).x("Received null intent, ignoring it");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                ((ejhf) ((ejhf) b.j()).ah((char) 5909)).x("Received intent with null action");
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
                asot asotVar = b;
                ((ejhf) ((ejhf) asotVar.h()).ah((char) 5904)).x("Handling LSR module init in persistent process");
                if (!intent.hasExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.EXTRA_MODULE_INIT_FLAGS")) {
                    ((ejhf) ((ejhf) asotVar.j()).ah((char) 5905)).x("Missing flags in init intent");
                    return;
                }
                if ((intent.getIntExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.EXTRA_MODULE_INIT_FLAGS", JGCastService.FLAG_USE_TDLS) & 2) != 0) {
                    b();
                }
                d(cayl.FORCE);
                return;
            }
            if (c != 1) {
                ((ejhf) ((ejhf) b.j()).ah((char) 5908)).B("Received intent with unknown action: %s", action);
                return;
            }
            asot asotVar2 = b;
            ((ejhf) ((ejhf) asotVar2.h()).ah((char) 5902)).x("Handling account change");
            if (!intent.hasExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.EXTRA_REMOVED_ACCOUNT_LIST")) {
                ((ejhf) ((ejhf) asotVar2.j()).ah((char) 5903)).x("No accounts in change intent");
                return;
            }
            eiid i = eiid.i(intent.getParcelableArrayListExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.EXTRA_REMOVED_ACCOUNT_LIST"));
            if (i.h()) {
                a(((List) i.c()).size());
                e((List) i.c());
                d(cayl.FORCE);
            }
        }
    }
}
