package com.google.android.gms.accountsettings.service;

import android.content.Context;
import com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.auad;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.catp;
import defpackage.caud;
import defpackage.cauf;
import defpackage.cvjk;
import defpackage.dpvs;
import defpackage.euwz;
import defpackage.fmkf;
import defpackage.fpuj;
import defpackage.fxwo;
import defpackage.mkv;
import defpackage.tqq;
import defpackage.uto;
import defpackage.utr;
import defpackage.utt;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PurgeScreenDataChimeraService extends GmsTaskChimeraService {
    private static final auad a = new auad("AccountSettings", "PurgeScreenDataSvc");
    private RepositoryDatabase b;
    private cvjk c;
    private utt d;

    public static caud b() {
        if (fpuj.a.lK().l()) {
            catg catgVar = new catg();
            catgVar.j = "com.google.android.gms.accountsettings.service.PurgeScreenDataService";
            catgVar.t("PurgeScreenData");
            catgVar.v(2);
            catgVar.l(false);
            catgVar.a = catn.l;
            return catgVar.b();
        }
        cate cateVar = new cate();
        cateVar.j = "com.google.android.gms.accountsettings.service.PurgeScreenDataService";
        cateVar.t("PurgeScreenData");
        cateVar.v(1);
        fmkf fmkfVar = fmkf.a;
        cateVar.a = fmkfVar.lK().h();
        cateVar.b = fmkfVar.lK().g();
        cateVar.x(0, 1);
        cateVar.y(2, 2);
        cateVar.t = catp.a(0, (int) TimeUnit.HOURS.toSeconds(4L), (int) TimeUnit.DAYS.toSeconds(3L));
        cateVar.p = true;
        return cateVar.b();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        boolean z;
        char c;
        String str = caufVar.a;
        auad auadVar = a;
        auadVar.j("Running gcm task %s", str);
        if (!"PurgeScreenData".equals(str)) {
            return 0;
        }
        fmkf fmkfVar = fmkf.a;
        if (fmkfVar.lK().E()) {
            RepositoryDatabase repositoryDatabase = this.b;
            final long currentTimeMillis = System.currentTimeMillis() - fmkfVar.lK().f();
            mkv.a(((tqq) repositoryDatabase.x()).a, false, true, new fxwo() { // from class: tqo
                @Override // defpackage.fxwo
                public final Object a(Object obj) {
                    mjx a2 = ((mjo) obj).a("DELETE FROM resource_info WHERE lastUpdatedMs < ?");
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
        auadVar.j("Purging deprecated account database", new Object[0]);
        Context baseContext = getBaseContext();
        boolean z2 = z && (!new HashSet(Arrays.asList(baseContext.databaseList())).contains("id_as_screens.db") ? true : baseContext.deleteDatabase("id_as_screens.db"));
        try {
            c = this.c.b.a().a > 0 ? (char) 3 : (char) 2;
        } catch (IOException e) {
            cvjk.a.g("Exception while garbage collecting tempfiles.", e, new Object[0]);
            c = 1;
        }
        if (c == 3) {
            this.d.i(euwz.OCTARINE_TEMPFILE_GC_SUCCESS);
        } else if (c == 1) {
            this.d.i(euwz.OCTARINE_TEMPFILE_GC_FAILED);
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
            this.c = new cvjk(getBaseContext(), new dpvs());
        }
        if (this.d == null) {
            this.d = utr.a(getBaseContext(), uto.a);
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
