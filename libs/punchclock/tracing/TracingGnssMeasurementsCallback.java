package com.google.android.gms.libs.punchclock.tracing;

import android.content.Context;
import android.location.GnssMeasurementsEvent;
import android.location.GnssMeasurementsEvent$Callback;
import defpackage.byhw;
import defpackage.byhz;
import defpackage.byik;
import defpackage.egkp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public abstract class TracingGnssMeasurementsCallback extends GnssMeasurementsEvent$Callback implements byik {
    private final byhw a;

    public TracingGnssMeasurementsCallback(Context context) {
        this.a = byhz.c.c(getClass(), 23, context);
    }

    protected abstract void a(GnssMeasurementsEvent gnssMeasurementsEvent);

    public final void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent) {
        egkp k = this.a.k("onGnssMeasurementsReceived");
        try {
            a(gnssMeasurementsEvent);
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
}
