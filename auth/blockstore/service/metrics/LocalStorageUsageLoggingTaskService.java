package com.google.android.gms.auth.blockstore.service.metrics;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.blockstore.service.metrics.LocalStorageUsageLoggingTaskService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aacb;
import defpackage.aacc;
import defpackage.aakp;
import defpackage.aalb;
import defpackage.aalc;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.byln;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fkwd;
import defpackage.fnck;
import java.io.Serializable;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class LocalStorageUsageLoggingTaskService extends GmsTaskBoundService {
    public static final asot a = aacc.b("LocalStorageUsageLoggingTaskService");
    public aacb b;
    private final aalc c = aalc.a().a();
    private final aalc d;

    public LocalStorageUsageLoggingTaskService() {
        aalb a2 = aalc.a();
        a2.b(true);
        this.d = a2.a();
    }

    public static void d(Context context) {
        ((ejhf) ((ejhf) a.h()).ah((char) 870)).x("scheduling a periodic local storage usage logging task.");
        Bundle bundle = new Bundle();
        if (fnck.d()) {
            byko bykoVar = new byko();
            bykoVar.w(LocalStorageUsageLoggingTaskService.class.getName());
            bykoVar.t("LOCAL_STORAGE_USAGE_LOGGING_PERIODIC");
            bykoVar.a = bykv.j;
            bykoVar.l(true);
            bykoVar.v(2);
            bykoVar.u = bundle;
            if (fkwd.g()) {
                bykoVar.k();
            }
            if (fkwd.f()) {
                bykoVar.e();
            }
            byjl.a(context).f(bykoVar.b());
            return;
        }
        boolean g = fkwd.g();
        boolean f = fkwd.f();
        bykm bykmVar = new bykm();
        bykmVar.t("LOCAL_STORAGE_USAGE_LOGGING_PERIODIC");
        bykmVar.w(LocalStorageUsageLoggingTaskService.class.getName());
        bykmVar.j(byki.a(fkwd.a.a().c()));
        bykmVar.y(g ? 1 : 0, 1);
        bykmVar.x(f ? 1 : 0, 1);
        bykmVar.u = bundle;
        bykmVar.v(2);
        byjl.a(context).f(bykmVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        if (!fkwd.i()) {
            ((ejhf) ((ejhf) a.h()).ah((char) 869)).x("Feature flag disabled, skip logging.");
            return ensj.i(0);
        }
        ((ejhf) ((ejhf) a.h()).ah((char) 868)).x("Triggering a local storage usage logging.");
        aakp n = aakp.n();
        enss a2 = n.c.a();
        eiho eihoVar = new eiho() { // from class: aajl
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                asot asotVar = aakp.a;
                return Integer.valueOf(((aana) obj).r().length);
            }
        };
        enre enreVar = enre.a;
        return enps.g(ensi.h(ensj.f(enps.f(a2, eihoVar, enreVar), n.c(this.c), n.c(this.d))), new enqc() { // from class: aahr
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                List list = (List) obj;
                int intValue = ((Integer) ((Serializable) list.get(0))).intValue();
                int size = ((List) list.get(1)).size();
                int size2 = ((List) list.get(2)).size();
                if (size == 0) {
                    ((ejhf) ((ejhf) LocalStorageUsageLoggingTaskService.a.h()).ah((char) 867)).x("Blockstore is not used in any app, skip logging");
                } else {
                    fecj v = pmj.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fecp fecpVar = v.b;
                    pmj pmjVar = (pmj) fecpVar;
                    pmjVar.b = 1 | pmjVar.b;
                    pmjVar.c = intValue;
                    if (!fecpVar.L()) {
                        v.U();
                    }
                    fecp fecpVar2 = v.b;
                    pmj pmjVar2 = (pmj) fecpVar2;
                    pmjVar2.b = 2 | pmjVar2.b;
                    pmjVar2.d = size;
                    if (!fecpVar2.L()) {
                        v.U();
                    }
                    LocalStorageUsageLoggingTaskService localStorageUsageLoggingTaskService = LocalStorageUsageLoggingTaskService.this;
                    pmj pmjVar3 = (pmj) v.b;
                    pmjVar3.b |= 4;
                    pmjVar3.e = size2;
                    pmj pmjVar4 = (pmj) v.Q();
                    asot asotVar = LocalStorageUsageLoggingTaskService.a;
                    ((ejhf) ((ejhf) asotVar.h()).ah((char) 863)).z("local storage used %s bytes.", intValue);
                    ((ejhf) ((ejhf) asotVar.h()).ah((char) 864)).z("local storage stored %s packages.", size);
                    ((ejhf) ((ejhf) asotVar.h()).ah((char) 865)).z("local storage stored %s packages with cloud backup enabled.", size2);
                    if (localStorageUsageLoggingTaskService.b == null) {
                        localStorageUsageLoggingTaskService.b = aacc.a(localStorageUsageLoggingTaskService.getApplicationContext(), aacc.c(localStorageUsageLoggingTaskService.getApplicationContext()));
                    }
                    localStorageUsageLoggingTaskService.b.j(pmjVar4);
                    ((ejhf) ((ejhf) asotVar.h()).ah((char) 866)).x("Finished logging.");
                }
                return ensj.i(0);
            }
        }, enreVar);
    }
}
