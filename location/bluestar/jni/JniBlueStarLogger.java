package com.google.android.gms.location.bluestar.jni;

import com.google.android.gms.location.bluestar.jni.JniBlueStarLogger;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.bzkl;
import defpackage.ewsu;
import defpackage.fuuq;
import defpackage.fwac;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class JniBlueStarLogger {
    public final long a = nativeNewJniBlueStarLogger();
    private final bzkl b;

    public JniBlueStarLogger(bzkl bzklVar) {
        this.b = bzklVar;
    }

    public static native void deleteLogger(long j);

    public static native byte[] getMetadata(long j);

    private native long nativeNewJniBlueStarLogger();

    void log(int i, final long j) {
        int i2;
        switch (i) {
            case 0:
                i2 = 2;
                break;
            case 1:
                i2 = 3;
                break;
            case 2:
                i2 = 4;
                break;
            case 3:
                i2 = 5;
                break;
            case 4:
                i2 = 6;
                break;
            case 5:
                i2 = 7;
                break;
            case 6:
                i2 = 8;
                break;
            case 7:
                i2 = 9;
                break;
            case 8:
                i2 = 10;
                break;
            case 9:
                i2 = 11;
                break;
            case 10:
                i2 = 12;
                break;
            case 11:
                i2 = 13;
                break;
            case 12:
                i2 = 14;
                break;
            case 13:
                i2 = 15;
                break;
            case 14:
                i2 = 16;
                break;
            case 15:
                i2 = 17;
                break;
            case 16:
                i2 = 18;
                break;
            case fwac.q /* 17 */:
                i2 = 19;
                break;
            case 18:
                i2 = 20;
                break;
            case 19:
                i2 = 21;
                break;
            case fwac.t /* 20 */:
                i2 = 22;
                break;
            case fwac.u /* 21 */:
                i2 = 23;
                break;
            case fwac.v /* 22 */:
                i2 = 24;
                break;
            case fwac.w /* 23 */:
                i2 = 25;
                break;
            case fwac.x /* 24 */:
                i2 = 26;
                break;
            case fwac.y /* 25 */:
                i2 = 27;
                break;
            case 26:
                i2 = 28;
                break;
            case fwac.A /* 27 */:
                i2 = 29;
                break;
            case fwac.B /* 28 */:
                i2 = 30;
                break;
            case fwac.C /* 29 */:
                i2 = 31;
                break;
            case fwac.D /* 30 */:
                i2 = 32;
                break;
            case fwac.E /* 31 */:
                i2 = 33;
                break;
            case 32:
                i2 = 34;
                break;
            case fwac.G /* 33 */:
                i2 = 35;
                break;
            case fwac.H /* 34 */:
                i2 = 36;
                break;
            case fwac.I /* 35 */:
            default:
                i2 = 0;
                break;
            case fwac.J /* 36 */:
                i2 = 38;
                break;
            case fwac.K /* 37 */:
                i2 = 39;
                break;
            case fwac.L /* 38 */:
                i2 = 40;
                break;
            case fwac.M /* 39 */:
                i2 = 41;
                break;
            case 40:
                i2 = 42;
                break;
            case 41:
                i2 = 43;
                break;
            case 42:
                i2 = 44;
                break;
            case 43:
                i2 = 45;
                break;
            case 44:
                i2 = 46;
                break;
            case 45:
                i2 = 47;
                break;
            case 46:
                i2 = 48;
                break;
            case 47:
                i2 = 49;
                break;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_EMAIL_SUBJECT /* 48 */:
                i2 = 50;
                break;
        }
        if (i2 == 0) {
            i2 = 2;
        }
        fuuq fuuqVar = new fuuq() { // from class: bzki
            @Override // defpackage.fuuq, defpackage.fuup
            public final Object a() {
                byte[] metadata = JniBlueStarLogger.getMetadata(j);
                try {
                    fecp y = fecp.y(ewsu.a, metadata, 0, metadata.length, febw.a());
                    fecp.M(y);
                    return (ewsu) y;
                } catch (fedk e) {
                    throw new IllegalArgumentException("Unable to decode log metadata", e);
                }
            }
        };
        if (i2 == 15) {
            ewsu ewsuVar = (ewsu) fuuqVar.a();
            throw new IllegalStateException("BlueStarLogger assertion ".concat(String.valueOf(ewsuVar.b == 2 ? (String) ewsuVar.c : "")));
        }
        this.b.b(i2, fuuqVar);
    }
}
