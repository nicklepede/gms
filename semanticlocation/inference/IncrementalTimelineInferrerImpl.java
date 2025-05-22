package com.google.android.gms.semanticlocation.inference;

import defpackage.a;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dbtc;
import defpackage.dbvx;
import defpackage.dbwb;
import defpackage.dbxd;
import defpackage.dbyg;
import defpackage.dcan;
import defpackage.dckf;
import defpackage.eixb;
import defpackage.eizp;
import defpackage.ekut;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.etry;
import defpackage.etrz;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgrr;
import defpackage.fgrs;
import defpackage.fgrt;
import defpackage.fush;
import defpackage.fyuj;
import defpackage.fyuk;
import defpackage.fyus;
import defpackage.fyut;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class IncrementalTimelineInferrerImpl implements dbvx {
    private static final ausn a = ausn.c("SemanticLocation", auid.SEMANTIC_LOCATION, "Inferrer");
    private long b = 0;
    private final dbyg c;
    private final dcan d;
    private final dbtc e;
    private final dckf f;

    public IncrementalTimelineInferrerImpl(dcan dcanVar, dbyg dbygVar, dbtc dbtcVar, dckf dckfVar) {
        this.d = dcanVar;
        this.c = dbygVar;
        this.e = dbtcVar;
        this.f = dckfVar;
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

    private static void f(etrz etrzVar, fyut fyutVar, dbtc dbtcVar) {
        String e = e(fyutVar.e);
        if (!e.isEmpty()) {
            ((eluo) ((eluo) a.i()).ai(9653)).P("%s%s", etrzVar, new etrz(etry.NO_USER_DATA, e));
        }
        String e2 = e(fyutVar.d);
        if (!e2.isEmpty()) {
            ((eluo) ((eluo) a.h()).ai(9652)).P("%s%s", etrzVar, new etrz(etry.NO_USER_DATA, e2));
        }
        e(fyutVar.c).isEmpty();
        StringBuilder sb = new StringBuilder();
        fgrr fgrrVar = fyutVar.f;
        fgrs fgrsVar = fyut.a;
        Iterator<E> it = new fgrt(fgrrVar, fgrsVar).iterator();
        while (it.hasNext()) {
            sb.append(((fyus) it.next()).as);
            sb.append("; ");
        }
        if (fush.a.lK().af()) {
            Iterator<E> it2 = new fgrt(fyutVar.f, fgrsVar).iterator();
            while (it2.hasNext()) {
                int i = ((fyus) it2.next()).as;
                if (i > 0) {
                    dbtcVar.k("IncrementalTimelineInferrerErrorCodeHistogram", i);
                }
            }
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return;
        }
        eluo eluoVar = (eluo) ((eluo) a.i()).ai(9650);
        etry etryVar = etrzVar.a;
        etry etryVar2 = etry.NO_USER_DATA;
        eluoVar.B("%s", new etrz(etryVar2, a.p(sb2, etryVar == etryVar2 ? etrzVar.toString() : "<REDACTED>: ", "Error IDs: ")));
    }

    private static native byte[] invokeImplPredict(long j, byte[] bArr);

    private static native void serializeInferrerStateImpl(long j, String str);

    @Override // defpackage.dbvx
    public final fyuk a(final fyuj fyujVar) {
        ekvl.b(d(), "Attempting to call `predict` in uninitialized state");
        eixb e = eizp.e("com/google/android/gms/semanticlocation/inference/IncrementalTimelineInferrerImpl", "predict", 191, "predict");
        try {
            byte[] invokeImplPredict = invokeImplPredict(this.b, fyujVar.r());
            fgri y = fgri.y(fyuk.a, invokeImplPredict, 0, invokeImplPredict.length, fgqp.a());
            fgri.M(y);
            final fyuk fyukVar = (fyuk) y;
            e.close();
            dbtc dbtcVar = this.e;
            etrz etrzVar = new etrz(etry.NO_USER_DATA, "IncrementalTimelineInferrer.predict() logs: ");
            fyut fyutVar = fyukVar.d;
            if (fyutVar == null) {
                fyutVar = fyut.b;
            }
            f(etrzVar, fyutVar, dbtcVar);
            dckf dckfVar = this.f;
            if (dckfVar != null) {
                final String d = this.c.d();
                dckfVar.c(new ekut() { // from class: dcjz
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        fgrc fgrcVar = (fgrc) obj;
                        int i = dckf.b;
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        String str = d;
                        dccc dcccVar = (dccc) fgrcVar.b;
                        dccc dcccVar2 = dccc.a;
                        str.getClass();
                        dcccVar.b |= 2;
                        dcccVar.d = str;
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        fyuj fyujVar2 = fyujVar;
                        fgri fgriVar = fgrcVar.b;
                        dccc dcccVar3 = (dccc) fgriVar;
                        fyujVar2.getClass();
                        dcccVar3.k = fyujVar2;
                        dcccVar3.b |= 128;
                        if (!fgriVar.L()) {
                            fgrcVar.U();
                        }
                        fyuk fyukVar2 = fyukVar;
                        dccc dcccVar4 = (dccc) fgrcVar.b;
                        fyukVar2.getClass();
                        dcccVar4.l = fyukVar2;
                        dcccVar4.b |= 256;
                        return fgrcVar;
                    }
                });
            }
            if (!fyukVar.c) {
                dbtcVar.g(21);
            }
            if (fush.A()) {
                dbyg dbygVar = this.c;
                if (dbygVar.f()) {
                    eixb e2 = eizp.e("com/google/android/gms/semanticlocation/inference/IncrementalTimelineInferrerImpl", "predict", 211, "serializeInferrer");
                    try {
                        serializeInferrerStateImpl(this.b, dbxd.a(dbygVar.e()));
                        e2.close();
                        return fyukVar;
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
            return fyukVar;
        } catch (Throwable th3) {
            try {
                e.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(103:13|(1:16)|17|(1:19)|20|(1:214)(1:25)|26|(1:28)|29|(1:31)|32|(1:34)|35|(1:37)|38|(1:40)|41|(1:43)|44|(1:46)|47|(1:49)|50|(1:52)|53|(1:55)|56|(1:58)|59|(1:61)|62|(1:64)|65|(1:67)|68|(1:70)|71|(1:73)|74|(1:76)|77|(1:79)|80|(1:82)|83|(1:85)|86|(1:88)|89|(1:91)|92|(1:94)|95|(1:97)|98|(1:100)|101|(1:103)|104|(1:106)|107|(1:109)|110|(1:112)|113|(1:115)|116|(1:118)|119|(1:121)|122|(1:124)|125|(1:127)|128|(1:130)|131|(1:133)|134|(1:136)|137|(1:139)|140|(1:142)|143|(3:145|(1:147)|148)|149|(6:151|(1:153)|154|(1:156)|157|(9:160|(1:162)|163|164|(1:166)|167|(1:169)|170|(3:174|175|176)(3:178|(3:181|182|184)(2:189|(2:193|194))|185)))|197|198|199|164|(0)|167|(0)|170|(4:172|174|175|176)|178|(4:181|182|184|185)|189|(1:196)(3:191|193|194)|185|10) */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0561, code lost:
    
        r9 = defpackage.fyun.a.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x056d, code lost:
    
        if (r9.b.L() == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x056f, code lost:
    
        r9.U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0572, code lost:
    
        r10 = (defpackage.fyun) r9.b;
        r10.d = 2;
        r10.b |= 2;
        r10 = defpackage.fyut.b.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x058b, code lost:
    
        if (r10.b.L() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x058d, code lost:
    
        r10.U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0590, code lost:
    
        r11 = (defpackage.fyut) r10.b;
        r12 = r11.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x059a, code lost:
    
        if (r12.c() == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x059c, code lost:
    
        r11.e = defpackage.fgri.E(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x05a2, code lost:
    
        r11.e.add("Parsing `InferrerInitializationResult` from JNI failed!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x05af, code lost:
    
        if (r9.b.L() == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x05b1, code lost:
    
        r9.U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x05b4, code lost:
    
        r11 = (defpackage.fyun) r9.b;
        r10 = (defpackage.fyut) r10.Q();
        r10.getClass();
        r11.e = r10;
        r11.b |= 4;
        r9 = (defpackage.fyun) r9.Q();
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05f1  */
    @Override // defpackage.dbvx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocation.inference.IncrementalTimelineInferrerImpl.b():void");
    }

    @Override // defpackage.dbvx
    public final void c() {
        if (d()) {
            destroyImpl(this.b);
            this.b = 0L;
        }
    }

    @Override // defpackage.dbvx
    public final boolean d() {
        return dbwb.c() && this.b != 0;
    }
}
