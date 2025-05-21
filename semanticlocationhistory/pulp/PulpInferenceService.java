package com.google.android.gms.semanticlocationhistory.pulp;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.isolation.OdlhJniLoader;
import com.google.android.gms.semanticlocationhistory.pulp.PulpInferenceService;
import com.google.android.libraries.geller.portable.Geller;
import defpackage.asej;
import defpackage.asot;
import defpackage.bwth;
import defpackage.byln;
import defpackage.czip;
import defpackage.czix;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czop;
import defpackage.czoq;
import defpackage.czoy;
import defpackage.czpj;
import defpackage.czps;
import defpackage.czta;
import defpackage.cztc;
import defpackage.dade;
import defpackage.dadh;
import defpackage.dahq;
import defpackage.dbdz;
import defpackage.dbeb;
import defpackage.dbej;
import defpackage.dbmx;
import defpackage.dboa;
import defpackage.dnus;
import defpackage.dpjp;
import defpackage.dpjq;
import defpackage.dplo;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eitj;
import defpackage.eits;
import defpackage.ejhf;
import defpackage.enox;
import defpackage.enps;
import defpackage.enqb;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.enti;
import defpackage.erdc;
import defpackage.erdd;
import defpackage.eykr;
import defpackage.eykt;
import defpackage.eykx;
import defpackage.feab;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.fefi;
import defpackage.fegx;
import defpackage.feof;
import defpackage.frwe;
import defpackage.frwz;
import defpackage.frxn;
import defpackage.frxq;
import defpackage.fvxx;
import defpackage.fvxz;
import defpackage.fvya;
import defpackage.fvyb;
import defpackage.fvyc;
import defpackage.fvyd;
import defpackage.fvzd;
import defpackage.fvze;
import defpackage.fvzf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PulpInferenceService extends GmsTaskBoundService {
    public dboa c;
    public dnus d;
    public dbmx e;
    private czoq g;
    private dbdz h;
    private dade j;
    private czje k;
    private czlk l;
    private dbeb m;
    private dahq n;
    public static final asot a = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "PULP");
    private static final eits f = eits.n(eykt.HOME, fvxz.HOME, eykt.WORK, fvxz.WORK, eykt.ALIASED_LOCATION, fvxz.NICKNAME);
    public static final String b = PulpInferenceService.class.getName();

    public static native byte[] calculatePulp(byte[] bArr, boolean z, boolean z2);

    public static boolean k() {
        return frxn.Q() && frwz.f();
    }

    public final czje d() {
        if (this.k == null) {
            this.k = new czje();
        }
        return this.k;
    }

    public final czlk e() {
        if (this.l == null) {
            this.l = new czlk(d());
        }
        return this.l;
    }

    final dade f() {
        if (this.j == null) {
            this.j = dadh.w(AppContextProvider.a());
        }
        return this.j;
    }

    public final dahq g() {
        if (this.n == null) {
            this.n = new dahq();
        }
        return this.n;
    }

    public final dbeb h() {
        if (this.m == null) {
            this.m = new dbej();
        }
        return this.m;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        if (!k()) {
            return ensj.i(0);
        }
        if (!frxq.h() ? !e().J() : !e().g().e) {
            return ensj.i(0);
        }
        d().e("PulpStartInferenceForDevice");
        this.k.k("PulpStartInferenceTimeOfDay", (int) (((System.currentTimeMillis() / 60000) % 1440) / 30));
        final Context a2 = AppContextProvider.a();
        if (!bwth.q(a2)) {
            d().e("PulpDeviceLocationDisabled");
            return ensj.i(0);
        }
        d().e("PulpDeviceLocationEnabled");
        final OdlhJniLoader odlhJniLoader = OdlhJniLoader.a;
        if (!odlhJniLoader.d(a2)) {
            ((ejhf) ((ejhf) a.i()).ah((char) 10552)).x("loadLibrary failed");
            d().e("PulpLoadJniLibraryFail");
            return frwe.d() ? enps.f(g().g("PulpInference", fegx.h(System.currentTimeMillis())), new eiho() { // from class: dbdi
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    asot asotVar = PulpInferenceService.a;
                    return 2;
                }
            }, enre.a) : ensj.i(2);
        }
        if (!odlhJniLoader.c()) {
            ((ejhf) ((ejhf) a.i()).ah((char) 10551)).x("connect to remote process failed");
            d().e("PulpConnectToRemoteServiceFail");
            return frwe.d() ? enps.f(g().g("PulpInference", fegx.h(System.currentTimeMillis())), new eiho() { // from class: dbdj
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    asot asotVar = PulpInferenceService.a;
                    return 2;
                }
            }, enre.a) : ensj.i(2);
        }
        if (this.g == null) {
            final Context a3 = AppContextProvider.a();
            this.g = new czpj(new czoy() { // from class: dbdt
                @Override // defpackage.czoy
                public final Geller a() {
                    PulpInferenceService pulpInferenceService = PulpInferenceService.this;
                    if (pulpInferenceService.d == null) {
                        Context context = a3;
                        System.loadLibrary("geller_jni_lite_lib");
                        pulpInferenceService.d = czin.a(context);
                    }
                    return new Geller(pulpInferenceService.d);
                }
            }, new czps(feof.HULK_ONDEVICE_PERSONALIZATION, d(), frwz.a.a().g(), eiid.j(38401), eiid.j(Integer.valueOf(czip.a(a3)))), a3, d(), null);
        }
        ensi h = ensi.h(this.g.a());
        enqc enqcVar = new enqc() { // from class: dbdk
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                eits eitsVar = (eits) obj;
                boolean c = frwz.a.a().c();
                PulpInferenceService pulpInferenceService = PulpInferenceService.this;
                Context context = a2;
                return c ? ensj.o(pulpInferenceService.j(context, eitsVar)) : ensj.e(pulpInferenceService.j(context, eitsVar));
            }
        };
        enre enreVar = enre.a;
        final enss g = enps.g(h, enqcVar, enreVar);
        return ensj.b(g).b(new enqb() { // from class: dbdl
            @Override // defpackage.enqb
            public final enss a() {
                odlhJniLoader.b();
                PulpInferenceService pulpInferenceService = PulpInferenceService.this;
                enss enssVar = g;
                if (!frwe.d()) {
                    return ensj.i(0);
                }
                try {
                    ensj.r(enssVar);
                    return enps.f(pulpInferenceService.g().e("PulpInference", false), new eiho() { // from class: dbdq
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            asot asotVar = PulpInferenceService.a;
                            return 0;
                        }
                    }, enre.a);
                } catch (ExecutionException unused) {
                    return enps.f(pulpInferenceService.g().g("PulpInference", fegx.h(System.currentTimeMillis())), new eiho() { // from class: dbdp
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            asot asotVar = PulpInferenceService.a;
                            return 2;
                        }
                    }, enre.a);
                }
            }
        }, enreVar);
    }

    public final List j(Context context, eits eitsVar) {
        Account[] accountArr;
        int i;
        int i2;
        int i3;
        czop czopVar;
        Account account;
        eitj i4;
        int i5;
        czta cztaVar;
        final Account account2;
        long j;
        ArrayList arrayList = new ArrayList();
        if (eitsVar.isEmpty()) {
            d().e("PulpGellerDataEmpty");
        }
        Account[] d = czix.d(context);
        int length = d.length;
        int i6 = 0;
        while (i6 < length) {
            Account account3 = d[i6];
            if (e().R(account3)) {
                d().e("PulpAccountWithLhEnabled");
                enti entiVar = new enti(enre.a);
                d().e("PulpCalculateForAccount");
                czop czopVar2 = (czop) eitsVar.get(account3);
                final fecj v = fvzf.a.v();
                fecj v2 = fvze.a.v();
                long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                TimeUnit timeUnit = TimeUnit.DAYS;
                try {
                    i3 = e().b(account3) > 30 ? 90 : 30;
                    accountArr = d;
                    i = length;
                    i2 = i6;
                } catch (IllegalStateException e) {
                    accountArr = d;
                    i = length;
                    i2 = i6;
                    ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 10543)).B("Failed to read user retention window with error: %s", new erdd(erdc.NO_USER_DATA, e.getMessage()));
                    i3 = 30;
                }
                long seconds2 = seconds - timeUnit.toSeconds(i3 - 1);
                if (frwz.c()) {
                    seconds -= TimeUnit.DAYS.toSeconds(1L);
                    long seconds3 = seconds2 - TimeUnit.DAYS.toSeconds(1L);
                    if (frwz.e()) {
                        fecj v3 = fvze.a.v();
                        fefi j2 = fegx.j(seconds);
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        fvze fvzeVar = (fvze) v3.b;
                        j2.getClass();
                        fvzeVar.c = j2;
                        fvzeVar.b |= 1;
                        j = seconds3;
                        fefi j3 = fegx.j(TimeUnit.DAYS.toSeconds(1L) + seconds);
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        fvze fvzeVar2 = (fvze) v3.b;
                        j3.getClass();
                        fvzeVar2.d = j3;
                        fvzeVar2.b |= 2;
                        fvze fvzeVar3 = (fvze) v3.Q();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fvzf fvzfVar = (fvzf) v.b;
                        fvzeVar3.getClass();
                        fvzfVar.e = fvzeVar3;
                        fvzfVar.b |= 64;
                    } else {
                        j = seconds3;
                    }
                    seconds2 = j;
                }
                fefi j4 = fegx.j(seconds2);
                if (!v2.b.L()) {
                    v2.U();
                }
                fvze fvzeVar4 = (fvze) v2.b;
                j4.getClass();
                fvzeVar4.c = j4;
                fvzeVar4.b |= 1;
                fefi j5 = fegx.j(seconds);
                if (!v2.b.L()) {
                    v2.U();
                }
                fvze fvzeVar5 = (fvze) v2.b;
                j5.getClass();
                fvzeVar5.d = j5;
                fvzeVar5.b |= 2;
                fefi j6 = fegx.j(seconds);
                if (!v.b.L()) {
                    v.U();
                }
                fvzf fvzfVar2 = (fvzf) v.b;
                j6.getClass();
                fvzfVar2.g = j6;
                fvzfVar2.b |= 256;
                fvze fvzeVar6 = (fvze) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                fvzf fvzfVar3 = (fvzf) v.b;
                fvzeVar6.getClass();
                fvzfVar3.d = fvzeVar6;
                fvzfVar3.b |= 2;
                fecj v4 = fvzd.a.v();
                czop czopVar3 = czopVar2;
                eitj k = f().k(account3, "odlh-pulp-computation", seconds2, seconds, null);
                if (!v4.b.L()) {
                    v4.U();
                }
                fvzd fvzdVar = (fvzd) v4.b;
                fedh fedhVar = fvzdVar.b;
                if (!fedhVar.c()) {
                    fvzdVar.b = fecp.E(fedhVar);
                }
                feab.E(k, fvzdVar.b);
                if (((fvzd) v4.b).b.size() == 0) {
                    d().e("PulpAccountLhSegmentsEmpty");
                } else {
                    d().e("PulpAccountLhSegmentsPresent");
                }
                ArrayList arrayList2 = new ArrayList();
                if (czopVar3 == null) {
                    i4 = eitj.i(arrayList2);
                    czopVar = czopVar3;
                    account = account3;
                } else {
                    eitj eitjVar = czopVar3.a;
                    int size = eitjVar.size();
                    int i7 = 0;
                    while (i7 < size) {
                        cztc cztcVar = (cztc) eitjVar.get(i7);
                        Iterator it = cztcVar.e.iterator();
                        while (true) {
                            i5 = i7 + 1;
                            if (it.hasNext()) {
                                eykx eykxVar = (eykx) it.next();
                                eykt b2 = eykt.b(eykxVar.c);
                                if (b2 == null) {
                                    b2 = eykt.UNKNOWN_TYPE;
                                }
                                eykt eyktVar = eykt.UNKNOWN_TYPE;
                                if (b2 != eyktVar) {
                                    eitj eitjVar2 = eitjVar;
                                    int i8 = size;
                                    long j7 = cztcVar.c;
                                    eitj eitjVar3 = czopVar3.b;
                                    czop czopVar4 = czopVar3;
                                    int size2 = eitjVar3.size();
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= size2) {
                                            cztaVar = null;
                                            break;
                                        }
                                        cztaVar = (czta) eitjVar3.get(i9);
                                        int i10 = size2;
                                        int i11 = i9 + 1;
                                        if (cztaVar.c == j7) {
                                            break;
                                        }
                                        size2 = i10;
                                        i9 = i11;
                                    }
                                    eits eitsVar2 = f;
                                    eykt b3 = eykt.b(eykxVar.c);
                                    if (b3 != null) {
                                        eyktVar = b3;
                                    }
                                    fvxz fvxzVar = (fvxz) eitsVar2.get(eyktVar);
                                    if ((eykxVar.b & 16) != 0) {
                                        d().e("PulpAccountPersonalPlaceLastUpdatedTimePresent");
                                    } else {
                                        d().e("PulpAccountPersonalPlaceLastUpdatedTimeMissing");
                                    }
                                    if (cztaVar == null || fvxzVar == null) {
                                        eitjVar = eitjVar2;
                                        size = i8;
                                        czopVar3 = czopVar4;
                                    } else {
                                        eykr eykrVar = eykxVar.g;
                                        if (eykrVar == null) {
                                            eykrVar = eykr.a;
                                        }
                                        fecj v5 = fvyd.a.v();
                                        fecj v6 = fvya.a.v();
                                        Account account4 = account3;
                                        int i12 = i7;
                                        long j8 = cztaVar.c;
                                        cztc cztcVar2 = cztcVar;
                                        if (!v6.b.L()) {
                                            v6.U();
                                        }
                                        fecp fecpVar = v6.b;
                                        fvya fvyaVar = (fvya) fecpVar;
                                        Iterator it2 = it;
                                        fvyaVar.b |= 2;
                                        fvyaVar.d = j8;
                                        long j9 = cztaVar.d;
                                        if (!fecpVar.L()) {
                                            v6.U();
                                        }
                                        fvya fvyaVar2 = (fvya) v6.b;
                                        fvyaVar2.b |= 1;
                                        fvyaVar2.c = j9;
                                        fecj v7 = fvyb.a.v();
                                        fvya fvyaVar3 = (fvya) v6.Q();
                                        if (!v7.b.L()) {
                                            v7.U();
                                        }
                                        fecp fecpVar2 = v7.b;
                                        fvyb fvybVar = (fvyb) fecpVar2;
                                        fvyaVar3.getClass();
                                        fvybVar.e = fvyaVar3;
                                        fvybVar.b |= 4;
                                        int i13 = cztaVar.e;
                                        if (!fecpVar2.L()) {
                                            v7.U();
                                        }
                                        fecp fecpVar3 = v7.b;
                                        fvyb fvybVar2 = (fvyb) fecpVar3;
                                        fvybVar2.b |= 1;
                                        fvybVar2.c = i13;
                                        int i14 = cztaVar.f;
                                        if (!fecpVar3.L()) {
                                            v7.U();
                                        }
                                        fvyb fvybVar3 = (fvyb) v7.b;
                                        fvybVar3.b |= 2;
                                        fvybVar3.d = i14;
                                        fecj v8 = fvxx.a.v();
                                        if (!v8.b.L()) {
                                            v8.U();
                                        }
                                        fvxx fvxxVar = (fvxx) v8.b;
                                        fvxxVar.c = fvxzVar.d;
                                        fvxxVar.b |= 1;
                                        if (frwz.a.a().k() && eykrVar != null) {
                                            fecj v9 = fvyc.a.v();
                                            long j10 = eykrVar.b;
                                            if (!v9.b.L()) {
                                                v9.U();
                                            }
                                            fvyc fvycVar = (fvyc) v9.b;
                                            fvycVar.b |= 1;
                                            fvycVar.c = j10;
                                            if (!v5.b.L()) {
                                                v5.U();
                                            }
                                            fvyd fvydVar = (fvyd) v5.b;
                                            fvyc fvycVar2 = (fvyc) v9.Q();
                                            fvycVar2.getClass();
                                            fvydVar.e = fvycVar2;
                                            fvydVar.b |= 8;
                                        }
                                        fvxx fvxxVar2 = (fvxx) v8.Q();
                                        if (!v5.b.L()) {
                                            v5.U();
                                        }
                                        fvyd fvydVar2 = (fvyd) v5.b;
                                        fvxxVar2.getClass();
                                        fvydVar2.c = fvxxVar2;
                                        fvydVar2.b |= 1;
                                        fvyb fvybVar4 = (fvyb) v7.Q();
                                        if (!v5.b.L()) {
                                            v5.U();
                                        }
                                        fvyd fvydVar3 = (fvyd) v5.b;
                                        fvybVar4.getClass();
                                        fvydVar3.d = fvybVar4;
                                        fvydVar3.b |= 2;
                                        arrayList2.add((fvyd) v5.Q());
                                        account3 = account4;
                                        eitjVar = eitjVar2;
                                        size = i8;
                                        czopVar3 = czopVar4;
                                        i7 = i12;
                                        cztcVar = cztcVar2;
                                        it = it2;
                                    }
                                }
                            }
                        }
                        i7 = i5;
                    }
                    czopVar = czopVar3;
                    account = account3;
                    i4 = eitj.i(arrayList2);
                }
                if (!v4.b.L()) {
                    v4.U();
                }
                fvzd fvzdVar2 = (fvzd) v4.b;
                fedh fedhVar2 = fvzdVar2.d;
                if (!fedhVar2.c()) {
                    fvzdVar2.d = fecp.E(fedhVar2);
                }
                feab.E(i4, fvzdVar2.d);
                if (frwz.c()) {
                    long seconds4 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                    account2 = account;
                    eitj k2 = f().k(account2, "odlh-pulp-computation", seconds4 - TimeUnit.DAYS.toSeconds(1L), seconds4, null);
                    if (!v4.b.L()) {
                        v4.U();
                    }
                    fvzd fvzdVar3 = (fvzd) v4.b;
                    fedh fedhVar3 = fvzdVar3.c;
                    if (!fedhVar3.c()) {
                        fvzdVar3.c = fecp.E(fedhVar3);
                    }
                    feab.E(k2, fvzdVar3.c);
                    d().e(((fvzd) v4.b).c.size() == 0 ? "PulpAccountEvalWeekLhSegmentsEmpty" : "PulpAccountEvalWeekLhSegments");
                } else {
                    account2 = account;
                }
                d().e(czopVar == null ? "PulpAccountPersonalPlaceNull" : "PulpAccountPersonalPlacesPresent");
                fvzd fvzdVar4 = (fvzd) v4.Q();
                if (!v.b.L()) {
                    v.U();
                }
                fvzf fvzfVar4 = (fvzf) v.b;
                fvzdVar4.getClass();
                fvzfVar4.c = fvzdVar4;
                fvzfVar4.b |= 1;
                if (this.h == null) {
                    this.h = dbdz.a(AppContextProvider.a());
                }
                final dbdz dbdzVar = this.h;
                dplo dploVar = dbdzVar.c;
                dpjp a2 = dpjq.a();
                a2.a = "pulp-home-work-model-configs";
                ensi h = ensi.h(dploVar.c(a2.a()));
                eiho eihoVar = new eiho() { // from class: dbdw
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        eiid eiidVar;
                        dbdz dbdzVar2 = dbdz.this;
                        dphe dpheVar = (dphe) obj;
                        if (dpheVar == null) {
                            ((ejhf) ((ejhf) dbdz.a.h()).ah((char) 10564)).x("Downloaded mdd model is not available yet.");
                            dbdzVar2.b(2);
                            return fvzc.a;
                        }
                        for (dpha dphaVar : dpheVar.h) {
                            if (dphaVar.c.equals("pulp-config.pb")) {
                                try {
                                    dxbg dxbgVar = dbdzVar2.b;
                                    Uri parse = Uri.parse(dphaVar.d);
                                    dxev dxevVar = new dxev((feen) fvzc.a.iB(7, null));
                                    dxevVar.a = febw.a();
                                    fvzc fvzcVar = (fvzc) dxbgVar.d(parse, dxevVar);
                                    ((ejhf) ((ejhf) dbdz.a.h()).ah(10562)).B("Got PulpConfig for fileId: %s", dphaVar.c);
                                    eiidVar = eiid.j(fvzcVar);
                                } catch (IOException e2) {
                                    ((ejhf) ((ejhf) ((ejhf) dbdz.a.i()).s(e2)).ah(10563)).B("Parsing PulpConfig from MDD file: %s failed", dphaVar.c);
                                    eiidVar = eigb.a;
                                }
                                if (eiidVar.h()) {
                                    dbdzVar2.b(5);
                                    return eiidVar.c();
                                }
                                dbdzVar2.b(4);
                                return fvzc.a;
                            }
                        }
                        dbdzVar2.b(3);
                        return fvzc.a;
                    }
                };
                enre enreVar = enre.a;
                enss g = enps.g(ensi.h(enox.f(enps.f(ensi.h(enox.g(enps.f(h, eihoVar, enreVar), Exception.class, new enqc() { // from class: dbdx
                    @Override // defpackage.enqc
                    public final enss a(Object obj) {
                        ((ejhf) ((ejhf) ((ejhf) dbdz.a.j()).s((Exception) obj)).ah(10565)).x("Failed to read data from MDD.");
                        dbdz.this.b(1);
                        return ensj.i(fvzc.a);
                    }
                }, enreVar)), new eiho() { // from class: dbdn
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        fvzc fvzcVar = (fvzc) obj;
                        asot asotVar = PulpInferenceService.a;
                        fecj fecjVar = (fecj) fvzcVar.iB(5, null);
                        fecjVar.X(fvzcVar);
                        fvzb fvzbVar = fvzcVar.d;
                        if (fvzbVar == null) {
                            fvzbVar = fvzb.a;
                        }
                        fecj fecjVar2 = (fecj) fvzbVar.iB(5, null);
                        fecjVar2.X(fvzbVar);
                        fvzb fvzbVar2 = fvzcVar.d;
                        if (fvzbVar2 == null) {
                            fvzbVar2 = fvzb.a;
                        }
                        fvza fvzaVar = fvzbVar2.c;
                        if (fvzaVar == null) {
                            fvzaVar = fvza.a;
                        }
                        fecj fecjVar3 = (fecj) fvzaVar.iB(5, null);
                        fecjVar3.X(fvzaVar);
                        boolean h2 = frwz.h();
                        if (!fecjVar3.b.L()) {
                            fecjVar3.U();
                        }
                        fvza fvzaVar2 = (fvza) fecjVar3.b;
                        fvzaVar2.b |= 2;
                        fvzaVar2.d = h2;
                        boolean g2 = frwz.g();
                        if (!fecjVar3.b.L()) {
                            fecjVar3.U();
                        }
                        fvza fvzaVar3 = (fvza) fecjVar3.b;
                        fvzaVar3.b |= 1;
                        fvzaVar3.c = g2;
                        if (!fecjVar2.b.L()) {
                            fecjVar2.U();
                        }
                        fvzb fvzbVar3 = (fvzb) fecjVar2.b;
                        fvza fvzaVar4 = (fvza) fecjVar3.Q();
                        fvzaVar4.getClass();
                        fvzbVar3.c = fvzaVar4;
                        fvzbVar3.b |= 4;
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        fvzc fvzcVar2 = (fvzc) fecjVar.b;
                        fvzb fvzbVar4 = (fvzb) fecjVar2.Q();
                        fvzbVar4.getClass();
                        fvzcVar2.d = fvzbVar4;
                        fvzcVar2.b |= 8;
                        fvyy fvyyVar = fvzcVar.c;
                        if (fvyyVar == null) {
                            fvyyVar = fvyy.a;
                        }
                        fecj fecjVar4 = (fecj) fvyyVar.iB(5, null);
                        fecjVar4.X(fvyyVar);
                        boolean e2 = frwz.e();
                        if (!fecjVar4.b.L()) {
                            fecjVar4.U();
                        }
                        fvyy fvyyVar2 = (fvyy) fecjVar4.b;
                        fvyyVar2.b |= 32;
                        fvyyVar2.c = e2;
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        fecj fecjVar5 = fecj.this;
                        fvzc fvzcVar3 = (fvzc) fecjVar.b;
                        fvyy fvyyVar3 = (fvyy) fecjVar4.Q();
                        fvyyVar3.getClass();
                        fvzcVar3.c = fvyyVar3;
                        fvzcVar3.b |= 4;
                        if (!fecjVar5.b.L()) {
                            fecjVar5.U();
                        }
                        fvzf fvzfVar5 = (fvzf) fecjVar5.b;
                        fvzc fvzcVar4 = (fvzc) fecjVar.Q();
                        fvzf fvzfVar6 = fvzf.a;
                        fvzcVar4.getClass();
                        fvzfVar5.f = fvzcVar4;
                        fvzfVar5.b |= 128;
                        return (fvzf) fecjVar5.Q();
                    }
                }, enreVar), Throwable.class, new eiho() { // from class: dbdo
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        ((ejhf) ((ejhf) ((ejhf) PulpInferenceService.a.j()).s((Throwable) obj)).ah((char) 10544)).x("Error fetching PulpConfig data from PulpMddHelper");
                        fecj fecjVar = fecj.this;
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        fvzf fvzfVar5 = (fvzf) fecjVar.b;
                        fvzf fvzfVar6 = fvzf.a;
                        fvzfVar5.f = null;
                        fvzfVar5.b &= -129;
                        return (fvzf) fecjVar.Q();
                    }
                }, enreVar)), new enqc() { // from class: dbdr
                    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
                    
                        if (((java.lang.Boolean) r0.c.a(r1, "odlh-pulp-output").get()).booleanValue() != false) goto L61;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[Catch: IOException -> 0x00a8, ExecutionException -> 0x00aa, IOException | InterruptedException | ExecutionException -> 0x00ac, TryCatch #8 {IOException | InterruptedException | ExecutionException -> 0x00ac, blocks: (B:23:0x0084, B:25:0x0088, B:26:0x0093), top: B:22:0x0084 }] */
                    @Override // defpackage.enqc
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final defpackage.enss a(java.lang.Object r14) {
                        /*
                            Method dump skipped, instructions count: 636
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbdr.a(java.lang.Object):enss");
                    }
                }, entiVar);
                enps.g(ensi.h(h().d(account2, frwz.a.a().a())), new enqc() { // from class: dbds
                    @Override // defpackage.enqc
                    public final enss a(Object obj) {
                        if (!((Boolean) obj).booleanValue()) {
                            return ensm.a;
                        }
                        return PulpInferenceService.this.h().a(account2.name);
                    }
                }, entiVar);
                arrayList.add(g);
            } else {
                ((ejhf) ((ejhf) a.h()).ah((char) 10557)).x("Pulp computation skipped due to Account settings.");
                accountArr = d;
                i = length;
                i2 = i6;
            }
            i6 = i2 + 1;
            d = accountArr;
            length = i;
        }
        return arrayList;
    }
}
