package com.google.android.gms.locationsharingreporter.service;

import android.R;
import android.accounts.Account;
import android.location.Location;
import android.net.Uri;
import com.google.android.gms.locationsharingreporter.service.LocationTrackingIntentOperation;
import defpackage.a;
import defpackage.aued;
import defpackage.auid;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.bngb;
import defpackage.bzoo;
import defpackage.cbhs;
import defpackage.cbrp;
import defpackage.cdbn;
import defpackage.cdbo;
import defpackage.cdcg;
import defpackage.cdch;
import defpackage.cdci;
import defpackage.cddy;
import defpackage.cdec;
import defpackage.cdeg;
import defpackage.cdeh;
import defpackage.cdfd;
import defpackage.cdft;
import defpackage.cdnt;
import defpackage.dhpk;
import defpackage.dqoo;
import defpackage.dznn;
import defpackage.dzno;
import defpackage.dzti;
import defpackage.dztj;
import defpackage.dzwm;
import defpackage.edro;
import defpackage.edrp;
import defpackage.edrq;
import defpackage.edrr;
import defpackage.edrt;
import defpackage.ekut;
import defpackage.ekvl;
import defpackage.elgc;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.eqex;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fjhu;
import defpackage.fjyk;
import defpackage.fsqb;
import defpackage.fsqf;
import defpackage.fsqm;
import defpackage.ilt;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationTrackingIntentOperation extends bngb {
    public static final /* synthetic */ int h = 0;
    private static final ausn i = ausn.b("HighPowerGeoIntOp", auid.LOCATION_SHARING_REPORTER);

    private final cdbn i() {
        fjhu c = cdnt.c(this);
        fgrc v = cdbn.a.v();
        long j = c.d;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        cdbn cdbnVar = (cdbn) fgriVar;
        cdbnVar.b |= 2;
        cdbnVar.d = j;
        boolean z = c.c;
        if (!fgriVar.L()) {
            v.U();
        }
        cdbn cdbnVar2 = (cdbn) v.b;
        cdbnVar2.b |= 1;
        cdbnVar2.c = z;
        return (cdbn) v.Q();
    }

    private final void j(String str, String str2, int i2) {
        cdci cdciVar;
        long j;
        if (fsqf.a.lK().d()) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                cdciVar = (cdci) k().a().get(fsqm.i(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                ((eluo) ((eluo) ((eluo) i.j()).s(e)).ai((char) 5727)).x("failed to get location tracking data");
                cdciVar = null;
            }
            if (cdciVar != null) {
                long j2 = i2;
                fgsa<cdcg> fgsaVar = cdciVar.b;
                ArrayList arrayList = new ArrayList();
                for (cdcg cdcgVar : fgsaVar) {
                    if (cdcgVar.d.equals(str2) && cdcgVar.c == j2) {
                        arrayList.add(cdcgVar);
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
                    long j3 = currentTimeMillis - ((cdcg) arrayList.get(i3)).e;
                    if (j3 > 0 && j3 <= fsqb.b()) {
                        i4++;
                    }
                    i3++;
                }
                int i5 = i4 + 1;
                fgrc v = edro.a.v();
                int m = m(i2);
                if (!v.b.L()) {
                    v.U();
                }
                edro edroVar = (edro) v.b;
                edroVar.c = m - 1;
                edroVar.b |= 1;
                fsqb fsqbVar = fsqb.a;
                boolean z = ((long) i5) >= fsqbVar.lK().d();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                edro edroVar2 = (edro) fgriVar;
                edroVar2.b |= 2;
                edroVar2.d = z;
                if (!fgriVar.L()) {
                    v.U();
                }
                edro edroVar3 = (edro) v.b;
                edroVar3.b |= 8;
                edroVar3.f = i5;
                long b = fsqb.b();
                if (!v.b.L()) {
                    v.U();
                }
                edro edroVar4 = (edro) v.b;
                edroVar4.b |= 4;
                edroVar4.e = b;
                edro edroVar5 = (edro) v.Q();
                cddy a = cddy.a();
                fgrc v2 = edrt.a.v();
                fgrc v3 = edrp.a.v();
                if (!v3.b.L()) {
                    v3.U();
                }
                edrp edrpVar = (edrp) v3.b;
                edroVar5.getClass();
                edrpVar.c = edroVar5;
                edrpVar.b = 4;
                if (!v2.b.L()) {
                    v2.U();
                }
                edrt edrtVar = (edrt) v2.b;
                edrp edrpVar2 = (edrp) v3.Q();
                edrpVar2.getClass();
                edrtVar.c = edrpVar2;
                edrtVar.b = 2;
                a.c(str, (edrt) v2.Q(), 16);
                final cdch cdchVar = (cdch) cdci.a.v();
                int i6 = 0;
                for (cdcg cdcgVar2 : fgsaVar) {
                    long j4 = j;
                    long j5 = currentTimeMillis - cdcgVar2.e;
                    if (j5 >= j4 && j5 <= fsqb.b() && i6 < fsqbVar.lK().c()) {
                        cdchVar.a(cdcgVar2);
                        i6++;
                    }
                    j = j4;
                }
                fgrc v4 = cdcg.a.v();
                if (!v4.b.L()) {
                    v4.U();
                }
                fgri fgriVar2 = v4.b;
                cdcg cdcgVar3 = (cdcg) fgriVar2;
                str2.getClass();
                cdcgVar3.b = 2 | cdcgVar3.b;
                cdcgVar3.d = str2;
                if (!fgriVar2.L()) {
                    v4.U();
                }
                fgri fgriVar3 = v4.b;
                cdcg cdcgVar4 = (cdcg) fgriVar3;
                cdcgVar4.b |= 1;
                cdcgVar4.c = j2;
                if (!fgriVar3.L()) {
                    v4.U();
                }
                cdcg cdcgVar5 = (cdcg) v4.b;
                cdcgVar5.b |= 4;
                cdcgVar5.e = currentTimeMillis;
                cdchVar.a((cdcg) v4.Q());
                try {
                    ((eqcy) k().b(new ekut() { // from class: cddx
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            int i7 = LocationTrackingIntentOperation.h;
                            return (cdci) cdch.this.Q();
                        }
                    }, eqex.a)).v(fsqm.i(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    ((eluo) ((eluo) ((eluo) i.j()).s(e2)).ai((char) 5726)).x("failed to update location tracking data");
                }
            }
        }
    }

    private final dzwm k() {
        Pattern pattern = dzno.a;
        dznn dznnVar = new dznn(this);
        dznnVar.e("locationsharingreporter");
        dznnVar.f("Location.Tracking.pb");
        Uri a = dznnVar.a();
        dzti a2 = dztj.a();
        a2.f(a);
        a2.e(cdci.a);
        return bzoo.a.a(a2.a());
    }

    private static final cdbo l(Location location) {
        fgrc v = cdbo.a.v();
        double altitude = location.getAltitude();
        if (!v.b.L()) {
            v.U();
        }
        cdbo cdboVar = (cdbo) v.b;
        cdboVar.b |= 16;
        cdboVar.g = altitude;
        double latitude = location.getLatitude();
        if (!v.b.L()) {
            v.U();
        }
        cdbo cdboVar2 = (cdbo) v.b;
        cdboVar2.b |= 8;
        cdboVar2.f = latitude;
        double longitude = location.getLongitude();
        if (!v.b.L()) {
            v.U();
        }
        cdbo cdboVar3 = (cdbo) v.b;
        cdboVar3.b |= 4;
        cdboVar3.e = longitude;
        double speed = location.getSpeed();
        if (!v.b.L()) {
            v.U();
        }
        cdbo cdboVar4 = (cdbo) v.b;
        cdboVar4.b |= 64;
        cdboVar4.i = speed;
        double accuracy = location.getAccuracy();
        if (!v.b.L()) {
            v.U();
        }
        cdbo cdboVar5 = (cdbo) v.b;
        cdboVar5.b |= 2;
        cdboVar5.d = accuracy;
        long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
        if (!v.b.L()) {
            v.U();
        }
        cdbo cdboVar6 = (cdbo) v.b;
        cdboVar6.b |= 1;
        cdboVar6.c = elapsedRealtimeNanos;
        return (cdbo) v.Q();
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

    private static final boolean n(cdbo cdboVar, cdfd cdfdVar) {
        return dqoo.a(cdboVar.f, cdboVar.e, cdfdVar.a, cdfdVar.b) < ((double) cdfdVar.c);
    }

    private static final void o(String str, cdfd cdfdVar, cdbo cdboVar, cdbo cdboVar2, int i2, int i3, long j) {
        fgrc v = edrp.a.v();
        fgrc v2 = edrr.a.v();
        double a = dqoo.a(cdboVar2.f, cdboVar2.e, cdboVar.f, cdboVar.e);
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        edrr edrrVar = (edrr) fgriVar;
        edrrVar.b |= 128;
        edrrVar.j = a;
        long j2 = cdboVar.c;
        if (!fgriVar.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        edrr edrrVar2 = (edrr) fgriVar2;
        edrrVar2.b |= 32;
        edrrVar2.h = j2;
        long j3 = cdboVar2.c;
        if (!fgriVar2.L()) {
            v2.U();
        }
        fgri fgriVar3 = v2.b;
        edrr edrrVar3 = (edrr) fgriVar3;
        edrrVar3.b |= 64;
        edrrVar3.i = j3;
        double d = cdboVar.i;
        if (!fgriVar3.L()) {
            v2.U();
        }
        fgri fgriVar4 = v2.b;
        edrr edrrVar4 = (edrr) fgriVar4;
        edrrVar4.b |= 8;
        edrrVar4.f = d;
        double d2 = cdboVar2.i;
        if (!fgriVar4.L()) {
            v2.U();
        }
        fgri fgriVar5 = v2.b;
        edrr edrrVar5 = (edrr) fgriVar5;
        edrrVar5.b |= 16;
        edrrVar5.g = d2;
        long j4 = i3;
        if (!fgriVar5.L()) {
            v2.U();
        }
        edrr edrrVar6 = (edrr) v2.b;
        edrrVar6.b |= 4;
        edrrVar6.e = j4;
        double d3 = cdfdVar.a;
        double d4 = cdfdVar.b;
        double a2 = dqoo.a(d3, d4, cdboVar.f, cdboVar.e);
        if (!v2.b.L()) {
            v2.U();
        }
        edrr edrrVar7 = (edrr) v2.b;
        edrrVar7.b |= 256;
        edrrVar7.k = a2;
        double a3 = dqoo.a(d3, d4, cdboVar2.f, cdboVar2.e);
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar6 = v2.b;
        edrr edrrVar8 = (edrr) fgriVar6;
        edrrVar8.b |= 512;
        edrrVar8.l = a3;
        float f = cdfdVar.c;
        if (!fgriVar6.L()) {
            v2.U();
        }
        fgri fgriVar7 = v2.b;
        edrr edrrVar9 = (edrr) fgriVar7;
        edrrVar9.b |= 1024;
        edrrVar9.m = f;
        if (!fgriVar7.L()) {
            v2.U();
        }
        fgri fgriVar8 = v2.b;
        edrr edrrVar10 = (edrr) fgriVar8;
        edrrVar10.b |= 2;
        edrrVar10.d = j;
        if (!fgriVar8.L()) {
            v2.U();
        }
        edrr edrrVar11 = (edrr) v2.b;
        edrrVar11.c = i2 - 1;
        edrrVar11.b |= 1;
        if (!v.b.L()) {
            v.U();
        }
        edrp edrpVar = (edrp) v.b;
        edrr edrrVar12 = (edrr) v2.Q();
        edrrVar12.getClass();
        edrpVar.c = edrrVar12;
        edrpVar.b = 1;
        edrp edrpVar2 = (edrp) v.Q();
        cddy a4 = cddy.a();
        fgrc v3 = edrt.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        edrt edrtVar = (edrt) v3.b;
        edrpVar2.getClass();
        edrtVar.c = edrpVar2;
        edrtVar.b = 2;
        a4.c(str, (edrt) v3.Q(), 9);
    }

    @Override // defpackage.bngb
    protected final elgc b() {
        return cdec.b().c(this);
    }

    @Override // defpackage.bngb
    protected final void c(fjyk fjykVar, int i2) {
        Account b = auqx.b(this);
        cddy a = cddy.a();
        String str = b != null ? b.name : null;
        fgrc v = edrt.a.v();
        fgrc v2 = edrp.a.v();
        fgrc v3 = edrq.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        fgri fgriVar = v3.b;
        edrq edrqVar = (edrq) fgriVar;
        edrqVar.b |= 2;
        edrqVar.d = i2;
        if (!fgriVar.L()) {
            v3.U();
        }
        edrq edrqVar2 = (edrq) v3.b;
        fjykVar.getClass();
        edrqVar2.c = fjykVar;
        edrqVar2.b |= 1;
        if (!v2.b.L()) {
            v2.U();
        }
        edrp edrpVar = (edrp) v2.b;
        edrq edrqVar3 = (edrq) v3.Q();
        edrqVar3.getClass();
        edrpVar.c = edrqVar3;
        edrpVar.b = 2;
        if (!v.b.L()) {
            v.U();
        }
        edrt edrtVar = (edrt) v.b;
        edrp edrpVar2 = (edrp) v2.Q();
        edrpVar2.getClass();
        edrtVar.c = edrpVar2;
        edrtVar.b = 2;
        a.c(str, (edrt) v.Q(), 10);
    }

    @Override // defpackage.bngb
    protected final void d(Location location) {
        ((eluo) ((eluo) i.h()).ai((char) 5729)).B("Location update at %s", location);
        cdft.a().c(this, location, i());
    }

    @Override // defpackage.bngb
    protected final void e() {
        cdeh.a().f(this, cdeg.SUPERVISED_USER_GEOFENCING);
    }

    @Override // defpackage.bngb
    protected final void f() {
        cdeh.a().g(this, cdeg.SUPERVISED_USER_GEOFENCING);
    }

    @Override // defpackage.bngb
    protected final void g(long j, int i2, int i3, int i4) {
        cbhs.a(this).c(17);
        cdeh.a();
        String a = cbrp.a(i2);
        String str = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? "STILL" : "SLOW" : "FAST" : "INITIAL_ACTIVITY" : "ALL_ACTIVITIES" : "UNKNOWN_ACTIVITY";
        String str2 = i4 != 3 ? i4 != 4 ? i4 != 5 ? i4 != 6 ? "DWELL" : "IN" : "CLOSE" : "FAR" : "INITIAL_DISTANCE";
        if (fsqf.c()) {
            aued f = aued.f(this);
            ekvl.y(f);
            cdeh.b(f);
            ilt iltVar = new ilt(this, "LSR_geofencing_debug_notification");
            iltVar.n(R.drawable.ic_dialog_alert);
            iltVar.r(a.C(j, "New location sampling rate:"));
            iltVar.j(String.format("priority:%s, lastActivityState:%s, lastDistanceCategory:%s", a, str, str2));
            iltVar.l = 2;
            f.w(cdeh.class.getName(), 397186322, dhpk.LSR_SUPERVISED_USERS_TRANSPARENCY, iltVar.b());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01cb, code lost:
    
        if (r10 != 4) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0408  */
    @Override // defpackage.bngb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void h(defpackage.cdfd r32, android.location.Location r33, int r34) {
        /*
            Method dump skipped, instructions count: 1193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.locationsharingreporter.service.LocationTrackingIntentOperation.h(cdfd, android.location.Location, int):void");
    }
}
