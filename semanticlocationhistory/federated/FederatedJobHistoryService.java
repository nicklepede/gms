package com.google.android.gms.semanticlocationhistory.federated;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.federated.FederatedJobHistoryService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.cauf;
import defpackage.ddcc;
import defpackage.ddco;
import defpackage.dzwm;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fgub;
import defpackage.fgvm;
import defpackage.fgvq;
import defpackage.fuqi;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class FederatedJobHistoryService extends GmsTaskBoundService {
    private ddcc c;
    private static final ausn b = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "FederatedJobHistoryService");
    public static final String a = FederatedJobHistoryService.class.getName();

    public static void d(Context context) {
        casd.a(context).d("FederatedJobHistoryService", a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        Context a2 = AppContextProvider.a();
        if (!fuqi.z()) {
            ((eluo) ((eluo) b.h()).ai((char) 10403)).x("Flag to run FederatedJobHistoryService disabled. Not scheduling task");
            d(a2);
            return eqgc.i(2);
        }
        if (this.c == null) {
            this.c = ddco.d();
        }
        ddcc ddccVar = this.c;
        final fgub m = fgvq.m(fgvq.h(System.currentTimeMillis()), fgvm.i(fuqi.a.lK().h()));
        dzwm dzwmVar = ((ddco) ddccVar).a;
        ekut ekutVar = new ekut() { // from class: ddci
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                fgub fgubVar;
                ddmo ddmoVar = (ddmo) obj;
                fgrc fgrcVar = (fgrc) ddmoVar.iQ(5, null);
                fgrcVar.X(ddmoVar);
                ddmk ddmkVar = (ddmk) fgrcVar;
                int i = elgo.d;
                elgj elgjVar = new elgj();
                Iterator it = DesugarCollections.unmodifiableMap(ddmoVar.c).entrySet().iterator();
                while (true) {
                    fgubVar = fgub.this;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    fgub fgubVar2 = ((ddmp) entry.getValue()).c;
                    if (fgubVar2 == null) {
                        fgubVar2 = fgub.a;
                    }
                    fgub fgubVar3 = ((ddmp) entry.getValue()).d;
                    if (fgubVar3 == null) {
                        fgubVar3 = fgub.a;
                    }
                    fgub fgubVar4 = fgvq.a;
                    int a3 = fgvp.a(fgubVar, fgubVar2);
                    int a4 = fgvp.a(fgubVar, fgubVar3);
                    if (a3 >= 0 && a4 >= 0) {
                        elgjVar.i((String) entry.getKey());
                    }
                }
                elgo g = elgjVar.g();
                int i2 = ((elpg) g).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    String str = (String) g.get(i3);
                    str.getClass();
                    if (!ddmkVar.b.L()) {
                        ddmkVar.U();
                    }
                    ((ddmo) ddmkVar.b).b().remove(str);
                }
                elgj elgjVar2 = new elgj();
                for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(ddmoVar.e).entrySet()) {
                    fgub fgubVar5 = ((ddme) entry2.getValue()).c;
                    if (fgubVar5 == null) {
                        fgubVar5 = fgub.a;
                    }
                    fgub fgubVar6 = fgvq.a;
                    if (fgvp.a(fgubVar5, fgubVar) < 0) {
                        elgjVar2.i((String) entry2.getKey());
                    }
                }
                elgo g2 = elgjVar2.g();
                int i4 = ((elpg) g2).c;
                for (int i5 = 0; i5 < i4; i5++) {
                    String str2 = (String) g2.get(i5);
                    str2.getClass();
                    if (!ddmkVar.b.L()) {
                        ddmkVar.U();
                    }
                    ((ddmo) ddmkVar.b).c().remove(str2);
                }
                if (fuqi.E()) {
                    elgj elgjVar3 = new elgj();
                    for (Map.Entry entry3 : DesugarCollections.unmodifiableMap(ddmoVar.f).entrySet()) {
                        ddmu ddmuVar = (ddmu) entry3.getValue();
                        ddmi ddmiVar = ddmuVar.c;
                        if (ddmiVar == null) {
                            ddmiVar = ddmi.a;
                        }
                        boolean h = ddco.h(fgubVar, ddmiVar);
                        boolean z = true;
                        if (!ddco.f(ddmuVar).isEmpty()) {
                            ddmi ddmiVar2 = ddmuVar.d;
                            if (ddmiVar2 == null) {
                                ddmiVar2 = ddmi.a;
                            }
                            if (!ddco.h(fgubVar, ddmiVar2)) {
                                z = false;
                            }
                        }
                        if (h && z) {
                            elgjVar3.i((String) entry3.getKey());
                        }
                    }
                    elgo g3 = elgjVar3.g();
                    int i6 = ((elpg) g3).c;
                    for (int i7 = 0; i7 < i6; i7++) {
                        String str3 = (String) g3.get(i7);
                        str3.getClass();
                        if (!ddmkVar.b.L()) {
                            ddmkVar.U();
                        }
                        ((ddmo) ddmkVar.b).d().remove(str3);
                    }
                }
                return (ddmo) ddmkVar.Q();
            }
        };
        eqex eqexVar = eqex.a;
        return eqdl.f(dzwmVar.b(ekutVar, eqexVar), new ekut() { // from class: ddcb
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                String str = FederatedJobHistoryService.a;
                return 0;
            }
        }, eqexVar);
    }
}
