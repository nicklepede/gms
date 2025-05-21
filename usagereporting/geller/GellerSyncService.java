package com.google.android.gms.usagereporting.geller;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.westworld.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.apud;
import defpackage.asej;
import defpackage.asnd;
import defpackage.asot;
import defpackage.byln;
import defpackage.dhpc;
import defpackage.dhqp;
import defpackage.dnss;
import defpackage.dvni;
import defpackage.eijy;
import defpackage.eiuu;
import defpackage.ejhf;
import defpackage.ents;
import defpackage.feof;
import defpackage.fepe;
import defpackage.unx;
import defpackage.vay;
import defpackage.vbf;
import defpackage.vbh;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GellerSyncService extends GmsTaskBoundService {
    public static final asot a = asot.b("GellerSync", asej.WESTWORLD);
    public final Context b;
    private final dnss c;
    private final feof d;

    public GellerSyncService() {
        new AtomicBoolean(false);
        Context a2 = AppContextProvider.a();
        this.b = a2;
        this.c = dhqp.a(a2).b;
        this.d = feof.PRIVACY_SETTINGS;
    }

    public static final void e(Context context) {
        dhpc.a(context).h();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        int i;
        try {
            Context context = this.b;
            Iterator it = asnd.h(context, context.getPackageName()).iterator();
            while (it.hasNext()) {
                d((Account) it.next());
                dhpc.a(context).d("GellerBackgroundSyncTaskSucceeded").a(0L, 1L, apud.b);
                ((ejhf) a.h()).x("Geller Sync succeeded.");
            }
            i = 0;
        } catch (IOException | InterruptedException | RuntimeException | ExecutionException | TimeoutException | unx unused) {
            i = 1;
        } catch (Throwable th) {
            e(this.b);
            throw th;
        }
        e(this.b);
        return i;
    }

    protected final void d(Account account) {
        try {
            try {
                try {
                    try {
                        Context context = this.b;
                        eijy.a(new vbf());
                        dvni.f(context);
                        this.c.c(account, vbh.e(context, account, "oauth2:https://www.googleapis.com/auth/webhistory", new vay(context)), eiuu.K(this.d, feof.GELLER_CONFIG), fepe.ON_DEMAND).get(60L, TimeUnit.SECONDS);
                        e(this.b);
                    } catch (ents e) {
                        e = e;
                        Throwable th = e;
                        ((ejhf) ((ejhf) a.i()).s(th)).x("Geller SyncFromServer failed.");
                        dhpc.a(this.b).d("GellerSyncTaskFailedExecutionException").a(0L, 1L, apud.b);
                        throw th;
                    } catch (InterruptedException e2) {
                        e = e2;
                        Throwable th2 = e;
                        ((ejhf) ((ejhf) a.i()).s(th2)).x("Geller SyncFromServer failed.");
                        dhpc.a(this.b).d("GellerSyncTaskFailedExecutionException").a(0L, 1L, apud.b);
                        throw th2;
                    } catch (ExecutionException e3) {
                        e = e3;
                        Throwable th22 = e;
                        ((ejhf) ((ejhf) a.i()).s(th22)).x("Geller SyncFromServer failed.");
                        dhpc.a(this.b).d("GellerSyncTaskFailedExecutionException").a(0L, 1L, apud.b);
                        throw th22;
                    } catch (TimeoutException e4) {
                        dhpc.a(this.b).d("GellerSyncTaskFailedRequestTimeout").a(0L, 1L, apud.b);
                        ((ejhf) ((ejhf) a.j()).s(e4)).x("Geller SyncFromServer failed due to Timeout exception.");
                        throw e4;
                    }
                } catch (IOException | unx e5) {
                    throw e5;
                }
            } catch (Throwable th3) {
                e(this.b);
                throw th3;
            }
        } catch (IOException e6) {
            e = e6;
        } catch (unx e7) {
            dhpc.a(this.b).d("GellerSyncTaskFailedAuthException").a(0L, 1L, apud.b);
            ((ejhf) ((ejhf) a.i()).s(e7)).x("Geller Auth for sync failed.");
            throw e7;
        }
    }

    public GellerSyncService(Context context, dnss dnssVar) {
        new AtomicBoolean(false);
        this.b = context;
        this.c = dnssVar;
        this.d = feof.PRIVACY_SETTINGS;
    }
}
