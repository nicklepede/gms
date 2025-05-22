package com.google.android.gms.location.weather.collector;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import com.google.android.gms.location.weather.collector.PressureProvider;
import defpackage.aupz;
import defpackage.ccyo;
import defpackage.eqgo;
import defpackage.ffbr;
import defpackage.ffbs;
import defpackage.fsha;
import defpackage.fsmx;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class PressureProvider extends TracingSensorEventListener implements ffbr {
    public final SensorManager a;
    public final Sensor b;
    public final ccyo c;
    public boolean d;
    private final ffbs e;
    private final eqgo g;

    public PressureProvider(SensorManager sensorManager, ffbs ffbsVar, ccyo ccyoVar) {
        super("PressureProvider", "location");
        this.d = false;
        this.a = sensorManager;
        this.c = ccyoVar;
        this.e = ffbsVar;
        this.b = sensorManager.getDefaultSensor(6);
        aupz aupzVar = new aupz(1, 9);
        this.g = aupzVar;
        if (fsha.c() && fsmx.k()) {
            ffbsVar.c(this, aupzVar);
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent) {
        final float f = sensorEvent.values[0];
        if (sensorEvent.sensor.getType() != 6) {
            return;
        }
        final long millis = TimeUnit.NANOSECONDS.toMillis(sensorEvent.timestamp);
        if (Float.isNaN(f)) {
            return;
        }
        this.g.execute(new Runnable() { // from class: ccyn
            @Override // java.lang.Runnable
            public final void run() {
                PressureProvider.this.c.c(millis, f);
            }
        });
    }

    public final void c() {
        if (this.d) {
            this.d = false;
            if (this.b != null) {
                this.a.unregisterListener(this);
            }
            if (fsha.c()) {
                this.e.b(this);
            }
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor) {
    }
}
