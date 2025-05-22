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
import defpackage.auid;
import defpackage.ausn;
import defpackage.cdec;
import defpackage.cdhi;
import defpackage.cdkf;
import defpackage.cdkg;
import defpackage.cdkh;
import defpackage.cdnd;
import defpackage.cdne;
import defpackage.cdnf;
import defpackage.edrt;
import defpackage.edry;
import defpackage.edsq;
import defpackage.ekvk;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fsqm;
import defpackage.fsrb;
import defpackage.fsrg;
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

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class SemanticLocationIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("LSR", auid.LOCATION_SHARING_REPORTER);

    private static boolean a(Account account, cdhi cdhiVar) {
        try {
            if (((Set) ((eqcy) cdec.c().a()).v(fsqm.i(), TimeUnit.MILLISECONDS)).contains(account.name)) {
                return false;
            }
            ((eluo) ((eluo) b.h()).ai((char) 6027)).x("Account no longer sharing location, so clearing any cached semantic location and unsubscribing from CSL updates");
            cdhiVar.d(account);
            cdnd.a(AppContextProvider.a(), account).b(cdnf.a(account));
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 6028)).x("Error reading accounts sharing location");
            return false;
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fsrg.c()) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.semantic.EXTRA_ACCOUNT");
            if (ekvk.c(stringExtra)) {
                ((eluo) ((eluo) b.j()).ai((char) 6026)).x("Semantic location update without account extra");
                return;
            }
            int i = cdkf.a;
            if (fsrb.v()) {
                fgrc v = edsq.a.v();
                edry b2 = cdkh.b();
                if (!v.b.L()) {
                    v.U();
                }
                edsq edsqVar = (edsq) v.b;
                b2.getClass();
                fgsa fgsaVar = edsqVar.y;
                if (!fgsaVar.c()) {
                    edsqVar.y = fgri.E(fgsaVar);
                }
                edsqVar.y.add(b2);
                edsq edsqVar2 = (edsq) v.Q();
                fgrc v2 = edrt.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                edrt edrtVar = (edrt) v2.b;
                edsqVar2.getClass();
                edrtVar.c = edsqVar2;
                edrtVar.b = 1;
                cdkg.b(stringExtra, (edrt) v2.Q());
            }
            Account account = new Account(stringExtra, "com.google");
            cdhi a2 = cdhi.a();
            if (a(account, a2)) {
                return;
            }
            SemanticLocationState a3 = SemanticLocationState.a(intent);
            if (a3 == null) {
                ((eluo) ((eluo) b.j()).ai((char) 6023)).x("Semantic location update without semantic location state");
                a2.d(account);
                return;
            }
            List list = a3.b;
            if (list.isEmpty()) {
                ((eluo) ((eluo) b.j()).ai((char) 6022)).x("Semantic location update without semantic location events");
                a2.d(account);
                return;
            }
            Optional max = Collection.EL.stream(list).filter(new Predicate() { // from class: cdng
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo478negate() {
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
                    double a4 = cdne.a(semanticLocationEvent);
                    fsrg fsrgVar = fsrg.a;
                    if (a4 >= fsrgVar.lK().c()) {
                        return ((double) (i2 == 1 ? ((PlaceEnterEvent) Objects.requireNonNull(semanticLocationEvent.d)).b : ((PlaceOngoingEvent) Objects.requireNonNull(semanticLocationEvent.f)).b)) >= fsrgVar.lK().a();
                    }
                    return false;
                }
            }).max(Comparator.EL.thenComparingDouble(Comparator.CC.comparingInt(new ToIntFunction() { // from class: cdnh
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
            }), new ToDoubleFunction() { // from class: cdni
                @Override // java.util.function.ToDoubleFunction
                public final double applyAsDouble(Object obj) {
                    return cdne.a((SemanticLocationEvent) obj);
                }
            }));
            if (!max.isPresent()) {
                String str = account.name;
                a2.d(account);
                return;
            }
            PlaceCandidate b3 = cdne.b((SemanticLocationEvent) max.get());
            if (b3 == null) {
                ((eluo) ((eluo) b.j()).ai((char) 6020)).x("Semantic location update without place candidate");
            } else {
                a2.c.put(account, b3);
            }
        }
    }
}
