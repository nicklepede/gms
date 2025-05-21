package com.google.android.gms.location.density;

import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.location.density.PopulationDensityMddDownloadScheduleService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.bzlc;
import defpackage.dplo;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fptx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PopulationDensityMddDownloadScheduleService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("PopulationDensityMddDownloadScheduleService", asej.LOCATION);
    private final dplo c;

    public PopulationDensityMddDownloadScheduleService() {
        bzlc.b(AppContextProvider.a());
        this.c = bzlc.a();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        if (!fptx.d()) {
            return ensj.i(2);
        }
        if (bylnVar.a.equals("PopulationDensityMddDownloadScheduleService")) {
            return enps.f(ensi.h(this.c.l()), new eiho() { // from class: bzlb
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    int i = PopulationDensityMddDownloadScheduleService.a;
                    return 0;
                }
            }, enre.a);
        }
        ((ejhf) b.j()).x("MDD schedule task failed: tag mismatch");
        return ensj.i(2);
    }

    public PopulationDensityMddDownloadScheduleService(dplo dploVar) {
        this.c = dploVar;
    }
}
