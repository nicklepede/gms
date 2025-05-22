package com.google.android.gms.gmscompliance.sync;

import com.google.android.gms.gmscompliance.sync.BackgroundSyncGmsTaskService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.bksh;
import defpackage.casd;
import defpackage.cate;
import defpackage.catf;
import defpackage.cauf;
import defpackage.ekut;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.frde;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class BackgroundSyncGmsTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int c = 0;
    public final eqgo b = new aupz(1, 10);
    private final ekww e = ekxd.a(new ekww() { // from class: bkth
        @Override // defpackage.ekww
        public final Object lK() {
            dpvs dpvsVar = new dpvs();
            BackgroundSyncGmsTaskService backgroundSyncGmsTaskService = BackgroundSyncGmsTaskService.this;
            return bksi.a(backgroundSyncGmsTaskService, dpvsVar, backgroundSyncGmsTaskService.b);
        }
    });
    private static final ausn d = ausn.b("BackgroundSyncGmsTaskService", auid.GMS_COMPLIANCE);
    static final String a = BackgroundSyncGmsTaskService.class.getName();

    public static catf d(String str, long j, boolean z) {
        cate cateVar = new cate();
        cateVar.w(a);
        cateVar.q(str);
        cateVar.v(2);
        cateVar.p = true;
        cateVar.y(z ? 1 : 0, 1);
        cateVar.x(0, 1);
        cateVar.f(0, 1);
        cateVar.a = j;
        return cateVar.b();
    }

    public static void e(casd casdVar) {
        casdVar.c(a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        if (!frde.c()) {
            ((eluo) ((eluo) d.j()).ai((char) 5075)).x("background sync is unavailable");
            return eqgc.i(0);
        }
        if (!frde.d()) {
            ((eluo) ((eluo) d.j()).ai((char) 5074)).x("background sync is disabled");
            e(casd.a(this));
            return eqgc.i(0);
        }
        String str = caufVar.a;
        final bksh bkshVar = (bksh) this.e.lK();
        eqgl h = eqgb.h(bkshVar.b());
        if (!"compliant_sync".equals(str)) {
            if (!"noncompliant_sync".equals(str)) {
                ((eluo) ((eluo) d.j()).ai((char) 5073)).B("unknown task [%s]", str);
                return eqdl.f(h, new ekut() { // from class: bktd
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        int i = BackgroundSyncGmsTaskService.c;
                        return 2;
                    }
                }, this.b);
            }
            h = eqdl.f(h, new ekut() { // from class: bktc
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    int i = BackgroundSyncGmsTaskService.c;
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }, this.b);
        }
        return eqdl.g(h, new eqdv() { // from class: bkte
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eqgc.i(0);
                }
                return eqdl.f(eqgb.h(bkshVar.e()), new ekut() { // from class: bktf
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        int i = BackgroundSyncGmsTaskService.c;
                        ((ekvi) obj2).b(new ekut() { // from class: bktg
                            @Override // defpackage.ekut
                            public final Object apply(Object obj3) {
                                int i2 = BackgroundSyncGmsTaskService.c;
                                return Boolean.toString(((Boolean) obj3).booleanValue());
                            }
                        }).e("unknown");
                        return 0;
                    }
                }, BackgroundSyncGmsTaskService.this.b);
            }
        }, this.b);
    }
}
