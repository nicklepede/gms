package com.google.android.gms.locationsharingreporter.service.reporting.semantic;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import com.google.android.gms.locationsharingreporter.service.reporting.semantic.SemanticLocationIntentOperation;
import com.google.android.gms.semanticlocation.PlaceCandidate;
import com.google.android.gms.semanticlocation.PlaceEnterEvent;
import com.google.android.gms.semanticlocation.PlaceOngoingEvent;
import com.google.android.gms.semanticlocation.SemanticLocationEvent;
import com.google.android.gms.semanticlocation.SemanticLocationState;
import defpackage.asej;
import defpackage.asot;
import defpackage.cavm;
import defpackage.cayn;
import defpackage.cbbn;
import defpackage.cbbo;
import defpackage.cbbp;
import defpackage.cbel;
import defpackage.cbem;
import defpackage.cben;
import defpackage.ebfg;
import defpackage.ebfl;
import defpackage.ebgd;
import defpackage.eiif;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.fpws;
import defpackage.fpxh;
import defpackage.fpxm;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class SemanticLocationIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("LSR", asej.LOCATION_SHARING_REPORTER);

    private static boolean a(Account account, cayn caynVar) {
        try {
            if (((Set) ((enpf) cavm.c().a()).v(fpws.i(), TimeUnit.MILLISECONDS)).contains(account.name)) {
                return false;
            }
            ((ejhf) ((ejhf) b.h()).ah((char) 6008)).x("Account no longer sharing location, so clearing any cached semantic location and unsubscribing from CSL updates");
            caynVar.d(account);
            cbel.a(AppContextProvider.a(), account).b(cben.a(account));
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 6009)).x("Error reading accounts sharing location");
            return false;
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fpxm.c()) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.semantic.EXTRA_ACCOUNT");
            if (eiif.c(stringExtra)) {
                ((ejhf) ((ejhf) b.j()).ah((char) 6007)).x("Semantic location update without account extra");
                return;
            }
            int i = cbbn.a;
            if (fpxh.v()) {
                fecj v = ebgd.a.v();
                ebfl b2 = cbbp.b();
                if (!v.b.L()) {
                    v.U();
                }
                ebgd ebgdVar = (ebgd) v.b;
                b2.getClass();
                fedh fedhVar = ebgdVar.y;
                if (!fedhVar.c()) {
                    ebgdVar.y = fecp.E(fedhVar);
                }
                ebgdVar.y.add(b2);
                ebgd ebgdVar2 = (ebgd) v.Q();
                fecj v2 = ebfg.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                ebfg ebfgVar = (ebfg) v2.b;
                ebgdVar2.getClass();
                ebfgVar.c = ebgdVar2;
                ebfgVar.b = 1;
                cbbo.b(stringExtra, (ebfg) v2.Q());
            }
            Account account = new Account(stringExtra, "com.google");
            cayn a2 = cayn.a();
            if (a(account, a2)) {
                return;
            }
            SemanticLocationState a3 = SemanticLocationState.a(intent);
            if (a3 == null) {
                ((ejhf) ((ejhf) b.j()).ah((char) 6004)).x("Semantic location update without semantic location state");
                a2.d(account);
                return;
            }
            List list = a3.b;
            if (list.isEmpty()) {
                ((ejhf) ((ejhf) b.j()).ah((char) 6003)).x("Semantic location update without semantic location events");
                a2.d(account);
                return;
            }
            Optional max = Collection.EL.stream(list).filter(new Predicate() { // from class: cbeo
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo463negate() {
                    return Predicate$CC.$default$negate(this);
                }

                @Override // java.util.function.Predicate
                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    SemanticLocationEvent semanticLocationEvent = (SemanticLocationEvent) obj;
                    int i2 = semanticLocationEvent.c;
                    int i3 = SemanticLocationIntentOperation.a;
                    if (i2 != 1) {
                        if (i2 != 3) {
                            return false;
                        }
                        i2 = 3;
                    }
                    if (cbem.a(semanticLocationEvent) >= fpxm.a.a().c()) {
                        return ((double) (i2 == 1 ? ((PlaceEnterEvent) Objects.requireNonNull(semanticLocationEvent.d)).b : ((PlaceOngoingEvent) Objects.requireNonNull(semanticLocationEvent.f)).b)) >= fpxm.a.a().a();
                    }
                    return false;
                }
            }).max(Comparator.EL.thenComparingDouble(Comparator.CC.comparingInt(new ToIntFunction() { // from class: cbep
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    SemanticLocationEvent semanticLocationEvent = (SemanticLocationEvent) obj;
                    int i2 = semanticLocationEvent.c;
                    if (i2 == 1) {
                        return ((PlaceEnterEvent) Objects.requireNonNull(semanticLocationEvent.d)).a;
                    }
                    if (i2 == 3) {
                        return ((PlaceOngoingEvent) Objects.requireNonNull(semanticLocationEvent.f)).a;
                    }
                    return -1;
                }
            }), new ToDoubleFunction() { // from class: cbeq
                @Override // java.util.function.ToDoubleFunction
                public final double applyAsDouble(Object obj) {
                    return cbem.a((SemanticLocationEvent) obj);
                }
            }));
            if (!max.isPresent()) {
                String str = account.name;
                a2.d(account);
                return;
            }
            PlaceCandidate b3 = cbem.b((SemanticLocationEvent) max.get());
            if (b3 == null) {
                ((ejhf) ((ejhf) b.j()).ah((char) 6001)).x("Semantic location update without place candidate");
            } else {
                a2.c.put(account, b3);
            }
        }
    }
}
