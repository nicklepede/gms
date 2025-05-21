package com.google.android.gms.findmydevice.spot.locationreporting;

import android.app.PendingIntent;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.locationreporting.LocationAssigningIntentOperation;
import com.google.android.gms.location.LocationResult;
import defpackage.asej;
import defpackage.asot;
import defpackage.bdap;
import defpackage.bebo;
import defpackage.bejb;
import defpackage.beje;
import defpackage.belh;
import defpackage.belx;
import defpackage.benk;
import defpackage.benu;
import defpackage.benw;
import defpackage.beup;
import defpackage.bfdp;
import defpackage.bfiy;
import defpackage.bqqa;
import defpackage.bvzi;
import defpackage.dnlf;
import defpackage.dwup;
import defpackage.dwwv;
import defpackage.dwyw;
import defpackage.dxaj;
import defpackage.egmx;
import defpackage.eigb;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.ezcr;
import defpackage.ezda;
import defpackage.fobh;
import defpackage.fobk;
import defpackage.fobr;
import defpackage.fuuq;
import defpackage.ilq;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class LocationAssigningIntentOperation extends IntentOperation {
    public static final asot a = asot.b("LocationAssigningIntOp", asej.FIND_MY_DEVICE_SPOT);
    public final bejb b;
    public final beup c;
    public final benu d;
    public final belx e;
    public final dwwv f;
    public final benw g;
    public final fuuq h;
    public final benk i;
    public final fuuq j;
    public final Executor k;
    public final Context l;
    public final bqqa m;
    private final dnlf n;

    public LocationAssigningIntentOperation() {
        this(bebo.a());
    }

    public static final void a(final ezda ezdaVar, final dwyw dwywVar, int i) {
        if (fobk.f()) {
            for (int i2 = 0; i2 < i; i2++) {
                bvzi.v().f(bdap.a(ezcr.SIGHTING_REPORTED, new eiho() { // from class: bejq
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        fecj fecjVar = (fecj) obj;
                        asot asotVar = LocationAssigningIntentOperation.a;
                        fecj v = ezcz.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        dwyw dwywVar2 = dwywVar;
                        ezda ezdaVar2 = ezda.this;
                        ezcz ezczVar = (ezcz) v.b;
                        ezczVar.c = ezdaVar2.a();
                        ezczVar.b |= 1;
                        boolean i3 = bego.i(dwywVar2);
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar = v.b;
                        ezcz ezczVar2 = (ezcz) fecpVar;
                        ezczVar2.b |= 2;
                        ezczVar2.d = i3;
                        euhg b = euhg.b(dwywVar2.g);
                        if (b == null) {
                            b = euhg.FMDN_DISABLED_DEFAULT;
                        }
                        if (!fecpVar.L()) {
                            v.U();
                        }
                        ezcz ezczVar3 = (ezcz) v.b;
                        ezczVar3.e = b.a();
                        ezczVar3.b |= 4;
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        ezcq ezcqVar = (ezcq) fecjVar.b;
                        ezcz ezczVar4 = (ezcz) v.Q();
                        ezcq ezcqVar2 = ezcq.a;
                        ezczVar4.getClass();
                        ezcqVar.d = ezczVar4;
                        ezcqVar.b |= 2;
                        return fecjVar;
                    }
                }));
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        enss i;
        enss i2;
        if (bfdp.b(intent, "com.google.android.gms.findmydevice.spot.locationreporting.ASSIGN_LOCATION")) {
            if (fobh.g() && intent.hasCategory("PowerConsumingSightingsLocationUpdate")) {
                this.e.a();
            }
            final long a2 = dxaj.a(this.n.a());
            if (!bfiy.a(this)) {
                i = ensj.i(eigb.a);
            } else if (LocationResult.d(intent)) {
                LocationResult c = LocationResult.c(intent);
                eiig.x(c);
                Location a3 = c.a();
                eiig.x(a3);
                a3.getAccuracy();
                if (beje.b(a3)) {
                    this.b.a(a3, a2, fobh.c() ? eiid.j(Double.valueOf(fobr.e())) : eigb.a);
                    i2 = ensj.i(eiid.j(a3));
                    i = egmx.f(i2).h(new eiho() { // from class: bejw
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            eiid eiidVar = (eiid) obj;
                            asot asotVar = LocationAssigningIntentOperation.a;
                            if (!eiidVar.h()) {
                                return eigb.a;
                            }
                            Location location = (Location) eiidVar.c();
                            if (!location.isFromMockProvider() || fobx.a.a().c()) {
                                return eiidVar;
                            }
                            ((ejhf) ((ejhf) LocationAssigningIntentOperation.a.j()).ah((char) 4237)).B("Dropping location %s because it is mocked", location);
                            return eigb.a;
                        }
                    }, enre.a);
                } else {
                    i = ensj.i(eigb.a);
                }
            } else if (intent.hasExtra("location")) {
                Location location = (Location) ilq.a(intent, "location", Location.class);
                eiig.x(location);
                location.getAccuracy();
                i2 = ensj.i(eiid.j(location));
                i = egmx.f(i2).h(new eiho() { // from class: bejw
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        eiid eiidVar = (eiid) obj;
                        asot asotVar = LocationAssigningIntentOperation.a;
                        if (!eiidVar.h()) {
                            return eigb.a;
                        }
                        Location location2 = (Location) eiidVar.c();
                        if (!location2.isFromMockProvider() || fobx.a.a().c()) {
                            return eiidVar;
                        }
                        ((ejhf) ((ejhf) LocationAssigningIntentOperation.a.j()).ah((char) 4237)).B("Dropping location %s because it is mocked", location2);
                        return eigb.a;
                    }
                }, enre.a);
            } else {
                i = ensj.i(eigb.a);
            }
            dwup.a("Sighting report", egmx.f(i).i(new enqc() { // from class: bejf
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    eiid eiidVar = (eiid) obj;
                    if (!eiidVar.h()) {
                        return ensm.a;
                    }
                    final LocationAssigningIntentOperation locationAssigningIntentOperation = LocationAssigningIntentOperation.this;
                    final Location location2 = (Location) eiidVar.c();
                    final enss a4 = locationAssigningIntentOperation.i.a(location2);
                    final enss h = fobk.g() ? egmx.f(locationAssigningIntentOperation.f.f()).h(new eiho() { // from class: bejy
                        @Override // defpackage.eiho
                        public final Object apply(Object obj2) {
                            return Boolean.valueOf(bego.e((dwyw) obj2));
                        }
                    }, enre.a) : ensj.i(false);
                    final long j = a2;
                    egmz h2 = egna.h(a4, h);
                    enqb enqbVar = new enqb() { // from class: bejk
                        @Override // defpackage.enqb
                        public final enss a() {
                            final List list;
                            List arrayList;
                            final benj benjVar = (benj) ensj.r(a4);
                            boolean booleanValue = ((Boolean) ensj.r(h)).booleanValue();
                            long j2 = j;
                            final LocationAssigningIntentOperation locationAssigningIntentOperation2 = LocationAssigningIntentOperation.this;
                            if (benjVar == benj.YES || benjVar == benj.UNINITIALIZED) {
                                benu benuVar = locationAssigningIntentOperation2.d;
                                eiho eihoVar = new eiho() { // from class: bejx
                                    @Override // defpackage.eiho
                                    public final Object apply(Object obj2) {
                                        asot asotVar = LocationAssigningIntentOperation.a;
                                        return ((bevo) obj2).d() ? ezcx.RECENT_SIGHTING_LOCATION_NOT_IMPROVED : benj.this == benj.YES ? ezcx.DROPPED_NOTABLE_LOCATION : ezcx.DROPPED_NO_NOTABLE_LOCATIONS;
                                    }
                                };
                                synchronized (benuVar.b) {
                                    ListIterator listIterator = benuVar.c.listIterator();
                                    while (listIterator.hasNext()) {
                                        SortedSet sortedSet = ((bent) listIterator.next()).b;
                                        Iterator it = sortedSet.iterator();
                                        while (it.hasNext()) {
                                            bevo bevoVar = (bevo) it.next();
                                            if (bevoVar.c.h()) {
                                                break;
                                            }
                                            it.remove();
                                            benuVar.d--;
                                            benuVar.a.c((ezcx) eihoVar.apply(bevoVar), bevoVar, bevq.b(bevoVar.e, booleanValue));
                                        }
                                        if (sortedSet.isEmpty()) {
                                            listIterator.remove();
                                        }
                                    }
                                }
                            }
                            final Location location3 = location2;
                            if (bfdr.a()) {
                                benu benuVar2 = locationAssigningIntentOperation2.d;
                                eiid b = locationAssigningIntentOperation2.b.b();
                                if (beje.b(location3)) {
                                    synchronized (benuVar2.b) {
                                        benuVar2.a(j2, b, booleanValue);
                                        long b2 = dxaj.b(location3.getElapsedRealtimeNanos());
                                        long floor = (int) Math.floor((fobr.c() - location3.getAccuracy()) / fobr.b());
                                        long j3 = b2 - floor;
                                        long j4 = floor + b2;
                                        if (b.h()) {
                                            j3 = Math.min(((Long) b.c()).longValue(), j3);
                                        }
                                        List list2 = benuVar2.c;
                                        int binarySearch = Collections.binarySearch(list2, new bent(j3), new Comparator() { // from class: benr
                                            @Override // java.util.Comparator
                                            public final int compare(Object obj2, Object obj3) {
                                                return Long.compare(((bent) obj2).a, ((bent) obj3).a);
                                            }
                                        });
                                        if (binarySearch < 0) {
                                            binarySearch = -(binarySearch + 1);
                                        }
                                        ListIterator listIterator2 = list2.listIterator(binarySearch);
                                        arrayList = new ArrayList();
                                        while (listIterator2.hasNext()) {
                                            bent bentVar = (bent) listIterator2.next();
                                            long j5 = bentVar.a;
                                            if (j5 > j4) {
                                                break;
                                            }
                                            double a5 = (!b.h() || ((Long) b.c()).longValue() > j5 || j5 > b2) ? beje.a(location3, j5) : location3.getAccuracy();
                                            Iterator it2 = bentVar.b.iterator();
                                            while (it2.hasNext()) {
                                                bevo bevoVar2 = (bevo) it2.next();
                                                long j6 = b2;
                                                double d = bevoVar2.i;
                                                if (d != 0.0d && d <= a5 + fobr.a.a().e()) {
                                                    bevoVar2.c();
                                                    b2 = j6;
                                                }
                                                it2.remove();
                                                benuVar2.d--;
                                                bevn bevnVar = new bevn(bevoVar2);
                                                bevnVar.d(a5);
                                                bevo a6 = bevnVar.a();
                                                arrayList.add(a6);
                                                benuVar2.a.c(bevoVar2.d() ? ezcx.REASSIGNED_LOCATION_POST_REPORTING : ezcx.ASSIGNED_LOCATION_POST_REPORTING, a6, bevq.b(bevoVar2.e, booleanValue));
                                                b2 = j6;
                                                benuVar2 = benuVar2;
                                            }
                                        }
                                    }
                                    list = arrayList;
                                } else {
                                    int i3 = eitj.d;
                                    list = ejcb.a;
                                }
                            } else {
                                int i4 = eitj.d;
                                list = ejcb.a;
                            }
                            eivv.s(eivv.j(list, new eiho() { // from class: bejn
                                @Override // defpackage.eiho
                                public final Object apply(Object obj2) {
                                    return ((bevo) obj2).c();
                                }
                            }));
                            egmx f = egmx.f(locationAssigningIntentOperation2.f.f());
                            enqc enqcVar = new enqc() { // from class: bejj
                                @Override // defpackage.enqc
                                public final enss a(Object obj2) {
                                    final eitj eitjVar;
                                    enss i5;
                                    final dwyw dwywVar = (dwyw) obj2;
                                    if (!bego.i(dwywVar)) {
                                        int i6 = eitj.d;
                                        return ensj.i(ejcb.a);
                                    }
                                    Location location4 = location3;
                                    final LocationAssigningIntentOperation locationAssigningIntentOperation3 = LocationAssigningIntentOperation.this;
                                    final long b3 = dxaj.b(location4.getElapsedRealtimeNanos());
                                    final long a7 = dxaj.a(location4.getTime());
                                    final double accuracy = location4.getAccuracy();
                                    if (fobb.h()) {
                                        dwxc dwxcVar = dwywVar.j;
                                        if (dwxcVar == null) {
                                            dwxcVar = dwxc.a;
                                        }
                                        if ((dwxcVar.b & 4) != 0) {
                                            dwxc dwxcVar2 = dwywVar.j;
                                            if (((dwxcVar2 == null ? dwxc.a : dwxcVar2).b & 2) != 0) {
                                                try {
                                                    Context context = locationAssigningIntentOperation3.l;
                                                    if (dwxcVar2 == null) {
                                                        dwxcVar2 = dwxc.a;
                                                    }
                                                    eiid b4 = bfdq.b(context, dwxcVar2.e);
                                                    if (b4.h()) {
                                                        bqqa.a(aseu.FIND_MY_DEVICE_SELF_SIGHTING_REPORT);
                                                        ezda ezdaVar = ezda.SELF_REPORTING;
                                                        LocationAssigningIntentOperation.a(ezdaVar, dwywVar, 1);
                                                        dwxc dwxcVar3 = dwywVar.j;
                                                        if (dwxcVar3 == null) {
                                                            dwxcVar3 = dwxc.a;
                                                        }
                                                        eufn eufnVar = dwxcVar3.d;
                                                        if (eufnVar == null) {
                                                            eufnVar = eufn.a;
                                                        }
                                                        Object c2 = b4.c();
                                                        bevn a8 = bevo.a();
                                                        a8.c(feay.b);
                                                        a8.b(dwva.COMPONENTLESS);
                                                        a8.e(true);
                                                        a8.a = eiid.j(eufnVar);
                                                        a8.b = eiid.j(c2);
                                                        a8.g(b3);
                                                        a8.h(a7);
                                                        a8.d(accuracy);
                                                        a8.i(ezdaVar);
                                                        eitjVar = eitj.l(a8.a());
                                                    } else {
                                                        ((ejhf) ((ejhf) LocationAssigningIntentOperation.a.j()).ah(4234)).x("Cannot find owner account for a self location report, skipping the report.");
                                                        int i7 = eitj.d;
                                                        eitjVar = ejcb.a;
                                                    }
                                                } catch (IOException | unx unused) {
                                                    ((ejhf) ((ejhf) LocationAssigningIntentOperation.a.j()).ah((char) 4233)).x("Error getting owner account for a self location report, skipping the report.");
                                                    int i8 = eitj.d;
                                                    eitjVar = ejcb.a;
                                                }
                                                if (fobb.f() || !fobb.a.a().m()) {
                                                    i5 = ensj.i(ejcb.a);
                                                } else {
                                                    beiq beiqVar = (beiq) locationAssigningIntentOperation3.j.a();
                                                    if (beiqVar.b.getAndSet(false)) {
                                                        eius eiusVar = new eius();
                                                        exfg exfgVar = beiqVar.a;
                                                        eiusVar.k(exfgVar.g(2));
                                                        eiusVar.k(exfgVar.g(1));
                                                        beiqVar.c = eiusVar.g();
                                                    }
                                                    eirn l = eirn.j(beiqVar.c).l(new eiho() { // from class: bejg
                                                        @Override // defpackage.eiho
                                                        public final Object apply(Object obj3) {
                                                            return ((BluetoothDevice) obj3).getAddress();
                                                        }
                                                    });
                                                    final dwvc dwvcVar = (dwvc) locationAssigningIntentOperation3.h.a();
                                                    Objects.requireNonNull(dwvcVar);
                                                    i5 = egna.f(l.l(new eiho() { // from class: bejh
                                                        @Override // defpackage.eiho
                                                        public final Object apply(Object obj3) {
                                                            return dwvc.this.k((String) obj3);
                                                        }
                                                    })).h(new eiho() { // from class: beji
                                                        @Override // defpackage.eiho
                                                        public final Object apply(Object obj3) {
                                                            eirn i9 = eirn.j((List) obj3).i(new eiih() { // from class: bejs
                                                                @Override // defpackage.eiih
                                                                public final boolean a(Object obj4) {
                                                                    eiid eiidVar2 = (eiid) obj4;
                                                                    asot asotVar = LocationAssigningIntentOperation.a;
                                                                    return eiidVar2 != null && eiidVar2.h();
                                                                }
                                                            }).l(new eiho() { // from class: bejt
                                                                @Override // defpackage.eiho
                                                                public final Object apply(Object obj4) {
                                                                    return (dwvb) ((eiid) obj4).c();
                                                                }
                                                            }).i(new eiih() { // from class: beju
                                                                @Override // defpackage.eiih
                                                                public final boolean a(Object obj4) {
                                                                    asot asotVar = LocationAssigningIntentOperation.a;
                                                                    return !((dwvb) obj4).c;
                                                                }
                                                            });
                                                            final long j7 = b3;
                                                            final long j8 = a7;
                                                            final double d2 = accuracy;
                                                            eirn l2 = i9.l(new eiho() { // from class: bejv
                                                                @Override // defpackage.eiho
                                                                public final Object apply(Object obj4) {
                                                                    dwvb dwvbVar = (dwvb) obj4;
                                                                    eufn eufnVar2 = dwvbVar.a;
                                                                    asot asotVar = LocationAssigningIntentOperation.a;
                                                                    return bevo.b(eufnVar2, eigb.a, dwva.COMPONENTLESS, dwvbVar.b, j7, j8, d2, ezda.CONNECTED_DEVICE_REPORTING);
                                                                }
                                                            });
                                                            if (!eivv.x(l2)) {
                                                                dwyw dwywVar2 = dwywVar;
                                                                bqqa.a(aseu.FIND_MY_DEVICE_CONNECTED_DEVICE_SIGHTINGS_REPORT);
                                                                LocationAssigningIntentOperation.a(ezda.CONNECTED_DEVICE_REPORTING, dwywVar2, eivv.b(l2));
                                                            }
                                                            return l2;
                                                        }
                                                    }, enre.a);
                                                }
                                                return egmx.f(i5).h(new eiho() { // from class: bejr
                                                    @Override // defpackage.eiho
                                                    public final Object apply(Object obj3) {
                                                        asot asotVar = LocationAssigningIntentOperation.a;
                                                        return eirn.f(eitj.this, (Iterable) obj3);
                                                    }
                                                }, enre.a);
                                            }
                                        }
                                    }
                                    ((ejhf) ((ejhf) LocationAssigningIntentOperation.a.h()).ah((char) 4232)).x("Incoming location but device is not provisioned, stopping self location fetcher.");
                                    locationAssigningIntentOperation3.g.b();
                                    int i9 = eitj.d;
                                    eitjVar = ejcb.a;
                                    if (fobb.f()) {
                                    }
                                    i5 = ensj.i(ejcb.a);
                                    return egmx.f(i5).h(new eiho() { // from class: bejr
                                        @Override // defpackage.eiho
                                        public final Object apply(Object obj3) {
                                            asot asotVar = LocationAssigningIntentOperation.a;
                                            return eirn.f(eitj.this, (Iterable) obj3);
                                        }
                                    }, enre.a);
                                }
                            };
                            Executor executor = locationAssigningIntentOperation2.k;
                            return egnc.k(egmx.f(f.i(enqcVar, executor)).h(new eiho() { // from class: bejo
                                @Override // defpackage.eiho
                                public final Object apply(Object obj2) {
                                    asot asotVar = LocationAssigningIntentOperation.a;
                                    return eirn.f(list, (Iterable) obj2);
                                }
                            }, enre.a), new enqc() { // from class: bejp
                                @Override // defpackage.enqc
                                public final enss a(Object obj2) {
                                    Iterable iterable = (Iterable) obj2;
                                    if (eivv.x(iterable)) {
                                        return ensm.a;
                                    }
                                    Location location4 = location3;
                                    LocationAssigningIntentOperation locationAssigningIntentOperation3 = LocationAssigningIntentOperation.this;
                                    return locationAssigningIntentOperation3.c.c(new beuo(iterable, location4, eigb.a));
                                }
                            }, executor);
                        }
                    };
                    Executor executor = locationAssigningIntentOperation.k;
                    return h2.b(enqbVar, executor).e(Throwable.class, new enqc() { // from class: bejl
                        @Override // defpackage.enqc
                        public final enss a(Object obj2) {
                            Throwable th = (Throwable) obj2;
                            asot asotVar = LocationAssigningIntentOperation.a;
                            if (th instanceof InterruptedException) {
                                return ensj.h(th);
                            }
                            ((ejhf) ((ejhf) LocationAssigningIntentOperation.a.j()).ah((char) 4236)).x("Error aggregating sightings.");
                            return ensm.a;
                        }
                    }, enre.a).i(new enqc() { // from class: bejm
                        @Override // defpackage.enqc
                        public final enss a(Object obj2) {
                            int i3;
                            LocationAssigningIntentOperation locationAssigningIntentOperation2 = LocationAssigningIntentOperation.this;
                            benu benuVar = locationAssigningIntentOperation2.d;
                            synchronized (benuVar.b) {
                                i3 = benuVar.d;
                            }
                            if (i3 == 0) {
                                belx belxVar = locationAssigningIntentOperation2.e;
                                synchronized (belxVar.b) {
                                    if (belxVar.c()) {
                                        PendingIntent a5 = beiz.a(belxVar.g, "NoPowerSightingsLocationUpdate");
                                        if (a5 != null) {
                                            belxVar.f.d(a5);
                                            belxVar.d = eigb.a;
                                        }
                                    }
                                }
                            }
                            return ensm.a;
                        }
                    }, executor);
                }
            }, this.k));
        }
    }

    public LocationAssigningIntentOperation(belh belhVar) {
        this.b = belhVar.m();
        this.c = belhVar.v();
        this.d = belhVar.s();
        this.e = belhVar.p();
        this.f = belhVar.F();
        this.g = belhVar.t();
        this.h = belhVar.O();
        this.i = belhVar.r();
        this.j = belhVar.N();
        this.m = belhVar.X();
        this.n = belhVar.C();
        this.k = belhVar.G();
        this.l = belhVar.c();
    }
}
