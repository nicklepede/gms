package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cbqe;
import defpackage.ekvl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DeviceOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cbqe();
    public final float a;
    public final float b;
    public final long c;
    public final byte d;
    public final float e;
    public final float f;
    private final float[] g;

    public DeviceOrientation(float[] fArr, float f, float f2, long j, byte b, float f3, float f4) {
        a(fArr);
        ekvl.a(j >= 0);
        this.g = fArr;
        float f5 = f % 360.0f;
        this.a = f5 < 0.0f ? f5 + 360.0f : f5;
        this.b = e(f2);
        this.e = f3;
        this.f = e(f4);
        this.c = j;
        this.d = (byte) (((byte) (((byte) (b | 16)) | 4)) | 8);
    }

    public static void a(float[] fArr) {
        ekvl.b(fArr != null && fArr.length == 4, "Input attitude array should be of length 4.");
        ekvl.b((Float.isNaN(fArr[0]) || Float.isNaN(fArr[1]) || Float.isNaN(fArr[2]) || Float.isNaN(fArr[3])) ? false : true, "Input attitude cannot contain NaNs.");
    }

    private static float e(float f) {
        return Math.max(0.0f, Math.min(f, 180.0f));
    }

    public final boolean b() {
        return (this.d & 64) != 0;
    }

    public final boolean c() {
        return (this.d & 32) != 0;
    }

    public final float[] d() {
        return (float[]) this.g.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientation)) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) obj;
        return Float.compare(this.a, deviceOrientation.a) == 0 && Float.compare(this.b, deviceOrientation.b) == 0 && (c() == deviceOrientation.c() && (!c() || Float.compare(this.e, deviceOrientation.e) == 0)) && (b() == deviceOrientation.b() && (!b() || Float.compare(this.f, deviceOrientation.f) == 0)) && this.c == deviceOrientation.c && Arrays.equals(this.g, deviceOrientation.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.f), Long.valueOf(this.c), this.g, Byte.valueOf(this.d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientation[attitude=");
        sb.append(Arrays.toString(this.g));
        sb.append(", headingDegrees=");
        sb.append(this.a);
        sb.append(", headingErrorDegrees=");
        sb.append(this.b);
        if (b()) {
            sb.append(", conservativeHeadingErrorDegrees=");
            sb.append(this.f);
        }
        sb.append(", elapsedRealtimeNs=");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.m(parcel, 1, d(), false);
        atzr.l(parcel, 4, this.a);
        atzr.l(parcel, 5, this.b);
        atzr.q(parcel, 6, this.c);
        atzr.h(parcel, 7, this.d);
        atzr.l(parcel, 8, this.e);
        atzr.l(parcel, 9, this.f);
        atzr.c(parcel, a);
    }
}
