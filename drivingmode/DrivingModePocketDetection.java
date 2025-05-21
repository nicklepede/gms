package com.google.android.gms.drivingmode;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import defpackage.axmz;
import defpackage.axnb;
import defpackage.axnf;
import defpackage.axqg;
import defpackage.elxf;
import defpackage.elxg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DrivingModePocketDetection extends TracingSensorEventListener {
    public final Sensor a;
    public final SensorManager b;
    public axnb c;
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
        axqg.b();
        new axmz(context).a(elxg.DRIVING_MODE, elxf.DRIVING_MODE_NULL_PROXIMITY_SENSOR);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void a(SensorEvent sensorEvent) {
        axnb axnbVar;
        if (sensorEvent.values[0] < this.d || (axnbVar = this.c) == null) {
            return;
        }
        axnf axnfVar = axnbVar.a;
        if (SystemClock.elapsedRealtime() <= axnfVar.f) {
            axnfVar.c();
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
