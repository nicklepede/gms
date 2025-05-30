package com.google.android.gms.libs.punchclock.tracing;

import android.hardware.Sensor;
import android.hardware.SensorEventListener2;
import defpackage.eixs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public abstract class TracingSensorEventListener2 extends TracingSensorEventListener implements SensorEventListener2 {
    protected TracingSensorEventListener2() {
        super("BatchSignalCollector", "location");
    }

    public abstract void c();

    @Override // android.hardware.SensorEventListener2
    public final void onFlushCompleted(Sensor sensor) {
        eixs a = this.f.a();
        try {
            c();
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
}
