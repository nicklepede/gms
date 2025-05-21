package com.google.android.gms.semanticlocationhistory.federated;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.InAppTrainingConstraints;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.federated.BrellaInvocationService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bqeu;
import defpackage.bwth;
import defpackage.byhj;
import defpackage.byhp;
import defpackage.byjl;
import defpackage.byln;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czlp;
import defpackage.daro;
import defpackage.dasg;
import defpackage.eiho;
import defpackage.eiif;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.frvo;
import defpackage.frxq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class BrellaInvocationService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.federated.BrellaInvocationService";
    private static final asot d = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "FederatedScheduleService");
    public final Object b = new Object();
    public final Map c = new HashMap();
    private final czje e;
    private final czlk f;

    public BrellaInvocationService() {
        czje czjeVar = new czje();
        this.e = czjeVar;
        this.f = new czlk(czjeVar);
    }

    public static eitj d(boolean z) {
        return z ? eitj.p("BrellaInvocationServiceFirstPopulation", "BrellaInvocationServiceSecondPopulation", "BrellaInvocationServiceThirdPopulation", "BrellaInvocationServiceFourthPopulation", "BrellaInvocationServiceFifthPopulation") : eitj.l("BrellaInvocationService");
    }

    public static void e(Context context, boolean z) {
        eitj d2 = d(z);
        int i = ((ejcb) d2).c;
        for (int i2 = 0; i2 < i; i2++) {
            byjl.a(context).d((String) d2.get(i2), a);
        }
    }

    static final InAppTrainerOptions f(String str, String str2, int i) {
        boolean x = frvo.x();
        InAppTrainingConstraints inAppTrainingConstraints = new InAppTrainingConstraints(frvo.w(), frvo.v(), x);
        bqeu bqeuVar = new bqeu();
        bqeuVar.b((int) frvo.c());
        bqeuVar.d(str);
        bqeuVar.a = i;
        bqeuVar.e(str2);
        bqeuVar.e = inAppTrainingConstraints;
        return bqeuVar.a();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(final byln bylnVar) {
        czje czjeVar = this.e;
        Context a2 = AppContextProvider.a();
        czjeVar.e("FederatedAnalyticsBrellaInvocationServiceStarted");
        if (!frxq.h() ? !this.f.J() : !this.f.g().e) {
            ((ejhf) ((ejhf) d.h()).ah((char) 10394)).x("Incognito mode enabled. Not executing Brella invocation task");
            this.e.e("FederatedAnalyticsBrellaInvocationServiceFailureIncognito");
            return ensj.i(2);
        }
        if (!bwth.q(a2)) {
            ((ejhf) ((ejhf) d.h()).ah((char) 10393)).x("Device-level location setting is turned off.");
            czjeVar.e("FederatedAnalyticsBrellaInvocationServiceFailureDeviceLocationDisabled");
            return ensj.i(2);
        }
        if (czlp.b(a2, this.f).isEmpty()) {
            ((ejhf) ((ejhf) d.h()).ah((char) 10392)).x("Account-level location setting is turned off.");
            this.e.e("FederatedAnalyticsBrellaInvocationServiceFailureAccountLocationDisabled");
            return ensj.i(2);
        }
        String str = bylnVar.a;
        ArrayList arrayList = new ArrayList();
        if (!eiif.c(frvo.i()) && (str.equals("BrellaInvocationServiceFirstPopulation") || str.equals("BrellaInvocationService"))) {
            arrayList.add(f(frvo.i(), "semantic_location_addl_first_session", 7));
        }
        if (!eiif.c(frvo.k()) && (str.equals("BrellaInvocationServiceSecondPopulation") || str.equals("BrellaInvocationService"))) {
            arrayList.add(f(frvo.k(), "semantic_location_addl_second_session", 8));
        }
        if (!eiif.c(frvo.l()) && (str.equals("BrellaInvocationServiceThirdPopulation") || str.equals("BrellaInvocationService"))) {
            arrayList.add(f(frvo.l(), "semantic_location_addl_third_session", 9));
        }
        if (!eiif.c(frvo.j()) && (str.equals("BrellaInvocationServiceFourthPopulation") || str.equals("BrellaInvocationService"))) {
            arrayList.add(f(frvo.j(), "semantic_location_addl_fourth_session", 10));
        }
        if (!eiif.c(frvo.h()) && (str.equals("BrellaInvocationServiceFifthPopulation") || str.equals("BrellaInvocationService"))) {
            arrayList.add(f(frvo.h(), "semantic_location_addl_fifth_session", 11));
        }
        czjeVar.e("FederatedAnalyticsBrellaInvocationServiceSuccess");
        if (arrayList.isEmpty()) {
            return ensj.i(0);
        }
        daro daroVar = new daro(a2, byhj.b.b(byhp.LOW_POWER), dasg.d(), czjeVar);
        synchronized (this.b) {
            this.c.put(str, daroVar);
        }
        return enps.f(daroVar.a(arrayList), new eiho() { // from class: darp
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                byln bylnVar2 = bylnVar;
                BrellaInvocationService brellaInvocationService = BrellaInvocationService.this;
                synchronized (brellaInvocationService.b) {
                    brellaInvocationService.c.remove(bylnVar2.a);
                }
                return 0;
            }
        }, enre.a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        eitj i;
        synchronized (this.b) {
            Map map = this.c;
            i = eitj.i(map.values());
            map.clear();
        }
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((daro) i.get(i2)).b();
        }
        super.onDestroy();
    }

    BrellaInvocationService(czlk czlkVar, czje czjeVar) {
        this.e = czjeVar;
        this.f = czlkVar;
    }
}
