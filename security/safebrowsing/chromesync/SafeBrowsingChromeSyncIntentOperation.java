package com.google.android.gms.security.safebrowsing.chromesync;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.aozb;
import defpackage.aozu;
import defpackage.apru;
import defpackage.asnd;
import defpackage.eijr;
import defpackage.enpf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
        if (intent == null || !Objects.equals(intent.getAction(), "com.google.android.gms.security.safebrowsing.ACTION_CHROME_SYNC_UPDATE") || (b = asnd.b(this)) == null) {
            return;
        }
        try {
            final apru apruVar = (apru) ((aozu) aozu.a.b()).b.a(b);
            ((enpf) enps.g(aozb.a(apruVar, a(this), new eijr() { // from class: cyvp
                @Override // defpackage.eijr
                public final Object a() {
                    return doci.b(apru.this.b(Bundle.EMPTY));
                }
            }), new enqc() { // from class: cyvq
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    final eitj eitjVar = (eitj) obj;
                    return cyvo.a(this).b(new eiho() { // from class: cyve
                        @Override // defpackage.eiho
                        public final Object apply(Object obj2) {
                            eitj eitjVar2 = cyvo.a;
                            fecj v = cytb.a.v();
                            List list = eitjVar;
                            Stream map = Collection.EL.stream(list).filter(new Predicate() { // from class: cyvi
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
                                public final boolean test(Object obj3) {
                                    eitj eitjVar3 = cyvo.a;
                                    return ((fczu) obj3).b.startsWith("ContentPackManualBehaviorHosts");
                                }
                            }).filter(new Predicate() { // from class: cyvj
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
                                public final boolean test(Object obj3) {
                                    eitj eitjVar3 = cyvo.a;
                                    return Boolean.parseBoolean(((fczu) obj3).c);
                                }
                            }).map(new Function() { // from class: cyvk
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo464andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    eitj eitjVar3 = cyvo.a;
                                    return ((fczu) obj3).b.substring(31);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i = eitj.d;
                            Collector collector = eipl.a;
                            eitj eitjVar3 = (eitj) map.collect(collector);
                            if (!v.b.L()) {
                                v.U();
                            }
                            cytb cytbVar = (cytb) v.b;
                            fedh fedhVar = cytbVar.e;
                            if (!fedhVar.c()) {
                                cytbVar.e = fecp.E(fedhVar);
                            }
                            feab.E(eitjVar3, cytbVar.e);
                            eitj eitjVar4 = (eitj) Collection.EL.stream(list).filter(new Predicate() { // from class: cyvl
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
                                public final boolean test(Object obj3) {
                                    eitj eitjVar5 = cyvo.a;
                                    return ((fczu) obj3).b.startsWith("ContentPackManualBehaviorHosts");
                                }
                            }).filter(new Predicate() { // from class: cyvm
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
                                public final boolean test(Object obj3) {
                                    eitj eitjVar5 = cyvo.a;
                                    return !Boolean.parseBoolean(((fczu) obj3).c);
                                }
                            }).map(new Function() { // from class: cyvn
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo464andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    eitj eitjVar5 = cyvo.a;
                                    return ((fczu) obj3).b.substring(31);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(collector);
                            if (!v.b.L()) {
                                v.U();
                            }
                            cytb cytbVar2 = (cytb) v.b;
                            fedh fedhVar2 = cytbVar2.d;
                            if (!fedhVar2.c()) {
                                cytbVar2.d = fecp.E(fedhVar2);
                            }
                            feab.E(eitjVar4, cytbVar2.d);
                            Optional map2 = Collection.EL.stream(list).filter(new Predicate() { // from class: cyvd
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
                                public final boolean test(Object obj3) {
                                    eitj eitjVar5 = cyvo.a;
                                    return ((fczu) obj3).b.equals("ContentPackDefaultFilteringBehavior");
                                }
                            }).findFirst().map(new Function() { // from class: cyvf
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo464andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    eitj eitjVar5 = cyvo.a;
                                    return ((fczu) obj3).c;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            Optional map3 = Collection.EL.stream(list).filter(new Predicate() { // from class: cyvg
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
                                public final boolean test(Object obj3) {
                                    eitj eitjVar5 = cyvo.a;
                                    return ((fczu) obj3).b.equals("SafeSites");
                                }
                            }).findFirst().map(new Function() { // from class: cyvh
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo464andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    eitj eitjVar5 = cyvo.a;
                                    return Boolean.valueOf(Boolean.parseBoolean(((fczu) obj3).c));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i2 = (map2.isPresent() && ((String) map2.get()).equals("2")) ? 5 : (!map3.isPresent() || true == ((Boolean) map3.get()).booleanValue()) ? 4 : 3;
                            if (!v.b.L()) {
                                v.U();
                            }
                            cytb cytbVar3 = (cytb) v.b;
                            cytbVar3.c = i2 - 2;
                            cytbVar3.b |= 1;
                            return (cytb) v.Q();
                        }
                    }, enre.a);
                }
            }, enre.a)).u();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("SafeBrowsingChromeSync", "Failed to update managed user settings.", e);
        }
    }
}
