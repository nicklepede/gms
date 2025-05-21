package com.google.android.gms.location.weather.collector;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import com.google.android.gms.location.weather.collector.PressureProvider;
import defpackage.asmf;
import defpackage.capy;
import defpackage.ensv;
import defpackage.fcna;
import defpackage.fcnb;
import defpackage.fpni;
import defpackage.fptf;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class PressureProvider extends TracingSensorEventListener implements fcna {
    public final SensorManager a;
    public final Sensor b;
    public final capy c;
    public boolean d;
    private final fcnb e;
    private final ensv g;

    public PressureProvider(SensorManager sensorManager, fcnb fcnbVar, capy capyVar) {
        super("PressureProvider", "location");
        this.d = false;
        this.a = sensorManager;
        this.c = capyVar;
        this.e = fcnbVar;
        this.b = sensorManager.getDefaultSensor(6);
        asmf asmfVar = new asmf(1, 9);
        this.g = asmfVar;
        if (fpni.c() && fptf.k()) {
            fcnbVar.c(this, asmfVar);
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
        this.g.execute(new Runnable() { // from class: capx
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
            if (fpni.c()) {
                this.e.b(this);
            }
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor) {
    }
}
