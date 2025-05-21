package com.google.android.gms.autofill.operation;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import defpackage.advz;
import defpackage.aeba;
import defpackage.aery;
import defpackage.aerz;
import defpackage.asej;
import defpackage.asmb;
import defpackage.asot;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.ejhf;
import defpackage.enqb;
import defpackage.ensj;
import defpackage.enss;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class WalletSyncOperation extends IntentOperation {
    private static final asot a = asot.b(WalletSyncOperation.class.getName(), asej.AUTOFILL);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        enss b;
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 1036)).x("Invoked ChromeSyncWalletMetadataSyncOperation");
        if (intent.getStringExtra("account_name") == null) {
            ((ejhf) ((ejhf) asotVar.j()).ah((char) 1040)).x("Account is missing from the intent.");
            return;
        }
        aerz a2 = aery.a(this);
        eiid h = a2.z(this, eigb.a, eiid.j(a2.i().z())).h();
        if (!h.h()) {
            ((ejhf) ((ejhf) asotVar.j()).ah((char) 1039)).x("WalletDataSource is missing.");
            return;
        }
        asmb asmbVar = new asmb(1, 10);
        try {
            aeba aebaVar = (aeba) h.c();
            eiid eiidVar = aebaVar.h;
            if (eiidVar.h()) {
                final advz advzVar = (advz) eiidVar.c();
                final enss b2 = aebaVar.e.b(null);
                final enss b3 = advzVar.b(null);
                b = ensj.b(b2, b3).b(new enqb() { // from class: aeax
                    @Override // defpackage.enqb
                    public final enss a() {
                        asot asotVar2 = aeba.a;
                        eitj eitjVar = (eitj) ensj.r(enss.this);
                        Stream map = Collection.EL.stream(eitjVar).map(new Function() { // from class: aeaq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo464andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                asot asotVar3 = aeba.a;
                                return new String(aeba.c.p(((fdby) obj).d));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        Collector collector = eipl.b;
                        final eiuu eiuuVar = (eiuu) map.collect(collector);
                        eitj eitjVar2 = (eitj) ensj.r(b2);
                        final eiuu eiuuVar2 = (eiuu) Collection.EL.stream(eitjVar2).map(new Function() { // from class: aear
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo464andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                asot asotVar3 = aeba.a;
                                fdbv fdbvVar = ((fcyx) obj).d;
                                if (fdbvVar == null) {
                                    fdbvVar = fdbv.a;
                                }
                                return fdbvVar.c;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(collector);
                        Stream filter = Collection.EL.stream(eitjVar2).filter(new Predicate() { // from class: aeas
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
                                fcyx fcyxVar = (fcyx) obj;
                                asot asotVar3 = aeba.a;
                                int a3 = fcyw.a(fcyxVar.c);
                                if (a3 == 0 || a3 != 2) {
                                    return false;
                                }
                                fdbv fdbvVar = fcyxVar.d;
                                if (fdbvVar == null) {
                                    fdbvVar = fdbv.a;
                                }
                                return !eiuu.this.contains(fdbvVar.c);
                            }
                        });
                        final advz advzVar2 = advzVar;
                        Stream map2 = filter.map(new Function() { // from class: aeat
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo464andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                asot asotVar3 = aeba.a;
                                fdbv fdbvVar = ((fcyx) obj).d;
                                if (fdbvVar == null) {
                                    fdbvVar = fdbv.a;
                                }
                                return advz.this.e(aeba.d(fdbvVar.c), Bundle.EMPTY);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = eitj.d;
                        Collector collector2 = eipl.a;
                        eitj eitjVar3 = (eitj) map2.collect(collector2);
                        eitj eitjVar4 = (eitj) Collection.EL.stream(eitjVar).filter(new Predicate() { // from class: aeau
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
                                fdby fdbyVar = (fdby) obj;
                                asot asotVar3 = aeba.a;
                                int a3 = fdbx.a(fdbyVar.c);
                                return (a3 == 0 || a3 != 2 || eiuu.this.contains(new String(aeba.c.p(fdbyVar.d)))) ? false : true;
                            }
                        }).map(new Function() { // from class: aeav
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo464andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                asot asotVar3 = aeba.a;
                                return advz.this.a((fdby) obj, Bundle.EMPTY);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(collector2);
                        eite eiteVar = new eite();
                        eiteVar.k(eitjVar3);
                        eiteVar.k(eitjVar4);
                        return ensj.e(eiteVar.g());
                    }
                }, asmbVar);
            } else {
                ((ejhf) ((ejhf) aeba.a.j()).ah((char) 936)).x("WalletMetadataApi not present.");
                int i = eitj.d;
                b = ensj.i(ejcb.a);
            }
            b.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 1037)).x("Failed to create missing metadata.");
        } catch (ExecutionException e2) {
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e2)).ah((char) 1038)).x("Failed to create missing metadata.");
        }
    }
}
