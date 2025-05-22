package com.google.android.gms.semanticlocation.mdd;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocation.mdd.MddDownloadScheduleService;
import defpackage.aszs;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.ceqg;
import defpackage.ceqm;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dcbg;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fuqv;
import defpackage.fush;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class MddDownloadScheduleService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.c("SemanticLocation", auid.SEMANTIC_LOCATION, "MDD");
    private dbvg c;
    private dbtc d;
    private ceqm e;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        if (!fush.P() || !fuqv.c()) {
            return eqgc.i(2);
        }
        String str = caufVar.a;
        if ("schedule_mdd_task".equals(str)) {
            return eqdl.f(dcbg.a(getApplicationContext(), this.e, this.c, this.d, new aupz(1, 10)), new ekut() { // from class: dcam
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    int i = MddDownloadScheduleService.a;
                    return 0;
                }
            }, eqex.a);
        }
        ((eluo) ((eluo) b.i()).ai((char) 9767)).B("Unexpected tag: %s", str);
        return eqgc.i(2);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        super.onCreate();
        this.c = new dbvg(this.d);
        this.d = new dbtc();
        Context applicationContext = getApplicationContext();
        aszs aszsVar = ceqg.a;
        this.e = new ceqm(applicationContext);
    }
}
