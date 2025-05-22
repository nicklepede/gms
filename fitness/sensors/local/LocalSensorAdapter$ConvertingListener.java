package com.google.android.gms.fitness.sensors.local;

import android.hardware.Sensor;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import defpackage.birf;
import defpackage.bitt;
import defpackage.bity;
import defpackage.bitz;
import defpackage.biua;
import defpackage.biue;
import defpackage.fkht;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class LocalSensorAdapter$ConvertingListener extends TracingSensorEventListener {
    public final birf a;
    public final fkht b;
    public final biua c;
    public final biue d;
    public final /* synthetic */ bity e;
    private final bitt g;
    private final bitz h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalSensorAdapter$ConvertingListener(bity bityVar, birf birfVar, bitt bittVar, fkht fkhtVar, bitz bitzVar, biua biuaVar, biue biueVar) {
        super("LocalSensorAdapter$ConvertingListener", "fitness");
        this.e = bityVar;
        this.a = birfVar;
        this.g = bittVar;
        this.b = fkhtVar;
        this.h = bitzVar;
        this.c = biuaVar;
        this.d = biueVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:
    
        if (r7 <= r2) goto L10;
     */
    @Override // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final android.hardware.SensorEvent r18) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.sensors.local.LocalSensorAdapter$ConvertingListener.a(android.hardware.SensorEvent):void");
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
    public final void b(Sensor sensor) {
    }
}
