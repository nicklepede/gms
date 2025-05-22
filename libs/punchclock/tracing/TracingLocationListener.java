package com.google.android.gms.libs.punchclock.tracing;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import defpackage.caqo;
import defpackage.caqr;
import defpackage.carc;
import defpackage.eixs;
import defpackage.iqb;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public abstract class TracingLocationListener implements iqb, carc {
    private final caqo a;

    public TracingLocationListener(Context context) {
        this.a = caqr.c.c(getClass(), 23, context);
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
        eixs k = this.a.k("onFlushComplete");
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
        eixs k = this.a.k("onLocationChanged");
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
        this.a = caqr.c.d(getClass(), 23, "location", str);
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(List list) {
        eixs k = this.a.k("onLocationChanged");
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
