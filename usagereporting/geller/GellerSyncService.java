package com.google.android.gms.usagereporting.geller;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.westworld.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.arwu;
import defpackage.auid;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.dkai;
import defpackage.dkbv;
import defpackage.dqdb;
import defpackage.dxyi;
import defpackage.ekxd;
import defpackage.elhz;
import defpackage.eluo;
import defpackage.eqhl;
import defpackage.fhcy;
import defpackage.fhdx;
import defpackage.wjw;
import defpackage.wwy;
import defpackage.wxf;
import defpackage.wxh;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GellerSyncService extends GmsTaskBoundService {
    public static final ausn a = ausn.b("GellerSync", auid.WESTWORLD);
    public final Context b;
    private final dqdb c;
    private final fhcy d;

    public GellerSyncService() {
        new AtomicBoolean(false);
        Context a2 = AppContextProvider.a();
        this.b = a2;
        this.c = dkbv.a(a2).b;
        this.d = fhcy.PRIVACY_SETTINGS;
    }

    public static final void e(Context context) {
        dkai.a(context).h();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        int i;
        try {
            Context context = this.b;
            Iterator it = auqx.h(context, context.getPackageName()).iterator();
            while (it.hasNext()) {
                d((Account) it.next());
                dkai.a(context).d("GellerBackgroundSyncTaskSucceeded").a(0L, 1L, arwu.b);
                ((eluo) a.h()).x("Geller Sync succeeded.");
            }
            i = 0;
        } catch (IOException | InterruptedException | RuntimeException | ExecutionException | TimeoutException | wjw unused) {
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
                        ekxd.a(new wxf());
                        dxyi.f(context);
                        this.c.c(account, wxh.e(context, account, "oauth2:https://www.googleapis.com/auth/webhistory", new wwy(context)), elhz.K(this.d, fhcy.GELLER_CONFIG), fhdx.ON_DEMAND).get(60L, TimeUnit.SECONDS);
                        e(this.b);
                    } catch (eqhl e) {
                        e = e;
                        Throwable th = e;
                        ((eluo) ((eluo) a.i()).s(th)).x("Geller SyncFromServer failed.");
                        dkai.a(this.b).d("GellerSyncTaskFailedExecutionException").a(0L, 1L, arwu.b);
                        throw th;
                    } catch (InterruptedException e2) {
                        e = e2;
                        Throwable th2 = e;
                        ((eluo) ((eluo) a.i()).s(th2)).x("Geller SyncFromServer failed.");
                        dkai.a(this.b).d("GellerSyncTaskFailedExecutionException").a(0L, 1L, arwu.b);
                        throw th2;
                    } catch (ExecutionException e3) {
                        e = e3;
                        Throwable th22 = e;
                        ((eluo) ((eluo) a.i()).s(th22)).x("Geller SyncFromServer failed.");
                        dkai.a(this.b).d("GellerSyncTaskFailedExecutionException").a(0L, 1L, arwu.b);
                        throw th22;
                    } catch (TimeoutException e4) {
                        dkai.a(this.b).d("GellerSyncTaskFailedRequestTimeout").a(0L, 1L, arwu.b);
                        ((eluo) ((eluo) a.j()).s(e4)).x("Geller SyncFromServer failed due to Timeout exception.");
                        throw e4;
                    }
                } catch (IOException | wjw e5) {
                    throw e5;
                }
            } catch (Throwable th3) {
                e(this.b);
                throw th3;
            }
        } catch (IOException e6) {
            e = e6;
        } catch (wjw e7) {
            dkai.a(this.b).d("GellerSyncTaskFailedAuthException").a(0L, 1L, arwu.b);
            ((eluo) ((eluo) a.i()).s(e7)).x("Geller Auth for sync failed.");
            throw e7;
        }
    }

    public GellerSyncService(Context context, dqdb dqdbVar) {
        new AtomicBoolean(false);
        this.b = context;
        this.c = dqdbVar;
        this.d = fhcy.PRIVACY_SETTINGS;
    }
}
