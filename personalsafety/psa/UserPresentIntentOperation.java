package com.google.android.gms.personalsafety.psa;

import com.google.android.chimera.IntentOperation;
import defpackage.aurp;
import defpackage.aurt;
import defpackage.cxze;
import defpackage.cyat;
import defpackage.cyau;
import defpackage.cyav;
import defpackage.dzwm;
import defpackage.ekut;
import defpackage.ekww;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgb;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function$CC;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class UserPresentIntentOperation extends IntentOperation {
    public final aurp a;

    public UserPresentIntentOperation() {
        this(aurt.a);
    }

    private static final cyau a() {
        try {
            ekww ekwwVar = cyav.a;
            final AtomicReference atomicReference = new AtomicReference(new cyat(null));
            dzwm dzwmVar = (dzwm) cyav.a.lK();
            ekut ekutVar = new ekut() { // from class: cyal
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    cybh cybhVar = (cybh) obj;
                    ekww ekwwVar2 = cyav.a;
                    long j = cybhVar.e;
                    final Optional empty = j == 0 ? Optional.empty() : Optional.of(Instant.ofEpochMilli(j));
                    AtomicReference atomicReference2 = atomicReference;
                    DesugarAtomicReference.updateAndGet(atomicReference2, new UnaryOperator() { // from class: cyan
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo479andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cyat cyatVar = (cyat) obj2;
                            ekww ekwwVar3 = cyav.a;
                            cyatVar.c(Optional.this);
                            return cyatVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final boolean z = cybhVar.f;
                    DesugarAtomicReference.updateAndGet(atomicReference2, new UnaryOperator() { // from class: cyao
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo479andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cyat cyatVar = (cyat) obj2;
                            ekww ekwwVar3 = cyav.a;
                            cyatVar.b(z);
                            return cyatVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final boolean z2 = true;
                    if ((cybhVar.b & 1) == 0 || !cybhVar.c) {
                        z2 = false;
                    } else {
                        fgrc fgrcVar = (fgrc) cybhVar.iQ(5, null);
                        fgrcVar.X(cybhVar);
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        cybh cybhVar2 = (cybh) fgrcVar.b;
                        cybhVar2.b |= 1;
                        cybhVar2.c = false;
                        cybhVar = (cybh) fgrcVar.Q();
                    }
                    DesugarAtomicReference.updateAndGet(atomicReference2, new UnaryOperator() { // from class: cyap
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo479andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cyat cyatVar = (cyat) obj2;
                            ekww ekwwVar3 = cyav.a;
                            cyatVar.d(z2);
                            return cyatVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return cybhVar;
                }
            };
            eqex eqexVar = eqex.a;
            return (cyau) ((eqcy) eqdl.f(eqgb.h(dzwmVar.b(ekutVar, eqexVar)), new ekut() { // from class: cyam
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    ekww ekwwVar2 = cyav.a;
                    return ((cyat) atomicReference.get()).a();
                }
            }, eqexVar)).u();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            ((eluo) ((eluo) ((eluo) cxze.a.j()).s(e)).ai((char) 8596)).x("Couldn't access PsaStore");
            cyat cyatVar = new cyat(null);
            cyatVar.b(false);
            cyatVar.d(false);
            cyatVar.c(Optional.empty());
            return cyatVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018d  */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.personalsafety.psa.UserPresentIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    public UserPresentIntentOperation(aurp aurpVar) {
        this.a = aurpVar;
    }
}
