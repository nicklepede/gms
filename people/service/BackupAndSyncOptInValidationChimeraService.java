package com.google.android.gms.people.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.cauf;
import defpackage.cvyt;
import defpackage.cwof;
import defpackage.cwus;
import defpackage.cwwi;
import defpackage.cxdp;
import defpackage.cxdv;
import defpackage.cxdw;
import defpackage.cxea;
import defpackage.cxeb;
import defpackage.cxed;
import defpackage.cxhr;
import defpackage.ekut;
import defpackage.elgx;
import defpackage.enjx;
import defpackage.eqcy;
import defpackage.eqex;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fpuj;
import defpackage.fpvd;
import defpackage.ftsq;
import defpackage.ftue;
import defpackage.ftuh;
import defpackage.ftwx;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class BackupAndSyncOptInValidationChimeraService extends GmsTaskChimeraService {
    private cxdp a;
    private cxdv b;
    private cxea c;

    public static void d(Context context) {
        cwof.f("BackupAndSyncValidation", "Canceling the service.");
        cvyt.i(context).r(ftuh.e(), ftuh.b(), ftuh.g(), ftuh.h(), ftuh.f(), ftuh.i(), ftuh.c());
        try {
            casd.a(context).c("com.google.android.gms.people.service.BackupAndSyncOptInValidationService");
        } catch (IllegalArgumentException e) {
            cwof.d("BackupAndSyncValidation", "Error when canceling the service.", e);
        }
    }

    public static void e(Context context) {
        if (!ftuh.e()) {
            d(context);
            return;
        }
        if (fpuj.k()) {
            g(context);
            return;
        }
        SharedPreferences sharedPreferences = cvyt.i(context).a;
        long b = ftuh.b();
        boolean g = ftuh.g();
        boolean h = ftuh.h();
        boolean f = ftuh.f();
        boolean i = ftuh.i();
        long c = ftuh.c();
        if (sharedPreferences.getBoolean("backup_and_sync_opt_in_validator_enabled", false) && sharedPreferences.getLong("backup_and_sync_opt_in_validator_periodic_interval_seconds", 0L) == b && sharedPreferences.getBoolean("backup_and_sync_opt_in_validator_requires_charging", false) == g && sharedPreferences.getBoolean("backup_and_sync_opt_in_validator_requires_device_idle", false) == h && sharedPreferences.getBoolean("backup_and_sync_opt_in_validator_persisted", false) == f && sharedPreferences.getBoolean("backup_and_sync_opt_in_validator_use_flex", false) == i && (!i || sharedPreferences.getLong("backup_and_sync_opt_in_validator_flex_seconds", 0L) == c)) {
            return;
        }
        cwof.f("BackupAndSyncValidation", "Flags changed. Will re-scheduling the service.");
        f(context);
    }

    public static void f(Context context) {
        cwof.f("BackupAndSyncValidation", "Scheduling the service.");
        if (fpuj.k()) {
            g(context);
            return;
        }
        cate cateVar = new cate();
        cateVar.j = "com.google.android.gms.people.service.BackupAndSyncOptInValidationService";
        cateVar.t("BackupAndSyncOptInValidationPeriodicTask");
        cateVar.y(2, 2);
        cateVar.x(ftuh.g() ? 1 : 0, 1);
        cateVar.i(ftuh.h());
        cateVar.v(1);
        cateVar.p = ftuh.f();
        long b = ftuh.b();
        if (fpvd.h()) {
            cateVar.j(cata.a(b));
        } else {
            cateVar.a = b;
            if (ftuh.i()) {
                cateVar.b = ftuh.c();
            }
        }
        cvyt.i(context).r(ftuh.e(), ftuh.b(), ftuh.g(), ftuh.h(), ftuh.f(), ftuh.i(), ftuh.c());
        try {
            casd.a(context).f(cateVar.b());
        } catch (IllegalArgumentException e) {
            cwof.d("BackupAndSyncValidation", "Error when scheduling the service.", e);
        }
    }

    private static void g(Context context) {
        cwof.f("BackupAndSyncValidation", "Scheduling the service.");
        catg catgVar = new catg();
        catgVar.j = "com.google.android.gms.people.service.BackupAndSyncOptInValidationService";
        catgVar.t("BackupAndSyncOptInValidationPeriodicTask");
        catgVar.l(false);
        catgVar.m((int) ftuh.a.lK().c());
        catgVar.v(2);
        if (ftuh.g()) {
            catgVar.e();
        }
        if (ftuh.h()) {
            catgVar.j();
        }
        try {
            casd.a(context).f(catgVar.b());
        } catch (IllegalArgumentException e) {
            cwof.d("BackupAndSyncValidation", "Error when scheduling the service.", e);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        cxdw cxdwVar;
        int i = 2;
        if (ftuh.e() || ftsq.e()) {
            if ("BackupAndSyncOptInValidationPeriodicTask".equals(caufVar.a)) {
                if (ftuh.e()) {
                    this.a.j();
                }
                if (ftsq.e() && this.b != null) {
                    if (ftsq.d()) {
                        try {
                            cxdv cxdvVar = this.b;
                            long currentTimeMillis = System.currentTimeMillis();
                            int i2 = 0;
                            for (Map.Entry entry : ((cxeb) cxdvVar).a().entrySet()) {
                                if (ftsq.a.lK().a() < TimeUnit.MILLISECONDS.toDays(currentTimeMillis - ((cwus) entry.getValue()).e)) {
                                    synchronized (cxdvVar) {
                                        cxdwVar = new cxdw(((cxeb) cxdvVar).c);
                                        try {
                                            cxdwVar.a.delete(cxeb.f((String) entry.getKey()));
                                            cxdwVar.close();
                                        } finally {
                                        }
                                    }
                                    i2++;
                                }
                            }
                            if (ftsq.f()) {
                                fgrc v = enjx.a.v();
                                if (!v.b.L()) {
                                    v.U();
                                }
                                fgri fgriVar = v.b;
                                enjx enjxVar = (enjx) fgriVar;
                                enjxVar.c = 6;
                                enjxVar.b |= 1;
                                if (!fgriVar.L()) {
                                    v.U();
                                }
                                fgri fgriVar2 = v.b;
                                enjx enjxVar2 = (enjx) fgriVar2;
                                enjxVar2.b |= 16;
                                enjxVar2.g = i2;
                                if (!fgriVar2.L()) {
                                    v.U();
                                }
                                enjx enjxVar3 = (enjx) v.b;
                                enjxVar3.d = 1;
                                enjxVar3.b |= 2;
                                cxeb.g(v);
                            }
                        } catch (LevelDbException | fgsd | UnsupportedEncodingException e) {
                            cwof.e("BackupAndSyncValidation", "Unable to perform BackupSyncUserActionStorage cleanup service.", e);
                            return 2;
                        }
                    }
                    if (ftsq.c()) {
                        try {
                            cxdv cxdvVar2 = this.b;
                            int i3 = 0;
                            for (Map.Entry entry2 : ((cxeb) cxdvVar2).a().entrySet()) {
                                int a = cxed.a((String) entry2.getKey());
                                elgx elgxVar = cxeb.a;
                                Integer valueOf = Integer.valueOf(a);
                                String str = (String) elgxVar.get(valueOf);
                                if (ftsq.a.lK().c().b.contains(valueOf) && str != null) {
                                    try {
                                        ((cxeb) cxdvVar2).b.getPackageInfo(str, 0);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        synchronized (cxdvVar2) {
                                            cxdwVar = new cxdw(((cxeb) cxdvVar2).c);
                                            try {
                                                cxdwVar.a.delete(cxeb.f((String) entry2.getKey()));
                                                cxdwVar.close();
                                                i3++;
                                            } finally {
                                                try {
                                                    cxdwVar.close();
                                                } catch (Throwable th) {
                                                    th.addSuppressed(th);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (ftsq.f() && i3 > 0) {
                                fgrc v2 = enjx.a.v();
                                if (!v2.b.L()) {
                                    v2.U();
                                }
                                fgri fgriVar3 = v2.b;
                                enjx enjxVar4 = (enjx) fgriVar3;
                                enjxVar4.c = 7;
                                enjxVar4.b |= 1;
                                if (!fgriVar3.L()) {
                                    v2.U();
                                }
                                fgri fgriVar4 = v2.b;
                                enjx enjxVar5 = (enjx) fgriVar4;
                                enjxVar5.b |= 16;
                                enjxVar5.g = i3;
                                if (!fgriVar4.L()) {
                                    v2.U();
                                }
                                enjx enjxVar6 = (enjx) v2.b;
                                enjxVar6.d = 1;
                                enjxVar6.b |= 2;
                                cxeb.g(v2);
                            }
                        } catch (LevelDbException | fgsd | UnsupportedEncodingException unused2) {
                            return 2;
                        }
                    }
                }
                ftwx ftwxVar = ftwx.a;
                if (ftwxVar.lK().j()) {
                    try {
                        cxhr a2 = cxhr.a(getApplicationContext());
                        long c = a2.c();
                        if (c != 0) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            if (currentTimeMillis2 < c || currentTimeMillis2 > c + ftwxVar.lK().b()) {
                                ((eqcy) a2.b(0L)).u();
                            }
                        }
                    } catch (InterruptedException | ExecutionException e2) {
                        cwof.e("BackupAndSyncValidation", "Unable to perform DeviceProvisionedStore cleanup service.", e2);
                        return 2;
                    }
                }
                if (ftue.d()) {
                    try {
                        cxea cxeaVar = this.c;
                        final HashMap hashMap = new HashMap(cxeaVar.b());
                        Iterator it = hashMap.entrySet().iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            if (System.currentTimeMillis() - ((cwwi) ((Map.Entry) it.next()).getValue()).c >= 2592000000L) {
                                it.remove();
                                z = true;
                            }
                        }
                        if (z) {
                            ((eqcy) cxeaVar.a.b(new ekut() { // from class: cxdz
                                @Override // defpackage.ekut
                                public final Object apply(Object obj) {
                                    cwwl cwwlVar = (cwwl) obj;
                                    int i4 = cxea.b;
                                    fgrc fgrcVar = (fgrc) cwwlVar.iQ(5, null);
                                    fgrcVar.X(cwwlVar);
                                    cwwj cwwjVar = (cwwj) fgrcVar;
                                    if (!cwwjVar.b.L()) {
                                        cwwjVar.U();
                                    }
                                    Map map = hashMap;
                                    cwwl cwwlVar2 = (cwwl) cwwjVar.b;
                                    cwwl cwwlVar3 = cwwl.a;
                                    cwwlVar2.b().clear();
                                    cwwjVar.a(map);
                                    return (cwwl) cwwjVar.Q();
                                }
                            }, eqex.a)).u();
                        }
                    } catch (InterruptedException | ExecutionException e3) {
                        cwof.e("BackupAndSyncValidation", "Unable to perform SimContactsSyncStorage cleanup service.", e3);
                        return 2;
                    }
                }
                i = 0;
            } else {
                cwof.c("BackupAndSyncValidation", "Unknown tag received. Will not run");
            }
        }
        e(this);
        return i;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        cxdp d = cxdp.d(this);
        if (this.a == null) {
            this.a = d;
        }
        if (ftsq.e() && (ftsq.c() || ftsq.d())) {
            try {
                cxeb c = cxeb.c(this);
                if (this.b == null) {
                    this.b = c;
                }
            } catch (LevelDbException e) {
                cwof.e("BackupAndSyncValidation", "Unable to create BackupSyncUserActionStorage instance.", e);
            }
        }
        if (ftue.d()) {
            cxea a = cxea.a(this);
            if (this.c == null) {
                this.c = a;
            }
        }
    }
}
