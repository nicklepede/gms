package com.google.android.gms.semanticlocation.mdd;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocation.mdd.MddDownloadScheduleService;
import defpackage.aqxd;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.byln;
import defpackage.cchm;
import defpackage.cchs;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czrf;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.frwb;
import defpackage.frxn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class MddDownloadScheduleService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.c("SemanticLocation", asej.SEMANTIC_LOCATION, "MDD");
    private czlk c;
    private czje d;
    private cchs e;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        if (!frxn.P() || !frwb.c()) {
            return ensj.i(2);
        }
        String str = bylnVar.a;
        if ("schedule_mdd_task".equals(str)) {
            return enps.f(czrf.a(getApplicationContext(), this.e, this.c, this.d, new asmf(1, 10)), new eiho() { // from class: czql
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    int i = MddDownloadScheduleService.a;
                    return 0;
                }
            }, enre.a);
        }
        ((ejhf) ((ejhf) b.i()).ah((char) 9765)).B("Unexpected tag: %s", str);
        return ensj.i(2);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        super.onCreate();
        this.c = new czlk(this.d);
        this.d = new czje();
        Context applicationContext = getApplicationContext();
        aqxd aqxdVar = cchm.a;
        this.e = new cchs(applicationContext);
    }
}
