package com.google.android.gms.location.bluestar.jni;

import defpackage.bzkl;
import defpackage.eiig;
import defpackage.ewss;
import defpackage.ewtu;
import defpackage.ewua;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class JniPositionFilter {
    public final long a;
    private final JniBlueStarLogger b;

    public JniPositionFilter(ewss ewssVar, bzkl bzklVar) {
        JniBlueStarLogger jniBlueStarLogger = new JniBlueStarLogger(bzklVar);
        this.b = jniBlueStarLogger;
        this.a = newPositionFilterNative(2, ewssVar.r(), jniBlueStarLogger.a);
    }

    private native void deletePositionFilterNative(long j);

    private native byte[] getPositionNative(long j);

    private native int getSensorRequestNative(long j);

    private native long newPositionFilterNative(int i, byte[] bArr, long j);

    private native void predictToNative(long j, long j2);

    public final ewtu a() {
        byte[] positionNative = getPositionNative(this.a);
        if (positionNative == null) {
            return ewtu.a;
        }
        try {
            fecp y = fecp.y(ewtu.a, positionNative, 0, positionNative.length, febw.a());
            fecp.M(y);
            return (ewtu) y;
        } catch (fedk e) {
            throw new IllegalStateException("Unable to decode position proto", e);
        }
    }

    public native void applyAccelNative(long j, long j2, float f, float f2, float f3);

    public native void applyActivityNative(long j, long j2, byte[] bArr);

    public native void applyGnssNative(long j, long j2, byte[] bArr);

    public native void applyGyroNative(long j, long j2, float f, float f2, float f3);

    public final ewua b() {
        int sensorRequestNative = getSensorRequestNative(this.a);
        ewua ewuaVar = sensorRequestNative != 0 ? sensorRequestNative != 1 ? null : ewua.SENSOR_GNSS : ewua.SENSOR_GNSS_AND_INERTIAL;
        eiig.y(ewuaVar, "Unknown sensor request");
        return ewuaVar;
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
