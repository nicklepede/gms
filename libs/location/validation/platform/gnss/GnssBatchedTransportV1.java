package com.google.android.gms.libs.location.validation.platform.gnss;

import android.content.Context;
import android.location.BatchedLocationCallback;
import android.location.LocationManager;
import android.os.Looper;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.libs.identity.ImmutableWorkSource;
import com.google.android.gms.libs.location.validation.platform.gnss.GnssBatchedTransportV1;
import com.google.android.gms.libs.location.validation.platform.gnss.GnssLocationListener;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener;
import defpackage.aupv;
import defpackage.ausn;
import defpackage.bzdv;
import defpackage.bzei;
import defpackage.bzej;
import defpackage.bzff;
import defpackage.bzfl;
import defpackage.bzfo;
import defpackage.bzgb;
import defpackage.bzgi;
import defpackage.bzgj;
import defpackage.bzkj;
import defpackage.bzkk;
import defpackage.bzko;
import defpackage.caqj;
import defpackage.eluo;
import defpackage.eqex;
import defpackage.fxsr;
import defpackage.fxsu;
import defpackage.fxwo;
import defpackage.fxxm;
import defpackage.fxxz;
import defpackage.fybs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GnssBatchedTransportV1 extends BatchedLocationCallback implements GmsAlarmManagerCompat$OnAlarmListener, bzgj {
    public static final /* synthetic */ int f = 0;
    public final LocationManager a;
    public final List b;
    public GnssLocationListener c;
    public Executor d;
    public bzgb e;
    private final Context g;
    private long h;
    private WorkSource i;
    private bzkk j;
    private final bzko k;

    public GnssBatchedTransportV1(Context context, LocationManager locationManager) {
        fxxm.f(locationManager, "locationManager");
        this.g = context;
        this.a = locationManager;
        this.k = bzkj.a(context);
        new aupv(1, 9);
        this.b = new ArrayList();
    }

    @Override // com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener
    public final void a(bzkk bzkkVar) {
        synchronized (this) {
            try {
                if (this.j != bzkkVar) {
                    return;
                }
                bzko bzkoVar = this.k;
                long elapsedRealtime = SystemClock.elapsedRealtime() + this.h;
                WorkSource workSource = this.i;
                fxxm.c(workSource);
                Executor executor = this.d;
                fxxm.c(executor);
                try {
                    this.j = bzkoVar.b("GnssBatchedTransportV1:periodic_flush", 2, elapsedRealtime, workSource, executor, this);
                    ausn ausnVar = bzfo.a;
                    this.a.flushGnssBatch();
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.bzgj
    public final void b(bzej bzejVar, long j, Executor executor, GnssLocationListener gnssLocationListener) {
        synchronized (this) {
            try {
                if (this.c != null) {
                    throw new IllegalStateException("Check failed.");
                }
                if (this.j != null) {
                    throw new IllegalStateException("Check failed.");
                }
                if (this.e != null) {
                    throw new IllegalStateException("Check failed.");
                }
                this.c = gnssLocationListener;
                this.d = executor;
                LocationManager locationManager = this.a;
                int gnssBatchSize = locationManager.getGnssBatchSize();
                ausn ausnVar = bzfo.a;
                bzdv.c(bzejVar.a());
                bzdv.c(bzejVar.c());
                if (fybs.b(fybs.h(j, bzgi.a), bzejVar.c()) < 0) {
                    Context context = this.g;
                    bzgb bzgbVar = new bzgb(context, locationManager);
                    this.e = bzgbVar;
                    fxxm.c(bzgbVar);
                    long c = bzejVar.c();
                    bzff g = bzejVar.g();
                    long e = bzejVar.e();
                    boolean z = bzejVar.c;
                    ImmutableWorkSource immutableWorkSource = bzejVar.e;
                    fxxm.f(g, "quality");
                    fxxm.f(immutableWorkSource, "workSource");
                    bzej b = bzei.b(g, 0L, e, c, 1, 0L, z, immutableWorkSource);
                    eqex eqexVar = eqex.a;
                    fxxm.e(eqexVar, "directExecutor(...)");
                    bzgbVar.b(b, 0L, eqexVar, new GnssLocationListener(context, new fxwo() { // from class: bzfj
                        @Override // defpackage.fxwo
                        public final Object a(Object obj) {
                            fxxm.f((List) obj, "<unused var>");
                            ausn ausnVar2 = bzfo.a;
                            GnssBatchedTransportV1 gnssBatchedTransportV1 = GnssBatchedTransportV1.this;
                            synchronized (gnssBatchedTransportV1) {
                                gnssBatchedTransportV1.e = null;
                            }
                            synchronized (gnssBatchedTransportV1) {
                                if (gnssBatchedTransportV1.c == null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                gnssBatchedTransportV1.a.flushGnssBatch();
                            }
                            return fxrq.a;
                        }
                    }));
                }
                try {
                } catch (IllegalStateException e2) {
                    ((eluo) ((eluo) bzfo.a.i()).s(e2)).x("error registering batched GNSS location request");
                }
                if (locationManager.registerGnssBatchedLocationCallback(fybs.d(bzejVar.a()), true, this, new caqj(Looper.getMainLooper()))) {
                    long d = fybs.d(bzejVar.c());
                    this.h = d;
                    if (d / fybs.d(bzejVar.a()) < gnssBatchSize) {
                        this.i = bzejVar.e.b();
                        bzko bzkoVar = this.k;
                        long elapsedRealtime = SystemClock.elapsedRealtime() + this.h;
                        WorkSource workSource = this.i;
                        fxxm.c(workSource);
                        try {
                            this.j = bzkoVar.b("GnssBatchedTransportV1:periodic_flush", 2, elapsedRealtime, workSource, executor, this);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    if (bzfl.a.getAndSet(true)) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                ((eluo) bzfo.a.i()).x("error registering batched GNSS location request");
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.bzgj
    public final void c() {
        synchronized (this) {
            if (this.c == null) {
                throw new IllegalStateException("Check failed.");
            }
            ausn ausnVar = bzfo.a;
            List list = this.b;
            if (!list.isEmpty()) {
                final List ad = fxsr.ad(list);
                Executor executor = this.d;
                fxxm.c(executor);
                executor.execute(new Runnable() { // from class: bzfk
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = GnssBatchedTransportV1.f;
                        Iterator it = ad.iterator();
                        while (it.hasNext()) {
                            ((fxwd) it.next()).a();
                        }
                    }
                });
            }
            this.i = null;
            bzgb bzgbVar = this.e;
            if (bzgbVar != null) {
                bzgbVar.c();
                this.e = null;
            }
            bzkk bzkkVar = this.j;
            if (bzkkVar != null) {
                bzkkVar.a();
                this.j = null;
            }
            this.c = null;
            this.d = null;
            list.clear();
            bzfl.a.set(false);
        }
    }

    public final void onLocationBatch(final List list) {
        Executor executor;
        fxxm.f(list, "locations");
        final fxxz fxxzVar = new fxxz();
        synchronized (this) {
            executor = this.d;
            if (list.isEmpty()) {
                List list2 = this.b;
                fxxzVar.a = fxsr.ad(list2);
                list2.clear();
            } else {
                fxxzVar.a = fxsu.a;
            }
        }
        if (executor == null) {
            return;
        }
        if (!((Collection) fxxzVar.a).isEmpty()) {
            ausn ausnVar = bzfo.a;
        } else if (list.isEmpty()) {
            return;
        }
        executor.execute(new Runnable() { // from class: bzfi
            @Override // java.lang.Runnable
            public final void run() {
                GnssLocationListener gnssLocationListener;
                List list3 = list;
                if (!list3.isEmpty()) {
                    GnssBatchedTransportV1 gnssBatchedTransportV1 = this;
                    synchronized (gnssBatchedTransportV1) {
                        gnssLocationListener = gnssBatchedTransportV1.c;
                    }
                    if (gnssLocationListener != null) {
                        gnssLocationListener.onLocationChanged(list3);
                    }
                }
                Iterator it = ((Iterable) fxxzVar.a).iterator();
                while (it.hasNext()) {
                    ((fxwd) it.next()).a();
                }
            }
        });
    }
}
