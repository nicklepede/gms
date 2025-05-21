package com.google.android.gms.semanticlocation.inference;

import defpackage.a;
import defpackage.asej;
import defpackage.asot;
import defpackage.czje;
import defpackage.czmb;
import defpackage.czmf;
import defpackage.cznh;
import defpackage.czok;
import defpackage.czqm;
import defpackage.daae;
import defpackage.egjy;
import defpackage.egmm;
import defpackage.eiho;
import defpackage.eiig;
import defpackage.ejhf;
import defpackage.erdc;
import defpackage.erdd;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fecy;
import defpackage.fecz;
import defpackage.feda;
import defpackage.frxn;
import defpackage.fvyj;
import defpackage.fvyk;
import defpackage.fvys;
import defpackage.fvyt;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class IncrementalTimelineInferrerImpl implements czmb {
    private static final asot a = asot.c("SemanticLocation", asej.SEMANTIC_LOCATION, "Inferrer");
    private long b = 0;
    private final czok c;
    private final czqm d;
    private final czje e;
    private final daae f;

    public IncrementalTimelineInferrerImpl(czqm czqmVar, czok czokVar, czje czjeVar, daae daaeVar) {
        this.d = czqmVar;
        this.c = czokVar;
        this.e = czjeVar;
        this.f = daaeVar;
    }

    private static native byte[] createImpl(byte[] bArr);

    private static native void destroyImpl(long j);

    private static String e(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append("\n");
            sb.append(str);
        }
        return sb.toString();
    }

    private static void f(erdd erddVar, fvyt fvytVar, czje czjeVar) {
        String e = e(fvytVar.e);
        if (!e.isEmpty()) {
            ((ejhf) ((ejhf) a.i()).ah(9651)).P("%s%s", erddVar, new erdd(erdc.NO_USER_DATA, e));
        }
        String e2 = e(fvytVar.d);
        if (!e2.isEmpty()) {
            ((ejhf) ((ejhf) a.h()).ah(9650)).P("%s%s", erddVar, new erdd(erdc.NO_USER_DATA, e2));
        }
        e(fvytVar.c).isEmpty();
        StringBuilder sb = new StringBuilder();
        fecy fecyVar = fvytVar.f;
        fecz feczVar = fvyt.a;
        Iterator<E> it = new feda(fecyVar, feczVar).iterator();
        while (it.hasNext()) {
            sb.append(((fvys) it.next()).as);
            sb.append("; ");
        }
        if (frxn.a.a().ag()) {
            Iterator<E> it2 = new feda(fvytVar.f, feczVar).iterator();
            while (it2.hasNext()) {
                int i = ((fvys) it2.next()).as;
                if (i > 0) {
                    czjeVar.k("IncrementalTimelineInferrerErrorCodeHistogram", i);
                }
            }
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return;
        }
        ejhf ejhfVar = (ejhf) ((ejhf) a.i()).ah(9648);
        erdc erdcVar = erddVar.a;
        erdc erdcVar2 = erdc.NO_USER_DATA;
        ejhfVar.B("%s", new erdd(erdcVar2, a.p(sb2, erdcVar == erdcVar2 ? erddVar.toString() : "<REDACTED>: ", "Error IDs: ")));
    }

    private static native byte[] invokeImplPredict(long j, byte[] bArr);

    private static native void serializeInferrerStateImpl(long j, String str);

    @Override // defpackage.czmb
    public final fvyk a(final fvyj fvyjVar) {
        eiig.b(d(), "Attempting to call `predict` in uninitialized state");
        egjy e = egmm.e("com/google/android/gms/semanticlocation/inference/IncrementalTimelineInferrerImpl", "predict", 193, "predict");
        try {
            byte[] invokeImplPredict = invokeImplPredict(this.b, fvyjVar.r());
            fecp y = fecp.y(fvyk.a, invokeImplPredict, 0, invokeImplPredict.length, febw.a());
            fecp.M(y);
            final fvyk fvykVar = (fvyk) y;
            e.close();
            czje czjeVar = this.e;
            erdd erddVar = new erdd(erdc.NO_USER_DATA, "IncrementalTimelineInferrer.predict() logs: ");
            fvyt fvytVar = fvykVar.d;
            if (fvytVar == null) {
                fvytVar = fvyt.b;
            }
            f(erddVar, fvytVar, czjeVar);
            daae daaeVar = this.f;
            if (daaeVar != null) {
                final String d = this.c.d();
                daaeVar.c(new eiho() { // from class: czzy
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        fecj fecjVar = (fecj) obj;
                        int i = daae.b;
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        String str = d;
                        czsb czsbVar = (czsb) fecjVar.b;
                        czsb czsbVar2 = czsb.a;
                        str.getClass();
                        czsbVar.b |= 2;
                        czsbVar.d = str;
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        fvyj fvyjVar2 = fvyjVar;
                        fecp fecpVar = fecjVar.b;
                        czsb czsbVar3 = (czsb) fecpVar;
                        fvyjVar2.getClass();
                        czsbVar3.k = fvyjVar2;
                        czsbVar3.b |= 128;
                        if (!fecpVar.L()) {
                            fecjVar.U();
                        }
                        fvyk fvykVar2 = fvykVar;
                        czsb czsbVar4 = (czsb) fecjVar.b;
                        fvykVar2.getClass();
                        czsbVar4.l = fvykVar2;
                        czsbVar4.b |= 256;
                        return fecjVar;
                    }
                });
            }
            if (!fvykVar.c) {
                czjeVar.g(21);
            }
            if (frxn.A()) {
                czok czokVar = this.c;
                if (czokVar.f()) {
                    egjy e2 = egmm.e("com/google/android/gms/semanticlocation/inference/IncrementalTimelineInferrerImpl", "predict", 213, "serializeInferrer");
                    try {
                        serializeInferrerStateImpl(this.b, cznh.a(czokVar.e()));
                        e2.close();
                        return fvykVar;
                    } catch (Throwable th) {
                        try {
                            e2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            return fvykVar;
        } catch (Throwable th3) {
            try {
                e.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0593  */
    @Override // defpackage.czmb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocation.inference.IncrementalTimelineInferrerImpl.b():void");
    }

    @Override // defpackage.czmb
    public final void c() {
        if (d()) {
            destroyImpl(this.b);
            this.b = 0L;
        }
    }

    @Override // defpackage.czmb
    public final boolean d() {
        return czmf.c() && this.b != 0;
    }
}
