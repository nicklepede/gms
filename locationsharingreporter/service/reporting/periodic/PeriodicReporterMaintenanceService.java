package com.google.android.gms.locationsharingreporter.service.reporting.periodic;

import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.locationsharingreporter.service.reporting.periodic.PeriodicReporterMaintenanceService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.cauf;
import defpackage.cdec;
import defpackage.cdhg;
import defpackage.cdhh;
import defpackage.cdno;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqgc;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.fsrb;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PeriodicReporterMaintenanceService extends GmsTaskBoundService {
    public static final ausn a = ausn.b("LSR", auid.LOCATION_SHARING_REPORTER);

    public static synchronized eqgl d() {
        synchronized (PeriodicReporterMaintenanceService.class) {
            ausn ausnVar = a;
            ((eluo) ((eluo) ausnVar.h()).ai((char) 5902)).x("Attempting to schedule periodic location reporting maintenance task");
            if (fsrb.E()) {
                return eqdl.f(eqdl.f(eqdl.f(cdec.c().c(), new ekut() { // from class: cdhp
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        ausn ausnVar2 = PeriodicReporterMaintenanceService.a;
                        Iterator it = DesugarCollections.unmodifiableMap(((cddp) obj).c).values().iterator();
                        while (it.hasNext()) {
                            Set keySet = DesugarCollections.unmodifiableMap(((cdds) it.next()).b).keySet();
                            Iterator it2 = fsrb.a.lK().P().b.iterator();
                            while (it2.hasNext()) {
                                if (keySet.contains((String) it2.next())) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }, cdno.a()), new ekut() { // from class: cdhm
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        long seconds;
                        long seconds2;
                        Boolean bool = (Boolean) obj;
                        ausn ausnVar2 = PeriodicReporterMaintenanceService.a;
                        cate cateVar = new cate();
                        cateVar.t("PeriodicReporterMaintenanceServiceTag");
                        cateVar.w(PeriodicReporterMaintenanceService.class.getName());
                        if (bool.booleanValue()) {
                            seconds = TimeUnit.MILLISECONDS.toSeconds(fsrb.a.lK().k());
                        } else {
                            seconds = TimeUnit.MILLISECONDS.toSeconds(fsrb.a.lK().o());
                        }
                        if (bool.booleanValue()) {
                            seconds2 = TimeUnit.MILLISECONDS.toSeconds(fsrb.a.lK().l());
                        } else {
                            seconds2 = TimeUnit.MILLISECONDS.toSeconds(fsrb.a.lK().p());
                        }
                        cateVar.e(seconds, seconds2, catx.a);
                        cateVar.v(2);
                        cateVar.x(0, 0);
                        cateVar.y(2, 2);
                        cateVar.p = false;
                        return cateVar.b();
                    }
                }, cdno.b()), new ekut() { // from class: cdhn
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        ((eluo) ((eluo) PeriodicReporterMaintenanceService.a.h()).ai((char) 5897)).x("Scheduling periodic location reporting maintenance task");
                        casd.a(AppContextProvider.a()).f((catf) obj);
                        return null;
                    }
                }, cdno.b());
            }
            ((eluo) ((eluo) ausnVar.h()).ai((char) 5903)).x("Periodic reporter maintenance task disabled, cancelling it");
            e();
            return eqgf.a;
        }
    }

    public static synchronized void e() {
        synchronized (PeriodicReporterMaintenanceService.class) {
            ((eluo) ((eluo) a.h()).ai((char) 5896)).x("Cancelling periodic location reporting maintenance task");
            casd.a(AppContextProvider.a()).c(PeriodicReporterMaintenanceService.class.getName());
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        if (fsrb.E()) {
            ((eluo) ((eluo) a.h()).ai((char) 5900)).x("Executing periodic reporter maintenance task");
            return eqdl.f(cdhh.a().d(cdhg.FORCE), new ekut() { // from class: cdho
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    ausn ausnVar = PeriodicReporterMaintenanceService.a;
                    return 0;
                }
            }, cdno.a());
        }
        ((eluo) ((eluo) a.h()).ai((char) 5901)).x("Periodic reporter maintenance task disabled, cancelling it");
        e();
        return eqgc.i(0);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        super.onCreate();
        ((eluo) ((eluo) a.h()).ai((char) 5898)).x("PeriodicReporterMaintenanceService created");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        super.onDestroy();
        ((eluo) ((eluo) a.h()).ai((char) 5899)).x("PeriodicReporterMaintenanceService destroyed");
    }
}
