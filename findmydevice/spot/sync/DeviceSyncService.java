package com.google.android.gms.findmydevice.spot.sync;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.findmydevice.spot.sync.DeviceSyncService;
import com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bcyr;
import defpackage.bebe;
import defpackage.bebf;
import defpackage.bebo;
import defpackage.bebp;
import defpackage.behm;
import defpackage.belk;
import defpackage.bews;
import defpackage.bfcs;
import defpackage.bfdr;
import defpackage.byjl;
import defpackage.byln;
import defpackage.dnlf;
import defpackage.dwvc;
import defpackage.egmx;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fefi;
import defpackage.fegx;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DeviceSyncService extends SafeGmsTaskBoundService {
    public static final asot a = asot.b("DeviceSyncService", asej.FIND_MY_DEVICE_SPOT);
    public final belk b;
    public final dwvc c;
    public final dnlf d;
    public final bews e;
    private final bebe f;

    public DeviceSyncService() {
        this(bebo.a());
    }

    @Override // com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService
    protected final enss d(byln bylnVar) {
        if (!bfdr.a()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 4497)).x("Eddystone use cases are disabled.");
            return ensj.i(2);
        }
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 4495)).x("Syncing devices of user.");
        final eiid d = bfcs.d(bylnVar, getBaseContext());
        if (!d.h()) {
            ((ejhf) ((ejhf) asotVar.i()).ah((char) 4496)).x("Account that has a SPOT owner key not found while syncing devices.");
            eiid e = bfcs.e(bylnVar);
            if (e.h()) {
                bfcs.g(byjl.a(getBaseContext()), (String) e.c());
            }
            return ensj.i(2);
        }
        Bundle bundle = bylnVar.b;
        boolean z = bundle == null || bundle.getBoolean("force", true);
        final bebf a2 = this.f.a((Account) d.c());
        egmx i = egmx.f(z ? ensj.i(true) : egmx.f(egmx.f(a2.c().c.a()).h(new eiho() { // from class: behk
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                dwzg dwzgVar = (dwzg) obj;
                asot asotVar2 = behm.a;
                if ((dwzgVar.c & 2) == 0) {
                    return eigb.a;
                }
                fefi fefiVar = dwzgVar.f;
                if (fefiVar == null) {
                    fefiVar = fefi.a;
                }
                return eiid.j(fefiVar);
            }
        }, enre.a)).h(new eiho() { // from class: bezj
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                eiid eiidVar = (eiid) obj;
                boolean z2 = true;
                if (eiidVar.h() && DeviceSyncService.this.d.d().toEpochMilli() - fegx.b((fefi) eiidVar.c()) <= TimeUnit.HOURS.toMillis(fobr.u())) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }, a2.e())).i(new enqc() { // from class: bezt
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return ensj.i(0);
                }
                final bebf bebfVar = a2;
                eiid eiidVar = d;
                final DeviceSyncService deviceSyncService = DeviceSyncService.this;
                Object c = eiidVar.c();
                final bfbs bfbsVar = (bfbs) bebfVar.d();
                egmx f = egmx.f(bfbsVar.c.a());
                enqc enqcVar = new enqc() { // from class: bfav
                    @Override // defpackage.enqc
                    public final enss a(Object obj2) {
                        return bfbs.this.k.g(((Integer) ((eiid) obj2).b(new eiho() { // from class: bfba
                            @Override // defpackage.eiho
                            public final Object apply(Object obj3) {
                                return Integer.valueOf(((dwyy) obj3).e);
                            }
                        }).e(-1)).intValue(), true);
                    }
                };
                Executor executor = bfbsVar.b;
                final Account account = (Account) c;
                return egmx.f(f.i(enqcVar, executor).i(new enqc() { // from class: bfaw
                    @Override // defpackage.enqc
                    public final enss a(Object obj2) {
                        final euhp euhpVar = (euhp) obj2;
                        dwze dwzeVar = (dwze) dwzf.a.v();
                        dwzeVar.k(euhpVar.f);
                        dwzeVar.a(euhpVar.g);
                        dwzf dwzfVar = (dwzf) dwzeVar.Q();
                        bfbs bfbsVar2 = bfbs.this;
                        return egnc.j(bfbsVar2.g.h(dwzfVar), new eiho() { // from class: bfar
                            @Override // defpackage.eiho
                            public final Object apply(Object obj3) {
                                asot asotVar2 = bfbs.a;
                                return euhp.this;
                            }
                        }, bfbsVar2.b);
                    }
                }, executor).i(new enqc() { // from class: bfax
                    @Override // defpackage.enqc
                    public final enss a(Object obj2) {
                        final euhp euhpVar = (euhp) obj2;
                        ejgq h = bfbs.a.h();
                        fecy fecyVar = euhpVar.h;
                        fecz feczVar = euhp.a;
                        ((ejhf) ((ejhf) h).ah((char) 4502)).B("Owned device types: %s", TextUtils.join(",", eivv.j(new feda(fecyVar, feczVar), new eiho() { // from class: bfbb
                            @Override // defpackage.eiho
                            public final Object apply(Object obj3) {
                                return ((eugj) obj3).name();
                            }
                        })));
                        final eiuu G = eiuu.G(new feda(euhpVar.h, feczVar));
                        bfbs bfbsVar2 = bfbs.this;
                        final behm behmVar = (behm) bfbsVar2.g;
                        return egnc.j(behmVar.c.b(new eiho() { // from class: behe
                            @Override // defpackage.eiho
                            public final Object apply(Object obj3) {
                                dwzg dwzgVar = (dwzg) obj3;
                                fecy fecyVar2 = dwzgVar.d;
                                fecz feczVar2 = dwzg.a;
                                eiuu G2 = eiuu.G(new feda(fecyVar2, feczVar2));
                                Set set = G;
                                if (G2.equals(set)) {
                                    return dwzgVar;
                                }
                                boolean k = behm.k(new feda(dwzgVar.d, feczVar2));
                                boolean k2 = behm.k(set);
                                behm.this.j(k2, dxai.b(k2 && !k, new Runnable() { // from class: behg
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ((ejhf) ((ejhf) behm.a.h()).ah((char) 4207)).x("New advertising devices found, may need sync.");
                                    }
                                }), false);
                                fecj fecjVar = (fecj) dwzgVar.iB(5, null);
                                fecjVar.X(dwzgVar);
                                if (!fecjVar.b.L()) {
                                    fecjVar.U();
                                }
                                ((dwzg) fecjVar.b).d = fecr.a;
                                if (!fecjVar.b.L()) {
                                    fecjVar.U();
                                }
                                dwzg dwzgVar2 = (dwzg) fecjVar.b;
                                dwzgVar2.b();
                                Iterator it = set.iterator();
                                while (it.hasNext()) {
                                    dwzgVar2.d.i(((eugj) it.next()).a());
                                }
                                return (dwzg) fecjVar.Q();
                            }
                        }, enre.a), new eiho() { // from class: bfbd
                            @Override // defpackage.eiho
                            public final Object apply(Object obj3) {
                                asot asotVar2 = bfbs.a;
                                return euhp.this;
                            }
                        }, bfbsVar2.b);
                    }
                }, executor).i(new enqc() { // from class: bfay
                    @Override // defpackage.enqc
                    public final enss a(Object obj2) {
                        final enss h;
                        final euhp euhpVar = (euhp) obj2;
                        int size = euhpVar.c.size() + euhpVar.d.size();
                        final bfbs bfbsVar2 = bfbs.this;
                        if (size == 0) {
                            ((ejhf) ((ejhf) bfbs.a.h()).ah((char) 4505)).x("Owns no advertising E2EE Android device and accessories.");
                            int i2 = eitj.d;
                            h = ensj.i(ejcb.a);
                        } else {
                            asot asotVar2 = bfbs.a;
                            ((ejhf) ((ejhf) asotVar2.h()).ah((char) 4503)).z("Owns %d advertising E2EE Android device and accessories.", size);
                            ((ejhf) ((ejhf) asotVar2.h()).ah((char) 4504)).z("%d E2EE devices require EID computation.", euhpVar.c.size());
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(bfbsVar2.j.d().toEpochMilli());
                            dwwe dwweVar = bfbsVar2.l;
                            final long seconds2 = seconds - TimeUnit.HOURS.toSeconds(Math.max(dwweVar.c(), dwweVar.a()));
                            final long seconds3 = TimeUnit.HOURS.toSeconds(((int) ftqs.a.a().c(dwweVar.a)) - dwweVar.c()) + seconds;
                            eiig.p(seconds2 <= seconds && seconds3 > seconds && seconds3 - seconds2 <= dwvq.a);
                            egmx f2 = egmx.f(bfbsVar2.h.f());
                            enqc enqcVar2 = new enqc() { // from class: bfbc
                                @Override // defpackage.enqc
                                public final enss a(Object obj3) {
                                    dwxc dwxcVar = ((dwyw) obj3).j;
                                    if (dwxcVar == null) {
                                        dwxcVar = dwxc.a;
                                    }
                                    eufn eufnVar = dwxcVar.d;
                                    if (eufnVar == null) {
                                        eufnVar = eufn.a;
                                    }
                                    final eufn eufnVar2 = eufnVar;
                                    final long j = seconds3;
                                    final long j2 = seconds2;
                                    final euhp euhpVar2 = euhpVar;
                                    final bfbs bfbsVar3 = bfbs.this;
                                    return egna.f(eirn.j(euhpVar2.c).l(new eiho() { // from class: bfal
                                        @Override // defpackage.eiho
                                        public final Object apply(Object obj4) {
                                            long j3;
                                            final euhm euhmVar = (euhm) obj4;
                                            int i3 = euhmVar.b & 32;
                                            final long j4 = j2;
                                            if (i3 != 0) {
                                                fefi fefiVar = euhmVar.k;
                                                if (fefiVar == null) {
                                                    fefiVar = fefi.a;
                                                }
                                                j3 = Math.min(fegx.d(fefiVar), dwvq.a + j4);
                                            } else {
                                                j3 = j;
                                            }
                                            final long j5 = j3;
                                            final bfbs bfbsVar4 = bfbs.this;
                                            eufn eufnVar3 = euhmVar.c;
                                            if (eufnVar3 == null) {
                                                eufnVar3 = eufn.a;
                                            }
                                            euhd euhdVar = euhmVar.d;
                                            if (euhdVar == null) {
                                                euhdVar = euhd.a;
                                            }
                                            eugr eugrVar = euhmVar.h;
                                            if (eugrVar == null) {
                                                eugrVar = eugr.a;
                                            }
                                            egmx a3 = bfbsVar4.d.a(eufnVar3, euhdVar, eugrVar);
                                            eufn eufnVar4 = euhmVar.c;
                                            if (eufnVar4 == null) {
                                                eufnVar4 = eufn.a;
                                            }
                                            if (eufnVar4.equals(eufnVar2)) {
                                                return a3.i(new enqc() { // from class: bfas
                                                    @Override // defpackage.enqc
                                                    public final enss a(Object obj5) {
                                                        final dwwn dwwnVar;
                                                        enss e2;
                                                        final euhm euhmVar2 = euhmVar;
                                                        dwwn dwwnVar2 = (dwwn) obj5;
                                                        eugr eugrVar2 = euhmVar2.h;
                                                        if (eugrVar2 == null) {
                                                            eugrVar2 = eugr.a;
                                                        }
                                                        final bfbs bfbsVar5 = bfbs.this;
                                                        bdly bdlyVar = bfbsVar5.f;
                                                        if (!eugrVar2.e) {
                                                            if (bdlyVar.c.d().toEpochMilli() - fegx.b(dwwnVar2.d) <= TimeUnit.HOURS.toMillis(Math.min(bdlyVar.e.d(), bdly.b))) {
                                                                e2 = ensj.i(dwwnVar2);
                                                                dwwnVar = dwwnVar2;
                                                                final long j6 = j5;
                                                                final long j7 = j4;
                                                                final dwwn dwwnVar3 = dwwnVar;
                                                                return egnc.j(e2, new eiho() { // from class: bfag
                                                                    @Override // defpackage.eiho
                                                                    public final Object apply(Object obj6) {
                                                                        dwwn dwwnVar4 = (dwwn) obj6;
                                                                        boolean z2 = dwwnVar4 != dwwnVar3;
                                                                        long j8 = j6;
                                                                        long j9 = j7;
                                                                        return bfbs.this.a(euhmVar2, dwwnVar4, z2, j9, j8, true);
                                                                    }
                                                                }, bfbsVar5.b);
                                                            }
                                                        }
                                                        ((ejhf) ((ejhf) bdly.a.h()).ah((char) 4016)).x("Rotating self device secrets.");
                                                        bddg bddgVar = bdlyVar.d;
                                                        eufn eufnVar5 = euhmVar2.c;
                                                        if (eufnVar5 == null) {
                                                            eufnVar5 = eufn.a;
                                                        }
                                                        eufn eufnVar6 = eufnVar5;
                                                        bdlw bdlwVar = bddgVar.b;
                                                        dwwnVar = dwwnVar2;
                                                        begh a4 = ((begl) bdlwVar.a).a();
                                                        fuuq fuuqVar = bdlwVar.c;
                                                        Object a5 = bdlwVar.b.a();
                                                        Executor executor2 = (Executor) fuuqVar.a();
                                                        executor2.getClass();
                                                        eufnVar6.getClass();
                                                        dwwnVar.getClass();
                                                        e2 = egnc.e(new bdlv(a4, (bddc) a5, executor2, eufnVar6, dwwnVar).a(), Throwable.class, new eiho() { // from class: bdlx
                                                            @Override // defpackage.eiho
                                                            public final Object apply(Object obj6) {
                                                                ((ejhf) ((ejhf) ((ejhf) bdly.a.i()).s((Throwable) obj6)).ah((char) 4015)).x("Failed rotating self device secrets");
                                                                return dwwn.this;
                                                            }
                                                        }, enre.a);
                                                        final long j62 = j5;
                                                        final long j72 = j4;
                                                        final dwwn dwwnVar32 = dwwnVar;
                                                        return egnc.j(e2, new eiho() { // from class: bfag
                                                            @Override // defpackage.eiho
                                                            public final Object apply(Object obj6) {
                                                                dwwn dwwnVar4 = (dwwn) obj6;
                                                                boolean z2 = dwwnVar4 != dwwnVar32;
                                                                long j8 = j62;
                                                                long j9 = j72;
                                                                return bfbs.this.a(euhmVar2, dwwnVar4, z2, j9, j8, true);
                                                            }
                                                        }, bfbsVar5.b);
                                                    }
                                                }, bfbsVar4.b);
                                            }
                                            eiho eihoVar = new eiho() { // from class: bfat
                                                @Override // defpackage.eiho
                                                public final Object apply(Object obj5) {
                                                    return bfbs.this.a(euhmVar, (dwwn) obj5, false, j4, j5, false);
                                                }
                                            };
                                            Executor executor2 = bfbsVar4.b;
                                            return a3.h(eihoVar, executor2).d(Throwable.class, new eiho() { // from class: bfau
                                                @Override // defpackage.eiho
                                                public final Object apply(Object obj5) {
                                                    ejhf ejhfVar = (ejhf) ((ejhf) ((ejhf) bfbs.a.i()).s((Throwable) obj5)).ah(4501);
                                                    euhm euhmVar2 = euhm.this;
                                                    eufn eufnVar5 = euhmVar2.c;
                                                    if (eufnVar5 == null) {
                                                        eufnVar5 = eufn.a;
                                                    }
                                                    ejhfVar.B("Error calculating EIDs for device %s.", eufnVar5.b);
                                                    eufn eufnVar6 = euhmVar2.c;
                                                    if (eufnVar6 == null) {
                                                        eufnVar6 = eufn.a;
                                                    }
                                                    int i4 = euhmVar2.f;
                                                    long j6 = euhmVar2.e;
                                                    int b = eugq.b(euhmVar2.i);
                                                    if (b == 0) {
                                                        b = 1;
                                                    }
                                                    dwvh dwvhVar = new dwvh(null);
                                                    dwvhVar.b(eufnVar6);
                                                    dwvhVar.f(i4);
                                                    eigb eigbVar = eigb.a;
                                                    dwvhVar.a = eigbVar;
                                                    dwvhVar.e(false);
                                                    dwvhVar.d(euie.a);
                                                    dwvhVar.b = eigbVar;
                                                    dwvhVar.c(j6);
                                                    dwvhVar.d = b;
                                                    dwvhVar.i(eugf.UNSPECIFIED_TRACKABLE_COMPONENTS);
                                                    dwvhVar.g(false);
                                                    dwvhVar.h(false);
                                                    dwvhVar.c = eigbVar;
                                                    return dwvhVar.a();
                                                }
                                            }, executor2);
                                        }
                                    }).n()).h(new eiho() { // from class: bfam
                                        @Override // defpackage.eiho
                                        public final Object apply(Object obj4) {
                                            asot asotVar3 = bfbs.a;
                                            Stream filter = Collection.EL.stream((List) obj4).filter(new Predicate() { // from class: bfao
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
                                                public final boolean test(Object obj5) {
                                                    return Objects.nonNull((dwvi) obj5);
                                                }
                                            });
                                            int i3 = eitj.d;
                                            return (eitj) filter.collect(eipl.a);
                                        }
                                    }, enre.a).i(new enqc() { // from class: bfan
                                        @Override // defpackage.enqc
                                        public final enss a(Object obj4) {
                                            final eitj eitjVar = (eitj) obj4;
                                            fedh fedhVar = euhpVar2.c;
                                            eite e2 = eitj.e(eitjVar.size());
                                            bfbs bfbsVar4 = bfbs.this;
                                            dwvs dwvsVar = bfbsVar4.e;
                                            fefi j3 = fegx.j(TimeUnit.MILLISECONDS.toSeconds(dwvsVar.a.d().toEpochMilli()) - ((int) TimeUnit.HOURS.toSeconds(dwvsVar.c.c())));
                                            for (int i3 = 0; i3 < eitjVar.size(); i3++) {
                                                dwvi dwviVar = (dwvi) eitjVar.get(i3);
                                                fedh fedhVar2 = dwviVar.e.b;
                                                fefi fefiVar = ((euhm) fedhVar.get(i3)).g;
                                                if (fefiVar == null) {
                                                    fefiVar = fefi.a;
                                                }
                                                List h2 = eixf.h(fedhVar2, new eiho() { // from class: dwvr
                                                    @Override // defpackage.eiho
                                                    public final Object apply(Object obj5) {
                                                        fefi fefiVar2 = ((euif) obj5).c;
                                                        return fefiVar2 == null ? fefi.a : fefiVar2;
                                                    }
                                                });
                                                if (fegw.a(fefiVar, j3) <= 0) {
                                                    fefiVar = j3;
                                                }
                                                int binarySearch = Collections.binarySearch(h2, fefiVar, fegw.a);
                                                int i4 = binarySearch < 0 ? -(binarySearch + 1) : binarySearch + 1;
                                                if (i4 != fedhVar2.size()) {
                                                    fecj v = euki.a.v();
                                                    eufn eufnVar3 = dwviVar.a;
                                                    if (!v.b.L()) {
                                                        v.U();
                                                    }
                                                    euki eukiVar = (euki) v.b;
                                                    eufnVar3.getClass();
                                                    eukiVar.c = eufnVar3;
                                                    eukiVar.b |= 1;
                                                    euid euidVar = (euid) euie.a.v();
                                                    euidVar.a(fedhVar2.subList(i4, fedhVar2.size()));
                                                    if (!v.b.L()) {
                                                        v.U();
                                                    }
                                                    euki eukiVar2 = (euki) v.b;
                                                    euie euieVar = (euie) euidVar.Q();
                                                    euieVar.getClass();
                                                    eukiVar2.d = euieVar;
                                                    eukiVar2.b |= 2;
                                                    long j4 = dwviVar.g;
                                                    if (!v.b.L()) {
                                                        v.U();
                                                    }
                                                    ((euki) v.b).e = j4;
                                                    e2.i((euki) v.Q());
                                                }
                                            }
                                            eitj g = e2.g();
                                            return egnc.j(g.isEmpty() ? ensm.a : dwvsVar.b.o(g), new eiho() { // from class: bfaz
                                                @Override // defpackage.eiho
                                                public final Object apply(Object obj5) {
                                                    asot asotVar3 = bfbs.a;
                                                    return eitj.this;
                                                }
                                            }, bfbsVar4.b);
                                        }
                                    }, bfbsVar3.b);
                                }
                            };
                            Executor executor2 = bfbsVar2.b;
                            h = f2.i(enqcVar2, executor2).h(new eiho() { // from class: bfbl
                                @Override // defpackage.eiho
                                public final Object apply(Object obj3) {
                                    eitj eitjVar = (eitj) obj3;
                                    asot asotVar3 = bfbs.a;
                                    int i3 = eitj.d;
                                    eite eiteVar = new eite();
                                    eiteVar.k(eirn.j(eitjVar).i(new eiih() { // from class: bfbn
                                        @Override // defpackage.eiih
                                        public final boolean a(Object obj4) {
                                            return ((dwvi) obj4).j;
                                        }
                                    }).l(new eiho() { // from class: bfbo
                                        @Override // defpackage.eiho
                                        public final Object apply(Object obj4) {
                                            boolean z2 = ((dwvi) obj4).d;
                                            asot asotVar4 = bfbs.a;
                                            bfad a3 = bfae.a();
                                            a3.c(z2);
                                            return a3.a();
                                        }
                                    }).n());
                                    eiteVar.k(eirn.j(eitjVar).i(new eiih() { // from class: bfbp
                                        @Override // defpackage.eiih
                                        public final boolean a(Object obj4) {
                                            asot asotVar4 = bfbs.a;
                                            return !((dwvi) obj4).j;
                                        }
                                    }).i(new eiih() { // from class: bfbq
                                        @Override // defpackage.eiih
                                        public final boolean a(Object obj4) {
                                            dwvi dwviVar = (dwvi) obj4;
                                            return (dwviVar.e.b.isEmpty() && ((euie) dwviVar.f.e(euie.a)).b.isEmpty()) ? false : true;
                                        }
                                    }).l(new eiho() { // from class: bfbr
                                        @Override // defpackage.eiho
                                        public final Object apply(Object obj4) {
                                            euie euieVar;
                                            dwvi dwviVar = (dwvi) obj4;
                                            asot asotVar4 = bfbs.a;
                                            bfad a3 = bfae.a();
                                            dwvd dwvdVar = new dwvd(null);
                                            eufn eufnVar = dwviVar.a;
                                            dwvdVar.c(eufnVar);
                                            dwvdVar.f(dwviVar.c);
                                            int i4 = dwviVar.b;
                                            dwfu a4 = dwfv.a();
                                            a4.d(i4);
                                            a4.b(dwviVar.g);
                                            a4.f(dwviVar.l);
                                            a4.e(dwviVar.h);
                                            a4.c(dwviVar.k);
                                            dwvdVar.b(a4.a());
                                            a3.b(dwvdVar.a());
                                            dwvt dwvtVar = new dwvt();
                                            dwvtVar.b(eufnVar);
                                            eiid eiidVar2 = dwviVar.f;
                                            if (eiidVar2.h()) {
                                                euid euidVar = (euid) euie.a.v();
                                                eitj m = eitj.m(dwviVar.e.b, ((euie) eiidVar2.c()).b);
                                                fefi fefiVar = fegx.a;
                                                euidVar.a(eivv.g(m, new eiok(new eiho() { // from class: dwvg
                                                    @Override // defpackage.eiho
                                                    public final Object apply(Object obj5) {
                                                        fefi fefiVar2 = ((euif) obj5).c;
                                                        return fefiVar2 == null ? fefi.a : fefiVar2;
                                                    }
                                                }, ejbo.f(fegw.a))));
                                                euieVar = (euie) euidVar.Q();
                                            } else {
                                                euieVar = dwviVar.e;
                                            }
                                            dwvtVar.c(euieVar);
                                            a3.d(dwvtVar.a());
                                            a3.a = eiid.j(new bfac(eufnVar, dwviVar.i));
                                            return a3.a();
                                        }
                                    }).n());
                                    eiteVar.k(eirn.j(euhp.this.d).l(new eiho() { // from class: bfah
                                        @Override // defpackage.eiho
                                        public final Object apply(Object obj4) {
                                            eiid eiidVar2;
                                            euho euhoVar = (euho) obj4;
                                            asot asotVar4 = bfbs.a;
                                            bfad a3 = bfae.a();
                                            dwvd dwvdVar = new dwvd(null);
                                            eufn eufnVar = euhoVar.c;
                                            if (eufnVar == null) {
                                                eufnVar = eufn.a;
                                            }
                                            dwvdVar.c(eufnVar);
                                            dwfu a4 = dwfv.a();
                                            a4.d(euhoVar.e);
                                            a4.b(euhoVar.f);
                                            int b = eugq.b(euhoVar.h);
                                            if (b == 0) {
                                                b = 1;
                                            }
                                            a4.f(b);
                                            if ((euhoVar.b & 4) != 0) {
                                                eugw eugwVar = euhoVar.g;
                                                if (eugwVar == null) {
                                                    eugwVar = eugw.a;
                                                }
                                                eiidVar2 = eiid.j(eugwVar);
                                            } else {
                                                eiidVar2 = eigb.a;
                                            }
                                            a4.c(eiidVar2);
                                            dwvdVar.b(a4.a());
                                            a3.b(dwvdVar.a());
                                            dwvt dwvtVar = new dwvt();
                                            eufn eufnVar2 = euhoVar.c;
                                            if (eufnVar2 == null) {
                                                eufnVar2 = eufn.a;
                                            }
                                            dwvtVar.b(eufnVar2);
                                            euie euieVar = euhoVar.d;
                                            if (euieVar == null) {
                                                euieVar = euie.a;
                                            }
                                            dwvtVar.c(euieVar);
                                            a3.d(dwvtVar.a());
                                            return a3.a();
                                        }
                                    }).n());
                                    return eiteVar.g();
                                }
                            }, executor2);
                        }
                        fedh fedhVar = euhpVar.e;
                        ((ejhf) ((ejhf) bfbs.a.h()).ah((char) 4506)).z("Owns %d non advertising accessories.", fedhVar.size());
                        final egmx h2 = egna.f(eirn.j(fedhVar).l(new eiho() { // from class: bfaj
                            @Override // defpackage.eiho
                            public final Object apply(Object obj3) {
                                final euhn euhnVar = (euhn) obj3;
                                eufn eufnVar = euhnVar.b;
                                if (eufnVar == null) {
                                    eufnVar = eufn.a;
                                }
                                euhd euhdVar = euhnVar.c;
                                if (euhdVar == null) {
                                    euhdVar = euhd.a;
                                }
                                eugr eugrVar = euhnVar.d;
                                if (eugrVar == null) {
                                    eugrVar = eugr.a;
                                }
                                bfbs bfbsVar3 = bfbs.this;
                                return egnc.j(bfbsVar3.d.a(eufnVar, euhdVar, eugrVar), new eiho() { // from class: bfai
                                    @Override // defpackage.eiho
                                    public final Object apply(Object obj4) {
                                        dwwn dwwnVar = (dwwn) obj4;
                                        asot asotVar3 = bfbs.a;
                                        bfad a3 = bfae.a();
                                        dwvd dwvdVar = new dwvd(null);
                                        eufn eufnVar2 = euhn.this.b;
                                        if (eufnVar2 == null) {
                                            eufnVar2 = eufn.a;
                                        }
                                        dwvdVar.c(eufnVar2);
                                        dwvdVar.e(dwwnVar);
                                        a3.b(dwvdVar.a());
                                        return a3.a();
                                    }
                                }, bfbsVar3.b);
                            }
                        }).n()).h(new eiho() { // from class: bfak
                            @Override // defpackage.eiho
                            public final Object apply(Object obj3) {
                                asot asotVar3 = bfbs.a;
                                Stream filter = Collection.EL.stream((List) obj3).filter(new Predicate() { // from class: bfbk
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
                                    public final boolean test(Object obj4) {
                                        return Objects.nonNull((bfae) obj4);
                                    }
                                });
                                int i3 = eitj.d;
                                return (List) filter.collect(eipl.a);
                            }
                        }, enre.a);
                        return egna.h(h, h2).a(new Callable() { // from class: bfbm
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                asot asotVar3 = bfbs.a;
                                int i3 = eitj.d;
                                eite eiteVar = new eite();
                                eiteVar.k((Iterable) ensj.r(enss.this));
                                eiteVar.k((Iterable) ensj.r(h2));
                                return eiteVar.g();
                            }
                        }, bfbsVar2.b);
                    }
                }, executor)).i(new enqc() { // from class: bezw
                    @Override // defpackage.enqc
                    public final enss a(Object obj2) {
                        final eitj eitjVar = (eitj) obj2;
                        boolean isEmpty = eitjVar.isEmpty();
                        final DeviceSyncService deviceSyncService2 = DeviceSyncService.this;
                        final bebf bebfVar2 = bebfVar;
                        if (isEmpty) {
                            return egmx.f(deviceSyncService2.e(bebfVar2)).h(new eiho() { // from class: bfaa
                                @Override // defpackage.eiho
                                public final Object apply(Object obj3) {
                                    asot asotVar2 = DeviceSyncService.a;
                                    return 0;
                                }
                            }, enre.a);
                        }
                        final Account account2 = account;
                        final eitj n = eirn.j(eitjVar).i(new eiih() { // from class: bezm
                            @Override // defpackage.eiih
                            public final boolean a(Object obj3) {
                                asot asotVar2 = DeviceSyncService.a;
                                return ((bfae) obj3).a.h();
                            }
                        }).l(new eiho() { // from class: bezn
                            @Override // defpackage.eiho
                            public final Object apply(Object obj3) {
                                asot asotVar2 = DeviceSyncService.a;
                                return ((bfae) obj3).a.c();
                            }
                        }).n();
                        egmx i2 = egmx.f(deviceSyncService2.c.r(account2, n)).i(new enqc() { // from class: bezo
                            @Override // defpackage.enqc
                            public final enss a(Object obj3) {
                                Stream map = Collection.EL.stream(eitjVar).filter(new Predicate() { // from class: bfab
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
                                    public final boolean test(Object obj4) {
                                        asot asotVar2 = DeviceSyncService.a;
                                        return ((bfae) obj4).c.h();
                                    }
                                }).map(new Function() { // from class: bezk
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo464andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        asot asotVar2 = DeviceSyncService.a;
                                        return ((bfae) obj4).c.c();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                final DeviceSyncService deviceSyncService3 = DeviceSyncService.this;
                                Stream map2 = map.map(new Function() { // from class: bezl
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo464andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        bfac bfacVar = (bfac) obj4;
                                        return DeviceSyncService.this.c.o(bfacVar.a, bfacVar.b);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i3 = eitj.d;
                                return egna.a((Iterable) map2.collect(eipl.a));
                            }
                        }, bebfVar2.e()).i(new enqc() { // from class: bezp
                            @Override // defpackage.enqc
                            public final enss a(Object obj3) {
                                return DeviceSyncService.this.e(bebfVar2);
                            }
                        }, bebfVar2.e()).i(new enqc() { // from class: bezq
                            @Override // defpackage.enqc
                            public final enss a(Object obj3) {
                                eitj eitjVar2 = eitjVar;
                                eitj n2 = eirn.j(eitjVar2).i(new eiih() { // from class: bezx
                                    @Override // defpackage.eiih
                                    public final boolean a(Object obj4) {
                                        asot asotVar2 = DeviceSyncService.a;
                                        return ((bfae) obj4).b.h();
                                    }
                                }).l(new eiho() { // from class: bezy
                                    @Override // defpackage.eiho
                                    public final Object apply(Object obj4) {
                                        asot asotVar2 = DeviceSyncService.a;
                                        return ((bfae) obj4).b.c();
                                    }
                                }).n();
                                DeviceSyncService deviceSyncService3 = DeviceSyncService.this;
                                belk belkVar = deviceSyncService3.b;
                                Account account3 = account2;
                                belkVar.e(account3, n2);
                                if (!n.isEmpty()) {
                                    bfcs.o(byjl.a(deviceSyncService3.getBaseContext()), account3);
                                }
                                if (eivv.v(eitjVar2, new eiih() { // from class: bezz
                                    @Override // defpackage.eiih
                                    public final boolean a(Object obj4) {
                                        return ((bfae) obj4).d;
                                    }
                                })) {
                                    deviceSyncService3.e.a();
                                }
                                final bfbs bfbsVar2 = (bfbs) bebfVar2.d();
                                return egmx.f(bfbsVar2.i.i(account3)).h(new eiho() { // from class: bfbg
                                    @Override // defpackage.eiho
                                    public final Object apply(Object obj4) {
                                        asot asotVar2 = bfbs.a;
                                        return (eiuu) Collection.EL.stream((eitj) obj4).filter(new Predicate() { // from class: bfbi
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
                                            public final boolean test(Object obj5) {
                                                dwuv dwuvVar = (dwuv) obj5;
                                                eiid eiidVar2 = dwuvVar.i;
                                                asot asotVar3 = bfbs.a;
                                                if (eiidVar2.h()) {
                                                    return (dwuvVar.h.h() || dwsz.c((eugj) eiidVar2.c())) ? false : true;
                                                }
                                                return true;
                                            }
                                        }).map(new Function() { // from class: bfbj
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo464andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj5) {
                                                return ((dwuv) obj5).a;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).collect(eipl.b);
                                    }
                                }, enre.a).i(new enqc() { // from class: bfbh
                                    @Override // defpackage.enqc
                                    public final enss a(Object obj4) {
                                        final eiuu eiuuVar = (eiuu) obj4;
                                        if (eiuuVar.isEmpty()) {
                                            return ensm.a;
                                        }
                                        bfbs bfbsVar3 = bfbs.this;
                                        egmx h = egmx.f(bfbsVar3.k.e()).h(new eiho() { // from class: bfbe
                                            @Override // defpackage.eiho
                                            public final Object apply(Object obj5) {
                                                asot asotVar2 = bfbs.a;
                                                Stream stream = Collection.EL.stream((eitj) obj5);
                                                final eiuu eiuuVar2 = eiuu.this;
                                                Stream map = stream.filter(new Predicate() { // from class: bfap
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
                                                    public final boolean test(Object obj6) {
                                                        asot asotVar3 = bfbs.a;
                                                        eufn eufnVar = ((eugc) obj6).c;
                                                        if (eufnVar == null) {
                                                            eufnVar = eufn.a;
                                                        }
                                                        return eiuu.this.contains(eufnVar);
                                                    }
                                                }).map(new Function() { // from class: bfaq
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo464andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj6) {
                                                        eugc eugcVar = (eugc) obj6;
                                                        asot asotVar3 = bfbs.a;
                                                        dwvd dwvdVar = new dwvd(null);
                                                        eufn eufnVar = eugcVar.c;
                                                        if (eufnVar == null) {
                                                            eufnVar = eufn.a;
                                                        }
                                                        dwvdVar.c(eufnVar);
                                                        eugo eugoVar = eugcVar.d;
                                                        if (eugoVar == null) {
                                                            eugoVar = eugo.a;
                                                        }
                                                        eugj b = eugj.b(eugoVar.g);
                                                        if (b == null) {
                                                            b = eugj.UNRECOGNIZED;
                                                        }
                                                        dwvdVar.b = eiid.j(b);
                                                        dwvdVar.d(eiid.j(eugcVar.i));
                                                        return dwvdVar.a();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                });
                                                int i3 = eitj.d;
                                                return (eitj) map.collect(eipl.a);
                                            }
                                        }, enre.a);
                                        final dwvc dwvcVar = bfbsVar3.i;
                                        Objects.requireNonNull(dwvcVar);
                                        return h.i(new enqc() { // from class: bfbf
                                            @Override // defpackage.enqc
                                            public final enss a(Object obj5) {
                                                return dwvc.this.s((eitj) obj5);
                                            }
                                        }, bfbsVar3.b);
                                    }
                                }, bfbsVar2.b);
                            }
                        }, bebfVar2.e());
                        eiho eihoVar = new eiho() { // from class: bezr
                            @Override // defpackage.eiho
                            public final Object apply(Object obj3) {
                                if (!fobx.d().isEmpty()) {
                                    DeviceSyncService.this.sendBroadcast(new Intent("DEVICE_SYNC_COMPLETED").setPackage(fobx.d()));
                                }
                                return 0;
                            }
                        };
                        enre enreVar = enre.a;
                        return i2.h(eihoVar, enreVar).d(Throwable.class, new eiho() { // from class: bezs
                            @Override // defpackage.eiho
                            public final Object apply(Object obj3) {
                                ((ejhf) ((ejhf) ((ejhf) DeviceSyncService.a.i()).s((Throwable) obj3)).ah((char) 4494)).x("Failed syncing devices.");
                                return 2;
                            }
                        }, enreVar);
                    }
                }, bebfVar.e());
            }
        }, a2.e());
        eiho eihoVar = new eiho() { // from class: bezu
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                bcyr bcyrVar = (bcyr) obj;
                asot asotVar2 = DeviceSyncService.a;
                if (bcyrVar.d()) {
                    ((ejhf) ((ejhf) ((ejhf) DeviceSyncService.a.i()).s(bcyrVar)).ah((char) 4491)).x("Failed syncing devices due to a transient RPC error. Will try again later.");
                    return 1;
                }
                ((ejhf) ((ejhf) ((ejhf) DeviceSyncService.a.i()).s(bcyrVar)).ah((char) 4492)).x("Failed syncing devices because the user is unauthenticated.");
                return 2;
            }
        };
        enre enreVar = enre.a;
        return i.d(bcyr.class, eihoVar, enreVar).d(Throwable.class, new eiho() { // from class: bezv
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                ((ejhf) ((ejhf) ((ejhf) DeviceSyncService.a.i()).s((Throwable) obj)).ah((char) 4493)).x("Failed syncing devices.");
                return 2;
            }
        }, enreVar);
    }

    public final enss e(bebf bebfVar) {
        behm c = bebfVar.c();
        final fefi h = fegx.h(this.d.d().toEpochMilli());
        return c.c.b(new eiho() { // from class: begt
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                dwzg dwzgVar = (dwzg) obj;
                asot asotVar = behm.a;
                fecj fecjVar = (fecj) dwzgVar.iB(5, null);
                fecjVar.X(dwzgVar);
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                fefi fefiVar = fefi.this;
                dwzg dwzgVar2 = (dwzg) fecjVar.b;
                fecz feczVar = dwzg.a;
                fefiVar.getClass();
                dwzgVar2.f = fefiVar;
                dwzgVar2.c |= 2;
                return (dwzg) fecjVar.Q();
            }
        }, enre.a);
    }

    public DeviceSyncService(bebp bebpVar) {
        this.b = bebpVar.o();
        this.c = bebpVar.D();
        this.f = bebpVar.R();
        this.e = bebpVar.w();
        this.d = bebpVar.C();
    }
}
