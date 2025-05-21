package com.google.android.gms.people.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.byln;
import defpackage.ctpn;
import defpackage.cuey;
import defpackage.cull;
import defpackage.cunb;
import defpackage.cuui;
import defpackage.cuun;
import defpackage.cuuo;
import defpackage.cuus;
import defpackage.cuut;
import defpackage.cuuv;
import defpackage.cuyj;
import defpackage.eiho;
import defpackage.eits;
import defpackage.ekwl;
import defpackage.enpf;
import defpackage.enre;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.fnck;
import defpackage.fnde;
import defpackage.fqyv;
import defpackage.fraj;
import defpackage.fram;
import defpackage.frdc;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class BackupAndSyncOptInValidationChimeraService extends GmsTaskChimeraService {
    private cuui a;
    private cuun b;
    private cuus c;

    public static void d(Context context) {
        cuey.f("BackupAndSyncValidation", "Canceling the service.");
        ctpn.i(context).r(fram.e(), fram.b(), fram.g(), fram.h(), fram.f(), fram.i(), fram.c());
        try {
            byjl.a(context).c("com.google.android.gms.people.service.BackupAndSyncOptInValidationService");
        } catch (IllegalArgumentException e) {
            cuey.d("BackupAndSyncValidation", "Error when canceling the service.", e);
        }
    }

    public static void e(Context context) {
        if (!fram.e()) {
            d(context);
            return;
        }
        if (fnck.k()) {
            g(context);
            return;
        }
        SharedPreferences sharedPreferences = ctpn.i(context).a;
        long b = fram.b();
        boolean g = fram.g();
        boolean h = fram.h();
        boolean f = fram.f();
        boolean i = fram.i();
        long c = fram.c();
        if (sharedPreferences.getBoolean("backup_and_sync_opt_in_validator_enabled", false) && sharedPreferences.getLong("backup_and_sync_opt_in_validator_periodic_interval_seconds", 0L) == b && sharedPreferences.getBoolean("backup_and_sync_opt_in_validator_requires_charging", false) == g && sharedPreferences.getBoolean("backup_and_sync_opt_in_validator_requires_device_idle", false) == h && sharedPreferences.getBoolean("backup_and_sync_opt_in_validator_persisted", false) == f && sharedPreferences.getBoolean("backup_and_sync_opt_in_validator_use_flex", false) == i && (!i || sharedPreferences.getLong("backup_and_sync_opt_in_validator_flex_seconds", 0L) == c)) {
            return;
        }
        cuey.f("BackupAndSyncValidation", "Flags changed. Will re-scheduling the service.");
        f(context);
    }

    public static void f(Context context) {
        cuey.f("BackupAndSyncValidation", "Scheduling the service.");
        if (fnck.k()) {
            g(context);
            return;
        }
        bykm bykmVar = new bykm();
        bykmVar.j = "com.google.android.gms.people.service.BackupAndSyncOptInValidationService";
        bykmVar.t("BackupAndSyncOptInValidationPeriodicTask");
        bykmVar.y(2, 2);
        bykmVar.x(fram.g() ? 1 : 0, 1);
        bykmVar.i(fram.h());
        bykmVar.v(1);
        bykmVar.p = fram.f();
        long b = fram.b();
        if (fnde.h()) {
            bykmVar.j(byki.a(b));
        } else {
            bykmVar.a = b;
            if (fram.i()) {
                bykmVar.b = fram.c();
            }
        }
        ctpn.i(context).r(fram.e(), fram.b(), fram.g(), fram.h(), fram.f(), fram.i(), fram.c());
        try {
            byjl.a(context).f(bykmVar.b());
        } catch (IllegalArgumentException e) {
            cuey.d("BackupAndSyncValidation", "Error when scheduling the service.", e);
        }
    }

    private static void g(Context context) {
        cuey.f("BackupAndSyncValidation", "Scheduling the service.");
        byko bykoVar = new byko();
        bykoVar.j = "com.google.android.gms.people.service.BackupAndSyncOptInValidationService";
        bykoVar.t("BackupAndSyncOptInValidationPeriodicTask");
        bykoVar.l(false);
        bykoVar.m((int) fram.a.a().c());
        bykoVar.v(2);
        if (fram.g()) {
            bykoVar.e();
        }
        if (fram.h()) {
            bykoVar.j();
        }
        try {
            byjl.a(context).f(bykoVar.b());
        } catch (IllegalArgumentException e) {
            cuey.d("BackupAndSyncValidation", "Error when scheduling the service.", e);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        int i = 2;
        if (fram.e() || fqyv.e()) {
            if ("BackupAndSyncOptInValidationPeriodicTask".equals(bylnVar.a)) {
                if (fram.e()) {
                    this.a.j();
                }
                if (fqyv.e() && this.b != null) {
                    if (fqyv.d()) {
                        try {
                            cuun cuunVar = this.b;
                            long currentTimeMillis = System.currentTimeMillis();
                            int i2 = 0;
                            for (Map.Entry entry : ((cuut) cuunVar).a().entrySet()) {
                                if (fqyv.a.a().a() < TimeUnit.MILLISECONDS.toDays(currentTimeMillis - ((cull) entry.getValue()).e)) {
                                    synchronized (cuunVar) {
                                        cuuo cuuoVar = new cuuo(((cuut) cuunVar).c);
                                        try {
                                            cuuoVar.a.delete(cuut.f((String) entry.getKey()));
                                            cuuoVar.close();
                                        } finally {
                                        }
                                    }
                                    i2++;
                                }
                            }
                            if (fqyv.f()) {
                                fecj v = ekwl.a.v();
                                if (!v.b.L()) {
                                    v.U();
                                }
                                fecp fecpVar = v.b;
                                ekwl ekwlVar = (ekwl) fecpVar;
                                ekwlVar.c = 6;
                                ekwlVar.b |= 1;
                                if (!fecpVar.L()) {
                                    v.U();
                                }
                                fecp fecpVar2 = v.b;
                                ekwl ekwlVar2 = (ekwl) fecpVar2;
                                ekwlVar2.b |= 16;
                                ekwlVar2.g = i2;
                                if (!fecpVar2.L()) {
                                    v.U();
                                }
                                ekwl ekwlVar3 = (ekwl) v.b;
                                ekwlVar3.d = 1;
                                ekwlVar3.b |= 2;
                                cuut.g(v);
                            }
                        } catch (LevelDbException | fedk | UnsupportedEncodingException e) {
                            cuey.e("BackupAndSyncValidation", "Unable to perform BackupSyncUserActionStorage cleanup service.", e);
                            return 2;
                        }
                    }
                    if (fqyv.c()) {
                        try {
                            cuun cuunVar2 = this.b;
                            int i3 = 0;
                            for (Map.Entry entry2 : ((cuut) cuunVar2).a().entrySet()) {
                                int a = cuuv.a((String) entry2.getKey());
                                eits eitsVar = cuut.a;
                                Integer valueOf = Integer.valueOf(a);
                                String str = (String) eitsVar.get(valueOf);
                                if (fqyv.a.a().c().b.contains(valueOf) && str != null) {
                                    try {
                                        ((cuut) cuunVar2).b.getPackageInfo(str, 0);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        synchronized (cuunVar2) {
                                            cuuo cuuoVar2 = new cuuo(((cuut) cuunVar2).c);
                                            try {
                                                cuuoVar2.a.delete(cuut.f((String) entry2.getKey()));
                                                cuuoVar2.close();
                                                i3++;
                                            } finally {
                                            }
                                        }
                                    }
                                }
                            }
                            if (fqyv.f() && i3 > 0) {
                                fecj v2 = ekwl.a.v();
                                if (!v2.b.L()) {
                                    v2.U();
                                }
                                fecp fecpVar3 = v2.b;
                                ekwl ekwlVar4 = (ekwl) fecpVar3;
                                ekwlVar4.c = 7;
                                ekwlVar4.b |= 1;
                                if (!fecpVar3.L()) {
                                    v2.U();
                                }
                                fecp fecpVar4 = v2.b;
                                ekwl ekwlVar5 = (ekwl) fecpVar4;
                                ekwlVar5.b |= 16;
                                ekwlVar5.g = i3;
                                if (!fecpVar4.L()) {
                                    v2.U();
                                }
                                ekwl ekwlVar6 = (ekwl) v2.b;
                                ekwlVar6.d = 1;
                                ekwlVar6.b |= 2;
                                cuut.g(v2);
                            }
                        } catch (LevelDbException | fedk | UnsupportedEncodingException unused2) {
                            return 2;
                        }
                    }
                }
                frdc frdcVar = frdc.a;
                if (frdcVar.a().j()) {
                    try {
                        cuyj a2 = cuyj.a(getApplicationContext());
                        long c = a2.c();
                        if (c != 0) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            if (currentTimeMillis2 < c || currentTimeMillis2 > c + frdcVar.a().b()) {
                                ((enpf) a2.b(0L)).u();
                            }
                        }
                    } catch (InterruptedException | ExecutionException e2) {
                        cuey.e("BackupAndSyncValidation", "Unable to perform DeviceProvisionedStore cleanup service.", e2);
                        return 2;
                    }
                }
                if (fraj.d()) {
                    try {
                        cuus cuusVar = this.c;
                        final HashMap hashMap = new HashMap(cuusVar.b());
                        Iterator it = hashMap.entrySet().iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            if (System.currentTimeMillis() - ((cunb) ((Map.Entry) it.next()).getValue()).c >= 2592000000L) {
                                it.remove();
                                z = true;
                            }
                        }
                        if (z) {
                            ((enpf) cuusVar.a.b(new eiho() { // from class: cuur
                                @Override // defpackage.eiho
                                public final Object apply(Object obj) {
                                    cune cuneVar = (cune) obj;
                                    int i4 = cuus.b;
                                    fecj fecjVar = (fecj) cuneVar.iB(5, null);
                                    fecjVar.X(cuneVar);
                                    cunc cuncVar = (cunc) fecjVar;
                                    if (!cuncVar.b.L()) {
                                        cuncVar.U();
                                    }
                                    Map map = hashMap;
                                    cune cuneVar2 = (cune) cuncVar.b;
                                    cune cuneVar3 = cune.a;
                                    cuneVar2.b().clear();
                                    cuncVar.a(map);
                                    return (cune) cuncVar.Q();
                                }
                            }, enre.a)).u();
                        }
                    } catch (InterruptedException | ExecutionException e3) {
                        cuey.e("BackupAndSyncValidation", "Unable to perform SimContactsSyncStorage cleanup service.", e3);
                        return 2;
                    }
                }
                i = 0;
            } else {
                cuey.c("BackupAndSyncValidation", "Unknown tag received. Will not run");
            }
        }
        e(this);
        return i;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        cuui d = cuui.d(this);
        if (this.a == null) {
            this.a = d;
        }
        if (fqyv.e() && (fqyv.c() || fqyv.d())) {
            try {
                cuut c = cuut.c(this);
                if (this.b == null) {
                    this.b = c;
                }
            } catch (LevelDbException e) {
                cuey.e("BackupAndSyncValidation", "Unable to create BackupSyncUserActionStorage instance.", e);
            }
        }
        if (fraj.d()) {
            cuus a = cuus.a(this);
            if (this.c == null) {
                this.c = a;
            }
        }
    }
}
