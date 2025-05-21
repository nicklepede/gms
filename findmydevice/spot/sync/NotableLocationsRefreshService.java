package com.google.android.gms.findmydevice.spot.sync;

import android.accounts.Account;
import com.google.android.gms.findmydevice.spot.sync.NotableLocationsRefreshService;
import com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bebo;
import defpackage.bebp;
import defpackage.bfdr;
import defpackage.byln;
import defpackage.egmx;
import defpackage.ejhf;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class NotableLocationsRefreshService extends SafeGmsTaskBoundService {
    public static final asot a = asot.b("NotableLocationsSvc", asej.FIND_MY_DEVICE_SPOT);
    public final bebp b;

    public NotableLocationsRefreshService() {
        this(bebo.a());
    }

    @Override // com.google.android.gms.findmydevice.util.SafeGmsTaskBoundService
    protected final enss d(byln bylnVar) {
        if (bfdr.a()) {
            return egmx.f(this.b.F().f()).i(new enqc() { // from class: bfcm
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    enss b;
                    if (!bego.c((dwyw) obj)) {
                        return ensj.i(0);
                    }
                    final benk r = NotableLocationsRefreshService.this.b.r();
                    if (!fobb.c() || r.e.a() >= r.g) {
                        eitj f = bfdq.f(r.b);
                        if (f.isEmpty()) {
                            b = egmx.f(r.d.m(ejcb.a)).h(new eiho() { // from class: benh
                                @Override // defpackage.eiho
                                public final Object apply(Object obj2) {
                                    asot asotVar = benk.a;
                                    return true;
                                }
                            }, enre.a);
                        } else {
                            final ArrayList arrayList = new ArrayList();
                            int size = f.size();
                            for (int i = 0; i < size; i++) {
                                Account account = (Account) f.get(i);
                                bebl beblVar = r.c;
                                eiig.x(account);
                                bcyc a2 = beblVar.b(account).a();
                                eujv eujvVar = (eujv) a2.a.o(bzgc.a, bxrf.b);
                                euhv euhvVar = euhv.a;
                                fecj v = euhvVar.v();
                                if (!v.b.L()) {
                                    v.U();
                                }
                                ((euhv) v.b).b = true;
                                euhv euhvVar2 = (euhv) v.Q();
                                fttm fttmVar = eujvVar.a;
                                ftxe ftxeVar = eujw.b;
                                if (ftxeVar == null) {
                                    synchronized (eujw.class) {
                                        ftxeVar = eujw.b;
                                        if (ftxeVar == null) {
                                            ftxb a3 = ftxe.a();
                                            a3.c = ftxd.UNARY;
                                            a3.d = ftxe.c("google.internal.spot.v1.SpotService", "GetUser");
                                            a3.b();
                                            febw febwVar = furo.a;
                                            a3.a = new furn(euhvVar);
                                            a3.b = new furn(euhw.a);
                                            ftxe a4 = a3.a();
                                            eujw.b = a4;
                                            ftxeVar = a4;
                                        }
                                    }
                                }
                                arrayList.add(egmx.f(bcxc.a(fusb.a(fttmVar.a(ftxeVar, eujvVar.b), euhvVar2), "getUser", a2.e)));
                            }
                            b = egna.g(arrayList).b(new enqb() { // from class: beni
                                @Override // defpackage.enqb
                                public final enss a() {
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
                                            for (euic euicVar : ((euhw) ensj.r((enss) arrayList4.get(i3))).b) {
                                                fecj v2 = dwyo.a.v();
                                                double d = euicVar.b / 1.0E7d;
                                                if (!v2.b.L()) {
                                                    v2.U();
                                                }
                                                fecp fecpVar = v2.b;
                                                z = true;
                                                try {
                                                    dwyo dwyoVar = (dwyo) fecpVar;
                                                    dwyoVar.b |= 1;
                                                    dwyoVar.c = d;
                                                    double d2 = euicVar.c / 1.0E7d;
                                                    if (!fecpVar.L()) {
                                                        v2.U();
                                                    }
                                                    dwyo dwyoVar2 = (dwyo) v2.b;
                                                    dwyoVar2.b |= 2;
                                                    dwyoVar2.d = d2;
                                                    dwyo dwyoVar3 = (dwyo) v2.Q();
                                                    Iterator it = arrayList3.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            arrayList2 = arrayList4;
                                                            i2 = size2;
                                                            arrayList3.add(dwyoVar3);
                                                            break;
                                                        }
                                                        dwyo dwyoVar4 = (dwyo) it.next();
                                                        double d3 = dwyoVar4.c;
                                                        double d4 = dwyoVar4.d;
                                                        arrayList2 = arrayList4;
                                                        i2 = size2;
                                                        try {
                                                            if (benk.b(d3, d4, dwyoVar3.c, dwyoVar3.d, 20L)) {
                                                                break;
                                                            }
                                                            arrayList4 = arrayList2;
                                                            size2 = i2;
                                                        } catch (ExecutionException e) {
                                                            e = e;
                                                            ((ejhf) ((ejhf) ((ejhf) benk.a.i()).s(e)).ah((char) 4318)).x("Failed to get notable locations.");
                                                            if ((e.getCause() instanceof bcyr) && ((bcyr) e.getCause()).d()) {
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
                                    benk benkVar = benk.this;
                                    benkVar.g = benkVar.e.a() + 600000;
                                    if (z2) {
                                        ((ejhf) ((ejhf) benk.a.h()).ah((char) 4316)).z("%d notable locations found.", arrayList3.size());
                                        return egmx.f(benkVar.d.m(arrayList3)).h(new eiho() { // from class: beng
                                            @Override // defpackage.eiho
                                            public final Object apply(Object obj2) {
                                                asot asotVar = benk.a;
                                                return true;
                                            }
                                        }, enre.a);
                                    }
                                    ((ejhf) ((ejhf) benk.a.j()).ah((char) 4317)).x("All requests to get notable locations failed.");
                                    final boolean z4 = fobb.c() || !z3;
                                    dwwv dwwvVar = benkVar.d;
                                    int i4 = eitj.d;
                                    return egmx.f(dwwvVar.m(ejcb.a)).h(new eiho() { // from class: benf
                                        @Override // defpackage.eiho
                                        public final Object apply(Object obj2) {
                                            asot asotVar = benk.a;
                                            return Boolean.valueOf(z4);
                                        }
                                    }, enre.a);
                                }
                            }, r.f);
                        }
                    } else {
                        b = ensj.i(true);
                    }
                    egmx f2 = egmx.f(b);
                    eiho eihoVar = new eiho() { // from class: bfck
                        @Override // defpackage.eiho
                        public final Object apply(Object obj2) {
                            asot asotVar = NotableLocationsRefreshService.a;
                            return Integer.valueOf(!((Boolean) obj2).booleanValue() ? 1 : 0);
                        }
                    };
                    enre enreVar = enre.a;
                    return f2.h(eihoVar, enreVar).d(Throwable.class, new eiho() { // from class: bfcl
                        @Override // defpackage.eiho
                        public final Object apply(Object obj2) {
                            ((ejhf) ((ejhf) ((ejhf) NotableLocationsRefreshService.a.i()).s((Throwable) obj2)).ah((char) 4522)).x("Error while fetching notable locations.");
                            return 1;
                        }
                    }, enreVar);
                }
            }, enre.a);
        }
        ((ejhf) ((ejhf) a.j()).ah((char) 4523)).x("Eddystone use cases are disabled.");
        return ensj.i(2);
    }

    public NotableLocationsRefreshService(bebp bebpVar) {
        this.b = bebpVar;
    }
}
