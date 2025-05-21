package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.crpm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class DlTdoaMeasurementParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crpm();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(dlTdoaMeasurementParams.a)) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(dlTdoaMeasurementParams.b)) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(dlTdoaMeasurementParams.c)) && arwb.b(Integer.valueOf(this.d), Integer.valueOf(dlTdoaMeasurementParams.d)) && arwb.b(Integer.valueOf(this.e), Integer.valueOf(dlTdoaMeasurementParams.e)) && arwb.b(Long.valueOf(this.f), Long.valueOf(dlTdoaMeasurementParams.f)) && arwb.b(Long.valueOf(this.g), Long.valueOf(dlTdoaMeasurementParams.g)) && arwb.b(Float.valueOf(this.h), Float.valueOf(dlTdoaMeasurementParams.h)) && arwb.b(Float.valueOf(this.i), Float.valueOf(dlTdoaMeasurementParams.i)) && arwb.b(Long.valueOf(this.j), Long.valueOf(dlTdoaMeasurementParams.j)) && arwb.b(Long.valueOf(this.k), Long.valueOf(dlTdoaMeasurementParams.k)) && arwb.b(Integer.valueOf(this.l), Integer.valueOf(dlTdoaMeasurementParams.l)) && Arrays.equals(this.m, dlTdoaMeasurementParams.m) && Arrays.equals(this.n, dlTdoaMeasurementParams.n)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.q(parcel, 6, this.f);
        arxc.q(parcel, 7, this.g);
        arxc.l(parcel, 8, this.h);
        arxc.l(parcel, 9, this.i);
        arxc.q(parcel, 10, this.j);
        arxc.q(parcel, 11, this.k);
        arxc.o(parcel, 12, this.l);
        arxc.i(parcel, 13, this.m, false);
        arxc.i(parcel, 14, this.n, false);
        arxc.c(parcel, a);
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
