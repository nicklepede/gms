package com.google.android.gms.semanticlocationhistory.topplace;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.isolation.OdlhJniLoader;
import com.google.android.gms.semanticlocationhistory.topplace.TopPlaceProcessingService;
import defpackage.asej;
import defpackage.asot;
import defpackage.czio;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czoq;
import defpackage.cztm;
import defpackage.cztu;
import defpackage.czua;
import defpackage.czux;
import defpackage.czuy;
import defpackage.czuz;
import defpackage.czvb;
import defpackage.daga;
import defpackage.dahq;
import defpackage.dazc;
import defpackage.dazs;
import defpackage.dazz;
import defpackage.dbbm;
import defpackage.dbbn;
import defpackage.dbel;
import defpackage.dbem;
import defpackage.egjy;
import defpackage.egmm;
import defpackage.eiho;
import defpackage.eite;
import defpackage.eitj;
import defpackage.eius;
import defpackage.ejcb;
import defpackage.ejhf;
import defpackage.ejls;
import defpackage.ejmh;
import defpackage.ennt;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.erfr;
import defpackage.eylo;
import defpackage.eyua;
import defpackage.eyub;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.fedk;
import defpackage.feep;
import defpackage.fegx;
import defpackage.frwe;
import defpackage.frwt;
import defpackage.frxn;
import defpackage.frxq;
import defpackage.frym;
import defpackage.ftye;
import defpackage.ftyg;
import defpackage.fvyt;
import j$.util.DesugarCollections;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class TopPlaceProcessingService extends GmsTaskBoundService {
    public static final asot a = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "TopPlace");
    public static final String b = TopPlaceProcessingService.class.getName();
    private czoq c;
    private daga d;
    private czje e;
    private czlk f;
    private dbel g;
    private dahq h;

    public static native byte[] aggregate(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    public static native byte[] getClusterSnappedTimeline(byte[][] bArr);

    public static boolean j() {
        return frxn.Q() && frym.a.a().d();
    }

    private final dahq k() {
        if (this.h == null) {
            this.h = new dahq();
        }
        return this.h;
    }

    private final enss l() {
        return enps.f(k().g("TopPlaceProcessing", fegx.h(System.currentTimeMillis())), new eiho() { // from class: dbmo
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                asot asotVar = TopPlaceProcessingService.a;
                return 2;
            }
        }, enre.a);
    }

    public static native byte[] populateGeoJournalSummaryUpgrades(byte[] bArr, byte[] bArr2, String str);

    public final czje d() {
        if (this.e == null) {
            this.e = new czje();
        }
        return this.e;
    }

    public final czlk e() {
        if (this.f == null) {
            this.f = new czlk(d());
        }
        return this.f;
    }

    public final cztu f(Context context, final eitj eitjVar, long j, long j2) {
        long j3;
        final cztu cztuVar;
        int i;
        int i2;
        List list;
        BitSet bitSet;
        long j4;
        BitSet bitSet2;
        czua czuaVar;
        czux czuxVar;
        int i3;
        eylo eyloVar;
        int i4 = eitj.d;
        eite eiteVar = new eite();
        try {
            d().f("TopPlaceRawSignalNum", ((ejcb) eitjVar).c);
            egjy e = egmm.e("com/google/android/gms/semanticlocationhistory/topplace/TopPlaceProcessingService", "clusterSignals", 899, "semanticlocationhistory-TopPlaceProcessingService_getClusterSnappedTimeline");
            try {
                Object a2 = OdlhJniLoader.a.a(new dazc() { // from class: dbls
                    @Override // defpackage.dazc
                    public final Object a() {
                        eitj eitjVar2 = eitj.this;
                        int i5 = ((ejcb) eitjVar2).c;
                        asot asotVar = TopPlaceProcessingService.a;
                        return TopPlaceProcessingService.getClusterSnappedTimeline((byte[][]) eitjVar2.toArray(new byte[i5][]));
                    }
                });
                e.close();
                febw febwVar = febw.a;
                feep feepVar = feep.a;
                int i5 = 0;
                fecp y = fecp.y(dbbn.a, (byte[]) a2, 0, ((byte[]) a2).length, febw.a);
                fecp.M(y);
                dbbn dbbnVar = (dbbn) y;
                czje d = d();
                fvyt fvytVar = dbbnVar.c;
                if (fvytVar == null) {
                    fvytVar = fvyt.b;
                }
                d.o(fvytVar, czje.d);
                eiteVar.k(eitj.i(dbbnVar.b));
                eitj g = eiteVar.g();
                czuz czuzVar = czuz.a;
                try {
                    eius eiusVar = new eius();
                    int i6 = ((ejcb) g).c;
                    int i7 = 0;
                    while (true) {
                        j3 = 100;
                        if (i7 >= i6) {
                            break;
                        }
                        czua czuaVar2 = ((cztm) g.get(i7)).e;
                        if (czuaVar2 == null) {
                            czuaVar2 = czua.a;
                        }
                        eiusVar.k(czio.a(czuaVar2, 100L));
                        i7++;
                    }
                    dbel g2 = g(context);
                    eyua eyuaVar = (eyua) eyub.a.v();
                    eyuaVar.a(eiusVar.g());
                    if (!eyuaVar.b.L()) {
                        eyuaVar.U();
                    }
                    eyub.b((eyub) eyuaVar.b);
                    eitj i8 = eitj.i(g2.b((eyub) eyuaVar.Q()).b);
                    fecj v = czuz.a.v();
                    int i9 = 0;
                    while (i9 < i6) {
                        cztm cztmVar = (cztm) g.get(i9);
                        czua czuaVar3 = cztmVar.e;
                        if (czuaVar3 == null) {
                            czuaVar3 = czua.a;
                        }
                        czua czuaVar4 = cztmVar.e;
                        if (czuaVar4 == null) {
                            czuaVar4 = czua.a;
                        }
                        List a3 = czio.a(czuaVar4, j3);
                        czux czuxVar2 = czux.a;
                        int size = i8.size();
                        czux czuxVar3 = czuxVar2;
                        while (i5 < size) {
                            eylo eyloVar2 = (eylo) i8.get(i5);
                            eitj eitjVar2 = i8;
                            int i10 = i6;
                            long j5 = eyloVar2.c;
                            int i11 = i9;
                            if (a3.contains(Long.valueOf(j5))) {
                                BitSet valueOf = BitSet.valueOf(eyloVar2.f.M());
                                i = i5;
                                BitSet valueOf2 = BitSet.valueOf(eyloVar2.g.M());
                                i2 = size;
                                list = a3;
                                int i12 = 0;
                                while (i12 < eyloVar2.e.size()) {
                                    if (!valueOf.get(i12) && !valueOf2.get(i12)) {
                                        j4 = j5;
                                        bitSet = valueOf;
                                        bitSet2 = valueOf2;
                                        czuaVar = czuaVar3;
                                        i3 = i12;
                                        eyloVar = eyloVar2;
                                        i12 = i3 + 1;
                                        valueOf = bitSet;
                                        valueOf2 = bitSet2;
                                        j5 = j4;
                                        czuaVar3 = czuaVar;
                                        eyloVar2 = eyloVar;
                                    }
                                    bitSet = valueOf;
                                    ejmh j6 = ejmh.j(czuaVar3.c, czuaVar3.d);
                                    ejmh B = new ejls(j5).B();
                                    j4 = j5;
                                    int c = B.e().c() + eyloVar2.h.d(i12);
                                    int c2 = B.g().c() + eyloVar2.i.d(i12);
                                    bitSet2 = valueOf2;
                                    double a4 = erfr.a(j6, ejmh.j(c, c2));
                                    czux czuxVar4 = czux.a;
                                    if (czuxVar3.equals(czuxVar4)) {
                                        czuaVar = czuaVar3;
                                        czuxVar = czuxVar4;
                                    } else {
                                        czuaVar = czuaVar3;
                                        czuxVar = czuxVar4;
                                        if (a4 < czuxVar3.f) {
                                        }
                                        i3 = i12;
                                        eyloVar = eyloVar2;
                                        i12 = i3 + 1;
                                        valueOf = bitSet;
                                        valueOf2 = bitSet2;
                                        j5 = j4;
                                        czuaVar3 = czuaVar;
                                        eyloVar2 = eyloVar;
                                    }
                                    fecj v2 = czuxVar.v();
                                    long a5 = eyloVar2.e.a(i12);
                                    i3 = i12;
                                    if (!v2.b.L()) {
                                        v2.U();
                                    }
                                    fecp fecpVar = v2.b;
                                    czux czuxVar5 = (czux) fecpVar;
                                    eyloVar = eyloVar2;
                                    czuxVar5.b |= 1;
                                    czuxVar5.c = a5;
                                    if (!fecpVar.L()) {
                                        v2.U();
                                    }
                                    fecp fecpVar2 = v2.b;
                                    czux czuxVar6 = (czux) fecpVar2;
                                    czuxVar6.b |= 2;
                                    czuxVar6.d = c;
                                    if (!fecpVar2.L()) {
                                        v2.U();
                                    }
                                    fecp fecpVar3 = v2.b;
                                    czux czuxVar7 = (czux) fecpVar3;
                                    czuxVar7.b |= 4;
                                    czuxVar7.e = c2;
                                    if (!fecpVar3.L()) {
                                        v2.U();
                                    }
                                    czux czuxVar8 = (czux) v2.b;
                                    czuxVar8.b |= 8;
                                    czuxVar8.f = a4;
                                    czuxVar3 = (czux) v2.Q();
                                    i12 = i3 + 1;
                                    valueOf = bitSet;
                                    valueOf2 = bitSet2;
                                    j5 = j4;
                                    czuaVar3 = czuaVar;
                                    eyloVar2 = eyloVar;
                                }
                            } else {
                                i = i5;
                                i2 = size;
                                list = a3;
                            }
                            i5 = i + 1;
                            i6 = i10;
                            i8 = eitjVar2;
                            i9 = i11;
                            size = i2;
                            a3 = list;
                            czuaVar3 = czuaVar3;
                        }
                        eitj eitjVar3 = i8;
                        int i13 = i6;
                        int i14 = i9;
                        if (!czuxVar3.equals(czux.a)) {
                            fecj v3 = czuy.a.v();
                            if (!v3.b.L()) {
                                v3.U();
                            }
                            fecp fecpVar4 = v3.b;
                            czuy czuyVar = (czuy) fecpVar4;
                            czuxVar3.getClass();
                            czuyVar.d = czuxVar3;
                            czuyVar.b |= 2;
                            if (!fecpVar4.L()) {
                                v3.U();
                            }
                            czuy czuyVar2 = (czuy) v3.b;
                            cztmVar.getClass();
                            czuyVar2.c = cztmVar;
                            czuyVar2.b |= 1;
                            if (!v.b.L()) {
                                v.U();
                            }
                            czuz czuzVar2 = (czuz) v.b;
                            czuy czuyVar3 = (czuy) v3.Q();
                            czuyVar3.getClass();
                            fedh fedhVar = czuzVar2.b;
                            if (!fedhVar.c()) {
                                czuzVar2.b = fecp.E(fedhVar);
                            }
                            czuzVar2.b.add(czuyVar3);
                        }
                        i9 = i14 + 1;
                        i6 = i13;
                        i8 = eitjVar3;
                        i5 = 0;
                        j3 = 100;
                    }
                    final czuz czuzVar3 = (czuz) v.Q();
                    cztu cztuVar2 = cztu.a;
                    try {
                        Map unmodifiableMap = frxq.h() ? DesugarCollections.unmodifiableMap(e().g().g) : e().A();
                        if (unmodifiableMap == null) {
                            cztuVar = cztu.a;
                        } else {
                            fecj v4 = cztu.a.v();
                            if (!v4.b.L()) {
                                v4.U();
                            }
                            ((cztu) v4.b).b().putAll(unmodifiableMap);
                            cztuVar = (cztu) v4.Q();
                        }
                        fecj v5 = czvb.a.v();
                        int h = ennt.h(TimeUnit.MILLISECONDS.toSeconds(j2));
                        if (!v5.b.L()) {
                            v5.U();
                        }
                        czvb czvbVar = (czvb) v5.b;
                        czvbVar.b |= 2;
                        czvbVar.d = h;
                        int h2 = ennt.h(TimeUnit.MILLISECONDS.toSeconds(j));
                        if (!v5.b.L()) {
                            v5.U();
                        }
                        fecp fecpVar5 = v5.b;
                        czvb czvbVar2 = (czvb) fecpVar5;
                        czvbVar2.b |= 4;
                        czvbVar2.e = h2;
                        if (!fecpVar5.L()) {
                            v5.U();
                        }
                        fecp fecpVar6 = v5.b;
                        czvb czvbVar3 = (czvb) fecpVar6;
                        czvbVar3.b |= 1;
                        czvbVar3.c = 90;
                        if (!fecpVar6.L()) {
                            v5.U();
                        }
                        czvb czvbVar4 = (czvb) v5.b;
                        czvbVar4.b |= 16;
                        czvbVar4.f = 1;
                        final czvb czvbVar5 = (czvb) v5.Q();
                        e = egmm.e("com/google/android/gms/semanticlocationhistory/topplace/TopPlaceProcessingService", "getPlaceAggregatesTimeline", 942, "semanticlocationhistory-TopPlaceProcessingService_aggregate");
                        try {
                            Object a6 = OdlhJniLoader.a.a(new dazc() { // from class: dbmd
                                @Override // defpackage.dazc
                                public final Object a() {
                                    asot asotVar = TopPlaceProcessingService.a;
                                    czvb czvbVar6 = czvbVar5;
                                    return TopPlaceProcessingService.aggregate(czuz.this.r(), cztuVar.r(), czvbVar6.r(), 0);
                                }
                            });
                            e.close();
                            fecp y2 = fecp.y(dbbm.a, (byte[]) a6, 0, ((byte[]) a6).length, febw.a());
                            fecp.M(y2);
                            dbbm dbbmVar = (dbbm) y2;
                            czje d2 = d();
                            fvyt fvytVar2 = dbbmVar.c;
                            if (fvytVar2 == null) {
                                fvytVar2 = fvyt.b;
                            }
                            d2.o(fvytVar2, czje.d);
                            cztu cztuVar3 = dbbmVar.b;
                            return cztuVar3 == null ? cztu.a : cztuVar3;
                        } finally {
                        }
                    } catch (RemoteException e2) {
                        ((ejhf) ((ejhf) ((ejhf) a.j()).s(e2)).ah((char) 10833)).x("JNI isolated api invocation failed");
                        d().e("TopPlaceJniInvocationFail");
                        return cztu.a;
                    } catch (fedk e3) {
                        ((ejhf) ((ejhf) ((ejhf) a.j()).s(e3)).ah((char) 10832)).x("Parsing aggregate output from JNI result failed.");
                        d().e("TopPlaceParseJniFail");
                        return cztu.a;
                    }
                } catch (ftye | ftyg e4) {
                    ((ejhf) ((ejhf) ((ejhf) a.j()).s(e4)).ah((char) 10834)).x("Fails to get Place info from the server.");
                    d().e("TopPlaceCallSlsFail");
                    return cztu.a;
                }
            } finally {
            }
        } catch (RemoteException e5) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e5)).ah((char) 10836)).x("JNI isolated api invocation failed");
            d().e("TopPlaceJniInvocationFail");
            return cztu.a;
        } catch (fedk e6) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e6)).ah((char) 10835)).x("Parsing cluster output from JNI result failed.");
            d().e("TopPlaceParseJniFail");
            return cztu.a;
        }
    }

    public final dbel g(Context context) {
        if (this.g == null) {
            if (frwt.a.a().r()) {
                this.g = dazz.c(context, context.getApplicationInfo().uid, new dazs(e(), d()));
            } else {
                this.g = dbem.e(context, context.getApplicationInfo().uid);
            }
        }
        return this.g;
    }

    public final enss h(cztu cztuVar) {
        OdlhJniLoader.a.b();
        if (cztuVar.equals(cztu.a)) {
            return frwe.d() ? l() : ensj.i(2);
        }
        if (e().T(DesugarCollections.unmodifiableMap(cztuVar.b))) {
            d().e("TopPlaceProcessingServiceSuccess");
            return frwe.d() ? enps.f(k().e("TopPlaceProcessing", false), new eiho() { // from class: dbmj
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    asot asotVar = TopPlaceProcessingService.a;
                    return 0;
                }
            }, enre.a) : ensj.i(0);
        }
        ((ejhf) ((ejhf) a.j()).ah((char) 10830)).x("Fails to store the TopPlace result into settings.");
        d().e("TopPlaceStoreResultFail");
        return frwe.d() ? l() : ensj.i(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.enss im(defpackage.byln r22) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.topplace.TopPlaceProcessingService.im(byln):enss");
    }
}
