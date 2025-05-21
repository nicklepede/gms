package com.google.android.gms.locationsharingreporter.service;

import android.R;
import android.accounts.Account;
import android.location.Location;
import android.net.Uri;
import com.google.android.gms.locationsharingreporter.service.LocationTrackingIntentOperation;
import defpackage.a;
import defpackage.asbo;
import defpackage.asej;
import defpackage.asnd;
import defpackage.asot;
import defpackage.bkzk;
import defpackage.bxfy;
import defpackage.byzb;
import defpackage.bziy;
import defpackage.casx;
import defpackage.casy;
import defpackage.catq;
import defpackage.catr;
import defpackage.cats;
import defpackage.cavi;
import defpackage.cavm;
import defpackage.cavq;
import defpackage.cavr;
import defpackage.cawn;
import defpackage.caxd;
import defpackage.cbfb;
import defpackage.dfee;
import defpackage.doef;
import defpackage.dxbn;
import defpackage.dxbo;
import defpackage.dxhi;
import defpackage.dxhj;
import defpackage.dxkm;
import defpackage.ebfb;
import defpackage.ebfc;
import defpackage.ebfd;
import defpackage.ebfe;
import defpackage.ebfg;
import defpackage.eiho;
import defpackage.eiig;
import defpackage.eisx;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.enre;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.fgsw;
import defpackage.fhin;
import defpackage.fpwh;
import defpackage.fpwl;
import defpackage.fpws;
import defpackage.fpxh;
import defpackage.ikd;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationTrackingIntentOperation extends bkzk {
    public static final /* synthetic */ int h = 0;
    private static final asot i = asot.b("HighPowerGeoIntOp", asej.LOCATION_SHARING_REPORTER);

    private final casx i() {
        fgsw c = cbfb.c(this);
        fecj v = casx.a.v();
        long j = c.d;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        casx casxVar = (casx) fecpVar;
        casxVar.b |= 2;
        casxVar.d = j;
        boolean z = c.c;
        if (!fecpVar.L()) {
            v.U();
        }
        casx casxVar2 = (casx) v.b;
        casxVar2.b |= 1;
        casxVar2.c = z;
        return (casx) v.Q();
    }

    private final void j(String str, String str2, int i2) {
        cats catsVar;
        long j;
        if (fpwl.a.a().d()) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                catsVar = (cats) k().a().get(fpws.i(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                ((ejhf) ((ejhf) ((ejhf) i.j()).s(e)).ah((char) 5713)).x("failed to get location tracking data");
                catsVar = null;
            }
            if (catsVar != null) {
                long j2 = i2;
                fedh<catq> fedhVar = catsVar.b;
                ArrayList arrayList = new ArrayList();
                for (catq catqVar : fedhVar) {
                    if (catqVar.d.equals(str2) && catqVar.c == j2) {
                        arrayList.add(catqVar);
                    }
                }
                int size = arrayList.size();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    j = 0;
                    if (i3 >= size) {
                        break;
                    }
                    long j3 = currentTimeMillis - ((catq) arrayList.get(i3)).e;
                    if (j3 > 0 && j3 <= fpwh.b()) {
                        i4++;
                    }
                    i3++;
                }
                int i5 = i4 + 1;
                fecj v = ebfb.a.v();
                int m = m(i2);
                if (!v.b.L()) {
                    v.U();
                }
                ebfb ebfbVar = (ebfb) v.b;
                ebfbVar.c = m - 1;
                ebfbVar.b |= 1;
                boolean z = ((long) i5) >= fpwh.a.a().d();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                ebfb ebfbVar2 = (ebfb) fecpVar;
                ebfbVar2.b |= 2;
                ebfbVar2.d = z;
                if (!fecpVar.L()) {
                    v.U();
                }
                ebfb ebfbVar3 = (ebfb) v.b;
                ebfbVar3.b |= 8;
                ebfbVar3.f = i5;
                long b = fpwh.b();
                if (!v.b.L()) {
                    v.U();
                }
                ebfb ebfbVar4 = (ebfb) v.b;
                ebfbVar4.b |= 4;
                ebfbVar4.e = b;
                ebfb ebfbVar5 = (ebfb) v.Q();
                cavi a = cavi.a();
                fecj v2 = ebfg.a.v();
                fecj v3 = ebfc.a.v();
                if (!v3.b.L()) {
                    v3.U();
                }
                ebfc ebfcVar = (ebfc) v3.b;
                ebfbVar5.getClass();
                ebfcVar.c = ebfbVar5;
                ebfcVar.b = 4;
                if (!v2.b.L()) {
                    v2.U();
                }
                ebfg ebfgVar = (ebfg) v2.b;
                ebfc ebfcVar2 = (ebfc) v3.Q();
                ebfcVar2.getClass();
                ebfgVar.c = ebfcVar2;
                ebfgVar.b = 2;
                a.c(str, (ebfg) v2.Q(), 16);
                final catr catrVar = (catr) cats.a.v();
                int i6 = 0;
                for (catq catqVar2 : fedhVar) {
                    long j4 = j;
                    long j5 = currentTimeMillis - catqVar2.e;
                    if (j5 >= j4 && j5 <= fpwh.b() && i6 < fpwh.a.a().c()) {
                        catrVar.a(catqVar2);
                        i6++;
                    }
                    j = j4;
                }
                fecj v4 = catq.a.v();
                if (!v4.b.L()) {
                    v4.U();
                }
                fecp fecpVar2 = v4.b;
                catq catqVar3 = (catq) fecpVar2;
                str2.getClass();
                catqVar3.b = 2 | catqVar3.b;
                catqVar3.d = str2;
                if (!fecpVar2.L()) {
                    v4.U();
                }
                fecp fecpVar3 = v4.b;
                catq catqVar4 = (catq) fecpVar3;
                catqVar4.b = 1 | catqVar4.b;
                catqVar4.c = j2;
                if (!fecpVar3.L()) {
                    v4.U();
                }
                catq catqVar5 = (catq) v4.b;
                catqVar5.b |= 4;
                catqVar5.e = currentTimeMillis;
                catrVar.a((catq) v4.Q());
                try {
                    ((enpf) k().b(new eiho() { // from class: cavh
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            int i7 = LocationTrackingIntentOperation.h;
                            return (cats) catr.this.Q();
                        }
                    }, enre.a)).v(fpws.i(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    ((ejhf) ((ejhf) ((ejhf) i.j()).s(e2)).ah((char) 5712)).x("failed to update location tracking data");
                }
            }
        }
    }

    private final dxkm k() {
        Pattern pattern = dxbo.a;
        dxbn dxbnVar = new dxbn(this);
        dxbnVar.e("locationsharingreporter");
        dxbnVar.f("Location.Tracking.pb");
        Uri a = dxbnVar.a();
        dxhi a2 = dxhj.a();
        a2.f(a);
        a2.e(cats.a);
        return bxfy.a.a(a2.a());
    }

    private static final casy l(Location location) {
        fecj v = casy.a.v();
        double altitude = location.getAltitude();
        if (!v.b.L()) {
            v.U();
        }
        casy casyVar = (casy) v.b;
        casyVar.b |= 16;
        casyVar.g = altitude;
        double latitude = location.getLatitude();
        if (!v.b.L()) {
            v.U();
        }
        casy casyVar2 = (casy) v.b;
        casyVar2.b |= 8;
        casyVar2.f = latitude;
        double longitude = location.getLongitude();
        if (!v.b.L()) {
            v.U();
        }
        casy casyVar3 = (casy) v.b;
        casyVar3.b |= 4;
        casyVar3.e = longitude;
        double speed = location.getSpeed();
        if (!v.b.L()) {
            v.U();
        }
        casy casyVar4 = (casy) v.b;
        casyVar4.b |= 64;
        casyVar4.i = speed;
        double accuracy = location.getAccuracy();
        if (!v.b.L()) {
            v.U();
        }
        casy casyVar5 = (casy) v.b;
        casyVar5.b |= 2;
        casyVar5.d = accuracy;
        long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
        if (!v.b.L()) {
            v.U();
        }
        casy casyVar6 = (casy) v.b;
        casyVar6.b |= 1;
        casyVar6.c = elapsedRealtimeNanos;
        return (casy) v.Q();
    }

    private static final int m(int i2) {
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 4 ? 1 : 4;
        }
        return 3;
    }

    private static final boolean n(casy casyVar, cawn cawnVar) {
        return doef.a(casyVar.f, casyVar.e, cawnVar.a, cawnVar.b) < ((double) cawnVar.c);
    }

    private static final void o(String str, cawn cawnVar, casy casyVar, casy casyVar2, int i2, int i3, long j) {
        fecj v = ebfc.a.v();
        fecj v2 = ebfe.a.v();
        double a = doef.a(casyVar2.f, casyVar2.e, casyVar.f, casyVar.e);
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        ebfe ebfeVar = (ebfe) fecpVar;
        ebfeVar.b |= 128;
        ebfeVar.j = a;
        long j2 = casyVar.c;
        if (!fecpVar.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        ebfe ebfeVar2 = (ebfe) fecpVar2;
        ebfeVar2.b |= 32;
        ebfeVar2.h = j2;
        long j3 = casyVar2.c;
        if (!fecpVar2.L()) {
            v2.U();
        }
        fecp fecpVar3 = v2.b;
        ebfe ebfeVar3 = (ebfe) fecpVar3;
        ebfeVar3.b |= 64;
        ebfeVar3.i = j3;
        double d = casyVar.i;
        if (!fecpVar3.L()) {
            v2.U();
        }
        fecp fecpVar4 = v2.b;
        ebfe ebfeVar4 = (ebfe) fecpVar4;
        ebfeVar4.b |= 8;
        ebfeVar4.f = d;
        double d2 = casyVar2.i;
        if (!fecpVar4.L()) {
            v2.U();
        }
        fecp fecpVar5 = v2.b;
        ebfe ebfeVar5 = (ebfe) fecpVar5;
        ebfeVar5.b |= 16;
        ebfeVar5.g = d2;
        long j4 = i3;
        if (!fecpVar5.L()) {
            v2.U();
        }
        ebfe ebfeVar6 = (ebfe) v2.b;
        ebfeVar6.b |= 4;
        ebfeVar6.e = j4;
        double d3 = cawnVar.a;
        double d4 = cawnVar.b;
        double a2 = doef.a(d3, d4, casyVar.f, casyVar.e);
        if (!v2.b.L()) {
            v2.U();
        }
        ebfe ebfeVar7 = (ebfe) v2.b;
        ebfeVar7.b |= 256;
        ebfeVar7.k = a2;
        double a3 = doef.a(d3, d4, casyVar2.f, casyVar2.e);
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar6 = v2.b;
        ebfe ebfeVar8 = (ebfe) fecpVar6;
        ebfeVar8.b |= 512;
        ebfeVar8.l = a3;
        float f = cawnVar.c;
        if (!fecpVar6.L()) {
            v2.U();
        }
        fecp fecpVar7 = v2.b;
        ebfe ebfeVar9 = (ebfe) fecpVar7;
        ebfeVar9.b |= 1024;
        ebfeVar9.m = f;
        if (!fecpVar7.L()) {
            v2.U();
        }
        fecp fecpVar8 = v2.b;
        ebfe ebfeVar10 = (ebfe) fecpVar8;
        ebfeVar10.b |= 2;
        ebfeVar10.d = j;
        if (!fecpVar8.L()) {
            v2.U();
        }
        ebfe ebfeVar11 = (ebfe) v2.b;
        ebfeVar11.c = i2 - 1;
        ebfeVar11.b |= 1;
        if (!v.b.L()) {
            v.U();
        }
        ebfc ebfcVar = (ebfc) v.b;
        ebfe ebfeVar12 = (ebfe) v2.Q();
        ebfeVar12.getClass();
        ebfcVar.c = ebfeVar12;
        ebfcVar.b = 1;
        ebfc ebfcVar2 = (ebfc) v.Q();
        cavi a4 = cavi.a();
        fecj v3 = ebfg.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        ebfg ebfgVar = (ebfg) v3.b;
        ebfcVar2.getClass();
        ebfgVar.c = ebfcVar2;
        ebfgVar.b = 2;
        a4.c(str, (ebfg) v3.Q(), 9);
    }

    @Override // defpackage.bkzk
    protected final eisx b() {
        return cavm.b().c(this);
    }

    @Override // defpackage.bkzk
    protected final void c(fhin fhinVar, int i2) {
        Account b = asnd.b(this);
        cavi a = cavi.a();
        String str = b != null ? b.name : null;
        fecj v = ebfg.a.v();
        fecj v2 = ebfc.a.v();
        fecj v3 = ebfd.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        fecp fecpVar = v3.b;
        ebfd ebfdVar = (ebfd) fecpVar;
        ebfdVar.b |= 2;
        ebfdVar.d = i2;
        if (!fecpVar.L()) {
            v3.U();
        }
        ebfd ebfdVar2 = (ebfd) v3.b;
        fhinVar.getClass();
        ebfdVar2.c = fhinVar;
        ebfdVar2.b |= 1;
        if (!v2.b.L()) {
            v2.U();
        }
        ebfc ebfcVar = (ebfc) v2.b;
        ebfd ebfdVar3 = (ebfd) v3.Q();
        ebfdVar3.getClass();
        ebfcVar.c = ebfdVar3;
        ebfcVar.b = 2;
        if (!v.b.L()) {
            v.U();
        }
        ebfg ebfgVar = (ebfg) v.b;
        ebfc ebfcVar2 = (ebfc) v2.Q();
        ebfcVar2.getClass();
        ebfgVar.c = ebfcVar2;
        ebfgVar.b = 2;
        a.c(str, (ebfg) v.Q(), 10);
    }

    @Override // defpackage.bkzk
    protected final void d(Location location) {
        ((ejhf) ((ejhf) i.h()).ah((char) 5715)).B("Location update at %s", location);
        caxd.a().c(this, location, i());
    }

    @Override // defpackage.bkzk
    protected final void e() {
        cavr.a().f(this, cavq.SUPERVISED_USER_GEOFENCING);
    }

    @Override // defpackage.bkzk
    protected final void f() {
        cavr.a().g(this, cavq.SUPERVISED_USER_GEOFENCING);
    }

    @Override // defpackage.bkzk
    protected final void g(long j, int i2, int i3, int i4) {
        byzb.a(this).c(17);
        cavr.a();
        String a = bziy.a(i2);
        String str = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? "STILL" : "SLOW" : "FAST" : "INITIAL_ACTIVITY" : "ALL_ACTIVITIES" : "UNKNOWN_ACTIVITY";
        String str2 = i4 != 3 ? i4 != 4 ? i4 != 5 ? i4 != 6 ? "DWELL" : "IN" : "CLOSE" : "FAR" : "INITIAL_DISTANCE";
        if (fpwl.c()) {
            asbo f = asbo.f(this);
            eiig.x(f);
            cavr.b(f);
            ikd ikdVar = new ikd(this, "LSR_geofencing_debug_notification");
            ikdVar.g(R.drawable.ic_dialog_alert);
            ikdVar.m(a.D(j, "New location sampling rate:"));
            ikdVar.l(String.format("priority:%s, lastActivityState:%s, lastDistanceCategory:%s", a, str, str2));
            ikdVar.l = 2;
            if (fpxh.C()) {
                f.w(cavr.class.getName(), 397186322, dfee.LSR_SUPERVISED_USERS_TRANSPARENCY, ikdVar.b());
            } else {
                f.v(cavr.class.getName(), 397186322, ikdVar.b());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e0, code lost:
    
        if (r10 != 4) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x041d  */
    @Override // defpackage.bkzk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void h(defpackage.cawn r32, android.location.Location r33, int r34) {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.locationsharingreporter.service.LocationTrackingIntentOperation.h(cawn, android.location.Location, int):void");
    }
}
