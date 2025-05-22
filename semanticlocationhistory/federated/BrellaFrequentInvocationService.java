package com.google.android.gms.semanticlocationhistory.federated;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.InAppTrainingConstraints;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.federated.BrellaFrequentInvocationService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bsmk;
import defpackage.bzbx;
import defpackage.caqb;
import defpackage.caqh;
import defpackage.casd;
import defpackage.cauf;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dbvl;
import defpackage.ddbw;
import defpackage.ddco;
import defpackage.ekut;
import defpackage.ekvk;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fuqi;
import defpackage.fusk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class BrellaFrequentInvocationService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.federated.BrellaFrequentInvocationService";
    private static final ausn d = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "FederatedScheduleService");
    public final Object b = new Object();
    public final Map c = new HashMap();
    private final dbtc e;
    private final dbvg f;

    public BrellaFrequentInvocationService() {
        dbtc dbtcVar = new dbtc();
        this.e = dbtcVar;
        this.f = new dbvg(dbtcVar);
    }

    public static void d(Context context) {
        casd.a(context).d("BrellaFrequentInvocationService", a);
    }

    static final InAppTrainerOptions e(String str, String str2) {
        boolean u = fuqi.u();
        InAppTrainingConstraints inAppTrainingConstraints = new InAppTrainingConstraints(fuqi.t(), fuqi.s(), u);
        bsmk bsmkVar = new bsmk();
        bsmkVar.b((int) fuqi.c());
        bsmkVar.d(str);
        bsmkVar.a = 1;
        bsmkVar.e(str2);
        bsmkVar.e = inAppTrainingConstraints;
        return bsmkVar.a();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(final cauf caufVar) {
        dbtc dbtcVar = this.e;
        Context a2 = AppContextProvider.a();
        dbtcVar.e("FederatedAnalyticsBrellaFreqInvocationServiceStarted");
        if (!fuqi.A()) {
            ((eluo) ((eluo) d.h()).ai((char) 10397)).x("Flag to run Brella invocation disabled. Not scheduling task");
            d(a2);
            dbtcVar.e("FederatedAnalyticsBrellaFreqInvocationServiceFailureServiceDisabled");
            return eqgc.i(2);
        }
        if (!fusk.g() ? !this.f.J() : !this.f.g().e) {
            ((eluo) ((eluo) d.h()).ai((char) 10396)).x("Incognito mode enabled. Not executing Brella invocation task");
            this.e.e("FederatedAnalyticsBrellaFreqInvocationServiceFailureIncognito");
            return eqgc.i(2);
        }
        if (!bzbx.q(a2)) {
            ((eluo) ((eluo) d.h()).ai((char) 10395)).x("Device-level location setting is turned off.");
            dbtcVar.e("FederatedAnalyticsBrellaFreqInvocationServiceFailureDeviceLocationDisabled");
            return eqgc.i(2);
        }
        if (dbvl.b(a2, this.f).isEmpty()) {
            ((eluo) ((eluo) d.h()).ai((char) 10394)).x("Account-level location setting is turned off.");
            dbtcVar.e("FederatedAnalyticsBrellaFreqInvocationServiceFailureAccountLocationDisabled");
            return eqgc.i(2);
        }
        ArrayList arrayList = new ArrayList();
        if (!ekvk.c(fuqi.n())) {
            arrayList.add(e(fuqi.n(), "semantic_location_freq_first_session"));
        }
        if (!ekvk.c(fuqi.o())) {
            arrayList.add(e(fuqi.o(), "semantic_location_freq_second_session"));
        }
        dbtcVar.e("FederatedAnalyticsBrellaFreqInvocationServiceSuccess");
        if (arrayList.isEmpty()) {
            return eqgc.i(0);
        }
        ddbw ddbwVar = new ddbw(a2, caqb.b.b(caqh.LOW_POWER), ddco.d(), dbtcVar);
        synchronized (this.b) {
            this.c.put(caufVar.a, ddbwVar);
        }
        return eqdl.f(ddbwVar.a(arrayList), new ekut() { // from class: ddbp
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                cauf caufVar2 = caufVar;
                BrellaFrequentInvocationService brellaFrequentInvocationService = BrellaFrequentInvocationService.this;
                synchronized (brellaFrequentInvocationService.b) {
                    brellaFrequentInvocationService.c.remove(caufVar2.a);
                }
                return 0;
            }
        }, eqex.a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        elgo i;
        synchronized (this.b) {
            Map map = this.c;
            i = elgo.i(map.values());
            map.clear();
        }
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ddbw) i.get(i2)).b();
        }
        super.onDestroy();
    }

    BrellaFrequentInvocationService(dbvg dbvgVar, dbtc dbtcVar) {
        this.e = dbtcVar;
        this.f = dbvgVar;
    }
}
