package com.google.android.gms.semanticlocationhistory.federated;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.federated.FederatedJobHistoryService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byln;
import defpackage.daru;
import defpackage.dasg;
import defpackage.dxkm;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fefi;
import defpackage.fegt;
import defpackage.fegx;
import defpackage.frvo;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class FederatedJobHistoryService extends GmsTaskBoundService {
    private daru c;
    private static final asot b = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "FederatedJobHistoryService");
    public static final String a = FederatedJobHistoryService.class.getName();

    public static void d(Context context) {
        byjl.a(context).d("FederatedJobHistoryService", a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        Context a2 = AppContextProvider.a();
        if (!frvo.z()) {
            ((ejhf) ((ejhf) b.h()).ah((char) 10397)).x("Flag to run FederatedJobHistoryService disabled. Not scheduling task");
            d(a2);
            return ensj.i(2);
        }
        if (this.c == null) {
            this.c = dasg.d();
        }
        daru daruVar = this.c;
        final fefi m = fegx.m(fegx.h(System.currentTimeMillis()), fegt.i(frvo.a.a().h()));
        dxkm dxkmVar = ((dasg) daruVar).a;
        eiho eihoVar = new eiho() { // from class: dasa
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                fefi fefiVar;
                dbcg dbcgVar = (dbcg) obj;
                fecj fecjVar = (fecj) dbcgVar.iB(5, null);
                fecjVar.X(dbcgVar);
                dbcc dbccVar = (dbcc) fecjVar;
                int i = eitj.d;
                eite eiteVar = new eite();
                Iterator it = DesugarCollections.unmodifiableMap(dbcgVar.c).entrySet().iterator();
                while (true) {
                    fefiVar = fefi.this;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    fefi fefiVar2 = ((dbch) entry.getValue()).c;
                    if (fefiVar2 == null) {
                        fefiVar2 = fefi.a;
                    }
                    fefi fefiVar3 = ((dbch) entry.getValue()).d;
                    if (fefiVar3 == null) {
                        fefiVar3 = fefi.a;
                    }
                    fefi fefiVar4 = fegx.a;
                    int a3 = fegw.a(fefiVar, fefiVar2);
                    int a4 = fegw.a(fefiVar, fefiVar3);
                    if (a3 >= 0 && a4 >= 0) {
                        eiteVar.i((String) entry.getKey());
                    }
                }
                eitj g = eiteVar.g();
                int i2 = ((ejcb) g).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    String str = (String) g.get(i3);
                    str.getClass();
                    if (!dbccVar.b.L()) {
                        dbccVar.U();
                    }
                    ((dbcg) dbccVar.b).b().remove(str);
                }
                eite eiteVar2 = new eite();
                for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(dbcgVar.e).entrySet()) {
                    fefi fefiVar5 = ((dbbw) entry2.getValue()).c;
                    if (fefiVar5 == null) {
                        fefiVar5 = fefi.a;
                    }
                    fefi fefiVar6 = fegx.a;
                    if (fegw.a(fefiVar5, fefiVar) < 0) {
                        eiteVar2.i((String) entry2.getKey());
                    }
                }
                eitj g2 = eiteVar2.g();
                int i4 = ((ejcb) g2).c;
                for (int i5 = 0; i5 < i4; i5++) {
                    String str2 = (String) g2.get(i5);
                    str2.getClass();
                    if (!dbccVar.b.L()) {
                        dbccVar.U();
                    }
                    ((dbcg) dbccVar.b).c().remove(str2);
                }
                if (frvo.E()) {
                    eite eiteVar3 = new eite();
                    for (Map.Entry entry3 : DesugarCollections.unmodifiableMap(dbcgVar.f).entrySet()) {
                        dbcm dbcmVar = (dbcm) entry3.getValue();
                        dbca dbcaVar = dbcmVar.c;
                        if (dbcaVar == null) {
                            dbcaVar = dbca.a;
                        }
                        boolean h = dasg.h(fefiVar, dbcaVar);
                        boolean z = true;
                        if (!dasg.f(dbcmVar).isEmpty()) {
                            dbca dbcaVar2 = dbcmVar.d;
                            if (dbcaVar2 == null) {
                                dbcaVar2 = dbca.a;
                            }
                            if (!dasg.h(fefiVar, dbcaVar2)) {
                                z = false;
                            }
                        }
                        if (h && z) {
                            eiteVar3.i((String) entry3.getKey());
                        }
                    }
                    eitj g3 = eiteVar3.g();
                    int i6 = ((ejcb) g3).c;
                    for (int i7 = 0; i7 < i6; i7++) {
                        String str3 = (String) g3.get(i7);
                        str3.getClass();
                        if (!dbccVar.b.L()) {
                            dbccVar.U();
                        }
                        ((dbcg) dbccVar.b).d().remove(str3);
                    }
                }
                return (dbcg) dbccVar.Q();
            }
        };
        enre enreVar = enre.a;
        return enps.f(dxkmVar.b(eihoVar, enreVar), new eiho() { // from class: dart
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                String str = FederatedJobHistoryService.a;
                return 0;
            }
        }, enreVar);
    }
}
