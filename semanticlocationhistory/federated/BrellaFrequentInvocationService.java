package com.google.android.gms.semanticlocationhistory.federated;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.InAppTrainingConstraints;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.federated.BrellaFrequentInvocationService;
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
public final class BrellaFrequentInvocationService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.federated.BrellaFrequentInvocationService";
    private static final asot d = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "FederatedScheduleService");
    public final Object b = new Object();
    public final Map c = new HashMap();
    private final czje e;
    private final czlk f;

    public BrellaFrequentInvocationService() {
        czje czjeVar = new czje();
        this.e = czjeVar;
        this.f = new czlk(czjeVar);
    }

    public static void d(Context context) {
        byjl.a(context).d("BrellaFrequentInvocationService", a);
    }

    static final InAppTrainerOptions e(String str, String str2) {
        boolean u = frvo.u();
        InAppTrainingConstraints inAppTrainingConstraints = new InAppTrainingConstraints(frvo.t(), frvo.s(), u);
        bqeu bqeuVar = new bqeu();
        bqeuVar.b((int) frvo.c());
        bqeuVar.d(str);
        bqeuVar.a = 1;
        bqeuVar.e(str2);
        bqeuVar.e = inAppTrainingConstraints;
        return bqeuVar.a();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(final byln bylnVar) {
        czje czjeVar = this.e;
        Context a2 = AppContextProvider.a();
        czjeVar.e("FederatedAnalyticsBrellaFreqInvocationServiceStarted");
        if (!frvo.A()) {
            ((ejhf) ((ejhf) d.h()).ah((char) 10391)).x("Flag to run Brella invocation disabled. Not scheduling task");
            d(a2);
            czjeVar.e("FederatedAnalyticsBrellaFreqInvocationServiceFailureServiceDisabled");
            return ensj.i(2);
        }
        if (!frxq.h() ? !this.f.J() : !this.f.g().e) {
            ((ejhf) ((ejhf) d.h()).ah((char) 10390)).x("Incognito mode enabled. Not executing Brella invocation task");
            this.e.e("FederatedAnalyticsBrellaFreqInvocationServiceFailureIncognito");
            return ensj.i(2);
        }
        if (!bwth.q(a2)) {
            ((ejhf) ((ejhf) d.h()).ah((char) 10389)).x("Device-level location setting is turned off.");
            czjeVar.e("FederatedAnalyticsBrellaFreqInvocationServiceFailureDeviceLocationDisabled");
            return ensj.i(2);
        }
        if (czlp.b(a2, this.f).isEmpty()) {
            ((ejhf) ((ejhf) d.h()).ah((char) 10388)).x("Account-level location setting is turned off.");
            czjeVar.e("FederatedAnalyticsBrellaFreqInvocationServiceFailureAccountLocationDisabled");
            return ensj.i(2);
        }
        ArrayList arrayList = new ArrayList();
        if (!eiif.c(frvo.n())) {
            arrayList.add(e(frvo.n(), "semantic_location_freq_first_session"));
        }
        if (!eiif.c(frvo.o())) {
            arrayList.add(e(frvo.o(), "semantic_location_freq_second_session"));
        }
        czjeVar.e("FederatedAnalyticsBrellaFreqInvocationServiceSuccess");
        if (arrayList.isEmpty()) {
            return ensj.i(0);
        }
        daro daroVar = new daro(a2, byhj.b.b(byhp.LOW_POWER), dasg.d(), czjeVar);
        synchronized (this.b) {
            this.c.put(bylnVar.a, daroVar);
        }
        return enps.f(daroVar.a(arrayList), new eiho() { // from class: darh
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                byln bylnVar2 = bylnVar;
                BrellaFrequentInvocationService brellaFrequentInvocationService = BrellaFrequentInvocationService.this;
                synchronized (brellaFrequentInvocationService.b) {
                    brellaFrequentInvocationService.c.remove(bylnVar2.a);
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

    BrellaFrequentInvocationService(czlk czlkVar, czje czjeVar) {
        this.e = czjeVar;
        this.f = czlkVar;
    }
}
