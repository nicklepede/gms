package com.google.android.gms.libs.punchclock.tracing;

import android.content.Context;
import android.location.GnssMeasurementsEvent;
import android.location.GnssMeasurementsEvent$Callback;
import defpackage.caqo;
import defpackage.caqr;
import defpackage.carc;
import defpackage.eixs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public abstract class TracingGnssMeasurementsCallback extends GnssMeasurementsEvent$Callback implements carc {
    private final caqo a;

    public TracingGnssMeasurementsCallback(Context context) {
        this.a = caqr.c.c(getClass(), 23, context);
    }

    protected abstract void a(GnssMeasurementsEvent gnssMeasurementsEvent);

    public final void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent) {
        eixs k = this.a.k("onGnssMeasurementsReceived");
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
