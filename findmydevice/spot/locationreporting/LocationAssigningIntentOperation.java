package com.google.android.gms.findmydevice.spot.locationreporting;

import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.locationreporting.LocationAssigningIntentOperation;
import com.google.android.gms.location.LocationResult;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bfcb;
import defpackage.bgda;
import defpackage.bgkn;
import defpackage.bgkq;
import defpackage.bgmt;
import defpackage.bgnj;
import defpackage.bgow;
import defpackage.bgpg;
import defpackage.bgpi;
import defpackage.bgwc;
import defpackage.bhff;
import defpackage.bhko;
import defpackage.bsxr;
import defpackage.byhu;
import defpackage.dpvo;
import defpackage.dzgp;
import defpackage.dziv;
import defpackage.dzkw;
import defpackage.dzmj;
import defpackage.ejaa;
import defpackage.ektg;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fbrg;
import defpackage.fbrp;
import defpackage.fqtb;
import defpackage.fqte;
import defpackage.fqtl;
import defpackage.fxqo;
import defpackage.ing;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class LocationAssigningIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("LocationAssigningIntOp", auid.FIND_MY_DEVICE_SPOT);
    public final bgkn b;
    public final bgwc c;
    public final bgpg d;
    public final bgnj e;
    public final dziv f;
    public final bgpi g;
    public final fxqo h;
    public final bgow i;
    public final fxqo j;
    public final Executor k;
    public final Context l;
    public final bsxr m;
    private final dpvo n;

    public LocationAssigningIntentOperation() {
        this(bgda.a());
    }

    public static final void a(final fbrp fbrpVar, final dzkw dzkwVar, int i) {
        if (fqte.f()) {
            for (int i2 = 0; i2 < i; i2++) {
                byhu.v().f(bfcb.a(fbrg.SIGHTING_REPORTED, new ekut() { // from class: bglc
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        fgrc fgrcVar = (fgrc) obj;
                        ausn ausnVar = LocationAssigningIntentOperation.a;
                        fgrc v = fbro.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        dzkw dzkwVar2 = dzkwVar;
                        fbrp fbrpVar2 = fbrp.this;
                        fbro fbroVar = (fbro) v.b;
                        fbroVar.c = fbrpVar2.a();
                        fbroVar.b |= 1;
                        boolean i3 = bgia.i(dzkwVar2);
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar = v.b;
                        fbro fbroVar2 = (fbro) fgriVar;
                        fbroVar2.b |= 2;
                        fbroVar2.d = i3;
                        ewwz b = ewwz.b(dzkwVar2.g);
                        if (b == null) {
                            b = ewwz.FMDN_DISABLED_DEFAULT;
                        }
                        if (!fgriVar.L()) {
                            v.U();
                        }
                        fbro fbroVar3 = (fbro) v.b;
                        fbroVar3.e = b.a();
                        fbroVar3.b |= 4;
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        fbrf fbrfVar = (fbrf) fgrcVar.b;
                        fbro fbroVar4 = (fbro) v.Q();
                        fbrf fbrfVar2 = fbrf.a;
                        fbroVar4.getClass();
                        fbrfVar.d = fbroVar4;
                        fbrfVar.b |= 2;
                        return fgrcVar;
                    }
                }));
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        eqgl i;
        eqgl i2;
        if (bhff.b(intent, "com.google.android.gms.findmydevice.spot.locationreporting.ASSIGN_LOCATION")) {
            if (fqtb.g() && intent.hasCategory("PowerConsumingSightingsLocationUpdate")) {
                this.e.a();
            }
            final long a2 = dzmj.a(this.n.a());
            if (!bhko.a(this)) {
                i = eqgc.i(ektg.a);
            } else if (LocationResult.d(intent)) {
                LocationResult c = LocationResult.c(intent);
                ekvl.y(c);
                Location a3 = c.a();
                ekvl.y(a3);
                a3.getAccuracy();
                if (bgkq.b(a3)) {
                    this.b.a(a3, a2, fqtb.c() ? ekvi.j(Double.valueOf(fqtl.e())) : ektg.a);
                    i2 = eqgc.i(ekvi.j(a3));
                    i = ejaa.g(i2).h(new ekut() { // from class: bgli
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            ekvi ekviVar = (ekvi) obj;
                            ausn ausnVar = LocationAssigningIntentOperation.a;
                            if (!ekviVar.h()) {
                                return ektg.a;
                            }
                            Location location = (Location) ekviVar.c();
                            if (!location.isFromMockProvider() || fqto.a.lK().c()) {
                                return ekviVar;
                            }
                            ((eluo) ((eluo) LocationAssigningIntentOperation.a.j()).ai((char) 4243)).B("Dropping location %s because it is mocked", location);
                            return ektg.a;
                        }
                    }, eqex.a);
                } else {
                    i = eqgc.i(ektg.a);
                }
            } else if (intent.hasExtra("location")) {
                Location location = (Location) ing.a(intent, "location", Location.class);
                ekvl.y(location);
                location.getAccuracy();
                i2 = eqgc.i(ekvi.j(location));
                i = ejaa.g(i2).h(new ekut() { // from class: bgli
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        ekvi ekviVar = (ekvi) obj;
                        ausn ausnVar = LocationAssigningIntentOperation.a;
                        if (!ekviVar.h()) {
                            return ektg.a;
                        }
                        Location location2 = (Location) ekviVar.c();
                        if (!location2.isFromMockProvider() || fqto.a.lK().c()) {
                            return ekviVar;
                        }
                        ((eluo) ((eluo) LocationAssigningIntentOperation.a.j()).ai((char) 4243)).B("Dropping location %s because it is mocked", location2);
                        return ektg.a;
                    }
                }, eqex.a);
            } else {
                i = eqgc.i(ektg.a);
            }
            dzgp.a("Sighting report", ejaa.g(i).i(new eqdv() { // from class: bgkr
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    ekvi ekviVar = (ekvi) obj;
                    if (!ekviVar.h()) {
                        return eqgf.a;
                    }
                    final LocationAssigningIntentOperation locationAssigningIntentOperation = LocationAssigningIntentOperation.this;
                    final Location location2 = (Location) ekviVar.c();
                    final eqgl a4 = locationAssigningIntentOperation.i.a(location2);
                    final eqgl h = fqte.g() ? ejaa.g(locationAssigningIntentOperation.f.f()).h(new ekut() { // from class: bglk
                        @Override // defpackage.ekut
                        public final Object apply(Object obj2) {
                            return Boolean.valueOf(bgia.e((dzkw) obj2));
                        }
                    }, eqex.a) : eqgc.i(false);
                    final long j = a2;
                    ejac h2 = ejad.h(a4, h);
                    eqdu eqduVar = new eqdu() { // from class: bgkw
                        @Override // defpackage.eqdu
                        public final eqgl a() {
                            final List list;
                            List arrayList;
                            final bgov bgovVar = (bgov) eqgc.r(a4);
                            boolean booleanValue = ((Boolean) eqgc.r(h)).booleanValue();
                            long j2 = j;
                            final LocationAssigningIntentOperation locationAssigningIntentOperation2 = LocationAssigningIntentOperation.this;
                            if (bgovVar == bgov.YES || bgovVar == bgov.UNINITIALIZED) {
                                bgpg bgpgVar = locationAssigningIntentOperation2.d;
                                ekut ekutVar = new ekut() { // from class: bglj
                                    @Override // defpackage.ekut
                                    public final Object apply(Object obj2) {
                                        ausn ausnVar = LocationAssigningIntentOperation.a;
                                        return ((bgxb) obj2).d() ? fbrm.RECENT_SIGHTING_LOCATION_NOT_IMPROVED : bgov.this == bgov.YES ? fbrm.DROPPED_NOTABLE_LOCATION : fbrm.DROPPED_NO_NOTABLE_LOCATIONS;
                                    }
                                };
                                synchronized (bgpgVar.b) {
                                    ListIterator listIterator = bgpgVar.c.listIterator();
                                    while (listIterator.hasNext()) {
                                        SortedSet sortedSet = ((bgpf) listIterator.next()).b;
                                        Iterator it = sortedSet.iterator();
                                        while (it.hasNext()) {
                                            bgxb bgxbVar = (bgxb) it.next();
                                            if (bgxbVar.c.h()) {
                                                break;
                                            }
                                            it.remove();
                                            bgpgVar.d--;
                                            bgpgVar.a.c((fbrm) ekutVar.apply(bgxbVar), bgxbVar, bgxd.b(bgxbVar.e, booleanValue));
                                        }
                                        if (sortedSet.isEmpty()) {
                                            listIterator.remove();
                                        }
                                    }
                                }
                            }
                            final Location location3 = location2;
                            if (bhfh.a()) {
                                bgpg bgpgVar2 = locationAssigningIntentOperation2.d;
                                ekvi b = locationAssigningIntentOperation2.b.b();
                                if (bgkq.b(location3)) {
                                    synchronized (bgpgVar2.b) {
                                        bgpgVar2.a(j2, b, booleanValue);
                                        long b2 = dzmj.b(location3.getElapsedRealtimeNanos());
                                        long floor = (int) Math.floor((fqtl.c() - location3.getAccuracy()) / fqtl.b());
                                        long j3 = b2 - floor;
                                        long j4 = floor + b2;
                                        if (b.h()) {
                                            j3 = Math.min(((Long) b.c()).longValue(), j3);
                                        }
                                        List list2 = bgpgVar2.c;
                                        int binarySearch = Collections.binarySearch(list2, new bgpf(j3), new Comparator() { // from class: bgpd
                                            @Override // java.util.Comparator
                                            public final int compare(Object obj2, Object obj3) {
                                                return Long.compare(((bgpf) obj2).a, ((bgpf) obj3).a);
                                            }
                                        });
                                        if (binarySearch < 0) {
                                            binarySearch = -(binarySearch + 1);
                                        }
                                        ListIterator listIterator2 = list2.listIterator(binarySearch);
                                        arrayList = new ArrayList();
                                        while (listIterator2.hasNext()) {
                                            bgpf bgpfVar = (bgpf) listIterator2.next();
                                            long j5 = bgpfVar.a;
                                            if (j5 > j4) {
                                                break;
                                            }
                                            double a5 = (!b.h() || ((Long) b.c()).longValue() > j5 || j5 > b2) ? bgkq.a(location3, j5) : location3.getAccuracy();
                                            Iterator it2 = bgpfVar.b.iterator();
                                            while (it2.hasNext()) {
                                                bgxb bgxbVar2 = (bgxb) it2.next();
                                                long j6 = b2;
                                                double d = bgxbVar2.i;
                                                if (d != 0.0d && d <= a5 + fqtl.a.lK().e()) {
                                                    bgxbVar2.c();
                                                    b2 = j6;
                                                }
                                                it2.remove();
                                                bgpgVar2.d--;
                                                bgxa bgxaVar = new bgxa(bgxbVar2);
                                                bgxaVar.d(a5);
                                                bgxb a6 = bgxaVar.a();
                                                arrayList.add(a6);
                                                bgpgVar2.a.c(bgxbVar2.d() ? fbrm.REASSIGNED_LOCATION_POST_REPORTING : fbrm.ASSIGNED_LOCATION_POST_REPORTING, a6, bgxd.b(bgxbVar2.e, booleanValue));
                                                b2 = j6;
                                                bgpgVar2 = bgpgVar2;
                                            }
                                        }
                                    }
                                    list = arrayList;
                                } else {
                                    int i3 = elgo.d;
                                    list = elpg.a;
                                }
                            } else {
                                int i4 = elgo.d;
                                list = elpg.a;
                            }
                            elja.s(elja.j(list, new ekut() { // from class: bgkz
                                @Override // defpackage.ekut
                                public final Object apply(Object obj2) {
                                    return ((bgxb) obj2).c();
                                }
                            }));
                            ejaa g = ejaa.g(locationAssigningIntentOperation2.f.f());
                            eqdv eqdvVar = new eqdv() { // from class: bgkv
                                @Override // defpackage.eqdv
                                public final eqgl a(Object obj2) {
                                    final elgo elgoVar;
                                    eqgl i5;
                                    final dzkw dzkwVar = (dzkw) obj2;
                                    if (!bgia.i(dzkwVar)) {
                                        int i6 = elgo.d;
                                        return eqgc.i(elpg.a);
                                    }
                                    Location location4 = location3;
                                    final LocationAssigningIntentOperation locationAssigningIntentOperation3 = LocationAssigningIntentOperation.this;
                                    final long b3 = dzmj.b(location4.getElapsedRealtimeNanos());
                                    final long a7 = dzmj.a(location4.getTime());
                                    final double accuracy = location4.getAccuracy();
                                    if (fqsv.h()) {
                                        dzjc dzjcVar = dzkwVar.j;
                                        if (dzjcVar == null) {
                                            dzjcVar = dzjc.a;
                                        }
                                        if ((dzjcVar.b & 4) != 0) {
                                            dzjc dzjcVar2 = dzkwVar.j;
                                            if (((dzjcVar2 == null ? dzjc.a : dzjcVar2).b & 2) != 0) {
                                                try {
                                                    Context context = locationAssigningIntentOperation3.l;
                                                    if (dzjcVar2 == null) {
                                                        dzjcVar2 = dzjc.a;
                                                    }
                                                    ekvi b4 = bhfg.b(context, dzjcVar2.e);
                                                    if (b4.h()) {
                                                        bsxr.a(auio.FIND_MY_DEVICE_SELF_SIGHTING_REPORT);
                                                        fbrp fbrpVar = fbrp.SELF_REPORTING;
                                                        LocationAssigningIntentOperation.a(fbrpVar, dzkwVar, 1);
                                                        dzjc dzjcVar3 = dzkwVar.j;
                                                        if (dzjcVar3 == null) {
                                                            dzjcVar3 = dzjc.a;
                                                        }
                                                        ewvg ewvgVar = dzjcVar3.d;
                                                        if (ewvgVar == null) {
                                                            ewvgVar = ewvg.a;
                                                        }
                                                        Object c2 = b4.c();
                                                        bgxa a8 = bgxb.a();
                                                        a8.c(fgpr.b);
                                                        a8.b(dzha.COMPONENTLESS);
                                                        a8.e(true);
                                                        a8.a = ekvi.j(ewvgVar);
                                                        a8.b = ekvi.j(c2);
                                                        a8.g(b3);
                                                        a8.h(a7);
                                                        a8.d(accuracy);
                                                        a8.i(fbrpVar);
                                                        elgoVar = elgo.l(a8.a());
                                                    } else {
                                                        ((eluo) ((eluo) LocationAssigningIntentOperation.a.j()).ai(4240)).x("Cannot find owner account for a self location report, skipping the report.");
                                                        int i7 = elgo.d;
                                                        elgoVar = elpg.a;
                                                    }
                                                } catch (IOException | wjw unused) {
                                                    ((eluo) ((eluo) LocationAssigningIntentOperation.a.j()).ai((char) 4239)).x("Error getting owner account for a self location report, skipping the report.");
                                                    int i8 = elgo.d;
                                                    elgoVar = elpg.a;
                                                }
                                                if (fqsv.f() || !fqsv.a.lK().m()) {
                                                    i5 = eqgc.i(elpg.a);
                                                } else {
                                                    bgkc bgkcVar = (bgkc) locationAssigningIntentOperation3.j.a();
                                                    if (bgkcVar.b.getAndSet(false)) {
                                                        elhx elhxVar = new elhx();
                                                        eztp eztpVar = bgkcVar.a;
                                                        elhxVar.k(eztpVar.g(2));
                                                        elhxVar.k(eztpVar.g(1));
                                                        bgkcVar.c = elhxVar.g();
                                                    }
                                                    eles l = eles.j(bgkcVar.c).l(new ekut() { // from class: bgks
                                                        @Override // defpackage.ekut
                                                        public final Object apply(Object obj3) {
                                                            return ((BluetoothDevice) obj3).getAddress();
                                                        }
                                                    });
                                                    final dzhc dzhcVar = (dzhc) locationAssigningIntentOperation3.h.a();
                                                    Objects.requireNonNull(dzhcVar);
                                                    i5 = ejad.f(l.l(new ekut() { // from class: bgkt
                                                        @Override // defpackage.ekut
                                                        public final Object apply(Object obj3) {
                                                            return dzhc.this.k((String) obj3);
                                                        }
                                                    })).h(new ekut() { // from class: bgku
                                                        @Override // defpackage.ekut
                                                        public final Object apply(Object obj3) {
                                                            eles i9 = eles.j((List) obj3).i(new ekvm() { // from class: bgle
                                                                @Override // defpackage.ekvm
                                                                public final boolean a(Object obj4) {
                                                                    ekvi ekviVar2 = (ekvi) obj4;
                                                                    ausn ausnVar = LocationAssigningIntentOperation.a;
                                                                    return ekviVar2 != null && ekviVar2.h();
                                                                }
                                                            }).l(new ekut() { // from class: bglf
                                                                @Override // defpackage.ekut
                                                                public final Object apply(Object obj4) {
                                                                    return (dzhb) ((ekvi) obj4).c();
                                                                }
                                                            }).i(new ekvm() { // from class: bglg
                                                                @Override // defpackage.ekvm
                                                                public final boolean a(Object obj4) {
                                                                    ausn ausnVar = LocationAssigningIntentOperation.a;
                                                                    return !((dzhb) obj4).c;
                                                                }
                                                            });
                                                            final long j7 = b3;
                                                            final long j8 = a7;
                                                            final double d2 = accuracy;
                                                            eles l2 = i9.l(new ekut() { // from class: bglh
                                                                @Override // defpackage.ekut
                                                                public final Object apply(Object obj4) {
                                                                    dzhb dzhbVar = (dzhb) obj4;
                                                                    ewvg ewvgVar2 = dzhbVar.a;
                                                                    ausn ausnVar = LocationAssigningIntentOperation.a;
                                                                    return bgxb.b(ewvgVar2, ektg.a, dzha.COMPONENTLESS, dzhbVar.b, j7, j8, d2, fbrp.CONNECTED_DEVICE_REPORTING);
                                                                }
                                                            });
                                                            if (!elja.x(l2)) {
                                                                dzkw dzkwVar2 = dzkwVar;
                                                                bsxr.a(auio.FIND_MY_DEVICE_CONNECTED_DEVICE_SIGHTINGS_REPORT);
                                                                LocationAssigningIntentOperation.a(fbrp.CONNECTED_DEVICE_REPORTING, dzkwVar2, elja.b(l2));
                                                            }
                                                            return l2;
                                                        }
                                                    }, eqex.a);
                                                }
                                                return ejaa.g(i5).h(new ekut() { // from class: bgld
                                                    @Override // defpackage.ekut
                                                    public final Object apply(Object obj3) {
                                                        ausn ausnVar = LocationAssigningIntentOperation.a;
                                                        return eles.f(elgo.this, (Iterable) obj3);
                                                    }
                                                }, eqex.a);
                                            }
                                        }
                                    }
                                    ((eluo) ((eluo) LocationAssigningIntentOperation.a.h()).ai((char) 4238)).x("Incoming location but device is not provisioned, stopping self location fetcher.");
                                    locationAssigningIntentOperation3.g.b();
                                    int i9 = elgo.d;
                                    elgoVar = elpg.a;
                                    if (fqsv.f()) {
                                    }
                                    i5 = eqgc.i(elpg.a);
                                    return ejaa.g(i5).h(new ekut() { // from class: bgld
                                        @Override // defpackage.ekut
                                        public final Object apply(Object obj3) {
                                            ausn ausnVar = LocationAssigningIntentOperation.a;
                                            return eles.f(elgo.this, (Iterable) obj3);
                                        }
                                    }, eqex.a);
                                }
                            };
                            Executor executor = locationAssigningIntentOperation2.k;
                            return ejaf.k(ejaa.g(g.i(eqdvVar, executor)).h(new ekut() { // from class: bgla
                                @Override // defpackage.ekut
                                public final Object apply(Object obj2) {
                                    ausn ausnVar = LocationAssigningIntentOperation.a;
                                    return eles.f(list, (Iterable) obj2);
                                }
                            }, eqex.a), new eqdv() { // from class: bglb
                                @Override // defpackage.eqdv
                                public final eqgl a(Object obj2) {
                                    Iterable iterable = (Iterable) obj2;
                                    if (elja.x(iterable)) {
                                        return eqgf.a;
                                    }
                                    Location location4 = location3;
                                    LocationAssigningIntentOperation locationAssigningIntentOperation3 = LocationAssigningIntentOperation.this;
                                    return locationAssigningIntentOperation3.c.c(new bgwb(iterable, location4, ektg.a));
                                }
                            }, executor);
                        }
                    };
                    Executor executor = locationAssigningIntentOperation.k;
                    return h2.b(eqduVar, executor).f(Throwable.class, new eqdv() { // from class: bgkx
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj2) {
                            Throwable th = (Throwable) obj2;
                            ausn ausnVar = LocationAssigningIntentOperation.a;
                            if (th instanceof InterruptedException) {
                                return eqgc.h(th);
                            }
                            ((eluo) ((eluo) LocationAssigningIntentOperation.a.j()).ai((char) 4242)).x("Error aggregating sightings.");
                            return eqgf.a;
                        }
                    }, eqex.a).i(new eqdv() { // from class: bgky
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj2) {
                            int i3;
                            LocationAssigningIntentOperation locationAssigningIntentOperation2 = LocationAssigningIntentOperation.this;
                            bgpg bgpgVar = locationAssigningIntentOperation2.d;
                            synchronized (bgpgVar.b) {
                                i3 = bgpgVar.d;
                            }
                            if (i3 == 0) {
                                bgnj bgnjVar = locationAssigningIntentOperation2.e;
                                synchronized (bgnjVar.b) {
                                    if (bgnjVar.c()) {
                                        PendingIntent a5 = bgkl.a(bgnjVar.g, "NoPowerSightingsLocationUpdate");
                                        if (a5 != null) {
                                            bgnjVar.f.d(a5);
                                            bgnjVar.d = ektg.a;
                                        }
                                    }
                                }
                            }
                            return eqgf.a;
                        }
                    }, executor);
                }
            }, this.k));
        }
    }

    public LocationAssigningIntentOperation(bgmt bgmtVar) {
        this.b = bgmtVar.m();
        this.c = bgmtVar.v();
        this.d = bgmtVar.s();
        this.e = bgmtVar.p();
        this.f = bgmtVar.F();
        this.g = bgmtVar.t();
        this.h = bgmtVar.O();
        this.i = bgmtVar.r();
        this.j = bgmtVar.N();
        this.m = bgmtVar.X();
        this.n = bgmtVar.C();
        this.k = bgmtVar.G();
        this.l = bgmtVar.c();
    }
}
