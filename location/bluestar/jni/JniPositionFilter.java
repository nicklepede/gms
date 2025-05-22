package com.google.android.gms.location.bluestar.jni;

import defpackage.cbtc;
import defpackage.ekvl;
import defpackage.ezhe;
import defpackage.ezig;
import defpackage.ezim;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class JniPositionFilter {
    public final long a;
    private final JniBlueStarLogger b;

    public JniPositionFilter(ezhe ezheVar, cbtc cbtcVar) {
        JniBlueStarLogger jniBlueStarLogger = new JniBlueStarLogger(cbtcVar);
        this.b = jniBlueStarLogger;
        this.a = newPositionFilterNative(2, ezheVar.r(), jniBlueStarLogger.a);
    }

    private native void deletePositionFilterNative(long j);

    private native byte[] getPositionNative(long j);

    private native int getSensorRequestNative(long j);

    private native long newPositionFilterNative(int i, byte[] bArr, long j);

    private native void predictToNative(long j, long j2);

    public final ezig a() {
        byte[] positionNative = getPositionNative(this.a);
        if (positionNative == null) {
            return ezig.a;
        }
        try {
            fgri y = fgri.y(ezig.a, positionNative, 0, positionNative.length, fgqp.a());
            fgri.M(y);
            return (ezig) y;
        } catch (fgsd e) {
            throw new IllegalStateException("Unable to decode position proto", e);
        }
    }

    public native void applyAccelNative(long j, long j2, float f, float f2, float f3);

    public native void applyActivityNative(long j, long j2, byte[] bArr);

    public native void applyGnssNative(long j, long j2, byte[] bArr);

    public native void applyGyroNative(long j, long j2, float f, float f2, float f3);

    public final ezim b() {
        int sensorRequestNative = getSensorRequestNative(this.a);
        ezim ezimVar = sensorRequestNative != 0 ? sensorRequestNative != 1 ? null : ezim.SENSOR_GNSS : ezim.SENSOR_GNSS_AND_INERTIAL;
        ekvl.z(ezimVar, "Unknown sensor request");
        return ezimVar;
    }

    public final void c(long j) {
        predictToNative(this.a, j);
    }

    protected final void finalize() {
        deletePositionFilterNative(this.a);
        JniBlueStarLogger.deleteLogger(this.b.a);
        super.finalize();
    }

    public native void resetNative(long j);
}
