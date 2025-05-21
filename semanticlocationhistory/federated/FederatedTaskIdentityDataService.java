package com.google.android.gms.semanticlocationhistory.federated;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.federated.FederatedTaskIdentityDataService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byln;
import defpackage.dasm;
import defpackage.dasr;
import defpackage.dxkm;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.frvo;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class FederatedTaskIdentityDataService extends GmsTaskBoundService {
    private dasm c;
    private static final asot b = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "FederatedTaskIdentityDataService");
    public static final String a = FederatedTaskIdentityDataService.class.getName();

    public static void d(Context context) {
        byjl.a(context).d("FederatedTaskIdentityDataService", a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        Context a2 = AppContextProvider.a();
        if (!frvo.z()) {
            ((ejhf) ((ejhf) b.h()).ah((char) 10408)).x("Flag to run FederatedTaskIdentityDataService disabled. Not scheduling task");
            d(a2);
            return ensj.i(2);
        }
        if (this.c == null) {
            this.c = new dasr();
        }
        dasm dasmVar = this.c;
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        dxkm dxkmVar = ((dasr) dasmVar).a;
        eiho eihoVar = new eiho() { // from class: dasp
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                dbck dbckVar = (dbck) obj;
                fecj fecjVar = (fecj) dbckVar.iB(5, null);
                fecjVar.X(dbckVar);
                dbcj dbcjVar = (dbcj) fecjVar;
                int size = dbckVar.b.size();
                if (!dbcjVar.b.L()) {
                    dbcjVar.U();
                }
                ((dbck) dbcjVar.b).b = feeq.a;
                long currentTimeMillis = System.currentTimeMillis();
                for (dbci dbciVar : dbckVar.b) {
                    long days = TimeUnit.MILLISECONDS.toDays(currentTimeMillis - dbciVar.f);
                    if (dbciVar.e || days <= frvo.a.a().g()) {
                        dbcjVar.a(dbciVar);
                    }
                }
                atomicInteger.set(size - ((dbck) dbcjVar.b).b.size());
                return (dbck) dbcjVar.Q();
            }
        };
        enre enreVar = enre.a;
        return enps.f(enps.f(dxkmVar.b(eihoVar, enreVar), new eiho() { // from class: dasq
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                int i = dasr.b;
                return Integer.valueOf(atomicInteger.get());
            }
        }, enreVar), new eiho() { // from class: dasl
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                String str = FederatedTaskIdentityDataService.a;
                return 0;
            }
        }, enreVar);
    }
}
