package com.google.android.gms.semanticlocationhistory.federated;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.ExampleConsumption;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bsmh;
import defpackage.bsmo;
import defpackage.dbtc;
import defpackage.ddcc;
import defpackage.ddco;
import defpackage.ddcr;
import defpackage.dder;
import defpackage.ddic;
import defpackage.elhx;
import defpackage.elhz;
import defpackage.eluo;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.evkk;
import defpackage.eyeg;
import defpackage.eyeo;
import defpackage.eyep;
import defpackage.fgoz;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class FederatedResultHandlingService extends bsmh {
    public static final ausn a = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "FederatedResultHandlingService");
    private dbtc b;
    private ddcc c;

    public FederatedResultHandlingService() {
    }

    private final dbtc b() {
        if (this.b == null) {
            this.b = new dbtc();
        }
        return this.b;
    }

    private final ddcc c() {
        if (this.c == null) {
            this.c = ddco.d();
        }
        return this.c;
    }

    @Override // defpackage.bsmh
    public final void a(boolean z, List list, bsmo bsmoVar) {
        Optional empty;
        Optional empty2;
        if (!z) {
            bsmoVar.a(Status.b);
            return;
        }
        final elhx elhxVar = new elhx();
        final elhx elhxVar2 = new elhx();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = ((ExampleConsumption) it.next()).b;
            fgoz a2 = evkk.a(bArr);
            if (a2 == null) {
                try {
                    fgri y = fgri.y(fgoz.a, bArr, 0, bArr.length, fgqp.a());
                    fgri.M(y);
                    a2 = (fgoz) y;
                } catch (fgsd unused) {
                    ((eluo) ((eluo) a.j()).ai((char) 10409)).x("Error parsing Any proto from the selection criteria.");
                    b().e("ExampleStoreSelectionCriteriaParseFail");
                }
            }
            if (a2.b.equals("type.googleapis.com/location.hulk.aggregates.federated.proto.examplestore.SelectionCriteria")) {
                eyeg eyegVar = eyeg.a;
                try {
                    eyeg a3 = dder.a(a2);
                    b().k("ExampleStoreSelectionCriteriaParseSuccessPerTask", a3.d);
                    if (dder.i(a3)) {
                        b().k("ExampleStoreSelectionCriteriaValidPerTask", a3.d);
                        empty = Optional.of(a3.c);
                    } else {
                        ((eluo) ((eluo) a.j()).ai((char) 10405)).x("SelectionCriteria is invalid.");
                        b().k("ExampleStoreSelectionCriteriaInvalidPerTask", a3.d);
                        empty = Optional.empty();
                    }
                } catch (fgsd unused2) {
                    ((eluo) ((eluo) a.j()).ai((char) 10406)).x("Error parsing SelectionCriteria proto.");
                    b().e("ExampleStoreSelectionCriteriaParseFail");
                    empty = Optional.empty();
                }
                Objects.requireNonNull(elhxVar);
                empty.ifPresent(new Consumer() { // from class: ddcq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void u(Object obj) {
                        elhx.this.c((String) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else if (ddic.b(a2)) {
                eyep eyepVar = eyep.a;
                try {
                    eyep a4 = ddic.a(a2);
                    dbtc b = b();
                    eyeo eyeoVar = a4.c;
                    if (eyeoVar == null) {
                        eyeoVar = eyeo.a;
                    }
                    b.k("ExampleStoreSelectionCriteriaParseSuccessPerTask", eyeoVar.c);
                    if (ddic.c(a4)) {
                        eyeo eyeoVar2 = a4.c;
                        if (eyeoVar2 == null) {
                            eyeoVar2 = eyeo.a;
                        }
                        empty2 = Optional.of(eyeoVar2.b);
                    } else {
                        ((eluo) ((eluo) a.j()).ai((char) 10407)).x("SelectionCriteria is invalid.");
                        dbtc b2 = b();
                        eyeo eyeoVar3 = a4.c;
                        if (eyeoVar3 == null) {
                            eyeoVar3 = eyeo.a;
                        }
                        b2.k("ExampleStoreSelectionCriteriaInvalidPerTask", eyeoVar3.c);
                        empty2 = Optional.empty();
                    }
                } catch (fgsd unused3) {
                    ((eluo) ((eluo) a.j()).ai((char) 10408)).x("Error parsing TransientSelectionCriteria proto.");
                    b().e("ExampleStoreSelectionCriteriaParseFail");
                    empty2 = Optional.empty();
                }
                Objects.requireNonNull(elhxVar2);
                empty2.ifPresent(new Consumer() { // from class: ddcq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void u(Object obj) {
                        elhx.this.c((String) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
        elhz g = elhxVar.g();
        elhz g2 = elhxVar2.g();
        if (g.isEmpty() && g2.isEmpty()) {
            bsmoVar.a(Status.b);
            return;
        }
        eqgl[] eqglVarArr = new eqgl[2];
        eqglVarArr[0] = g.isEmpty() ? eqgf.a : c().b(g);
        eqglVarArr[1] = g2.isEmpty() ? eqgf.a : c().c(g2);
        eqgc.t(eqgc.p(eqglVarArr), new ddcr(bsmoVar), eqex.a);
    }

    public FederatedResultHandlingService(ddcc ddccVar) {
        this.c = ddccVar;
    }
}
