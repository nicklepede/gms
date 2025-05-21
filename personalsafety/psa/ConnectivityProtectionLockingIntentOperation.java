package com.google.android.gms.personalsafety.psa;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.personalsafety.psa.ConnectivityProtectionLockingIntentOperation;
import defpackage.asit;
import defpackage.asmf;
import defpackage.byic;
import defpackage.byid;
import defpackage.byir;
import defpackage.byis;
import defpackage.cvpa;
import defpackage.cvpo;
import defpackage.cvpu;
import defpackage.cvqk;
import defpackage.cvqp;
import defpackage.cvqq;
import defpackage.cvqr;
import defpackage.cvrf;
import defpackage.dxkm;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.ensm;
import defpackage.enss;
import defpackage.fegu;
import defpackage.fmzv;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ConnectivityProtectionLockingIntentOperation extends IntentOperation {
    public static final /* synthetic */ int c = 0;
    public static final Executor a = new asmf(Integer.MAX_VALUE, 9);
    private static final Object d = new Object();
    public static final byis b = byis.a(fegu.c(fmzv.d()), (int) fmzv.c(), new byir() { // from class: cvql
        @Override // defpackage.byir
        public final enss a(final Function function) {
            return ((dxkm) cvrf.a.a()).b(new eiho() { // from class: cvqs
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    Object apply;
                    cvrr cvrrVar = (cvrr) obj;
                    eijr eijrVar = cvrf.a;
                    Stream map = Collection.EL.stream(cvrrVar.d).map(new Function() { // from class: cvqt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo464andThen(Function function2) {
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
                    int i = eitj.d;
                    Collector collector = eipl.a;
                    apply = Function.this.apply((eitj) map.collect(collector));
                    eitj eitjVar = (eitj) apply;
                    fecj fecjVar = (fecj) cvrrVar.iB(5, null);
                    fecjVar.X(cvrrVar);
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    ((cvrr) fecjVar.b).d = fedu.a;
                    Iterable iterable = (Iterable) Collection.EL.stream(eitjVar).map(new Function() { // from class: cvqu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo464andThen(Function function2) {
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
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    cvrr cvrrVar2 = (cvrr) fecjVar.b;
                    fedb fedbVar = cvrrVar2.d;
                    if (!fedbVar.c()) {
                        cvrrVar2.d = fecp.D(fedbVar);
                    }
                    feab.E(iterable, cvrrVar2.d);
                    return (cvrr) fecjVar.Q();
                }
            }, enre.a);
        }
    });

    public static enss a(Context context) {
        context.getString(R.string.auto_lock_lock_screen_message);
        cvpa.a(context);
        ((ejhf) ((ejhf) cvpo.a.h()).ah((char) 8586)).x("ConnectivityProtectionLockingIntentOperation: locked");
        cvpu.a(context, cvqr.b(context, 2));
        final Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        return ((dxkm) cvrf.a.a()).b(new eiho() { // from class: cvrc
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                cvrr cvrrVar = (cvrr) obj;
                eijr eijrVar = cvrf.a;
                fecj fecjVar = (fecj) cvrrVar.iB(5, null);
                fecjVar.X(cvrrVar);
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                Instant instant = Instant.this;
                cvrr cvrrVar2 = (cvrr) fecjVar.b;
                cvrr cvrrVar3 = cvrr.a;
                cvrrVar2.b |= 1;
                cvrrVar2.c = true;
                long epochMilli = instant.toEpochMilli();
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                cvrr cvrrVar4 = (cvrr) fecjVar.b;
                cvrrVar4.b |= 2;
                cvrrVar4.e = epochMilli;
                return (cvrr) fecjVar.Q();
            }
        }, enre.a);
    }

    public static void b(Context context) {
        synchronized (d) {
            try {
                new asit(context).d.cancel(d(context).a());
            } catch (NullPointerException e) {
                ((ejhf) ((ejhf) asit.a.i()).s(e)).x("Cancel NPE");
            }
            ((ejhf) ((ejhf) cvpo.a.h()).ah(8583)).x("ConnectivityProtectionLockingIntentOperation: cancelled task");
        }
    }

    static void c(Context context) {
        synchronized (d) {
            asit asitVar = new asit(context);
            byid d2 = d(context);
            ensj.t(b.c(false, Instant.ofEpochMilli(System.currentTimeMillis()).plusSeconds(fmzv.b())), new cvqp(asitVar, d2), a);
        }
    }

    private static byid d(Context context) {
        return byic.a(context, new Intent("com.google.android.gms.personalsafety.psa.ACTION_CONNECTIVITY_PROTECTION_LOCK").setPackage("com.google.android.gms"), 201326592);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        enss enssVar;
        if (Objects.equals(intent.getAction(), "com.google.android.gms.personalsafety.psa.ACTION_CONNECTIVITY_PROTECTION_LOCK")) {
            try {
                if (cvqq.b(this) && !cvqk.b(this)) {
                    ensi h = ensi.h(cvqk.a(this));
                    enqc enqcVar = new enqc() { // from class: cvqm
                        @Override // defpackage.enqc
                        public final enss a(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            final ConnectivityProtectionLockingIntentOperation connectivityProtectionLockingIntentOperation = ConnectivityProtectionLockingIntentOperation.this;
                            if (booleanValue) {
                                return enps.f(ConnectivityProtectionLockingIntentOperation.b.b(), new eiho() { // from class: cvqo
                                    @Override // defpackage.eiho
                                    public final Object apply(Object obj2) {
                                        Boolean bool = (Boolean) obj2;
                                        if (!bool.booleanValue()) {
                                            ConnectivityProtectionLockingIntentOperation connectivityProtectionLockingIntentOperation2 = ConnectivityProtectionLockingIntentOperation.this;
                                            cvpu.a(connectivityProtectionLockingIntentOperation2, cvqr.b(connectivityProtectionLockingIntentOperation2, 4));
                                        }
                                        return bool;
                                    }
                                }, ConnectivityProtectionLockingIntentOperation.a);
                            }
                            if (!cvqk.d()) {
                                return ensj.i(false);
                            }
                            cvpu.a(connectivityProtectionLockingIntentOperation, cvqr.b(connectivityProtectionLockingIntentOperation, 5));
                            ((ejhf) ((ejhf) cvpo.a.h()).ah((char) 8584)).x("ConnectivityProtectionLockingIntentOperation: dark launch prevented lock");
                            return ensj.i(false);
                        }
                    };
                    Executor executor = a;
                    enssVar = enps.g(enps.g(h, enqcVar, executor), new enqc() { // from class: cvqn
                        @Override // defpackage.enqc
                        public final enss a(Object obj) {
                            return !((Boolean) obj).booleanValue() ? ensm.a : ConnectivityProtectionLockingIntentOperation.a(ConnectivityProtectionLockingIntentOperation.this);
                        }
                    }, executor);
                    enssVar.get();
                }
                enssVar = ensm.a;
                enssVar.get();
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                ((ejhf) ((ejhf) ((ejhf) cvpo.a.j()).s(e)).ah((char) 8585)).x("Couldn't handle connectivity protection lock action");
            }
        }
    }
}
