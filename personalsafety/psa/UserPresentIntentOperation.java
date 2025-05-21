package com.google.android.gms.personalsafety.psa;

import com.google.android.chimera.IntentOperation;
import defpackage.asnv;
import defpackage.asnz;
import defpackage.cvpo;
import defpackage.cvrd;
import defpackage.cvre;
import defpackage.cvrf;
import defpackage.dxkm;
import defpackage.eiho;
import defpackage.eijr;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensi;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function$CC;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class UserPresentIntentOperation extends IntentOperation {
    public final asnv a;

    public UserPresentIntentOperation() {
        this(asnz.a);
    }

    private static final cvre a() {
        try {
            eijr eijrVar = cvrf.a;
            final AtomicReference atomicReference = new AtomicReference(new cvrd(null));
            dxkm dxkmVar = (dxkm) cvrf.a.a();
            eiho eihoVar = new eiho() { // from class: cvqv
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    cvrr cvrrVar = (cvrr) obj;
                    eijr eijrVar2 = cvrf.a;
                    long j = cvrrVar.e;
                    final Optional empty = j == 0 ? Optional.empty() : Optional.of(Instant.ofEpochMilli(j));
                    AtomicReference atomicReference2 = atomicReference;
                    DesugarAtomicReference.updateAndGet(atomicReference2, new UnaryOperator() { // from class: cvqx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo464andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cvrd cvrdVar = (cvrd) obj2;
                            eijr eijrVar3 = cvrf.a;
                            cvrdVar.c(Optional.this);
                            return cvrdVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final boolean z = cvrrVar.f;
                    DesugarAtomicReference.updateAndGet(atomicReference2, new UnaryOperator() { // from class: cvqy
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo464andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cvrd cvrdVar = (cvrd) obj2;
                            eijr eijrVar3 = cvrf.a;
                            cvrdVar.b(z);
                            return cvrdVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final boolean z2 = true;
                    if ((cvrrVar.b & 1) == 0 || !cvrrVar.c) {
                        z2 = false;
                    } else {
                        fecj fecjVar = (fecj) cvrrVar.iB(5, null);
                        fecjVar.X(cvrrVar);
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        cvrr cvrrVar2 = (cvrr) fecjVar.b;
                        cvrrVar2.b |= 1;
                        cvrrVar2.c = false;
                        cvrrVar = (cvrr) fecjVar.Q();
                    }
                    DesugarAtomicReference.updateAndGet(atomicReference2, new UnaryOperator() { // from class: cvqz
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo464andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cvrd cvrdVar = (cvrd) obj2;
                            eijr eijrVar3 = cvrf.a;
                            cvrdVar.d(z2);
                            return cvrdVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return cvrrVar;
                }
            };
            enre enreVar = enre.a;
            return (cvre) ((enpf) enps.f(ensi.h(dxkmVar.b(eihoVar, enreVar)), new eiho() { // from class: cvqw
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    eijr eijrVar2 = cvrf.a;
                    return ((cvrd) atomicReference.get()).a();
                }
            }, enreVar)).u();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            ((ejhf) ((ejhf) ((ejhf) cvpo.a.j()).s(e)).ah((char) 8599)).x("Couldn't access PsaStore");
            cvrd cvrdVar = new cvrd(null);
            cvrdVar.b(false);
            cvrdVar.d(false);
            cvrdVar.c(Optional.empty());
            return cvrdVar.a();
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

    public UserPresentIntentOperation(asnv asnvVar) {
        this.a = asnvVar;
    }
}
