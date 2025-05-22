package com.google.android.gms.personalsafety.psa;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.personalsafety.psa.ConnectivityProtectionLockingIntentOperation;
import defpackage.aumn;
import defpackage.aupz;
import defpackage.caqu;
import defpackage.caqv;
import defpackage.carj;
import defpackage.cark;
import defpackage.cxyq;
import defpackage.cxze;
import defpackage.cxzk;
import defpackage.cyaa;
import defpackage.cyaf;
import defpackage.cyag;
import defpackage.cyah;
import defpackage.cyav;
import defpackage.dzwm;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.fgvn;
import defpackage.fpru;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ConnectivityProtectionLockingIntentOperation extends IntentOperation {
    public static final /* synthetic */ int c = 0;
    public static final Executor a = new aupz(Integer.MAX_VALUE, 9);
    private static final Object d = new Object();
    public static final cark b = cark.a(fgvn.c(fpru.d()), (int) fpru.c(), new carj() { // from class: cyab
        @Override // defpackage.carj
        public final eqgl a(final Function function) {
            return ((dzwm) cyav.a.lK()).b(new ekut() { // from class: cyai
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    Object apply;
                    cybh cybhVar = (cybh) obj;
                    ekww ekwwVar = cyav.a;
                    Stream map = Collection.EL.stream(cybhVar.d).map(new Function() { // from class: cyaj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo479andThen(Function function2) {
                            return Function$CC.$default$andThen(this, function2);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return Instant.ofEpochMilli(((Long) obj2).longValue());
                        }

                        public final /* synthetic */ Function compose(Function function2) {
                            return Function$CC.$default$compose(this, function2);
                        }
                    });
                    int i = elgo.d;
                    Collector collector = elcq.a;
                    apply = Function.this.apply((elgo) map.collect(collector));
                    elgo elgoVar = (elgo) apply;
                    fgrc fgrcVar = (fgrc) cybhVar.iQ(5, null);
                    fgrcVar.X(cybhVar);
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    ((cybh) fgrcVar.b).d = fgsn.a;
                    Iterable iterable = (Iterable) Collection.EL.stream(elgoVar).map(new Function() { // from class: cyak
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo479andThen(Function function2) {
                            return Function$CC.$default$andThen(this, function2);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return Long.valueOf(((Instant) obj2).toEpochMilli());
                        }

                        public final /* synthetic */ Function compose(Function function2) {
                            return Function$CC.$default$compose(this, function2);
                        }
                    }).collect(collector);
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    cybh cybhVar2 = (cybh) fgrcVar.b;
                    fgru fgruVar = cybhVar2.d;
                    if (!fgruVar.c()) {
                        cybhVar2.d = fgri.D(fgruVar);
                    }
                    fgou.E(iterable, cybhVar2.d);
                    return (cybh) fgrcVar.Q();
                }
            }, eqex.a);
        }
    });

    public static eqgl a(Context context) {
        context.getString(R.string.auto_lock_lock_screen_message);
        cxyq.a(context);
        ((eluo) ((eluo) cxze.a.h()).ai((char) 8583)).x("ConnectivityProtectionLockingIntentOperation: locked");
        cxzk.a(context, cyah.b(context, 2));
        final Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        return ((dzwm) cyav.a.lK()).b(new ekut() { // from class: cyas
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                cybh cybhVar = (cybh) obj;
                ekww ekwwVar = cyav.a;
                fgrc fgrcVar = (fgrc) cybhVar.iQ(5, null);
                fgrcVar.X(cybhVar);
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                Instant instant = Instant.this;
                cybh cybhVar2 = (cybh) fgrcVar.b;
                cybh cybhVar3 = cybh.a;
                cybhVar2.b |= 1;
                cybhVar2.c = true;
                long epochMilli = instant.toEpochMilli();
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                cybh cybhVar4 = (cybh) fgrcVar.b;
                cybhVar4.b |= 2;
                cybhVar4.e = epochMilli;
                return (cybh) fgrcVar.Q();
            }
        }, eqex.a);
    }

    public static void b(Context context) {
        synchronized (d) {
            try {
                new aumn(context).d.cancel(d(context).a());
            } catch (NullPointerException e) {
                ((eluo) ((eluo) aumn.a.i()).s(e)).x("Cancel NPE");
            }
            ((eluo) ((eluo) cxze.a.h()).ai(8580)).x("ConnectivityProtectionLockingIntentOperation: cancelled task");
        }
    }

    static void c(Context context) {
        synchronized (d) {
            aumn aumnVar = new aumn(context);
            caqv d2 = d(context);
            eqgc.t(b.c(false, Instant.ofEpochMilli(System.currentTimeMillis()).plusSeconds(fpru.b())), new cyaf(aumnVar, d2), a);
        }
    }

    private static caqv d(Context context) {
        return caqu.a(context, new Intent("com.google.android.gms.personalsafety.psa.ACTION_CONNECTIVITY_PROTECTION_LOCK").setPackage("com.google.android.gms"), 201326592);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        eqgl eqglVar;
        if (Objects.equals(intent.getAction(), "com.google.android.gms.personalsafety.psa.ACTION_CONNECTIVITY_PROTECTION_LOCK")) {
            try {
                if (cyag.b(this) && !cyaa.b(this)) {
                    eqgb h = eqgb.h(cyaa.a(this));
                    eqdv eqdvVar = new eqdv() { // from class: cyac
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final ConnectivityProtectionLockingIntentOperation connectivityProtectionLockingIntentOperation = ConnectivityProtectionLockingIntentOperation.this;
                            if (booleanValue) {
                                return eqdl.f(ConnectivityProtectionLockingIntentOperation.b.b(), new ekut() { // from class: cyae
                                    @Override // defpackage.ekut
                                    public final Object apply(Object obj2) {
                                        Boolean bool = (Boolean) obj2;
                                        if (!bool.booleanValue()) {
                                            ConnectivityProtectionLockingIntentOperation connectivityProtectionLockingIntentOperation2 = ConnectivityProtectionLockingIntentOperation.this;
                                            cxzk.a(connectivityProtectionLockingIntentOperation2, cyah.b(connectivityProtectionLockingIntentOperation2, 4));
                                        }
                                        return bool;
                                    }
                                }, ConnectivityProtectionLockingIntentOperation.a);
                            }
                            if (!cyaa.d()) {
                                return eqgc.i(false);
                            }
                            cxzk.a(connectivityProtectionLockingIntentOperation, cyah.b(connectivityProtectionLockingIntentOperation, 5));
                            ((eluo) ((eluo) cxze.a.h()).ai((char) 8581)).x("ConnectivityProtectionLockingIntentOperation: dark launch prevented lock");
                            return eqgc.i(false);
                        }
                    };
                    Executor executor = a;
                    eqglVar = eqdl.g(eqdl.g(h, eqdvVar, executor), new eqdv() { // from class: cyad
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj) {
                            return !((Boolean) obj).booleanValue() ? eqgf.a : ConnectivityProtectionLockingIntentOperation.a(ConnectivityProtectionLockingIntentOperation.this);
                        }
                    }, executor);
                    eqglVar.get();
                }
                eqglVar = eqgf.a;
                eqglVar.get();
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                ((eluo) ((eluo) ((eluo) cxze.a.j()).s(e)).ai((char) 8582)).x("Couldn't handle connectivity protection lock action");
            }
        }
    }
}
