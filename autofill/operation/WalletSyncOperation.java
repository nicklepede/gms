package com.google.android.gms.autofill.operation;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import defpackage.afwg;
import defpackage.agar;
import defpackage.agsl;
import defpackage.agsm;
import defpackage.auid;
import defpackage.aupv;
import defpackage.ausn;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.eluo;
import defpackage.eqdu;
import defpackage.eqgc;
import defpackage.eqgl;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class WalletSyncOperation extends IntentOperation {
    private static final ausn a = ausn.b(WalletSyncOperation.class.getName(), auid.AUTOFILL);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        eqgl b;
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 1030)).x("Invoked ChromeSyncWalletMetadataSyncOperation");
        if (intent.getStringExtra("account_name") == null) {
            ((eluo) ((eluo) ausnVar.j()).ai((char) 1034)).x("Account is missing from the intent.");
            return;
        }
        agsm a2 = agsl.a(this);
        ekvi h = a2.z(this, ektg.a, ekvi.j(a2.i().z())).h();
        if (!h.h()) {
            ((eluo) ((eluo) ausnVar.j()).ai((char) 1033)).x("WalletDataSource is missing.");
            return;
        }
        aupv aupvVar = new aupv(1, 10);
        try {
            agar agarVar = (agar) h.c();
            ekvi ekviVar = agarVar.h;
            if (ekviVar.h()) {
                final afwg afwgVar = (afwg) ekviVar.c();
                final eqgl b2 = agarVar.e.b(null);
                final eqgl b3 = afwgVar.b(null);
                b = eqgc.b(b2, b3).b(new eqdu() { // from class: agaf
                    @Override // defpackage.eqdu
                    public final eqgl a() {
                        ausn ausnVar2 = agar.a;
                        elgo elgoVar = (elgo) eqgc.r(eqgl.this);
                        Stream map = Collection.EL.stream(elgoVar).map(new Function() { // from class: agai
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo479andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                ausn ausnVar3 = agar.a;
                                return new String(agar.c.p(((ffqp) obj).d));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        Collector collector = elcq.b;
                        final elhz elhzVar = (elhz) map.collect(collector);
                        elgo elgoVar2 = (elgo) eqgc.r(b2);
                        final elhz elhzVar2 = (elhz) Collection.EL.stream(elgoVar2).map(new Function() { // from class: agaj
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo479andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                ausn ausnVar3 = agar.a;
                                ffqm ffqmVar = ((ffnn) obj).d;
                                if (ffqmVar == null) {
                                    ffqmVar = ffqm.a;
                                }
                                return ffqmVar.c;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(collector);
                        Stream filter = Collection.EL.stream(elgoVar2).filter(new Predicate() { // from class: agak
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
                                ffnn ffnnVar = (ffnn) obj;
                                ausn ausnVar3 = agar.a;
                                int a3 = ffnm.a(ffnnVar.c);
                                if (a3 == 0 || a3 != 2) {
                                    return false;
                                }
                                ffqm ffqmVar = ffnnVar.d;
                                if (ffqmVar == null) {
                                    ffqmVar = ffqm.a;
                                }
                                return !elhz.this.contains(ffqmVar.c);
                            }
                        });
                        final afwg afwgVar2 = afwgVar;
                        Stream map2 = filter.map(new Function() { // from class: agal
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo479andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                ausn ausnVar3 = agar.a;
                                ffqm ffqmVar = ((ffnn) obj).d;
                                if (ffqmVar == null) {
                                    ffqmVar = ffqm.a;
                                }
                                return afwg.this.e(agar.d(ffqmVar.c), Bundle.EMPTY);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = elgo.d;
                        Collector collector2 = elcq.a;
                        elgo elgoVar3 = (elgo) map2.collect(collector2);
                        elgo elgoVar4 = (elgo) Collection.EL.stream(elgoVar).filter(new Predicate() { // from class: agam
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
                                ffqp ffqpVar = (ffqp) obj;
                                ausn ausnVar3 = agar.a;
                                int a3 = ffqo.a(ffqpVar.c);
                                return (a3 == 0 || a3 != 2 || elhz.this.contains(new String(agar.c.p(ffqpVar.d)))) ? false : true;
                            }
                        }).map(new Function() { // from class: agan
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo479andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                ausn ausnVar3 = agar.a;
                                return afwg.this.a((ffqp) obj, Bundle.EMPTY);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(collector2);
                        elgj elgjVar = new elgj();
                        elgjVar.k(elgoVar3);
                        elgjVar.k(elgoVar4);
                        return eqgc.e(elgjVar.g());
                    }
                }, aupvVar);
            } else {
                ((eluo) agar.a.j()).x("WalletMetadataApi not present.");
                int i = elgo.d;
                b = eqgc.i(elpg.a);
            }
            b.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 1031)).x("Failed to create missing metadata.");
        } catch (ExecutionException e2) {
            ((eluo) ((eluo) ((eluo) a.i()).s(e2)).ai((char) 1032)).x("Failed to create missing metadata.");
        }
    }
}
