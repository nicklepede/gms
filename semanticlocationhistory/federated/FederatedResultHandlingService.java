package com.google.android.gms.semanticlocationhistory.federated;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.ExampleConsumption;
import defpackage.asej;
import defpackage.asot;
import defpackage.bqer;
import defpackage.bqey;
import defpackage.czje;
import defpackage.daru;
import defpackage.dasg;
import defpackage.dasj;
import defpackage.dauj;
import defpackage.daxu;
import defpackage.eius;
import defpackage.eiuu;
import defpackage.ejhf;
import defpackage.enre;
import defpackage.ensj;
import defpackage.ensm;
import defpackage.enss;
import defpackage.esuu;
import defpackage.evok;
import defpackage.evos;
import defpackage.evot;
import defpackage.feag;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class FederatedResultHandlingService extends bqer {
    public static final asot a = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "FederatedResultHandlingService");
    private czje b;
    private daru c;

    public FederatedResultHandlingService() {
    }

    private final czje b() {
        if (this.b == null) {
            this.b = new czje();
        }
        return this.b;
    }

    private final daru c() {
        if (this.c == null) {
            this.c = dasg.d();
        }
        return this.c;
    }

    @Override // defpackage.bqer
    public final void a(boolean z, List list, bqey bqeyVar) {
        Optional empty;
        Optional empty2;
        if (!z) {
            bqeyVar.a(Status.b);
            return;
        }
        final eius eiusVar = new eius();
        final eius eiusVar2 = new eius();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = ((ExampleConsumption) it.next()).b;
            feag a2 = esuu.a(bArr);
            if (a2 == null) {
                try {
                    fecp y = fecp.y(feag.a, bArr, 0, bArr.length, febw.a());
                    fecp.M(y);
                    a2 = (feag) y;
                } catch (fedk unused) {
                    ((ejhf) ((ejhf) a.j()).ah((char) 10403)).x("Error parsing Any proto from the selection criteria.");
                    b().e("ExampleStoreSelectionCriteriaParseFail");
                }
            }
            if (a2.b.equals("type.googleapis.com/location.hulk.aggregates.federated.proto.examplestore.SelectionCriteria")) {
                evok evokVar = evok.a;
                try {
                    evok a3 = dauj.a(a2);
                    b().k("ExampleStoreSelectionCriteriaParseSuccessPerTask", a3.d);
                    if (dauj.i(a3)) {
                        b().k("ExampleStoreSelectionCriteriaValidPerTask", a3.d);
                        empty = Optional.of(a3.c);
                    } else {
                        ((ejhf) ((ejhf) a.j()).ah((char) 10399)).x("SelectionCriteria is invalid.");
                        b().k("ExampleStoreSelectionCriteriaInvalidPerTask", a3.d);
                        empty = Optional.empty();
                    }
                } catch (fedk unused2) {
                    ((ejhf) ((ejhf) a.j()).ah((char) 10400)).x("Error parsing SelectionCriteria proto.");
                    b().e("ExampleStoreSelectionCriteriaParseFail");
                    empty = Optional.empty();
                }
                Objects.requireNonNull(eiusVar);
                empty.ifPresent(new Consumer() { // from class: dasi
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void q(Object obj) {
                        eius.this.c((String) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else if (daxu.b(a2)) {
                evot evotVar = evot.a;
                try {
                    evot a4 = daxu.a(a2);
                    czje b = b();
                    evos evosVar = a4.c;
                    if (evosVar == null) {
                        evosVar = evos.a;
                    }
                    b.k("ExampleStoreSelectionCriteriaParseSuccessPerTask", evosVar.c);
                    if (daxu.c(a4)) {
                        evos evosVar2 = a4.c;
                        if (evosVar2 == null) {
                            evosVar2 = evos.a;
                        }
                        empty2 = Optional.of(evosVar2.b);
                    } else {
                        ((ejhf) ((ejhf) a.j()).ah((char) 10401)).x("SelectionCriteria is invalid.");
                        czje b2 = b();
                        evos evosVar3 = a4.c;
                        if (evosVar3 == null) {
                            evosVar3 = evos.a;
                        }
                        b2.k("ExampleStoreSelectionCriteriaInvalidPerTask", evosVar3.c);
                        empty2 = Optional.empty();
                    }
                } catch (fedk unused3) {
                    ((ejhf) ((ejhf) a.j()).ah((char) 10402)).x("Error parsing TransientSelectionCriteria proto.");
                    b().e("ExampleStoreSelectionCriteriaParseFail");
                    empty2 = Optional.empty();
                }
                Objects.requireNonNull(eiusVar2);
                empty2.ifPresent(new Consumer() { // from class: dasi
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void q(Object obj) {
                        eius.this.c((String) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
        eiuu g = eiusVar.g();
        eiuu g2 = eiusVar2.g();
        if (g.isEmpty() && g2.isEmpty()) {
            bqeyVar.a(Status.b);
            return;
        }
        enss[] enssVarArr = new enss[2];
        enssVarArr[0] = g.isEmpty() ? ensm.a : c().b(g);
        enssVarArr[1] = g2.isEmpty() ? ensm.a : c().c(g2);
        ensj.t(ensj.p(enssVarArr), new dasj(bqeyVar), enre.a);
    }

    public FederatedResultHandlingService(daru daruVar) {
        this.c = daruVar;
    }
}
