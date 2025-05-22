package com.google.android.gms.semanticlocationhistory.federated;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.InAppTrainingConstraints;
import com.google.android.gms.learning.TrainingInterval;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bsmj;
import defpackage.bsmk;
import defpackage.bzbx;
import defpackage.casd;
import defpackage.cauf;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dbvl;
import defpackage.ekvk;
import defpackage.eluo;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fuqi;
import defpackage.fusk;
import j$.time.Duration;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class FederatedScheduleService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.federated.FederatedScheduleService";
    private static final ausn b = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "FederatedScheduleService");
    private final dbtc c;
    private final dbvg d;

    public FederatedScheduleService() {
        dbtc dbtcVar = new dbtc();
        this.c = dbtcVar;
        this.d = new dbvg(dbtcVar);
    }

    public static void d(Context context) {
        casd.a(context).d("FederatedLocation", a);
    }

    static final InAppTrainerOptions e(String str, String str2, int i, long j) {
        fuqi fuqiVar = fuqi.a;
        boolean Y = fuqiVar.lK().Y();
        InAppTrainingConstraints inAppTrainingConstraints = new InAppTrainingConstraints(fuqiVar.lK().X(), fuqiVar.lK().W(), Y);
        bsmk bsmkVar = new bsmk();
        bsmkVar.b((int) fuqi.c());
        bsmkVar.d(str);
        bsmkVar.a = i;
        bsmkVar.e(str2);
        bsmkVar.e = inAppTrainingConstraints;
        if (j > 0) {
            bsmkVar.f = new TrainingInterval(0, Duration.ofSeconds(j).toMillis());
        }
        return bsmkVar.a();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        dbtc dbtcVar = this.c;
        Context a2 = AppContextProvider.a();
        dbtcVar.e("FederatedAnalyticsScheduleInvocation");
        if (!fuqi.z()) {
            ((eluo) ((eluo) b.h()).ai((char) 10413)).x("Flag to run FederatedScheduleService disabled. Not scheduling task");
            d(a2);
            dbtcVar.e("FederatedAnalyticsScheduleFailureServiceDisabled");
            return eqgc.i(2);
        }
        if (!fusk.g() ? !this.d.J() : !this.d.g().e) {
            ((eluo) ((eluo) b.h()).ai((char) 10412)).x("Incognito mode enabled. Not executing FederatedScheduleService task");
            dbtcVar.e("FederatedAnalyticsScheduleFailureIncognito");
            return eqgc.i(2);
        }
        if (!bzbx.q(a2)) {
            ((eluo) ((eluo) b.h()).ai((char) 10411)).x("Device-level location setting is turned off.");
            dbtcVar.e("FederatedAnalyticsScheduleFailureMasterLocationDisabled");
            return eqgc.i(2);
        }
        if (dbvl.b(a2, this.d).isEmpty()) {
            ((eluo) ((eluo) b.h()).ai((char) 10410)).x("Account-level location setting is turned off.");
            dbtcVar.e("FederatedAnalyticsScheduleFailureAccountLocationDisabled");
            return eqgc.i(2);
        }
        fuqi.p();
        bsmj.a(a2, e(fuqi.p(), "semantic_location_session", 4, fuqi.f())).a();
        fuqi fuqiVar = fuqi.a;
        boolean V = fuqiVar.lK().V();
        InAppTrainingConstraints inAppTrainingConstraints = new InAppTrainingConstraints(fuqiVar.lK().U(), fuqiVar.lK().T(), V);
        bsmk bsmkVar = new bsmk();
        bsmkVar.b((int) fuqi.c());
        bsmkVar.d(fuqiVar.lK().r());
        bsmkVar.a = 13;
        bsmkVar.e("semantic_location_hulk_internal_session");
        bsmkVar.e = inAppTrainingConstraints;
        if (fuqi.e() > 0) {
            bsmkVar.f = new TrainingInterval(0, Duration.ofSeconds(fuqi.e()).toMillis());
        }
        bsmj.a(a2, bsmkVar.a()).a();
        if (fuqiVar.lK().G()) {
            boolean y = fuqiVar.lK().y();
            InAppTrainingConstraints inAppTrainingConstraints2 = new InAppTrainingConstraints(fuqiVar.lK().x(), fuqiVar.lK().w(), y);
            bsmk bsmkVar2 = new bsmk();
            bsmkVar2.b((int) fuqi.c());
            bsmkVar2.d(fuqiVar.lK().n());
            bsmkVar2.a = 12;
            bsmkVar2.e("semantic_location_adhoc_session");
            bsmkVar2.e = inAppTrainingConstraints2;
            if (fuqi.b() > 0) {
                bsmkVar2.f = new TrainingInterval(0, Duration.ofSeconds(fuqi.b()).toMillis());
            }
            bsmj.a(a2, bsmkVar2.a()).a();
        }
        if (!ekvk.c(fuqi.q())) {
            bsmj.a(a2, e(fuqi.q(), "semantic_location_second_session", 5, fuqi.f())).a();
        }
        if (!ekvk.c(fuqi.r())) {
            bsmj.a(a2, e(fuqi.r(), "semantic_location_third_session", 6, fuqi.f())).a();
        }
        if (!ekvk.c(fuqi.m())) {
            InAppTrainingConstraints inAppTrainingConstraints3 = new InAppTrainingConstraints(true, true, true);
            bsmk bsmkVar3 = new bsmk();
            bsmkVar3.b((int) fuqi.c());
            bsmkVar3.d(fuqi.m());
            bsmkVar3.a = 13;
            bsmkVar3.e("semantic_location_fl_session");
            bsmkVar3.e = inAppTrainingConstraints3;
            if (fuqi.d() > 0) {
                bsmkVar3.f = new TrainingInterval(0, Duration.ofSeconds(fuqi.d()).toMillis());
            }
            bsmj.a(a2, bsmkVar3.a()).a();
        }
        dbtcVar.e("FederatedAnalyticsScheduleSuccess");
        return eqgc.i(0);
    }

    FederatedScheduleService(dbvg dbvgVar, dbtc dbtcVar) {
        this.c = dbtcVar;
        this.d = dbvgVar;
    }
}
