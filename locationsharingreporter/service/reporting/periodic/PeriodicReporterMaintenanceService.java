package com.google.android.gms.locationsharingreporter.service.reporting.periodic;

import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.locationsharingreporter.service.reporting.periodic.PeriodicReporterMaintenanceService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byln;
import defpackage.cavm;
import defpackage.cayl;
import defpackage.caym;
import defpackage.cbew;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.ensj;
import defpackage.ensm;
import defpackage.enss;
import defpackage.fpxh;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PeriodicReporterMaintenanceService extends GmsTaskBoundService {
    public static final asot a = asot.b("LSR", asej.LOCATION_SHARING_REPORTER);

    public static synchronized enss d() {
        synchronized (PeriodicReporterMaintenanceService.class) {
            asot asotVar = a;
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 5883)).x("Attempting to schedule periodic location reporting maintenance task");
            if (fpxh.F()) {
                return enps.f(enps.f(enps.f(cavm.c().c(), new eiho() { // from class: cayu
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        asot asotVar2 = PeriodicReporterMaintenanceService.a;
                        Iterator it = DesugarCollections.unmodifiableMap(((cauz) obj).c).values().iterator();
                        while (it.hasNext()) {
                            Set keySet = DesugarCollections.unmodifiableMap(((cavc) it.next()).b).keySet();
                            Iterator it2 = fpxh.a.a().N().b.iterator();
                            while (it2.hasNext()) {
                                if (keySet.contains((String) it2.next())) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }, cbew.a()), new eiho() { // from class: cayr
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        long seconds;
                        long seconds2;
                        Boolean bool = (Boolean) obj;
                        asot asotVar2 = PeriodicReporterMaintenanceService.a;
                        bykm bykmVar = new bykm();
                        bykmVar.t("PeriodicReporterMaintenanceServiceTag");
                        bykmVar.w(PeriodicReporterMaintenanceService.class.getName());
                        if (bool.booleanValue()) {
                            seconds = TimeUnit.MILLISECONDS.toSeconds(fpxh.a.a().j());
                        } else {
                            seconds = TimeUnit.MILLISECONDS.toSeconds(fpxh.a.a().m());
                        }
                        if (bool.booleanValue()) {
                            seconds2 = TimeUnit.MILLISECONDS.toSeconds(fpxh.a.a().k());
                        } else {
                            seconds2 = TimeUnit.MILLISECONDS.toSeconds(fpxh.a.a().n());
                        }
                        bykmVar.e(seconds, seconds2, bylf.a);
                        bykmVar.v(2);
                        bykmVar.x(0, 0);
                        bykmVar.y(2, 2);
                        bykmVar.p = false;
                        return bykmVar.b();
                    }
                }, cbew.b()), new eiho() { // from class: cays
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        ((ejhf) ((ejhf) PeriodicReporterMaintenanceService.a.h()).ah((char) 5878)).x("Scheduling periodic location reporting maintenance task");
                        byjl.a(AppContextProvider.a()).f((bykn) obj);
                        return null;
                    }
                }, cbew.b());
            }
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 5884)).x("Periodic reporter maintenance task disabled, cancelling it");
            e();
            return ensm.a;
        }
    }

    public static synchronized void e() {
        synchronized (PeriodicReporterMaintenanceService.class) {
            ((ejhf) ((ejhf) a.h()).ah((char) 5877)).x("Cancelling periodic location reporting maintenance task");
            byjl.a(AppContextProvider.a()).c(PeriodicReporterMaintenanceService.class.getName());
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        if (fpxh.F()) {
            ((ejhf) ((ejhf) a.h()).ah((char) 5881)).x("Executing periodic reporter maintenance task");
            return enps.f(caym.a().d(cayl.FORCE), new eiho() { // from class: cayt
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    asot asotVar = PeriodicReporterMaintenanceService.a;
                    return 0;
                }
            }, cbew.a());
        }
        ((ejhf) ((ejhf) a.h()).ah((char) 5882)).x("Periodic reporter maintenance task disabled, cancelling it");
        e();
        return ensj.i(0);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        super.onCreate();
        ((ejhf) ((ejhf) a.h()).ah((char) 5879)).x("PeriodicReporterMaintenanceService created");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        super.onDestroy();
        ((ejhf) ((ejhf) a.h()).ah((char) 5880)).x("PeriodicReporterMaintenanceService destroyed");
    }
}
