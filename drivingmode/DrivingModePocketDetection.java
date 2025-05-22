package com.google.android.gms.drivingmode;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import defpackage.azqz;
import defpackage.azrb;
import defpackage.azrf;
import defpackage.azug;
import defpackage.eokt;
import defpackage.eoku;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DrivingModePocketDetection extends TracingSensorEventListener {
    public final Sensor a;
    public final SensorManager b;
    public azrb c;
    private final float d;

    public DrivingModePocketDetection(Context context) {
        super("DrivingModePocketDetection", "drivingmode");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        this.a = defaultSensor;
        if (defaultSensor != null) {
            this.d = Math.min(defaultSensor.getMaximumRange(), 5.0f);
            return;
        }
        this.d = 5.0f;
        azug.b();
        new azqz(context).a(eoku.DRIVING_MODE, eokt.DRIVING_MODE_NULL_PROXIMITY_SENSOR);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent) {
        azrb azrbVar;
        if (sensorEvent.values[0] < this.d || (azrbVar = this.c) == null) {
            return;
        }
        azrf azrfVar = azrbVar.a;
        if (SystemClock.elapsedRealtime() <= azrfVar.f) {
            azrfVar.c();
        }
        c();
    }

    public final void c() {
        this.c = null;
        this.b.unregisterListener(this);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor) {
    }
}
