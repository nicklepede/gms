package com.google.android.gms.fitness.sensors.local;

import android.hardware.Sensor;
import android.hardware.SensorEventListener2;
import defpackage.bgmp;
import defpackage.bgpd;
import defpackage.bgpi;
import defpackage.bgpj;
import defpackage.bgpk;
import defpackage.bgpo;
import defpackage.entj;
import defpackage.fhrw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class LocalSensorAdapter$ConvertingListenerKitKat extends LocalSensorAdapter$ConvertingListener implements SensorEventListener2 {
    private entj g;

    public LocalSensorAdapter$ConvertingListenerKitKat(bgpi bgpiVar, bgmp bgmpVar, bgpd bgpdVar, fhrw fhrwVar, bgpj bgpjVar, bgpk bgpkVar, bgpo bgpoVar) {
        super(bgpiVar, bgmpVar, bgpdVar, fhrwVar, bgpjVar, bgpkVar, bgpoVar);
    }

    public final synchronized void c(entj entjVar) {
        this.g = entjVar;
    }

    @Override // android.hardware.SensorEventListener2
    public final synchronized void onFlushCompleted(Sensor sensor) {
        entj entjVar = this.g;
        if (entjVar != null) {
            entjVar.q(null);
            this.g = null;
        }
    }
}
