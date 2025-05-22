package com.google.android.gms.security.safebrowsing.chromesync;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.arbs;
import defpackage.arcl;
import defpackage.arul;
import defpackage.auqx;
import defpackage.ekww;
import defpackage.eqcy;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SafeBrowsingChromeSyncIntentOperation extends IntentOperation {
    public static Intent a(Context context) {
        Intent startIntent = IntentOperation.getStartIntent(context, SafeBrowsingChromeSyncIntentOperation.class, "com.google.android.gms.security.safebrowsing.ACTION_CHROME_SYNC_UPDATE");
        if (startIntent != null) {
            startIntent.putExtra("component_name", "safebrowsing");
        }
        return startIntent;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Account b;
        if (intent == null || !Objects.equals(intent.getAction(), "com.google.android.gms.security.safebrowsing.ACTION_CHROME_SYNC_UPDATE") || (b = auqx.b(this)) == null) {
            return;
        }
        try {
            final arul arulVar = (arul) ((arcl) arcl.a.b()).b.a(b);
            ((eqcy) eqdl.g(arbs.a(arulVar, a(this), new ekww() { // from class: dbfn
                @Override // defpackage.ekww
                public final Object lK() {
                    return dqmr.b(arul.this.b(Bundle.EMPTY));
                }
            }), new eqdv() { // from class: dbfo
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    final elgo elgoVar = (elgo) obj;
                    return dbfm.a(this).b(new ekut() { // from class: dbfc
                        @Override // defpackage.ekut
                        public final Object apply(Object obj2) {
                            elgo elgoVar2 = dbfm.a;
                            fgrc v = dbcz.a.v();
                            List list = elgoVar;
                            Stream map = Collection.EL.stream(list).filter(new Predicate() { // from class: dbfg
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
                                public final boolean test(Object obj3) {
                                    elgo elgoVar3 = dbfm.a;
                                    return ((ffok) obj3).b.startsWith("ContentPackManualBehaviorHosts");
                                }
                            }).filter(new Predicate() { // from class: dbfh
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
                                public final boolean test(Object obj3) {
                                    elgo elgoVar3 = dbfm.a;
                                    return Boolean.parseBoolean(((ffok) obj3).c);
                                }
                            }).map(new Function() { // from class: dbfi
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo479andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    elgo elgoVar3 = dbfm.a;
                                    return ((ffok) obj3).b.substring(31);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i = elgo.d;
                            Collector collector = elcq.a;
                            elgo elgoVar3 = (elgo) map.collect(collector);
                            if (!v.b.L()) {
                                v.U();
                            }
                            dbcz dbczVar = (dbcz) v.b;
                            fgsa fgsaVar = dbczVar.e;
                            if (!fgsaVar.c()) {
                                dbczVar.e = fgri.E(fgsaVar);
                            }
                            fgou.E(elgoVar3, dbczVar.e);
                            elgo elgoVar4 = (elgo) Collection.EL.stream(list).filter(new Predicate() { // from class: dbfj
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
                                public final boolean test(Object obj3) {
                                    elgo elgoVar5 = dbfm.a;
                                    return ((ffok) obj3).b.startsWith("ContentPackManualBehaviorHosts");
                                }
                            }).filter(new Predicate() { // from class: dbfk
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
                                public final boolean test(Object obj3) {
                                    elgo elgoVar5 = dbfm.a;
                                    return !Boolean.parseBoolean(((ffok) obj3).c);
                                }
                            }).map(new Function() { // from class: dbfl
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo479andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    elgo elgoVar5 = dbfm.a;
                                    return ((ffok) obj3).b.substring(31);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(collector);
                            if (!v.b.L()) {
                                v.U();
                            }
                            dbcz dbczVar2 = (dbcz) v.b;
                            fgsa fgsaVar2 = dbczVar2.d;
                            if (!fgsaVar2.c()) {
                                dbczVar2.d = fgri.E(fgsaVar2);
                            }
                            fgou.E(elgoVar4, dbczVar2.d);
                            Optional map2 = Collection.EL.stream(list).filter(new Predicate() { // from class: dbfb
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
                                public final boolean test(Object obj3) {
                                    elgo elgoVar5 = dbfm.a;
                                    return ((ffok) obj3).b.equals("ContentPackDefaultFilteringBehavior");
                                }
                            }).findFirst().map(new Function() { // from class: dbfd
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo479andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    elgo elgoVar5 = dbfm.a;
                                    return ((ffok) obj3).c;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            Optional map3 = Collection.EL.stream(list).filter(new Predicate() { // from class: dbfe
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
                                public final boolean test(Object obj3) {
                                    elgo elgoVar5 = dbfm.a;
                                    return ((ffok) obj3).b.equals("SafeSites");
                                }
                            }).findFirst().map(new Function() { // from class: dbff
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo479andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    elgo elgoVar5 = dbfm.a;
                                    return Boolean.valueOf(Boolean.parseBoolean(((ffok) obj3).c));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i2 = (map2.isPresent() && ((String) map2.get()).equals("2")) ? 5 : (!map3.isPresent() || true == ((Boolean) map3.get()).booleanValue()) ? 4 : 3;
                            if (!v.b.L()) {
                                v.U();
                            }
                            dbcz dbczVar3 = (dbcz) v.b;
                            dbczVar3.c = i2 - 2;
                            dbczVar3.b |= 1;
                            return (dbcz) v.Q();
                        }
                    }, eqex.a);
                }
            }, eqex.a)).u();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("SafeBrowsingChromeSync", "Failed to update managed user settings.", e);
        }
    }
}
