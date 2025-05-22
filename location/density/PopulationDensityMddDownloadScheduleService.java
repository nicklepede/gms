package com.google.android.gms.location.density;

import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.location.density.PopulationDensityMddDownloadScheduleService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.cbtt;
import defpackage.drvx;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fsnp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PopulationDensityMddDownloadScheduleService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("PopulationDensityMddDownloadScheduleService", auid.LOCATION);
    private final drvx c;

    public PopulationDensityMddDownloadScheduleService() {
        cbtt.b(AppContextProvider.a());
        this.c = cbtt.a();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        if (!fsnp.d()) {
            return eqgc.i(2);
        }
        if (caufVar.a.equals("PopulationDensityMddDownloadScheduleService")) {
            return eqdl.f(eqgb.h(this.c.l()), new ekut() { // from class: cbts
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    int i = PopulationDensityMddDownloadScheduleService.a;
                    return 0;
                }
            }, eqex.a);
        }
        ((eluo) b.j()).x("MDD schedule task failed: tag mismatch");
        return eqgc.i(2);
    }

    public PopulationDensityMddDownloadScheduleService(drvx drvxVar) {
        this.c = drvxVar;
    }
}
