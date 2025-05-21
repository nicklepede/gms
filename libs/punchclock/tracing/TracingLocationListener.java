package com.google.android.gms.libs.punchclock.tracing;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import defpackage.byhw;
import defpackage.byhz;
import defpackage.byik;
import defpackage.egkp;
import defpackage.iol;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public abstract class TracingLocationListener implements iol, byik {
    private final byhw a;

    public TracingLocationListener(Context context) {
        this.a = byhz.c.c(getClass(), 23, context);
    }

    protected abstract void a(Location location);

    protected void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((Location) it.next());
        }
    }

    @Override // android.location.LocationListener
    public final void onFlushComplete(int i) {
        egkp k = this.a.k("onFlushComplete");
        try {
            c(i);
            if (k != null) {
                k.close();
            }
        } catch (Throwable th) {
            if (k != null) {
                try {
                    k.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        egkp k = this.a.k("onLocationChanged");
        try {
            a(location);
            if (k != null) {
                k.close();
            }
        } catch (Throwable th) {
            if (k != null) {
                try {
                    k.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public TracingLocationListener(String str) {
        this.a = byhz.c.d(getClass(), 23, "location", str);
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(List list) {
        egkp k = this.a.k("onLocationChanged");
        try {
            b(list);
            if (k != null) {
                k.close();
            }
        } catch (Throwable th) {
            if (k != null) {
                try {
                    k.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    protected void c(int i) {
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
