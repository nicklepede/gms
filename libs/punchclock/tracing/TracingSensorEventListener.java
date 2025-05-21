package com.google.android.gms.libs.punchclock.tracing;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import defpackage.byht;
import defpackage.byhv;
import defpackage.byhz;
import defpackage.byik;
import defpackage.egkp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public abstract class TracingSensorEventListener implements SensorEventListener, byik {
    final byht f;

    protected TracingSensorEventListener(Context context) {
        this.f = byhv.c.a(byhz.c.c(getClass(), 17, context));
    }

    public abstract void a(SensorEvent sensorEvent);

    public abstract void b(Sensor sensor);

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        egkp a = this.f.a();
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
        egkp a = this.f.a();
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
        this.f = byhv.c.a(byhz.c.d(getClass(), 17, str2, str));
    }
}
