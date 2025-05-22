package com.google.android.gms.semanticlocationhistory.federated;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.federated.FederatedTaskIdentityDataService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.cauf;
import defpackage.ddcu;
import defpackage.ddcz;
import defpackage.dzwm;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fuqi;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class FederatedTaskIdentityDataService extends GmsTaskBoundService {
    private ddcu c;
    private static final ausn b = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "FederatedTaskIdentityDataService");
    public static final String a = FederatedTaskIdentityDataService.class.getName();

    public static void d(Context context) {
        casd.a(context).d("FederatedTaskIdentityDataService", a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        Context a2 = AppContextProvider.a();
        if (!fuqi.z()) {
            ((eluo) ((eluo) b.h()).ai((char) 10414)).x("Flag to run FederatedTaskIdentityDataService disabled. Not scheduling task");
            d(a2);
            return eqgc.i(2);
        }
        if (this.c == null) {
            this.c = new ddcz();
        }
        ddcu ddcuVar = this.c;
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        dzwm dzwmVar = ((ddcz) ddcuVar).a;
        ekut ekutVar = new ekut() { // from class: ddcx
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ddms ddmsVar = (ddms) obj;
                fgrc fgrcVar = (fgrc) ddmsVar.iQ(5, null);
                fgrcVar.X(ddmsVar);
                ddmr ddmrVar = (ddmr) fgrcVar;
                int size = ddmsVar.b.size();
                if (!ddmrVar.b.L()) {
                    ddmrVar.U();
                }
                ((ddms) ddmrVar.b).b = fgtj.a;
                long currentTimeMillis = System.currentTimeMillis();
                for (ddmq ddmqVar : ddmsVar.b) {
                    long days = TimeUnit.MILLISECONDS.toDays(currentTimeMillis - ddmqVar.f);
                    if (ddmqVar.e || days <= fuqi.a.lK().g()) {
                        ddmrVar.a(ddmqVar);
                    }
                }
                atomicInteger.set(size - ((ddms) ddmrVar.b).b.size());
                return (ddms) ddmrVar.Q();
            }
        };
        eqex eqexVar = eqex.a;
        return eqdl.f(eqdl.f(dzwmVar.b(ekutVar, eqexVar), new ekut() { // from class: ddcy
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                int i = ddcz.b;
                return Integer.valueOf(atomicInteger.get());
            }
        }, eqexVar), new ekut() { // from class: ddct
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                String str = FederatedTaskIdentityDataService.a;
                return 0;
            }
        }, eqexVar);
    }
}
