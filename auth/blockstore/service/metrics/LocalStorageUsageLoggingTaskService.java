package com.google.android.gms.auth.blockstore.service.metrics;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.blockstore.service.metrics.LocalStorageUsageLoggingTaskService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.accb;
import defpackage.accc;
import defpackage.ackp;
import defpackage.aclb;
import defpackage.aclc;
import defpackage.ausn;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.cauf;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fnnh;
import defpackage.fpuj;
import java.io.Serializable;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class LocalStorageUsageLoggingTaskService extends GmsTaskBoundService {
    public static final ausn a = accc.b("LocalStorageUsageLoggingTaskService");
    public accb b;
    private final aclc c = aclc.a().a();
    private final aclc d;

    public LocalStorageUsageLoggingTaskService() {
        aclb a2 = aclc.a();
        a2.b(true);
        this.d = a2.a();
    }

    public static void d(Context context) {
        ((eluo) ((eluo) a.h()).ai((char) 869)).x("scheduling a periodic local storage usage logging task.");
        Bundle bundle = new Bundle();
        if (fpuj.d()) {
            catg catgVar = new catg();
            catgVar.w(LocalStorageUsageLoggingTaskService.class.getName());
            catgVar.t("LOCAL_STORAGE_USAGE_LOGGING_PERIODIC");
            catgVar.a = catn.j;
            catgVar.l(true);
            catgVar.v(2);
            catgVar.u = bundle;
            if (fnnh.g()) {
                catgVar.k();
            }
            if (fnnh.f()) {
                catgVar.e();
            }
            casd.a(context).f(catgVar.b());
            return;
        }
        boolean g = fnnh.g();
        boolean f = fnnh.f();
        cate cateVar = new cate();
        cateVar.t("LOCAL_STORAGE_USAGE_LOGGING_PERIODIC");
        cateVar.w(LocalStorageUsageLoggingTaskService.class.getName());
        cateVar.j(cata.a(fnnh.a.lK().c()));
        cateVar.y(g ? 1 : 0, 1);
        cateVar.x(f ? 1 : 0, 1);
        cateVar.u = bundle;
        cateVar.v(2);
        casd.a(context).f(cateVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        if (!fnnh.i()) {
            ((eluo) ((eluo) a.h()).ai((char) 868)).x("Feature flag disabled, skip logging.");
            return eqgc.i(0);
        }
        ((eluo) ((eluo) a.h()).ai((char) 867)).x("Triggering a local storage usage logging.");
        ackp n = ackp.n();
        eqgl a2 = n.c.a();
        ekut ekutVar = new ekut() { // from class: acjl
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ausn ausnVar = ackp.a;
                return Integer.valueOf(((acna) obj).r().length);
            }
        };
        eqex eqexVar = eqex.a;
        return eqdl.g(eqgb.h(eqgc.f(eqdl.f(a2, ekutVar, eqexVar), n.c(this.c), n.c(this.d))), new eqdv() { // from class: achr
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                List list = (List) obj;
                int intValue = ((Integer) ((Serializable) list.get(0))).intValue();
                int size = ((List) list.get(1)).size();
                int size2 = ((List) list.get(2)).size();
                if (size == 0) {
                    ((eluo) ((eluo) LocalStorageUsageLoggingTaskService.a.h()).ai((char) 866)).x("Blockstore is not used in any app, skip logging");
                } else {
                    fgrc v = rfn.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fgri fgriVar = v.b;
                    rfn rfnVar = (rfn) fgriVar;
                    rfnVar.b = 1 | rfnVar.b;
                    rfnVar.c = intValue;
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    fgri fgriVar2 = v.b;
                    rfn rfnVar2 = (rfn) fgriVar2;
                    rfnVar2.b = 2 | rfnVar2.b;
                    rfnVar2.d = size;
                    if (!fgriVar2.L()) {
                        v.U();
                    }
                    LocalStorageUsageLoggingTaskService localStorageUsageLoggingTaskService = LocalStorageUsageLoggingTaskService.this;
                    rfn rfnVar3 = (rfn) v.b;
                    rfnVar3.b |= 4;
                    rfnVar3.e = size2;
                    rfn rfnVar4 = (rfn) v.Q();
                    ausn ausnVar = LocalStorageUsageLoggingTaskService.a;
                    ((eluo) ((eluo) ausnVar.h()).ai((char) 862)).z("local storage used %s bytes.", intValue);
                    ((eluo) ((eluo) ausnVar.h()).ai((char) 863)).z("local storage stored %s packages.", size);
                    ((eluo) ((eluo) ausnVar.h()).ai((char) 864)).z("local storage stored %s packages with cloud backup enabled.", size2);
                    if (localStorageUsageLoggingTaskService.b == null) {
                        localStorageUsageLoggingTaskService.b = accc.a(localStorageUsageLoggingTaskService.getApplicationContext(), accc.c(localStorageUsageLoggingTaskService.getApplicationContext()));
                    }
                    localStorageUsageLoggingTaskService.b.j(rfnVar4);
                    ((eluo) ((eluo) ausnVar.h()).ai((char) 865)).x("Finished logging.");
                }
                return eqgc.i(0);
            }
        }, eqexVar);
    }
}
