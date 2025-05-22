package com.google.android.gms.fitness.sensors.local;

import android.hardware.Sensor;
import android.hardware.SensorEventListener2;
import defpackage.birf;
import defpackage.bitt;
import defpackage.bity;
import defpackage.bitz;
import defpackage.biua;
import defpackage.biue;
import defpackage.eqhc;
import defpackage.fkht;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class LocalSensorAdapter$ConvertingListenerKitKat extends LocalSensorAdapter$ConvertingListener implements SensorEventListener2 {
    private eqhc g;

    public LocalSensorAdapter$ConvertingListenerKitKat(bity bityVar, birf birfVar, bitt bittVar, fkht fkhtVar, bitz bitzVar, biua biuaVar, biue biueVar) {
        super(bityVar, birfVar, bittVar, fkhtVar, bitzVar, biuaVar, biueVar);
    }

    public final synchronized void c(eqhc eqhcVar) {
        this.g = eqhcVar;
    }

    @Override // android.hardware.SensorEventListener2
    public final synchronized void onFlushCompleted(Sensor sensor) {
        eqhc eqhcVar = this.g;
        if (eqhcVar != null) {
            eqhcVar.q(null);
            this.g = null;
        }
    }
}
