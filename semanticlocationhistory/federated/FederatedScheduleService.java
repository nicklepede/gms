package com.google.android.gms.semanticlocationhistory.federated;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.InAppTrainingConstraints;
import com.google.android.gms.learning.TrainingInterval;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bqet;
import defpackage.bqeu;
import defpackage.bwth;
import defpackage.byjl;
import defpackage.byln;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czlp;
import defpackage.eiif;
import defpackage.ejhf;
import defpackage.ensj;
import defpackage.enss;
import defpackage.frvo;
import defpackage.frxq;
import j$.time.Duration;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class FederatedScheduleService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.federated.FederatedScheduleService";
    private static final asot b = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "FederatedScheduleService");
    private final czje c;
    private final czlk d;

    public FederatedScheduleService() {
        czje czjeVar = new czje();
        this.c = czjeVar;
        this.d = new czlk(czjeVar);
    }

    public static void d(Context context) {
        byjl.a(context).d("FederatedLocation", a);
    }

    static final InAppTrainerOptions e(String str, String str2, int i, long j) {
        boolean Y = frvo.a.a().Y();
        frvo frvoVar = frvo.a;
        InAppTrainingConstraints inAppTrainingConstraints = new InAppTrainingConstraints(frvoVar.a().X(), frvoVar.a().W(), Y);
        bqeu bqeuVar = new bqeu();
        bqeuVar.b((int) frvo.c());
        bqeuVar.d(str);
        bqeuVar.a = i;
        bqeuVar.e(str2);
        bqeuVar.e = inAppTrainingConstraints;
        if (j > 0) {
            bqeuVar.f = new TrainingInterval(0, Duration.ofSeconds(j).toMillis());
        }
        return bqeuVar.a();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        czje czjeVar = this.c;
        Context a2 = AppContextProvider.a();
        czjeVar.e("FederatedAnalyticsScheduleInvocation");
        if (!frvo.z()) {
            ((ejhf) ((ejhf) b.h()).ah((char) 10407)).x("Flag to run FederatedScheduleService disabled. Not scheduling task");
            d(a2);
            czjeVar.e("FederatedAnalyticsScheduleFailureServiceDisabled");
            return ensj.i(2);
        }
        if (!frxq.h() ? !this.d.J() : !this.d.g().e) {
            ((ejhf) ((ejhf) b.h()).ah((char) 10406)).x("Incognito mode enabled. Not executing FederatedScheduleService task");
            czjeVar.e("FederatedAnalyticsScheduleFailureIncognito");
            return ensj.i(2);
        }
        if (!bwth.q(a2)) {
            ((ejhf) ((ejhf) b.h()).ah((char) 10405)).x("Device-level location setting is turned off.");
            czjeVar.e("FederatedAnalyticsScheduleFailureMasterLocationDisabled");
            return ensj.i(2);
        }
        if (czlp.b(a2, this.d).isEmpty()) {
            ((ejhf) ((ejhf) b.h()).ah((char) 10404)).x("Account-level location setting is turned off.");
            czjeVar.e("FederatedAnalyticsScheduleFailureAccountLocationDisabled");
            return ensj.i(2);
        }
        bqet.a(a2, e(frvo.p() != null ? frvo.p() : "test_population", "semantic_location_session", 4, frvo.f())).a();
        frvo frvoVar = frvo.a;
        boolean V = frvoVar.a().V();
        frvo frvoVar2 = frvo.a;
        InAppTrainingConstraints inAppTrainingConstraints = new InAppTrainingConstraints(frvoVar2.a().U(), frvoVar2.a().T(), V);
        bqeu bqeuVar = new bqeu();
        bqeuVar.b((int) frvo.c());
        bqeuVar.d(frvoVar2.a().r());
        bqeuVar.a = 13;
        bqeuVar.e("semantic_location_hulk_internal_session");
        bqeuVar.e = inAppTrainingConstraints;
        if (frvo.e() > 0) {
            bqeuVar.f = new TrainingInterval(0, Duration.ofSeconds(frvo.e()).toMillis());
        }
        bqet.a(a2, bqeuVar.a()).a();
        if (frvoVar.a().G()) {
            InAppTrainingConstraints inAppTrainingConstraints2 = new InAppTrainingConstraints(frvoVar2.a().x(), frvoVar2.a().w(), frvoVar.a().y());
            bqeu bqeuVar2 = new bqeu();
            bqeuVar2.b((int) frvo.c());
            bqeuVar2.d(frvoVar2.a().n());
            bqeuVar2.a = 12;
            bqeuVar2.e("semantic_location_adhoc_session");
            bqeuVar2.e = inAppTrainingConstraints2;
            if (frvo.b() > 0) {
                bqeuVar2.f = new TrainingInterval(0, Duration.ofSeconds(frvo.b()).toMillis());
            }
            bqet.a(a2, bqeuVar2.a()).a();
        }
        if (!eiif.c(frvo.q())) {
            bqet.a(a2, e(frvo.q(), "semantic_location_second_session", 5, frvo.f())).a();
        }
        if (!eiif.c(frvo.r())) {
            bqet.a(a2, e(frvo.r(), "semantic_location_third_session", 6, frvo.f())).a();
        }
        if (!eiif.c(frvo.m())) {
            InAppTrainingConstraints inAppTrainingConstraints3 = new InAppTrainingConstraints(true, true, true);
            bqeu bqeuVar3 = new bqeu();
            bqeuVar3.b((int) frvo.c());
            bqeuVar3.d(frvo.m());
            bqeuVar3.a = 13;
            bqeuVar3.e("semantic_location_fl_session");
            bqeuVar3.e = inAppTrainingConstraints3;
            if (frvo.d() > 0) {
                bqeuVar3.f = new TrainingInterval(0, Duration.ofSeconds(frvo.d()).toMillis());
            }
            bqet.a(a2, bqeuVar3.a()).a();
        }
        czjeVar.e("FederatedAnalyticsScheduleSuccess");
        return ensj.i(0);
    }

    FederatedScheduleService(czlk czlkVar, czje czjeVar) {
        this.c = czjeVar;
        this.d = czlkVar;
    }
}
