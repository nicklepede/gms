package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amrx;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarSensorEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amrx();
    public final int a;
    public final int b;
    public final long c;
    public final float[] d;
    public final byte[] e;

    public CarSensorEvent(int i, int i2, long j, float[] fArr, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = fArr;
        this.e = bArr;
    }

    public static int a(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] << 8;
        int i4 = bArr[i + 2] << 16;
        return ((bArr[i + 3] << 24) & (-16777216)) | (65280 & i3) | i2 | (16711680 & i4);
    }

    public static void c(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    public final void b(int i) {
        int i2 = this.b;
        if (i2 != i) {
            throw new UnsupportedOperationException(String.format("Invalid sensor type: expected %d, got %d", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[type:");
        sb.append(Integer.toHexString(this.b));
        sb.append("timestamp:");
        sb.append(this.c);
        float[] fArr = this.d;
        if (fArr != null && (fArr.length) > 0) {
            sb.append(" float values:");
            for (float f : fArr) {
                sb.append(" ");
                sb.append(f);
            }
        }
        byte[] bArr = this.e;
        if (bArr != null && (bArr.length) > 0) {
            sb.append(" byte values:");
            for (byte b : bArr) {
                sb.append(" ");
                sb.append((int) b);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.b);
        atzr.q(parcel, 2, this.c);
        atzr.m(parcel, 3, this.d, false);
        atzr.i(parcel, 4, this.e, false);
        atzr.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        atzr.c(parcel, a);
    }

    public CarSensorEvent(int i, long j, float[] fArr, byte[] bArr) {
        this.a = 3;
        this.b = i;
        this.c = j;
        this.d = fArr;
        this.e = bArr;
    }

    public CarSensorEvent(int i, long j, int i2, int i3) {
        this.a = 3;
        this.b = i;
        this.c = j;
        this.d = new float[i2];
        this.e = new byte[i3];
    }
}
