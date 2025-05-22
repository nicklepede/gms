package com.google.android.gms.libs.punchclock.tracing;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import defpackage.caql;
import defpackage.caqn;
import defpackage.caqr;
import defpackage.carc;
import defpackage.eixs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public abstract class TracingSensorEventListener implements SensorEventListener, carc {
    final caql f;

    protected TracingSensorEventListener(Context context) {
        this.f = caqn.c.a(caqr.c.c(getClass(), 17, context));
    }

    public abstract void a(SensorEvent sensorEvent);

    public abstract void b(Sensor sensor);

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        eixs a = this.f.a();
        try {
            b(sensor);
            if (a != null) {
                a.close();
            }
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        eixs a = this.f.a();
        try {
            a(sensorEvent);
            if (a != null) {
                a.close();
            }
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    protected TracingSensorEventListener(String str, String str2) {
        this.f = caqn.c.a(caqr.c.d(getClass(), 17, str2, str));
    }
}
