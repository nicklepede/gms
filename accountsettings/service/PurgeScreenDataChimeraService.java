package com.google.android.gms.accountsettings.service;

import android.content.Context;
import com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.arxo;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.bykx;
import defpackage.byll;
import defpackage.byln;
import defpackage.ctag;
import defpackage.dnlj;
import defpackage.eshk;
import defpackage.fjue;
import defpackage.fnck;
import defpackage.fvaq;
import defpackage.ksa;
import defpackage.rxg;
import defpackage.sxq;
import defpackage.sxt;
import defpackage.sxv;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PurgeScreenDataChimeraService extends GmsTaskChimeraService {
    private static final arxo a = new arxo("AccountSettings", "PurgeScreenDataSvc");
    private RepositoryDatabase b;
    private ctag c;
    private sxv d;

    public static byll b() {
        if (fnck.a.a().l()) {
            byko bykoVar = new byko();
            bykoVar.j = "com.google.android.gms.accountsettings.service.PurgeScreenDataService";
            bykoVar.t("PurgeScreenData");
            bykoVar.v(2);
            bykoVar.l(false);
            bykoVar.a = bykv.l;
            return bykoVar.b();
        }
        bykm bykmVar = new bykm();
        bykmVar.j = "com.google.android.gms.accountsettings.service.PurgeScreenDataService";
        bykmVar.t("PurgeScreenData");
        bykmVar.v(1);
        bykmVar.a = fjue.a.a().h();
        bykmVar.b = fjue.a.a().g();
        bykmVar.x(0, 1);
        bykmVar.y(2, 2);
        bykmVar.t = bykx.a(0, (int) TimeUnit.HOURS.toSeconds(4L), (int) TimeUnit.DAYS.toSeconds(3L));
        bykmVar.p = true;
        return bykmVar.b();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        boolean z;
        char c;
        String str = bylnVar.a;
        arxo arxoVar = a;
        arxoVar.j("Running gcm task %s", str);
        if (!"PurgeScreenData".equals(str)) {
            return 0;
        }
        fjue fjueVar = fjue.a;
        if (fjueVar.a().E()) {
            RepositoryDatabase repositoryDatabase = this.b;
            final long currentTimeMillis = System.currentTimeMillis() - fjueVar.a().f();
            ksa.a(((rxg) repositoryDatabase.x()).a, false, true, new fvaq() { // from class: rxe
                @Override // defpackage.fvaq
                public final Object a(Object obj) {
                    kri a2 = ((kqz) obj).a("DELETE FROM resource_info WHERE lastUpdatedMs < ?");
                    try {
                        a2.f(1, currentTimeMillis);
                        a2.k();
                        a2.close();
                        return null;
                    } catch (Throwable th) {
                        a2.close();
                        throw th;
                    }
                }
            });
            z = true;
        } else {
            z = false;
        }
        arxoVar.j("Purging deprecated account database", new Object[0]);
        Context baseContext = getBaseContext();
        boolean z2 = z && (!new HashSet(Arrays.asList(baseContext.databaseList())).contains("id_as_screens.db") ? true : baseContext.deleteDatabase("id_as_screens.db"));
        try {
            c = this.c.b.a().a > 0 ? (char) 3 : (char) 2;
        } catch (IOException e) {
            ctag.a.g("Exception while garbage collecting tempfiles.", e, new Object[0]);
            c = 1;
        }
        if (c == 3) {
            this.d.i(eshk.OCTARINE_TEMPFILE_GC_SUCCESS);
        } else if (c == 1) {
            this.d.i(eshk.OCTARINE_TEMPFILE_GC_FAILED);
        }
        return z2 ? 0 : 1;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        if (this.b == null) {
            this.b = RepositoryDatabase.w(getBaseContext());
        }
        if (this.c == null) {
            this.c = new ctag(getBaseContext(), new dnlj());
        }
        if (this.d == null) {
            this.d = sxt.a(getBaseContext(), sxq.a);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        RepositoryDatabase repositoryDatabase = this.b;
        if (repositoryDatabase != null) {
            repositoryDatabase.G();
        }
    }
}
