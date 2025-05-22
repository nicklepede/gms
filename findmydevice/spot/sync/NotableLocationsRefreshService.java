package com.google.android.gms.findmydevice.spot.sync;

import android.accounts.Account;
import com.google.android.gms.findmydevice.spot.sync.NotableLocationsRefreshService;
import com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgda;
import defpackage.bgdb;
import defpackage.bhfh;
import defpackage.cauf;
import defpackage.ejaa;
import defpackage.eluo;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class NotableLocationsRefreshService extends SafeGmsTaskBoundService {
    public static final ausn a = ausn.b("NotableLocationsSvc", auid.FIND_MY_DEVICE_SPOT);
    public final bgdb b;

    public NotableLocationsRefreshService() {
        this(bgda.a());
    }

    @Override // com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService
    protected final eqgl d(cauf caufVar) {
        if (bhfh.a()) {
            return ejaa.g(this.b.F().f()).i(new eqdv() { // from class: bhec
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    eqgl b;
                    if (!bgia.c((dzkw) obj)) {
                        return eqgc.i(0);
                    }
                    final bgow r = NotableLocationsRefreshService.this.b.r();
                    if (!fqsv.c() || r.e.a() >= r.g) {
                        elgo f = bhfg.f(r.b);
                        if (f.isEmpty()) {
                            b = ejaa.g(r.d.m(elpg.a)).h(new ekut() { // from class: bgot
                                @Override // defpackage.ekut
                                public final Object apply(Object obj2) {
                                    ausn ausnVar = bgow.a;
                                    return true;
                                }
                            }, eqex.a);
                        } else {
                            final ArrayList arrayList = new ArrayList();
                            int size = f.size();
                            for (int i = 0; i < size; i++) {
                                Account account = (Account) f.get(i);
                                bgcx bgcxVar = r.c;
                                ekvl.y(account);
                                ewzo ewzoVar = (ewzo) bgcxVar.b(account).a().a.o(cbot.a, bzzv.b);
                                ewxo ewxoVar = ewxo.a;
                                fgrc v = ewxoVar.v();
                                if (!v.b.L()) {
                                    v.U();
                                }
                                ((ewxo) v.b).b = true;
                                ewxo ewxoVar2 = (ewxo) v.Q();
                                fwpk fwpkVar = ewzoVar.a;
                                fwtc fwtcVar = ewzp.b;
                                if (fwtcVar == null) {
                                    synchronized (ewzp.class) {
                                        fwtcVar = ewzp.b;
                                        if (fwtcVar == null) {
                                            fwsz a2 = fwtc.a();
                                            a2.c = fwtb.UNARY;
                                            a2.d = fwtc.c("google.internal.spot.v1.SpotService", "GetUser");
                                            a2.b();
                                            fgqp fgqpVar = fxnm.a;
                                            a2.a = new fxnl(ewxoVar);
                                            a2.b = new fxnl(ewxp.a);
                                            fwtc a3 = a2.a();
                                            ewzp.b = a3;
                                            fwtcVar = a3;
                                        }
                                    }
                                }
                                arrayList.add(ejaa.g(beyo.a(fxnz.a(fwpkVar.a(fwtcVar, ewzoVar.b), ewxoVar2), "getUser")));
                            }
                            b = ejad.g(arrayList).b(new eqdu() { // from class: bgou
                                @Override // defpackage.eqdu
                                public final eqgl a() {
                                    ArrayList arrayList2;
                                    int i2;
                                    boolean z;
                                    ArrayList arrayList3 = new ArrayList();
                                    ArrayList arrayList4 = arrayList;
                                    int size2 = arrayList4.size();
                                    int i3 = 0;
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    while (i3 < size2) {
                                        try {
                                            for (ewxv ewxvVar : ((ewxp) eqgc.r((eqgl) arrayList4.get(i3))).b) {
                                                fgrc v2 = dzko.a.v();
                                                double d = ewxvVar.b / 1.0E7d;
                                                if (!v2.b.L()) {
                                                    v2.U();
                                                }
                                                fgri fgriVar = v2.b;
                                                z = true;
                                                try {
                                                    dzko dzkoVar = (dzko) fgriVar;
                                                    dzkoVar.b |= 1;
                                                    dzkoVar.c = d;
                                                    double d2 = ewxvVar.c / 1.0E7d;
                                                    if (!fgriVar.L()) {
                                                        v2.U();
                                                    }
                                                    dzko dzkoVar2 = (dzko) v2.b;
                                                    dzkoVar2.b |= 2;
                                                    dzkoVar2.d = d2;
                                                    dzko dzkoVar3 = (dzko) v2.Q();
                                                    Iterator it = arrayList3.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            arrayList2 = arrayList4;
                                                            i2 = size2;
                                                            arrayList3.add(dzkoVar3);
                                                            break;
                                                        }
                                                        dzko dzkoVar4 = (dzko) it.next();
                                                        double d3 = dzkoVar4.c;
                                                        double d4 = dzkoVar4.d;
                                                        arrayList2 = arrayList4;
                                                        i2 = size2;
                                                        try {
                                                            if (bgow.b(d3, d4, dzkoVar3.c, dzkoVar3.d, 20L)) {
                                                                break;
                                                            }
                                                            arrayList4 = arrayList2;
                                                            size2 = i2;
                                                        } catch (ExecutionException e) {
                                                            e = e;
                                                            ((eluo) ((eluo) ((eluo) bgow.a.i()).s(e)).ai((char) 4324)).x("Failed to get notable locations.");
                                                            if ((e.getCause() instanceof bfad) && ((bfad) e.getCause()).d()) {
                                                                z3 = z;
                                                            }
                                                            i3++;
                                                            arrayList4 = arrayList2;
                                                            size2 = i2;
                                                        }
                                                    }
                                                    arrayList4 = arrayList2;
                                                    size2 = i2;
                                                    z2 = true;
                                                } catch (ExecutionException e2) {
                                                    e = e2;
                                                    arrayList2 = arrayList4;
                                                    i2 = size2;
                                                }
                                            }
                                            arrayList2 = arrayList4;
                                            i2 = size2;
                                        } catch (ExecutionException e3) {
                                            e = e3;
                                            arrayList2 = arrayList4;
                                            i2 = size2;
                                            z = true;
                                        }
                                        i3++;
                                        arrayList4 = arrayList2;
                                        size2 = i2;
                                    }
                                    bgow bgowVar = bgow.this;
                                    bgowVar.g = bgowVar.e.a() + 600000;
                                    if (z2) {
                                        ((eluo) ((eluo) bgow.a.h()).ai((char) 4322)).z("%d notable locations found.", arrayList3.size());
                                        return ejaa.g(bgowVar.d.m(arrayList3)).h(new ekut() { // from class: bgos
                                            @Override // defpackage.ekut
                                            public final Object apply(Object obj2) {
                                                ausn ausnVar = bgow.a;
                                                return true;
                                            }
                                        }, eqex.a);
                                    }
                                    ((eluo) ((eluo) bgow.a.j()).ai((char) 4323)).x("All requests to get notable locations failed.");
                                    final boolean z4 = fqsv.c() || !z3;
                                    dziv dzivVar = bgowVar.d;
                                    int i4 = elgo.d;
                                    return ejaa.g(dzivVar.m(elpg.a)).h(new ekut() { // from class: bgor
                                        @Override // defpackage.ekut
                                        public final Object apply(Object obj2) {
                                            ausn ausnVar = bgow.a;
                                            return Boolean.valueOf(z4);
                                        }
                                    }, eqex.a);
                                }
                            }, r.f);
                        }
                    } else {
                        b = eqgc.i(true);
                    }
                    ejaa g = ejaa.g(b);
                    ekut ekutVar = new ekut() { // from class: bhea
                        @Override // defpackage.ekut
                        public final Object apply(Object obj2) {
                            ausn ausnVar = NotableLocationsRefreshService.a;
                            return Integer.valueOf(!((Boolean) obj2).booleanValue() ? 1 : 0);
                        }
                    };
                    eqex eqexVar = eqex.a;
                    return g.h(ekutVar, eqexVar).e(Throwable.class, new ekut() { // from class: bheb
                        @Override // defpackage.ekut
                        public final Object apply(Object obj2) {
                            ((eluo) ((eluo) ((eluo) NotableLocationsRefreshService.a.i()).s((Throwable) obj2)).ai((char) 4532)).x("Error while fetching notable locations.");
                            return 1;
                        }
                    }, eqexVar);
                }
            }, eqex.a);
        }
        ((eluo) ((eluo) a.j()).ai((char) 4533)).x("Eddystone use cases are disabled.");
        return eqgc.i(2);
    }

    public NotableLocationsRefreshService(bgdb bgdbVar) {
        this.b = bgdbVar;
    }
}
