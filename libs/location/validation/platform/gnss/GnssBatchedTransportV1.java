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
import defpackage.asmb;
import defpackage.asot;
import defpackage.bwvf;
import defpackage.bwvs;
import defpackage.bwvt;
import defpackage.bwwp;
import defpackage.bwwv;
import defpackage.bwwy;
import defpackage.bwxl;
import defpackage.bwxs;
import defpackage.bwxt;
import defpackage.bxbt;
import defpackage.bxbu;
import defpackage.bxby;
import defpackage.byhr;
import defpackage.ejhf;
import defpackage.enre;
import defpackage.fuwt;
import defpackage.fuww;
import defpackage.fvaq;
import defpackage.fvbo;
import defpackage.fvcb;
import defpackage.fvfu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GnssBatchedTransportV1 extends BatchedLocationCallback implements GmsAlarmManagerCompat$OnAlarmListener, bwxt {
    public static final /* synthetic */ int f = 0;
    public final LocationManager a;
    public final List b;
    public GnssLocationListener c;
    public Executor d;
    public bwxl e;
    private final Context g;
    private long h;
    private WorkSource i;
    private bxbu j;
    private final bxby k;

    public GnssBatchedTransportV1(Context context, LocationManager locationManager) {
        fvbo.f(locationManager, "locationManager");
        this.g = context;
        this.a = locationManager;
        this.k = bxbt.a(context);
        new asmb(1, 9);
        this.b = new ArrayList();
    }

    @Override // com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener
    public final void a(bxbu bxbuVar) {
        synchronized (this) {
            try {
                if (this.j != bxbuVar) {
                    return;
                }
                bxby bxbyVar = this.k;
                long elapsedRealtime = SystemClock.elapsedRealtime() + this.h;
                WorkSource workSource = this.i;
                fvbo.c(workSource);
                Executor executor = this.d;
                fvbo.c(executor);
                try {
                    this.j = bxbyVar.b("GnssBatchedTransportV1:periodic_flush", 2, elapsedRealtime, workSource, executor, this);
                    asot asotVar = bwwy.a;
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

    @Override // defpackage.bwxt
    public final void b(bwvt bwvtVar, long j, Executor executor, GnssLocationListener gnssLocationListener) {
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
                asot asotVar = bwwy.a;
                bwvf.c(bwvtVar.a());
                bwvf.c(bwvtVar.c());
                if (fvfu.b(fvfu.h(j, bwxs.a), bwvtVar.c()) < 0) {
                    Context context = this.g;
                    bwxl bwxlVar = new bwxl(context, locationManager);
                    this.e = bwxlVar;
                    fvbo.c(bwxlVar);
                    long c = bwvtVar.c();
                    bwwp g = bwvtVar.g();
                    long e = bwvtVar.e();
                    boolean z = bwvtVar.c;
                    ImmutableWorkSource immutableWorkSource = bwvtVar.e;
                    fvbo.f(g, "quality");
                    fvbo.f(immutableWorkSource, "workSource");
                    bwvt b = bwvs.b(g, 0L, e, c, 1, 0L, z, immutableWorkSource);
                    enre enreVar = enre.a;
                    fvbo.e(enreVar, "directExecutor(...)");
                    bwxlVar.b(b, 0L, enreVar, new GnssLocationListener(context, new fvaq() { // from class: bwwt
                        @Override // defpackage.fvaq
                        public final Object a(Object obj) {
                            fvbo.f((List) obj, "<unused var>");
                            asot asotVar2 = bwwy.a;
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
                            return fuvs.a;
                        }
                    }));
                }
                try {
                } catch (IllegalStateException e2) {
                    ((ejhf) ((ejhf) bwwy.a.i()).s(e2)).x("error registering batched GNSS location request");
                }
                if (locationManager.registerGnssBatchedLocationCallback(fvfu.d(bwvtVar.a()), true, this, new byhr(Looper.getMainLooper()))) {
                    long d = fvfu.d(bwvtVar.c());
                    this.h = d;
                    if (d / fvfu.d(bwvtVar.a()) < gnssBatchSize) {
                        this.i = bwvtVar.e.b();
                        bxby bxbyVar = this.k;
                        long elapsedRealtime = SystemClock.elapsedRealtime() + this.h;
                        WorkSource workSource = this.i;
                        fvbo.c(workSource);
                        try {
                            this.j = bxbyVar.b("GnssBatchedTransportV1:periodic_flush", 2, elapsedRealtime, workSource, executor, this);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    if (bwwv.a.getAndSet(true)) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                ((ejhf) bwwy.a.i()).x("error registering batched GNSS location request");
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.bwxt
    public final void c() {
        synchronized (this) {
            if (this.c == null) {
                throw new IllegalStateException("Check failed.");
            }
            asot asotVar = bwwy.a;
            List list = this.b;
            if (!list.isEmpty()) {
                final List ad = fuwt.ad(list);
                Executor executor = this.d;
                fvbo.c(executor);
                executor.execute(new Runnable() { // from class: bwwu
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = GnssBatchedTransportV1.f;
                        Iterator it = ad.iterator();
                        while (it.hasNext()) {
                            ((fvaf) it.next()).a();
                        }
                    }
                });
            }
            this.i = null;
            bwxl bwxlVar = this.e;
            if (bwxlVar != null) {
                bwxlVar.c();
                this.e = null;
            }
            bxbu bxbuVar = this.j;
            if (bxbuVar != null) {
                bxbuVar.a();
                this.j = null;
            }
            this.c = null;
            this.d = null;
            list.clear();
            bwwv.a.set(false);
        }
    }

    public final void onLocationBatch(final List list) {
        Executor executor;
        fvbo.f(list, "locations");
        final fvcb fvcbVar = new fvcb();
        synchronized (this) {
            executor = this.d;
            if (list.isEmpty()) {
                List list2 = this.b;
                fvcbVar.a = fuwt.ad(list2);
                list2.clear();
            } else {
                fvcbVar.a = fuww.a;
            }
        }
        if (executor == null) {
            return;
        }
        if (!((Collection) fvcbVar.a).isEmpty()) {
            asot asotVar = bwwy.a;
        } else if (list.isEmpty()) {
            return;
        }
        executor.execute(new Runnable() { // from class: bwws
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
                Iterator it = ((Iterable) fvcbVar.a).iterator();
                while (it.hasNext()) {
                    ((fvaf) it.next()).a();
                }
            }
        });
    }
}
