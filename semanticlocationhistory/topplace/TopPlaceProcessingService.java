package com.google.android.gms.semanticlocationhistory.topplace;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.isolation.OdlhJniLoader;
import com.google.android.gms.semanticlocationhistory.topplace.TopPlaceProcessingService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dbsm;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dbyr;
import defpackage.dcdn;
import defpackage.dcdv;
import defpackage.dceb;
import defpackage.dcey;
import defpackage.dcez;
import defpackage.dcfa;
import defpackage.dcfc;
import defpackage.dcqi;
import defpackage.dcry;
import defpackage.ddjk;
import defpackage.ddka;
import defpackage.ddkh;
import defpackage.ddlu;
import defpackage.ddlv;
import defpackage.ddot;
import defpackage.ddou;
import defpackage.eixb;
import defpackage.eizp;
import defpackage.ekut;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.elhx;
import defpackage.elpg;
import defpackage.eluo;
import defpackage.elzb;
import defpackage.elzp;
import defpackage.eqbm;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.etun;
import defpackage.fbaa;
import defpackage.fbio;
import defpackage.fbip;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fgvq;
import defpackage.fuqy;
import defpackage.furn;
import defpackage.fush;
import defpackage.fusk;
import defpackage.futg;
import defpackage.fwuc;
import defpackage.fwue;
import defpackage.fyut;
import j$.util.DesugarCollections;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class TopPlaceProcessingService extends GmsTaskBoundService {
    public static final ausn a = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "TopPlace");
    public static final String b = TopPlaceProcessingService.class.getName();
    private dbyr c;
    private dcqi d;
    private dbtc e;
    private dbvg f;
    private ddot g;
    private dcry h;

    public static native byte[] aggregate(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    public static native byte[] getClusterSnappedTimeline(byte[][] bArr);

    public static boolean j() {
        return fush.Q() && futg.a.lK().d();
    }

    private final dcry k() {
        if (this.h == null) {
            this.h = new dcry();
        }
        return this.h;
    }

    private final eqgl l() {
        return eqdl.f(k().g("TopPlaceProcessing", fgvq.h(System.currentTimeMillis())), new ekut() { // from class: ddwu
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ausn ausnVar = TopPlaceProcessingService.a;
                return 2;
            }
        }, eqex.a);
    }

    public static native byte[] populateGeoJournalSummaryUpgrades(byte[] bArr, byte[] bArr2, String str);

    public final dbtc d() {
        if (this.e == null) {
            this.e = new dbtc();
        }
        return this.e;
    }

    public final dbvg e() {
        if (this.f == null) {
            this.f = new dbvg(d());
        }
        return this.f;
    }

    public final dcdv f(Context context, final elgo elgoVar, long j, long j2) {
        String str;
        String str2;
        long j3;
        final dcdv dcdvVar;
        String str3;
        int i;
        List list;
        BitSet bitSet;
        long j4;
        String str4;
        String str5;
        dcdn dcdnVar;
        dceb dcebVar;
        dcdn dcdnVar2;
        fbaa fbaaVar;
        String str6 = "TopPlaceJniInvocationFail";
        String str7 = "JNI isolated api invocation failed";
        String str8 = "TopPlaceParseJniFail";
        int i2 = elgo.d;
        elgj elgjVar = new elgj();
        try {
            d().f("TopPlaceRawSignalNum", ((elpg) elgoVar).c);
            eixb e = eizp.e("com/google/android/gms/semanticlocationhistory/topplace/TopPlaceProcessingService", "clusterSignals", 899, "semanticlocationhistory-TopPlaceProcessingService_getClusterSnappedTimeline");
            try {
                Object a2 = OdlhJniLoader.a.a(new ddjk() { // from class: ddvy
                    @Override // defpackage.ddjk
                    public final Object a() {
                        elgo elgoVar2 = elgo.this;
                        int i3 = ((elpg) elgoVar2).c;
                        ausn ausnVar = TopPlaceProcessingService.a;
                        return TopPlaceProcessingService.getClusterSnappedTimeline((byte[][]) elgoVar2.toArray(new byte[i3][]));
                    }
                });
                e.close();
                fgqp fgqpVar = fgqp.a;
                fgti fgtiVar = fgti.a;
                int i3 = 0;
                fgri y = fgri.y(ddlv.a, (byte[]) a2, 0, ((byte[]) a2).length, fgqp.a);
                fgri.M(y);
                ddlv ddlvVar = (ddlv) y;
                dbtc d = d();
                fyut fyutVar = ddlvVar.c;
                if (fyutVar == null) {
                    fyutVar = fyut.b;
                }
                d.o(fyutVar, dbtc.d);
                elgjVar.k(elgo.i(ddlvVar.b));
                elgo g = elgjVar.g();
                dcfa dcfaVar = dcfa.a;
                try {
                    elhx elhxVar = new elhx();
                    int i4 = ((elpg) g).c;
                    int i5 = 0;
                    while (true) {
                        j3 = 100;
                        if (i5 >= i4) {
                            break;
                        }
                        dceb dcebVar2 = ((dcdn) g.get(i5)).e;
                        if (dcebVar2 == null) {
                            dcebVar2 = dceb.a;
                        }
                        elhxVar.k(dbsm.a(dcebVar2, 100L));
                        i5++;
                    }
                    ddot g2 = g(context);
                    fbio fbioVar = (fbio) fbip.a.v();
                    fbioVar.a(elhxVar.g());
                    if (!fbioVar.b.L()) {
                        fbioVar.U();
                    }
                    fbip.b((fbip) fbioVar.b);
                    elgo i6 = elgo.i(g2.b((fbip) fbioVar.Q()).b);
                    fgrc v = dcfa.a.v();
                    int i7 = 0;
                    while (i7 < i4) {
                        dcdn dcdnVar3 = (dcdn) g.get(i7);
                        dceb dcebVar3 = dcdnVar3.e;
                        if (dcebVar3 == null) {
                            dcebVar3 = dceb.a;
                        }
                        dceb dcebVar4 = dcdnVar3.e;
                        if (dcebVar4 == null) {
                            dcebVar4 = dceb.a;
                        }
                        List a3 = dbsm.a(dcebVar4, j3);
                        dcey dceyVar = dcey.a;
                        int size = i6.size();
                        dcey dceyVar2 = dceyVar;
                        while (i3 < size) {
                            elgo elgoVar2 = i6;
                            fbaa fbaaVar2 = (fbaa) i6.get(i3);
                            int i8 = i7;
                            int i9 = i3;
                            long j5 = fbaaVar2.c;
                            int i10 = i4;
                            if (a3.contains(Long.valueOf(j5))) {
                                BitSet valueOf = BitSet.valueOf(fbaaVar2.f.M());
                                i = size;
                                BitSet valueOf2 = BitSet.valueOf(fbaaVar2.g.M());
                                str3 = str8;
                                list = a3;
                                int i11 = 0;
                                while (i11 < fbaaVar2.e.size()) {
                                    if (!valueOf.get(i11) && !valueOf2.get(i11)) {
                                        str4 = str6;
                                        str5 = str7;
                                        bitSet = valueOf;
                                        j4 = j5;
                                        dcdnVar = dcdnVar3;
                                        dcebVar = dcebVar3;
                                        dcdnVar2 = dcdnVar;
                                        fbaaVar = fbaaVar2;
                                        i11++;
                                        dcebVar3 = dcebVar;
                                        valueOf = bitSet;
                                        str6 = str4;
                                        j5 = j4;
                                        str7 = str5;
                                        dcdnVar3 = dcdnVar2;
                                        fbaaVar2 = fbaaVar;
                                    }
                                    bitSet = valueOf;
                                    elzp j6 = elzp.j(dcebVar3.c, dcebVar3.d);
                                    elzp B = new elzb(j5).B();
                                    int c = B.e().c() + fbaaVar2.h.d(i11);
                                    j4 = j5;
                                    int c2 = B.g().c() + fbaaVar2.i.d(i11);
                                    str4 = str6;
                                    str5 = str7;
                                    double a4 = etun.a(j6, elzp.j(c, c2));
                                    if (dceyVar2.equals(dceyVar)) {
                                        dcdnVar = dcdnVar3;
                                        dcebVar = dcebVar3;
                                    } else {
                                        dcdnVar = dcdnVar3;
                                        dcebVar = dcebVar3;
                                        if (a4 < dceyVar2.f) {
                                        }
                                        dcdnVar2 = dcdnVar;
                                        fbaaVar = fbaaVar2;
                                        i11++;
                                        dcebVar3 = dcebVar;
                                        valueOf = bitSet;
                                        str6 = str4;
                                        j5 = j4;
                                        str7 = str5;
                                        dcdnVar3 = dcdnVar2;
                                        fbaaVar2 = fbaaVar;
                                    }
                                    fgrc v2 = dceyVar.v();
                                    long a5 = fbaaVar2.e.a(i11);
                                    dcdnVar2 = dcdnVar;
                                    if (!v2.b.L()) {
                                        v2.U();
                                    }
                                    fgri fgriVar = v2.b;
                                    dcey dceyVar3 = (dcey) fgriVar;
                                    fbaaVar = fbaaVar2;
                                    dceyVar3.b |= 1;
                                    dceyVar3.c = a5;
                                    if (!fgriVar.L()) {
                                        v2.U();
                                    }
                                    fgri fgriVar2 = v2.b;
                                    dcey dceyVar4 = (dcey) fgriVar2;
                                    dceyVar4.b |= 2;
                                    dceyVar4.d = c;
                                    if (!fgriVar2.L()) {
                                        v2.U();
                                    }
                                    fgri fgriVar3 = v2.b;
                                    dcey dceyVar5 = (dcey) fgriVar3;
                                    dceyVar5.b |= 4;
                                    dceyVar5.e = c2;
                                    if (!fgriVar3.L()) {
                                        v2.U();
                                    }
                                    dcey dceyVar6 = (dcey) v2.b;
                                    dceyVar6.b |= 8;
                                    dceyVar6.f = a4;
                                    dceyVar2 = (dcey) v2.Q();
                                    i11++;
                                    dcebVar3 = dcebVar;
                                    valueOf = bitSet;
                                    str6 = str4;
                                    j5 = j4;
                                    str7 = str5;
                                    dcdnVar3 = dcdnVar2;
                                    fbaaVar2 = fbaaVar;
                                }
                            } else {
                                str3 = str8;
                                i = size;
                                list = a3;
                            }
                            dcebVar3 = dcebVar3;
                            i7 = i8;
                            i6 = elgoVar2;
                            i4 = i10;
                            size = i;
                            a3 = list;
                            str8 = str3;
                            str7 = str7;
                            dcdnVar3 = dcdnVar3;
                            i3 = i9 + 1;
                            str6 = str6;
                        }
                        String str9 = str6;
                        String str10 = str7;
                        String str11 = str8;
                        elgo elgoVar3 = i6;
                        int i12 = i4;
                        int i13 = i7;
                        dcdn dcdnVar4 = dcdnVar3;
                        if (!dceyVar2.equals(dceyVar)) {
                            fgrc v3 = dcez.a.v();
                            if (!v3.b.L()) {
                                v3.U();
                            }
                            fgri fgriVar4 = v3.b;
                            dcez dcezVar = (dcez) fgriVar4;
                            dceyVar2.getClass();
                            dcezVar.d = dceyVar2;
                            dcezVar.b |= 2;
                            if (!fgriVar4.L()) {
                                v3.U();
                            }
                            dcez dcezVar2 = (dcez) v3.b;
                            dcdnVar4.getClass();
                            dcezVar2.c = dcdnVar4;
                            dcezVar2.b |= 1;
                            if (!v.b.L()) {
                                v.U();
                            }
                            dcfa dcfaVar2 = (dcfa) v.b;
                            dcez dcezVar3 = (dcez) v3.Q();
                            dcezVar3.getClass();
                            fgsa fgsaVar = dcfaVar2.b;
                            if (!fgsaVar.c()) {
                                dcfaVar2.b = fgri.E(fgsaVar);
                            }
                            dcfaVar2.b.add(dcezVar3);
                        }
                        i7 = i13 + 1;
                        i6 = elgoVar3;
                        i4 = i12;
                        str8 = str11;
                        str6 = str9;
                        str7 = str10;
                        i3 = 0;
                        j3 = 100;
                    }
                    String str12 = str6;
                    String str13 = str7;
                    String str14 = str8;
                    final dcfa dcfaVar3 = (dcfa) v.Q();
                    dcdv dcdvVar2 = dcdv.a;
                    try {
                        Map unmodifiableMap = fusk.g() ? DesugarCollections.unmodifiableMap(e().g().g) : e().A();
                        if (unmodifiableMap == null) {
                            dcdvVar = dcdv.a;
                        } else {
                            fgrc v4 = dcdv.a.v();
                            if (!v4.b.L()) {
                                v4.U();
                            }
                            ((dcdv) v4.b).b().putAll(unmodifiableMap);
                            dcdvVar = (dcdv) v4.Q();
                        }
                        fgrc v5 = dcfc.a.v();
                        int h = eqbm.h(TimeUnit.MILLISECONDS.toSeconds(j2));
                        if (!v5.b.L()) {
                            v5.U();
                        }
                        dcfc dcfcVar = (dcfc) v5.b;
                        dcfcVar.b |= 2;
                        dcfcVar.d = h;
                        int h2 = eqbm.h(TimeUnit.MILLISECONDS.toSeconds(j));
                        if (!v5.b.L()) {
                            v5.U();
                        }
                        fgri fgriVar5 = v5.b;
                        dcfc dcfcVar2 = (dcfc) fgriVar5;
                        dcfcVar2.b |= 4;
                        dcfcVar2.e = h2;
                        if (!fgriVar5.L()) {
                            v5.U();
                        }
                        fgri fgriVar6 = v5.b;
                        dcfc dcfcVar3 = (dcfc) fgriVar6;
                        dcfcVar3.b |= 1;
                        dcfcVar3.c = 90;
                        if (!fgriVar6.L()) {
                            v5.U();
                        }
                        dcfc dcfcVar4 = (dcfc) v5.b;
                        dcfcVar4.b |= 16;
                        dcfcVar4.f = 1;
                        final dcfc dcfcVar5 = (dcfc) v5.Q();
                        eixb e2 = eizp.e("com/google/android/gms/semanticlocationhistory/topplace/TopPlaceProcessingService", "getPlaceAggregatesTimeline", 942, "semanticlocationhistory-TopPlaceProcessingService_aggregate");
                        try {
                            Object a6 = OdlhJniLoader.a.a(new ddjk() { // from class: ddwj
                                @Override // defpackage.ddjk
                                public final Object a() {
                                    ausn ausnVar = TopPlaceProcessingService.a;
                                    dcfc dcfcVar6 = dcfcVar5;
                                    return TopPlaceProcessingService.aggregate(dcfa.this.r(), dcdvVar.r(), dcfcVar6.r(), 0);
                                }
                            });
                            e2.close();
                            fgri y2 = fgri.y(ddlu.a, (byte[]) a6, 0, ((byte[]) a6).length, fgqp.a());
                            fgri.M(y2);
                            ddlu ddluVar = (ddlu) y2;
                            dbtc d2 = d();
                            fyut fyutVar2 = ddluVar.c;
                            if (fyutVar2 == null) {
                                fyutVar2 = fyut.b;
                            }
                            d2.o(fyutVar2, dbtc.d);
                            dcdv dcdvVar3 = ddluVar.b;
                            return dcdvVar3 == null ? dcdv.a : dcdvVar3;
                        } finally {
                        }
                    } catch (RemoteException e3) {
                        ((eluo) ((eluo) ((eluo) a.j()).s(e3)).ai((char) 10836)).x(str13);
                        d().e(str12);
                        return dcdv.a;
                    } catch (fgsd e4) {
                        ((eluo) ((eluo) ((eluo) a.j()).s(e4)).ai((char) 10835)).x("Parsing aggregate output from JNI result failed.");
                        d().e(str14);
                        return dcdv.a;
                    }
                } catch (fwuc | fwue e5) {
                    ((eluo) ((eluo) ((eluo) a.j()).s(e5)).ai((char) 10837)).x("Fails to get Place info from the server.");
                    d().e("TopPlaceCallSlsFail");
                    return dcdv.a;
                }
            } catch (Throwable th) {
                str2 = "TopPlaceJniInvocationFail";
                str = "TopPlaceParseJniFail";
                try {
                    e.close();
                    throw th;
                } catch (Throwable th2) {
                    try {
                        th.addSuppressed(th2);
                        throw th;
                    } catch (RemoteException e6) {
                        e = e6;
                        ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 10839)).x("JNI isolated api invocation failed");
                        d().e(str2);
                        return dcdv.a;
                    } catch (fgsd e7) {
                        e = e7;
                        ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 10838)).x("Parsing cluster output from JNI result failed.");
                        d().e(str);
                        return dcdv.a;
                    }
                }
            }
        } catch (RemoteException e8) {
            e = e8;
            str2 = "TopPlaceJniInvocationFail";
        } catch (fgsd e9) {
            e = e9;
            str = "TopPlaceParseJniFail";
        }
    }

    public final ddot g(Context context) {
        if (this.g == null) {
            if (furn.a.lK().r()) {
                this.g = ddkh.c(context, context.getApplicationInfo().uid, new ddka(e(), d()));
            } else {
                this.g = ddou.e(context, context.getApplicationInfo().uid);
            }
        }
        return this.g;
    }

    public final eqgl h(dcdv dcdvVar) {
        OdlhJniLoader.a.b();
        if (dcdvVar.equals(dcdv.a)) {
            return fuqy.d() ? l() : eqgc.i(2);
        }
        if (e().T(DesugarCollections.unmodifiableMap(dcdvVar.b))) {
            d().e("TopPlaceProcessingServiceSuccess");
            return fuqy.d() ? eqdl.f(k().e("TopPlaceProcessing", false), new ekut() { // from class: ddwp
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    ausn ausnVar = TopPlaceProcessingService.a;
                    return 0;
                }
            }, eqex.a) : eqgc.i(0);
        }
        ((eluo) ((eluo) a.j()).ai((char) 10833)).x("Fails to store the TopPlace result into settings.");
        d().e("TopPlaceStoreResultFail");
        return fuqy.d() ? l() : eqgc.i(2);
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
    public final defpackage.eqgl iB(defpackage.cauf r22) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.topplace.TopPlaceProcessingService.iB(cauf):eqgl");
    }
}
