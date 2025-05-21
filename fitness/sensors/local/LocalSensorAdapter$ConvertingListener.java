package com.google.android.gms.fitness.sensors.local;

import android.hardware.Sensor;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import defpackage.bgmp;
import defpackage.bgpd;
import defpackage.bgpi;
import defpackage.bgpj;
import defpackage.bgpk;
import defpackage.bgpo;
import defpackage.fhrw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class LocalSensorAdapter$ConvertingListener extends TracingSensorEventListener {
    public final bgmp a;
    public final fhrw b;
    public final bgpk c;
    public final bgpo d;
    public final /* synthetic */ bgpi e;
    private final bgpd g;
    private final bgpj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalSensorAdapter$ConvertingListener(bgpi bgpiVar, bgmp bgmpVar, bgpd bgpdVar, fhrw fhrwVar, bgpj bgpjVar, bgpk bgpkVar, bgpo bgpoVar) {
        super("LocalSensorAdapter$ConvertingListener", "fitness");
        this.e = bgpiVar;
        this.a = bgmpVar;
        this.g = bgpdVar;
        this.b = fhrwVar;
        this.h = bgpjVar;
        this.c = bgpkVar;
        this.d = bgpoVar;
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
