package com.google.android.gms.findmydevice.spot.sync;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.findmydevice.spot.sync.DeviceSyncService;
import com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bfad;
import defpackage.bgcq;
import defpackage.bgcr;
import defpackage.bgda;
import defpackage.bgdb;
import defpackage.bgiy;
import defpackage.bgmw;
import defpackage.bgyf;
import defpackage.bhei;
import defpackage.bhfh;
import defpackage.casd;
import defpackage.cauf;
import defpackage.dpvo;
import defpackage.dzhc;
import defpackage.ejaa;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fgub;
import defpackage.fgvq;
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

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DeviceSyncService extends SafeGmsTaskBoundService {
    public static final ausn a = ausn.b("DeviceSyncService", auid.FIND_MY_DEVICE_SPOT);
    public final bgmw b;
    public final dzhc c;
    public final dpvo d;
    public final bgyf e;
    private final bgcq f;

    public DeviceSyncService() {
        this(bgda.a());
    }

    @Override // com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService
    protected final eqgl d(cauf caufVar) {
        if (!bhfh.a()) {
            ((eluo) ((eluo) a.j()).ai((char) 4507)).x("Eddystone use cases are disabled.");
            return eqgc.i(2);
        }
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 4505)).x("Syncing devices of user.");
        final ekvi d = bhei.d(caufVar, getBaseContext());
        if (!d.h()) {
            ((eluo) ((eluo) ausnVar.i()).ai((char) 4506)).x("Account that has a SPOT owner key not found while syncing devices.");
            ekvi e = bhei.e(caufVar);
            if (e.h()) {
                bhei.g(casd.a(getBaseContext()), (String) e.c());
            }
            return eqgc.i(2);
        }
        Bundle bundle = caufVar.b;
        boolean z = bundle == null || bundle.getBoolean("force", true);
        final bgcr a2 = this.f.a((Account) d.c());
        ejaa i = ejaa.g(z ? eqgc.i(true) : ejaa.g(ejaa.g(a2.c().c.a()).h(new ekut() { // from class: bgiw
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                dzlg dzlgVar = (dzlg) obj;
                ausn ausnVar2 = bgiy.a;
                if ((dzlgVar.c & 2) == 0) {
                    return ektg.a;
                }
                fgub fgubVar = dzlgVar.f;
                if (fgubVar == null) {
                    fgubVar = fgub.a;
                }
                return ekvi.j(fgubVar);
            }
        }, eqex.a)).h(new ekut() { // from class: bhaz
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ekvi ekviVar = (ekvi) obj;
                boolean z2 = true;
                if (ekviVar.h() && DeviceSyncService.this.d.d().toEpochMilli() - fgvq.b((fgub) ekviVar.c()) <= TimeUnit.HOURS.toMillis(fqtl.u())) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }, a2.e())).i(new eqdv() { // from class: bhbj
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eqgc.i(0);
                }
                final bgcr bgcrVar = a2;
                ekvi ekviVar = d;
                final DeviceSyncService deviceSyncService = DeviceSyncService.this;
                Object c = ekviVar.c();
                final bhdi bhdiVar = (bhdi) bgcrVar.d();
                ejaa g = ejaa.g(bhdiVar.c.a());
                eqdv eqdvVar = new eqdv() { // from class: bhcl
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj2) {
                        return bhdi.this.k.g(((Integer) ((ekvi) obj2).b(new ekut() { // from class: bhcq
                            @Override // defpackage.ekut
                            public final Object apply(Object obj3) {
                                return Integer.valueOf(((dzky) obj3).e);
                            }
                        }).e(-1)).intValue(), true);
                    }
                };
                Executor executor = bhdiVar.b;
                final Account account = (Account) c;
                return ejaa.g(g.i(eqdvVar, executor).i(new eqdv() { // from class: bhcm
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj2) {
                        final ewxi ewxiVar = (ewxi) obj2;
                        dzle dzleVar = (dzle) dzlf.a.v();
                        dzleVar.k(ewxiVar.f);
                        dzleVar.a(ewxiVar.g);
                        dzlf dzlfVar = (dzlf) dzleVar.Q();
                        bhdi bhdiVar2 = bhdi.this;
                        return ejaf.j(bhdiVar2.g.h(dzlfVar), new ekut() { // from class: bhch
                            @Override // defpackage.ekut
                            public final Object apply(Object obj3) {
                                ausn ausnVar2 = bhdi.a;
                                return ewxi.this;
                            }
                        }, bhdiVar2.b);
                    }
                }, executor).i(new eqdv() { // from class: bhcn
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj2) {
                        final ewxi ewxiVar = (ewxi) obj2;
                        eltz h = bhdi.a.h();
                        fgrr fgrrVar = ewxiVar.h;
                        fgrs fgrsVar = ewxi.a;
                        ((eluo) ((eluo) h).ai((char) 4512)).B("Owned device types: %s", TextUtils.join(",", elja.j(new fgrt(fgrrVar, fgrsVar), new ekut() { // from class: bhcr
                            @Override // defpackage.ekut
                            public final Object apply(Object obj3) {
                                return ((ewwc) obj3).name();
                            }
                        })));
                        final elhz G = elhz.G(new fgrt(ewxiVar.h, fgrsVar));
                        bhdi bhdiVar2 = bhdi.this;
                        final bgiy bgiyVar = (bgiy) bhdiVar2.g;
                        return ejaf.j(bgiyVar.c.b(new ekut() { // from class: bgiq
                            @Override // defpackage.ekut
                            public final Object apply(Object obj3) {
                                dzlg dzlgVar = (dzlg) obj3;
                                fgrr fgrrVar2 = dzlgVar.d;
                                fgrs fgrsVar2 = dzlg.a;
                                elhz G2 = elhz.G(new fgrt(fgrrVar2, fgrsVar2));
                                Set set = G;
                                if (G2.equals(set)) {
                                    return dzlgVar;
                                }
                                boolean k = bgiy.k(new fgrt(dzlgVar.d, fgrsVar2));
                                boolean k2 = bgiy.k(set);
                                bgiy.this.j(k2, dzmi.b(k2 && !k, new Runnable() { // from class: bgis
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ((eluo) ((eluo) bgiy.a.h()).ai((char) 4213)).x("New advertising devices found, may need sync.");
                                    }
                                }), false);
                                fgrc fgrcVar = (fgrc) dzlgVar.iQ(5, null);
                                fgrcVar.X(dzlgVar);
                                if (!fgrcVar.b.L()) {
                                    fgrcVar.U();
                                }
                                ((dzlg) fgrcVar.b).d = fgrk.a;
                                if (!fgrcVar.b.L()) {
                                    fgrcVar.U();
                                }
                                dzlg dzlgVar2 = (dzlg) fgrcVar.b;
                                dzlgVar2.b();
                                Iterator it = set.iterator();
                                while (it.hasNext()) {
                                    dzlgVar2.d.i(((ewwc) it.next()).a());
                                }
                                return (dzlg) fgrcVar.Q();
                            }
                        }, eqex.a), new ekut() { // from class: bhct
                            @Override // defpackage.ekut
                            public final Object apply(Object obj3) {
                                ausn ausnVar2 = bhdi.a;
                                return ewxi.this;
                            }
                        }, bhdiVar2.b);
                    }
                }, executor).i(new eqdv() { // from class: bhco
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj2) {
                        final eqgl h;
                        final ewxi ewxiVar = (ewxi) obj2;
                        int size = ewxiVar.c.size() + ewxiVar.d.size();
                        final bhdi bhdiVar2 = bhdi.this;
                        if (size == 0) {
                            ((eluo) ((eluo) bhdi.a.h()).ai((char) 4515)).x("Owns no advertising E2EE Android device and accessories.");
                            int i2 = elgo.d;
                            h = eqgc.i(elpg.a);
                        } else {
                            ausn ausnVar2 = bhdi.a;
                            ((eluo) ((eluo) ausnVar2.h()).ai((char) 4513)).z("Owns %d advertising E2EE Android device and accessories.", size);
                            ((eluo) ((eluo) ausnVar2.h()).ai((char) 4514)).z("%d E2EE devices require EID computation.", ewxiVar.c.size());
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(bhdiVar2.j.d().toEpochMilli());
                            dzie dzieVar = bhdiVar2.l;
                            final long seconds2 = seconds - TimeUnit.HOURS.toSeconds(Math.max(dzieVar.c(), dzieVar.a()));
                            final long seconds3 = TimeUnit.HOURS.toSeconds(((int) fwmp.a.lK().c(dzieVar.a)) - dzieVar.c()) + seconds;
                            ekvl.q(seconds2 <= seconds && seconds3 > seconds && seconds3 - seconds2 <= dzhq.a);
                            ejaa g2 = ejaa.g(bhdiVar2.h.f());
                            eqdv eqdvVar2 = new eqdv() { // from class: bhcs
                                @Override // defpackage.eqdv
                                public final eqgl a(Object obj3) {
                                    dzjc dzjcVar = ((dzkw) obj3).j;
                                    if (dzjcVar == null) {
                                        dzjcVar = dzjc.a;
                                    }
                                    ewvg ewvgVar = dzjcVar.d;
                                    if (ewvgVar == null) {
                                        ewvgVar = ewvg.a;
                                    }
                                    final ewvg ewvgVar2 = ewvgVar;
                                    final long j = seconds3;
                                    final long j2 = seconds2;
                                    final ewxi ewxiVar2 = ewxiVar;
                                    final bhdi bhdiVar3 = bhdi.this;
                                    return ejad.f(eles.j(ewxiVar2.c).l(new ekut() { // from class: bhcb
                                        @Override // defpackage.ekut
                                        public final Object apply(Object obj4) {
                                            long j3;
                                            final ewxf ewxfVar = (ewxf) obj4;
                                            int i3 = ewxfVar.b & 32;
                                            final long j4 = j2;
                                            if (i3 != 0) {
                                                fgub fgubVar = ewxfVar.k;
                                                if (fgubVar == null) {
                                                    fgubVar = fgub.a;
                                                }
                                                j3 = Math.min(fgvq.d(fgubVar), dzhq.a + j4);
                                            } else {
                                                j3 = j;
                                            }
                                            final long j5 = j3;
                                            final bhdi bhdiVar4 = bhdi.this;
                                            ewvg ewvgVar3 = ewxfVar.c;
                                            if (ewvgVar3 == null) {
                                                ewvgVar3 = ewvg.a;
                                            }
                                            ewww ewwwVar = ewxfVar.d;
                                            if (ewwwVar == null) {
                                                ewwwVar = ewww.a;
                                            }
                                            ewwk ewwkVar = ewxfVar.h;
                                            if (ewwkVar == null) {
                                                ewwkVar = ewwk.a;
                                            }
                                            ejaa a3 = bhdiVar4.d.a(ewvgVar3, ewwwVar, ewwkVar);
                                            ewvg ewvgVar4 = ewxfVar.c;
                                            if (ewvgVar4 == null) {
                                                ewvgVar4 = ewvg.a;
                                            }
                                            if (ewvgVar4.equals(ewvgVar2)) {
                                                return a3.i(new eqdv() { // from class: bhci
                                                    @Override // defpackage.eqdv
                                                    public final eqgl a(Object obj5) {
                                                        final dzin dzinVar;
                                                        eqgl e2;
                                                        final ewxf ewxfVar2 = ewxfVar;
                                                        dzin dzinVar2 = (dzin) obj5;
                                                        ewwk ewwkVar2 = ewxfVar2.h;
                                                        if (ewwkVar2 == null) {
                                                            ewwkVar2 = ewwk.a;
                                                        }
                                                        final bhdi bhdiVar5 = bhdi.this;
                                                        bfnk bfnkVar = bhdiVar5.f;
                                                        if (!ewwkVar2.e) {
                                                            if (bfnkVar.c.d().toEpochMilli() - fgvq.b(dzinVar2.d) <= TimeUnit.HOURS.toMillis(Math.min(bfnkVar.e.d(), bfnk.b))) {
                                                                e2 = eqgc.i(dzinVar2);
                                                                dzinVar = dzinVar2;
                                                                final long j6 = j5;
                                                                final long j7 = j4;
                                                                final dzin dzinVar3 = dzinVar;
                                                                return ejaf.j(e2, new ekut() { // from class: bhbw
                                                                    @Override // defpackage.ekut
                                                                    public final Object apply(Object obj6) {
                                                                        dzin dzinVar4 = (dzin) obj6;
                                                                        boolean z2 = dzinVar4 != dzinVar3;
                                                                        long j8 = j6;
                                                                        long j9 = j7;
                                                                        return bhdi.this.a(ewxfVar2, dzinVar4, z2, j9, j8, true);
                                                                    }
                                                                }, bhdiVar5.b);
                                                            }
                                                        }
                                                        ((eluo) ((eluo) bfnk.a.h()).ai((char) 4022)).x("Rotating self device secrets.");
                                                        bfes bfesVar = bfnkVar.d;
                                                        ewvg ewvgVar5 = ewxfVar2.c;
                                                        if (ewvgVar5 == null) {
                                                            ewvgVar5 = ewvg.a;
                                                        }
                                                        ewvg ewvgVar6 = ewvgVar5;
                                                        bfni bfniVar = bfesVar.b;
                                                        dzinVar = dzinVar2;
                                                        bght a4 = ((bghx) bfniVar.a).a();
                                                        fxqo fxqoVar = bfniVar.c;
                                                        Object a5 = bfniVar.b.a();
                                                        Executor executor2 = (Executor) fxqoVar.a();
                                                        executor2.getClass();
                                                        ewvgVar6.getClass();
                                                        dzinVar.getClass();
                                                        e2 = ejaf.e(new bfnh(a4, (bfeo) a5, executor2, ewvgVar6, dzinVar).a(), Throwable.class, new ekut() { // from class: bfnj
                                                            @Override // defpackage.ekut
                                                            public final Object apply(Object obj6) {
                                                                ((eluo) ((eluo) ((eluo) bfnk.a.i()).s((Throwable) obj6)).ai((char) 4021)).x("Failed rotating self device secrets");
                                                                return dzin.this;
                                                            }
                                                        }, eqex.a);
                                                        final long j62 = j5;
                                                        final long j72 = j4;
                                                        final dzin dzinVar32 = dzinVar;
                                                        return ejaf.j(e2, new ekut() { // from class: bhbw
                                                            @Override // defpackage.ekut
                                                            public final Object apply(Object obj6) {
                                                                dzin dzinVar4 = (dzin) obj6;
                                                                boolean z2 = dzinVar4 != dzinVar32;
                                                                long j8 = j62;
                                                                long j9 = j72;
                                                                return bhdi.this.a(ewxfVar2, dzinVar4, z2, j9, j8, true);
                                                            }
                                                        }, bhdiVar5.b);
                                                    }
                                                }, bhdiVar4.b);
                                            }
                                            ekut ekutVar = new ekut() { // from class: bhcj
                                                @Override // defpackage.ekut
                                                public final Object apply(Object obj5) {
                                                    return bhdi.this.a(ewxfVar, (dzin) obj5, false, j4, j5, false);
                                                }
                                            };
                                            Executor executor2 = bhdiVar4.b;
                                            return a3.h(ekutVar, executor2).e(Throwable.class, new ekut() { // from class: bhck
                                                @Override // defpackage.ekut
                                                public final Object apply(Object obj5) {
                                                    eluo eluoVar = (eluo) ((eluo) ((eluo) bhdi.a.i()).s((Throwable) obj5)).ai(4511);
                                                    ewxf ewxfVar2 = ewxf.this;
                                                    ewvg ewvgVar5 = ewxfVar2.c;
                                                    if (ewvgVar5 == null) {
                                                        ewvgVar5 = ewvg.a;
                                                    }
                                                    eluoVar.B("Error calculating EIDs for device %s.", ewvgVar5.b);
                                                    ewvg ewvgVar6 = ewxfVar2.c;
                                                    if (ewvgVar6 == null) {
                                                        ewvgVar6 = ewvg.a;
                                                    }
                                                    int i4 = ewxfVar2.f;
                                                    long j6 = ewxfVar2.e;
                                                    int b = ewwj.b(ewxfVar2.i);
                                                    if (b == 0) {
                                                        b = 1;
                                                    }
                                                    dzhh dzhhVar = new dzhh(null);
                                                    dzhhVar.b(ewvgVar6);
                                                    dzhhVar.f(i4);
                                                    ektg ektgVar = ektg.a;
                                                    dzhhVar.a = ektgVar;
                                                    dzhhVar.e(false);
                                                    dzhhVar.d(ewxx.a);
                                                    dzhhVar.b = ektgVar;
                                                    dzhhVar.c(j6);
                                                    dzhhVar.d = b;
                                                    dzhhVar.i(ewvy.UNSPECIFIED_TRACKABLE_COMPONENTS);
                                                    dzhhVar.g(false);
                                                    dzhhVar.h(false);
                                                    dzhhVar.c = ektgVar;
                                                    return dzhhVar.a();
                                                }
                                            }, executor2);
                                        }
                                    }).n()).h(new ekut() { // from class: bhcc
                                        @Override // defpackage.ekut
                                        public final Object apply(Object obj4) {
                                            ausn ausnVar3 = bhdi.a;
                                            Stream filter = Collection.EL.stream((List) obj4).filter(new Predicate() { // from class: bhce
                                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                                    return Predicate$CC.$default$and(this, predicate);
                                                }

                                                @Override // java.util.function.Predicate
                                                /* renamed from: negate */
                                                public final /* synthetic */ Predicate mo478negate() {
                                                    return Predicate$CC.$default$negate(this);
                                                }

                                                @Override // java.util.function.Predicate
                                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                                    return Predicate$CC.$default$or(this, predicate);
                                                }

                                                @Override // java.util.function.Predicate
                                                public final boolean test(Object obj5) {
                                                    return Objects.nonNull((dzhi) obj5);
                                                }
                                            });
                                            int i3 = elgo.d;
                                            return (elgo) filter.collect(elcq.a);
                                        }
                                    }, eqex.a).i(new eqdv() { // from class: bhcd
                                        @Override // defpackage.eqdv
                                        public final eqgl a(Object obj4) {
                                            final elgo elgoVar = (elgo) obj4;
                                            fgsa fgsaVar = ewxiVar2.c;
                                            elgj e2 = elgo.e(elgoVar.size());
                                            bhdi bhdiVar4 = bhdi.this;
                                            dzhs dzhsVar = bhdiVar4.e;
                                            fgub j3 = fgvq.j(TimeUnit.MILLISECONDS.toSeconds(dzhsVar.a.d().toEpochMilli()) - ((int) TimeUnit.HOURS.toSeconds(dzhsVar.c.c())));
                                            for (int i3 = 0; i3 < elgoVar.size(); i3++) {
                                                dzhi dzhiVar = (dzhi) elgoVar.get(i3);
                                                fgsa fgsaVar2 = dzhiVar.e.b;
                                                fgub fgubVar = ((ewxf) fgsaVar.get(i3)).g;
                                                if (fgubVar == null) {
                                                    fgubVar = fgub.a;
                                                }
                                                List h2 = elkk.h(fgsaVar2, new ekut() { // from class: dzhr
                                                    @Override // defpackage.ekut
                                                    public final Object apply(Object obj5) {
                                                        fgub fgubVar2 = ((ewxy) obj5).c;
                                                        return fgubVar2 == null ? fgub.a : fgubVar2;
                                                    }
                                                });
                                                if (fgvp.a(fgubVar, j3) <= 0) {
                                                    fgubVar = j3;
                                                }
                                                int binarySearch = Collections.binarySearch(h2, fgubVar, fgvp.a);
                                                int i4 = binarySearch < 0 ? -(binarySearch + 1) : binarySearch + 1;
                                                if (i4 != fgsaVar2.size()) {
                                                    fgrc v = exab.a.v();
                                                    ewvg ewvgVar3 = dzhiVar.a;
                                                    if (!v.b.L()) {
                                                        v.U();
                                                    }
                                                    exab exabVar = (exab) v.b;
                                                    ewvgVar3.getClass();
                                                    exabVar.c = ewvgVar3;
                                                    exabVar.b |= 1;
                                                    ewxw ewxwVar = (ewxw) ewxx.a.v();
                                                    ewxwVar.a(fgsaVar2.subList(i4, fgsaVar2.size()));
                                                    if (!v.b.L()) {
                                                        v.U();
                                                    }
                                                    exab exabVar2 = (exab) v.b;
                                                    ewxx ewxxVar = (ewxx) ewxwVar.Q();
                                                    ewxxVar.getClass();
                                                    exabVar2.d = ewxxVar;
                                                    exabVar2.b |= 2;
                                                    long j4 = dzhiVar.g;
                                                    if (!v.b.L()) {
                                                        v.U();
                                                    }
                                                    ((exab) v.b).e = j4;
                                                    e2.i((exab) v.Q());
                                                }
                                            }
                                            elgo g3 = e2.g();
                                            return ejaf.j(g3.isEmpty() ? eqgf.a : dzhsVar.b.o(g3), new ekut() { // from class: bhcp
                                                @Override // defpackage.ekut
                                                public final Object apply(Object obj5) {
                                                    ausn ausnVar3 = bhdi.a;
                                                    return elgo.this;
                                                }
                                            }, bhdiVar4.b);
                                        }
                                    }, bhdiVar3.b);
                                }
                            };
                            Executor executor2 = bhdiVar2.b;
                            h = g2.i(eqdvVar2, executor2).h(new ekut() { // from class: bhdb
                                @Override // defpackage.ekut
                                public final Object apply(Object obj3) {
                                    elgo elgoVar = (elgo) obj3;
                                    ausn ausnVar3 = bhdi.a;
                                    int i3 = elgo.d;
                                    elgj elgjVar = new elgj();
                                    elgjVar.k(eles.j(elgoVar).i(new ekvm() { // from class: bhdd
                                        @Override // defpackage.ekvm
                                        public final boolean a(Object obj4) {
                                            return ((dzhi) obj4).j;
                                        }
                                    }).l(new ekut() { // from class: bhde
                                        @Override // defpackage.ekut
                                        public final Object apply(Object obj4) {
                                            boolean z2 = ((dzhi) obj4).d;
                                            ausn ausnVar4 = bhdi.a;
                                            bhbt a3 = bhbu.a();
                                            a3.c(z2);
                                            return a3.a();
                                        }
                                    }).n());
                                    elgjVar.k(eles.j(elgoVar).i(new ekvm() { // from class: bhdf
                                        @Override // defpackage.ekvm
                                        public final boolean a(Object obj4) {
                                            ausn ausnVar4 = bhdi.a;
                                            return !((dzhi) obj4).j;
                                        }
                                    }).i(new ekvm() { // from class: bhdg
                                        @Override // defpackage.ekvm
                                        public final boolean a(Object obj4) {
                                            dzhi dzhiVar = (dzhi) obj4;
                                            return (dzhiVar.e.b.isEmpty() && ((ewxx) dzhiVar.f.e(ewxx.a)).b.isEmpty()) ? false : true;
                                        }
                                    }).l(new ekut() { // from class: bhdh
                                        @Override // defpackage.ekut
                                        public final Object apply(Object obj4) {
                                            ewxx ewxxVar;
                                            dzhi dzhiVar = (dzhi) obj4;
                                            ausn ausnVar4 = bhdi.a;
                                            bhbt a3 = bhbu.a();
                                            dzhd dzhdVar = new dzhd(null);
                                            ewvg ewvgVar = dzhiVar.a;
                                            dzhdVar.c(ewvgVar);
                                            dzhdVar.f(dzhiVar.c);
                                            int i4 = dzhiVar.b;
                                            dyrv a4 = dyrw.a();
                                            a4.d(i4);
                                            a4.b(dzhiVar.g);
                                            a4.f(dzhiVar.l);
                                            a4.e(dzhiVar.h);
                                            a4.c(dzhiVar.k);
                                            dzhdVar.b(a4.a());
                                            a3.b(dzhdVar.a());
                                            dzht dzhtVar = new dzht();
                                            dzhtVar.b(ewvgVar);
                                            ekvi ekviVar2 = dzhiVar.f;
                                            if (ekviVar2.h()) {
                                                ewxw ewxwVar = (ewxw) ewxx.a.v();
                                                elgo m = elgo.m(dzhiVar.e.b, ((ewxx) ekviVar2.c()).b);
                                                fgub fgubVar = fgvq.a;
                                                ewxwVar.a(elja.g(m, new elbp(new ekut() { // from class: dzhg
                                                    @Override // defpackage.ekut
                                                    public final Object apply(Object obj5) {
                                                        fgub fgubVar2 = ((ewxy) obj5).c;
                                                        return fgubVar2 == null ? fgub.a : fgubVar2;
                                                    }
                                                }, elot.f(fgvp.a))));
                                                ewxxVar = (ewxx) ewxwVar.Q();
                                            } else {
                                                ewxxVar = dzhiVar.e;
                                            }
                                            dzhtVar.c(ewxxVar);
                                            a3.d(dzhtVar.a());
                                            a3.a = ekvi.j(new bhbs(ewvgVar, dzhiVar.i));
                                            return a3.a();
                                        }
                                    }).n());
                                    elgjVar.k(eles.j(ewxi.this.d).l(new ekut() { // from class: bhbx
                                        @Override // defpackage.ekut
                                        public final Object apply(Object obj4) {
                                            ekvi ekviVar2;
                                            ewxh ewxhVar = (ewxh) obj4;
                                            ausn ausnVar4 = bhdi.a;
                                            bhbt a3 = bhbu.a();
                                            dzhd dzhdVar = new dzhd(null);
                                            ewvg ewvgVar = ewxhVar.c;
                                            if (ewvgVar == null) {
                                                ewvgVar = ewvg.a;
                                            }
                                            dzhdVar.c(ewvgVar);
                                            dyrv a4 = dyrw.a();
                                            a4.d(ewxhVar.e);
                                            a4.b(ewxhVar.f);
                                            int b = ewwj.b(ewxhVar.h);
                                            if (b == 0) {
                                                b = 1;
                                            }
                                            a4.f(b);
                                            if ((ewxhVar.b & 4) != 0) {
                                                ewwp ewwpVar = ewxhVar.g;
                                                if (ewwpVar == null) {
                                                    ewwpVar = ewwp.a;
                                                }
                                                ekviVar2 = ekvi.j(ewwpVar);
                                            } else {
                                                ekviVar2 = ektg.a;
                                            }
                                            a4.c(ekviVar2);
                                            dzhdVar.b(a4.a());
                                            a3.b(dzhdVar.a());
                                            dzht dzhtVar = new dzht();
                                            ewvg ewvgVar2 = ewxhVar.c;
                                            if (ewvgVar2 == null) {
                                                ewvgVar2 = ewvg.a;
                                            }
                                            dzhtVar.b(ewvgVar2);
                                            ewxx ewxxVar = ewxhVar.d;
                                            if (ewxxVar == null) {
                                                ewxxVar = ewxx.a;
                                            }
                                            dzhtVar.c(ewxxVar);
                                            a3.d(dzhtVar.a());
                                            return a3.a();
                                        }
                                    }).n());
                                    return elgjVar.g();
                                }
                            }, executor2);
                        }
                        fgsa fgsaVar = ewxiVar.e;
                        ((eluo) ((eluo) bhdi.a.h()).ai((char) 4516)).z("Owns %d non advertising accessories.", fgsaVar.size());
                        final ejaa h2 = ejad.f(eles.j(fgsaVar).l(new ekut() { // from class: bhbz
                            @Override // defpackage.ekut
                            public final Object apply(Object obj3) {
                                final ewxg ewxgVar = (ewxg) obj3;
                                ewvg ewvgVar = ewxgVar.b;
                                if (ewvgVar == null) {
                                    ewvgVar = ewvg.a;
                                }
                                ewww ewwwVar = ewxgVar.c;
                                if (ewwwVar == null) {
                                    ewwwVar = ewww.a;
                                }
                                ewwk ewwkVar = ewxgVar.d;
                                if (ewwkVar == null) {
                                    ewwkVar = ewwk.a;
                                }
                                bhdi bhdiVar3 = bhdi.this;
                                return ejaf.j(bhdiVar3.d.a(ewvgVar, ewwwVar, ewwkVar), new ekut() { // from class: bhby
                                    @Override // defpackage.ekut
                                    public final Object apply(Object obj4) {
                                        dzin dzinVar = (dzin) obj4;
                                        ausn ausnVar3 = bhdi.a;
                                        bhbt a3 = bhbu.a();
                                        dzhd dzhdVar = new dzhd(null);
                                        ewvg ewvgVar2 = ewxg.this.b;
                                        if (ewvgVar2 == null) {
                                            ewvgVar2 = ewvg.a;
                                        }
                                        dzhdVar.c(ewvgVar2);
                                        dzhdVar.e(dzinVar);
                                        a3.b(dzhdVar.a());
                                        return a3.a();
                                    }
                                }, bhdiVar3.b);
                            }
                        }).n()).h(new ekut() { // from class: bhca
                            @Override // defpackage.ekut
                            public final Object apply(Object obj3) {
                                ausn ausnVar3 = bhdi.a;
                                Stream filter = Collection.EL.stream((List) obj3).filter(new Predicate() { // from class: bhda
                                    public final /* synthetic */ Predicate and(Predicate predicate) {
                                        return Predicate$CC.$default$and(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    /* renamed from: negate */
                                    public final /* synthetic */ Predicate mo478negate() {
                                        return Predicate$CC.$default$negate(this);
                                    }

                                    @Override // java.util.function.Predicate
                                    public final /* synthetic */ Predicate or(Predicate predicate) {
                                        return Predicate$CC.$default$or(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj4) {
                                        return Objects.nonNull((bhbu) obj4);
                                    }
                                });
                                int i3 = elgo.d;
                                return (List) filter.collect(elcq.a);
                            }
                        }, eqex.a);
                        return ejad.h(h, h2).a(new Callable() { // from class: bhdc
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ausn ausnVar3 = bhdi.a;
                                int i3 = elgo.d;
                                elgj elgjVar = new elgj();
                                elgjVar.k((Iterable) eqgc.r(eqgl.this));
                                elgjVar.k((Iterable) eqgc.r(h2));
                                return elgjVar.g();
                            }
                        }, bhdiVar2.b);
                    }
                }, executor)).i(new eqdv() { // from class: bhbm
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj2) {
                        final elgo elgoVar = (elgo) obj2;
                        boolean isEmpty = elgoVar.isEmpty();
                        final DeviceSyncService deviceSyncService2 = DeviceSyncService.this;
                        final bgcr bgcrVar2 = bgcrVar;
                        if (isEmpty) {
                            return ejaa.g(deviceSyncService2.e(bgcrVar2)).h(new ekut() { // from class: bhbq
                                @Override // defpackage.ekut
                                public final Object apply(Object obj3) {
                                    ausn ausnVar2 = DeviceSyncService.a;
                                    return 0;
                                }
                            }, eqex.a);
                        }
                        final Account account2 = account;
                        final elgo n = eles.j(elgoVar).i(new ekvm() { // from class: bhbc
                            @Override // defpackage.ekvm
                            public final boolean a(Object obj3) {
                                ausn ausnVar2 = DeviceSyncService.a;
                                return ((bhbu) obj3).a.h();
                            }
                        }).l(new ekut() { // from class: bhbd
                            @Override // defpackage.ekut
                            public final Object apply(Object obj3) {
                                ausn ausnVar2 = DeviceSyncService.a;
                                return ((bhbu) obj3).a.c();
                            }
                        }).n();
                        ejaa i2 = ejaa.g(deviceSyncService2.c.r(account2, n)).i(new eqdv() { // from class: bhbe
                            @Override // defpackage.eqdv
                            public final eqgl a(Object obj3) {
                                Stream map = Collection.EL.stream(elgoVar).filter(new Predicate() { // from class: bhbr
                                    public final /* synthetic */ Predicate and(Predicate predicate) {
                                        return Predicate$CC.$default$and(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    /* renamed from: negate */
                                    public final /* synthetic */ Predicate mo478negate() {
                                        return Predicate$CC.$default$negate(this);
                                    }

                                    @Override // java.util.function.Predicate
                                    public final /* synthetic */ Predicate or(Predicate predicate) {
                                        return Predicate$CC.$default$or(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj4) {
                                        ausn ausnVar2 = DeviceSyncService.a;
                                        return ((bhbu) obj4).c.h();
                                    }
                                }).map(new Function() { // from class: bhba
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo479andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        ausn ausnVar2 = DeviceSyncService.a;
                                        return ((bhbu) obj4).c.c();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                final DeviceSyncService deviceSyncService3 = DeviceSyncService.this;
                                Stream map2 = map.map(new Function() { // from class: bhbb
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo479andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        bhbs bhbsVar = (bhbs) obj4;
                                        return DeviceSyncService.this.c.o(bhbsVar.a, bhbsVar.b);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i3 = elgo.d;
                                return ejad.a((Iterable) map2.collect(elcq.a));
                            }
                        }, bgcrVar2.e()).i(new eqdv() { // from class: bhbf
                            @Override // defpackage.eqdv
                            public final eqgl a(Object obj3) {
                                return DeviceSyncService.this.e(bgcrVar2);
                            }
                        }, bgcrVar2.e()).i(new eqdv() { // from class: bhbg
                            @Override // defpackage.eqdv
                            public final eqgl a(Object obj3) {
                                elgo elgoVar2 = elgoVar;
                                elgo n2 = eles.j(elgoVar2).i(new ekvm() { // from class: bhbn
                                    @Override // defpackage.ekvm
                                    public final boolean a(Object obj4) {
                                        ausn ausnVar2 = DeviceSyncService.a;
                                        return ((bhbu) obj4).b.h();
                                    }
                                }).l(new ekut() { // from class: bhbo
                                    @Override // defpackage.ekut
                                    public final Object apply(Object obj4) {
                                        ausn ausnVar2 = DeviceSyncService.a;
                                        return ((bhbu) obj4).b.c();
                                    }
                                }).n();
                                DeviceSyncService deviceSyncService3 = DeviceSyncService.this;
                                bgmw bgmwVar = deviceSyncService3.b;
                                Account account3 = account2;
                                bgmwVar.e(account3, n2);
                                if (!n.isEmpty()) {
                                    bhei.o(casd.a(deviceSyncService3.getBaseContext()), account3);
                                }
                                if (elja.v(elgoVar2, new ekvm() { // from class: bhbp
                                    @Override // defpackage.ekvm
                                    public final boolean a(Object obj4) {
                                        return ((bhbu) obj4).d;
                                    }
                                })) {
                                    deviceSyncService3.e.a();
                                }
                                final bhdi bhdiVar2 = (bhdi) bgcrVar2.d();
                                return ejaa.g(bhdiVar2.i.i(account3)).h(new ekut() { // from class: bhcw
                                    @Override // defpackage.ekut
                                    public final Object apply(Object obj4) {
                                        ausn ausnVar2 = bhdi.a;
                                        return (elhz) Collection.EL.stream((elgo) obj4).filter(new Predicate() { // from class: bhcy
                                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                                return Predicate$CC.$default$and(this, predicate);
                                            }

                                            @Override // java.util.function.Predicate
                                            /* renamed from: negate */
                                            public final /* synthetic */ Predicate mo478negate() {
                                                return Predicate$CC.$default$negate(this);
                                            }

                                            @Override // java.util.function.Predicate
                                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                                return Predicate$CC.$default$or(this, predicate);
                                            }

                                            @Override // java.util.function.Predicate
                                            public final boolean test(Object obj5) {
                                                dzgv dzgvVar = (dzgv) obj5;
                                                ekvi ekviVar2 = dzgvVar.i;
                                                ausn ausnVar3 = bhdi.a;
                                                if (ekviVar2.h()) {
                                                    return (dzgvVar.h.h() || dzez.c((ewwc) ekviVar2.c())) ? false : true;
                                                }
                                                return true;
                                            }
                                        }).map(new Function() { // from class: bhcz
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo479andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj5) {
                                                return ((dzgv) obj5).a;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).collect(elcq.b);
                                    }
                                }, eqex.a).i(new eqdv() { // from class: bhcx
                                    @Override // defpackage.eqdv
                                    public final eqgl a(Object obj4) {
                                        final elhz elhzVar = (elhz) obj4;
                                        if (elhzVar.isEmpty()) {
                                            return eqgf.a;
                                        }
                                        bhdi bhdiVar3 = bhdi.this;
                                        ejaa h = ejaa.g(bhdiVar3.k.e()).h(new ekut() { // from class: bhcu
                                            @Override // defpackage.ekut
                                            public final Object apply(Object obj5) {
                                                ausn ausnVar2 = bhdi.a;
                                                Stream stream = Collection.EL.stream((elgo) obj5);
                                                final elhz elhzVar2 = elhz.this;
                                                Stream map = stream.filter(new Predicate() { // from class: bhcf
                                                    public final /* synthetic */ Predicate and(Predicate predicate) {
                                                        return Predicate$CC.$default$and(this, predicate);
                                                    }

                                                    @Override // java.util.function.Predicate
                                                    /* renamed from: negate */
                                                    public final /* synthetic */ Predicate mo478negate() {
                                                        return Predicate$CC.$default$negate(this);
                                                    }

                                                    @Override // java.util.function.Predicate
                                                    public final /* synthetic */ Predicate or(Predicate predicate) {
                                                        return Predicate$CC.$default$or(this, predicate);
                                                    }

                                                    @Override // java.util.function.Predicate
                                                    public final boolean test(Object obj6) {
                                                        ausn ausnVar3 = bhdi.a;
                                                        ewvg ewvgVar = ((ewvv) obj6).c;
                                                        if (ewvgVar == null) {
                                                            ewvgVar = ewvg.a;
                                                        }
                                                        return elhz.this.contains(ewvgVar);
                                                    }
                                                }).map(new Function() { // from class: bhcg
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo479andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj6) {
                                                        ewvv ewvvVar = (ewvv) obj6;
                                                        ausn ausnVar3 = bhdi.a;
                                                        dzhd dzhdVar = new dzhd(null);
                                                        ewvg ewvgVar = ewvvVar.c;
                                                        if (ewvgVar == null) {
                                                            ewvgVar = ewvg.a;
                                                        }
                                                        dzhdVar.c(ewvgVar);
                                                        ewwh ewwhVar = ewvvVar.d;
                                                        if (ewwhVar == null) {
                                                            ewwhVar = ewwh.a;
                                                        }
                                                        ewwc b = ewwc.b(ewwhVar.g);
                                                        if (b == null) {
                                                            b = ewwc.UNRECOGNIZED;
                                                        }
                                                        dzhdVar.b = ekvi.j(b);
                                                        dzhdVar.d(ekvi.j(ewvvVar.i));
                                                        return dzhdVar.a();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                });
                                                int i3 = elgo.d;
                                                return (elgo) map.collect(elcq.a);
                                            }
                                        }, eqex.a);
                                        final dzhc dzhcVar = bhdiVar3.i;
                                        Objects.requireNonNull(dzhcVar);
                                        return h.i(new eqdv() { // from class: bhcv
                                            @Override // defpackage.eqdv
                                            public final eqgl a(Object obj5) {
                                                return dzhc.this.s((elgo) obj5);
                                            }
                                        }, bhdiVar3.b);
                                    }
                                }, bhdiVar2.b);
                            }
                        }, bgcrVar2.e());
                        ekut ekutVar = new ekut() { // from class: bhbh
                            @Override // defpackage.ekut
                            public final Object apply(Object obj3) {
                                if (!fqto.d().isEmpty()) {
                                    DeviceSyncService.this.sendBroadcast(new Intent("DEVICE_SYNC_COMPLETED").setPackage(fqto.d()));
                                }
                                return 0;
                            }
                        };
                        eqex eqexVar = eqex.a;
                        return i2.h(ekutVar, eqexVar).e(Throwable.class, new ekut() { // from class: bhbi
                            @Override // defpackage.ekut
                            public final Object apply(Object obj3) {
                                ((eluo) ((eluo) ((eluo) DeviceSyncService.a.i()).s((Throwable) obj3)).ai((char) 4504)).x("Failed syncing devices.");
                                return 2;
                            }
                        }, eqexVar);
                    }
                }, bgcrVar.e());
            }
        }, a2.e());
        ekut ekutVar = new ekut() { // from class: bhbk
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                bfad bfadVar = (bfad) obj;
                ausn ausnVar2 = DeviceSyncService.a;
                if (bfadVar.d()) {
                    ((eluo) ((eluo) ((eluo) DeviceSyncService.a.i()).s(bfadVar)).ai((char) 4501)).x("Failed syncing devices due to a transient RPC error. Will try again later.");
                    return 1;
                }
                ((eluo) ((eluo) ((eluo) DeviceSyncService.a.i()).s(bfadVar)).ai((char) 4502)).x("Failed syncing devices because the user is unauthenticated.");
                return 2;
            }
        };
        eqex eqexVar = eqex.a;
        return i.e(bfad.class, ekutVar, eqexVar).e(Throwable.class, new ekut() { // from class: bhbl
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ((eluo) ((eluo) ((eluo) DeviceSyncService.a.i()).s((Throwable) obj)).ai((char) 4503)).x("Failed syncing devices.");
                return 2;
            }
        }, eqexVar);
    }

    public final eqgl e(bgcr bgcrVar) {
        bgiy c = bgcrVar.c();
        final fgub h = fgvq.h(this.d.d().toEpochMilli());
        return c.c.b(new ekut() { // from class: bgif
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                dzlg dzlgVar = (dzlg) obj;
                ausn ausnVar = bgiy.a;
                fgrc fgrcVar = (fgrc) dzlgVar.iQ(5, null);
                fgrcVar.X(dzlgVar);
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                fgub fgubVar = fgub.this;
                dzlg dzlgVar2 = (dzlg) fgrcVar.b;
                fgrs fgrsVar = dzlg.a;
                fgubVar.getClass();
                dzlgVar2.f = fgubVar;
                dzlgVar2.c |= 2;
                return (dzlg) fgrcVar.Q();
            }
        }, eqex.a);
    }

    public DeviceSyncService(bgdb bgdbVar) {
        this.b = bgdbVar.o();
        this.c = bgdbVar.D();
        this.f = bgdbVar.R();
        this.e = bgdbVar.w();
        this.d = bgdbVar.C();
    }
}
