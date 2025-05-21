package com.google.android.gms.libs.punchclock.tracing;

import android.content.Context;
import defpackage.byhw;
import defpackage.byhz;
import defpackage.byik;
import defpackage.egkp;
import defpackage.iod;
import defpackage.ioe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public abstract class TracingGnssStatusCallback extends iod implements byik {
    private final byhw a;

    public TracingGnssStatusCallback(Context context) {
        this.a = byhz.c.c(getClass(), 23, context);
    }

    @Override // defpackage.iod
    public final void a(ioe ioeVar) {
        egkp k = this.a.k("onSatelliteStatusChanged");
        try {
            e(ioeVar);
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

    @Override // defpackage.iod
    public final void b() {
        egkp k = this.a.k("onStarted");
        if (k != null) {
            k.close();
        }
    }

    @Override // defpackage.iod
    public final void c() {
        egkp k = this.a.k("onStopped");
        if (k != null) {
            k.close();
        }
    }

    @Override // defpackage.iod
    public final void d() {
        egkp k = this.a.k("onFirstFix");
        if (k != null) {
            k.close();
        }
    }

    protected abstract void e(ioe ioeVar);
}
