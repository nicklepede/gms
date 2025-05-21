package com.google.android.gms.gmscompliance.sync;

import com.google.android.gms.gmscompliance.sync.BackgroundSyncGmsTaskService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.bins;
import defpackage.byjl;
import defpackage.bykm;
import defpackage.bykn;
import defpackage.byln;
import defpackage.eiho;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.ensv;
import defpackage.foko;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class BackgroundSyncGmsTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int c = 0;
    public final ensv b = new asmf(1, 10);
    private final eijr e = eijy.a(new eijr() { // from class: bios
        @Override // defpackage.eijr
        public final Object a() {
            dnlj dnljVar = new dnlj();
            BackgroundSyncGmsTaskService backgroundSyncGmsTaskService = BackgroundSyncGmsTaskService.this;
            return bint.a(backgroundSyncGmsTaskService, dnljVar, backgroundSyncGmsTaskService.b);
        }
    });
    private static final asot d = asot.b("BackgroundSyncGmsTaskService", asej.GMS_COMPLIANCE);
    static final String a = BackgroundSyncGmsTaskService.class.getName();

    public static bykn d(String str, long j, boolean z) {
        bykm bykmVar = new bykm();
        bykmVar.w(a);
        bykmVar.q(str);
        bykmVar.v(2);
        bykmVar.p = true;
        bykmVar.y(z ? 1 : 0, 1);
        bykmVar.x(0, 1);
        bykmVar.f(0, 1);
        bykmVar.a = j;
        return bykmVar.b();
    }

    public static void e(byjl byjlVar) {
        byjlVar.c(a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        if (!foko.c()) {
            ((ejhf) ((ejhf) d.j()).ah((char) 5065)).x("background sync is unavailable");
            return ensj.i(0);
        }
        if (!foko.d()) {
            ((ejhf) ((ejhf) d.j()).ah((char) 5064)).x("background sync is disabled");
            e(byjl.a(this));
            return ensj.i(0);
        }
        String str = bylnVar.a;
        final bins binsVar = (bins) this.e.a();
        enss h = ensi.h(binsVar.b());
        if (!"compliant_sync".equals(str)) {
            if (!"noncompliant_sync".equals(str)) {
                ((ejhf) ((ejhf) d.j()).ah((char) 5063)).B("unknown task [%s]", str);
                return enps.f(h, new eiho() { // from class: bioo
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        int i = BackgroundSyncGmsTaskService.c;
                        return 2;
                    }
                }, this.b);
            }
            h = enps.f(h, new eiho() { // from class: bion
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    int i = BackgroundSyncGmsTaskService.c;
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }, this.b);
        }
        return enps.g(h, new enqc() { // from class: biop
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return ensj.i(0);
                }
                return enps.f(ensi.h(binsVar.e()), new eiho() { // from class: bioq
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        int i = BackgroundSyncGmsTaskService.c;
                        ((eiid) obj2).b(new eiho() { // from class: bior
                            @Override // defpackage.eiho
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
