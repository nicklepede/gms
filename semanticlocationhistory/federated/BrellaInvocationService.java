package com.google.android.gms.semanticlocationhistory.federated;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.InAppTrainingConstraints;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.federated.BrellaInvocationService;
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
import defpackage.elpg;
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
public final class BrellaInvocationService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.federated.BrellaInvocationService";
    private static final ausn d = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "FederatedScheduleService");
    public final Object b = new Object();
    public final Map c = new HashMap();
    private final dbtc e;
    private final dbvg f;

    public BrellaInvocationService() {
        dbtc dbtcVar = new dbtc();
        this.e = dbtcVar;
        this.f = new dbvg(dbtcVar);
    }

    public static elgo d(boolean z) {
        return z ? elgo.p("BrellaInvocationServiceFirstPopulation", "BrellaInvocationServiceSecondPopulation", "BrellaInvocationServiceThirdPopulation", "BrellaInvocationServiceFourthPopulation", "BrellaInvocationServiceFifthPopulation") : elgo.l("BrellaInvocationService");
    }

    public static void e(Context context, boolean z) {
        elgo d2 = d(z);
        int i = ((elpg) d2).c;
        for (int i2 = 0; i2 < i; i2++) {
            casd.a(context).d((String) d2.get(i2), a);
        }
    }

    static final InAppTrainerOptions f(String str, String str2, int i) {
        boolean x = fuqi.x();
        InAppTrainingConstraints inAppTrainingConstraints = new InAppTrainingConstraints(fuqi.w(), fuqi.v(), x);
        bsmk bsmkVar = new bsmk();
        bsmkVar.b((int) fuqi.c());
        bsmkVar.d(str);
        bsmkVar.a = i;
        bsmkVar.e(str2);
        bsmkVar.e = inAppTrainingConstraints;
        return bsmkVar.a();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(final cauf caufVar) {
        dbtc dbtcVar = this.e;
        Context a2 = AppContextProvider.a();
        dbtcVar.e("FederatedAnalyticsBrellaInvocationServiceStarted");
        if (!fusk.g() ? !this.f.J() : !this.f.g().e) {
            ((eluo) ((eluo) d.h()).ai((char) 10400)).x("Incognito mode enabled. Not executing Brella invocation task");
            this.e.e("FederatedAnalyticsBrellaInvocationServiceFailureIncognito");
            return eqgc.i(2);
        }
        if (!bzbx.q(a2)) {
            ((eluo) ((eluo) d.h()).ai((char) 10399)).x("Device-level location setting is turned off.");
            dbtcVar.e("FederatedAnalyticsBrellaInvocationServiceFailureDeviceLocationDisabled");
            return eqgc.i(2);
        }
        if (dbvl.b(a2, this.f).isEmpty()) {
            ((eluo) ((eluo) d.h()).ai((char) 10398)).x("Account-level location setting is turned off.");
            this.e.e("FederatedAnalyticsBrellaInvocationServiceFailureAccountLocationDisabled");
            return eqgc.i(2);
        }
        String str = caufVar.a;
        ArrayList arrayList = new ArrayList();
        if (!ekvk.c(fuqi.i()) && (str.equals("BrellaInvocationServiceFirstPopulation") || str.equals("BrellaInvocationService"))) {
            arrayList.add(f(fuqi.i(), "semantic_location_addl_first_session", 7));
        }
        if (!ekvk.c(fuqi.k()) && (str.equals("BrellaInvocationServiceSecondPopulation") || str.equals("BrellaInvocationService"))) {
            arrayList.add(f(fuqi.k(), "semantic_location_addl_second_session", 8));
        }
        if (!ekvk.c(fuqi.l()) && (str.equals("BrellaInvocationServiceThirdPopulation") || str.equals("BrellaInvocationService"))) {
            arrayList.add(f(fuqi.l(), "semantic_location_addl_third_session", 9));
        }
        if (!ekvk.c(fuqi.j()) && (str.equals("BrellaInvocationServiceFourthPopulation") || str.equals("BrellaInvocationService"))) {
            arrayList.add(f(fuqi.j(), "semantic_location_addl_fourth_session", 10));
        }
        if (!ekvk.c(fuqi.h()) && (str.equals("BrellaInvocationServiceFifthPopulation") || str.equals("BrellaInvocationService"))) {
            arrayList.add(f(fuqi.h(), "semantic_location_addl_fifth_session", 11));
        }
        dbtcVar.e("FederatedAnalyticsBrellaInvocationServiceSuccess");
        if (arrayList.isEmpty()) {
            return eqgc.i(0);
        }
        ddbw ddbwVar = new ddbw(a2, caqb.b.b(caqh.LOW_POWER), ddco.d(), dbtcVar);
        synchronized (this.b) {
            this.c.put(str, ddbwVar);
        }
        return eqdl.f(ddbwVar.a(arrayList), new ekut() { // from class: ddbx
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                cauf caufVar2 = caufVar;
                BrellaInvocationService brellaInvocationService = BrellaInvocationService.this;
                synchronized (brellaInvocationService.b) {
                    brellaInvocationService.c.remove(caufVar2.a);
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

    BrellaInvocationService(dbvg dbvgVar, dbtc dbtcVar) {
        this.e = dbtcVar;
        this.f = dbvgVar;
    }
}
