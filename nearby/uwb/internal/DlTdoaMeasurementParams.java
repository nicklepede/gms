package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ctyr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DlTdoaMeasurementParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctyr();
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public float h;
    public float i;
    public long j;
    public long k;
    public int l;
    public byte[] m;
    public byte[] n;

    private DlTdoaMeasurementParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DlTdoaMeasurementParams) {
            DlTdoaMeasurementParams dlTdoaMeasurementParams = (DlTdoaMeasurementParams) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(dlTdoaMeasurementParams.a)) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(dlTdoaMeasurementParams.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(dlTdoaMeasurementParams.c)) && atyq.b(Integer.valueOf(this.d), Integer.valueOf(dlTdoaMeasurementParams.d)) && atyq.b(Integer.valueOf(this.e), Integer.valueOf(dlTdoaMeasurementParams.e)) && atyq.b(Long.valueOf(this.f), Long.valueOf(dlTdoaMeasurementParams.f)) && atyq.b(Long.valueOf(this.g), Long.valueOf(dlTdoaMeasurementParams.g)) && atyq.b(Float.valueOf(this.h), Float.valueOf(dlTdoaMeasurementParams.h)) && atyq.b(Float.valueOf(this.i), Float.valueOf(dlTdoaMeasurementParams.i)) && atyq.b(Long.valueOf(this.j), Long.valueOf(dlTdoaMeasurementParams.j)) && atyq.b(Long.valueOf(this.k), Long.valueOf(dlTdoaMeasurementParams.k)) && atyq.b(Integer.valueOf(this.l), Integer.valueOf(dlTdoaMeasurementParams.l)) && Arrays.equals(this.m, dlTdoaMeasurementParams.m) && Arrays.equals(this.n, dlTdoaMeasurementParams.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Float.valueOf(this.h), Float.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(Arrays.hashCode(this.m)), Integer.valueOf(Arrays.hashCode(this.n))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.q(parcel, 6, this.f);
        atzr.q(parcel, 7, this.g);
        atzr.l(parcel, 8, this.h);
        atzr.l(parcel, 9, this.i);
        atzr.q(parcel, 10, this.j);
        atzr.q(parcel, 11, this.k);
        atzr.o(parcel, 12, this.l);
        atzr.i(parcel, 13, this.m, false);
        atzr.i(parcel, 14, this.n, false);
        atzr.c(parcel, a);
    }

    public DlTdoaMeasurementParams(int i, int i2, int i3, int i4, int i5, long j, long j2, float f, float f2, long j3, long j4, int i6, byte[] bArr, byte[] bArr2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = j;
        this.g = j2;
        this.h = f;
        this.i = f2;
        this.j = j3;
        this.k = j4;
        this.l = i6;
        this.m = bArr;
        this.n = bArr2;
    }
}
