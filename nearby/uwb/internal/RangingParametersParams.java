package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ctzv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RangingParametersParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctzv();
    public int a;
    public int b;
    public byte[] c;
    public UwbComplexChannelParams d;
    public int e;
    public UwbDeviceParams[] f;
    public int g;
    public byte[] h;
    public UwbDeviceParams i;
    public RangeDataNtfConfigParams j;
    public int k;
    public int l;
    public boolean m;
    public RangeLimitsConfigParams n;

    public RangingParametersParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RangingParametersParams) {
            RangingParametersParams rangingParametersParams = (RangingParametersParams) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(rangingParametersParams.a)) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(rangingParametersParams.b)) && Arrays.equals(this.c, rangingParametersParams.c) && atyq.b(this.d, rangingParametersParams.d) && atyq.b(Integer.valueOf(this.e), Integer.valueOf(rangingParametersParams.e)) && Arrays.equals(this.f, rangingParametersParams.f) && atyq.b(Integer.valueOf(this.g), Integer.valueOf(rangingParametersParams.g)) && Arrays.equals(this.h, rangingParametersParams.h) && atyq.b(this.i, rangingParametersParams.i) && atyq.b(this.j, rangingParametersParams.j) && atyq.b(Integer.valueOf(this.k), Integer.valueOf(rangingParametersParams.k)) && atyq.b(Integer.valueOf(this.l), Integer.valueOf(rangingParametersParams.l)) && atyq.b(Boolean.valueOf(this.m), Boolean.valueOf(rangingParametersParams.m)) && atyq.b(this.n, rangingParametersParams.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c)), this.d, Integer.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(this.g), Integer.valueOf(Arrays.hashCode(this.h)), this.i, this.j, Integer.valueOf(this.k), Integer.valueOf(this.l), Boolean.valueOf(this.m), this.n});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.i(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.o(parcel, 5, this.e);
        atzr.J(parcel, 6, this.f, i);
        atzr.o(parcel, 7, this.g);
        atzr.i(parcel, 8, this.h, false);
        atzr.t(parcel, 9, this.i, i, false);
        atzr.t(parcel, 10, this.j, i, false);
        atzr.o(parcel, 11, this.k);
        atzr.o(parcel, 12, this.l);
        atzr.e(parcel, 13, this.m);
        atzr.t(parcel, 14, this.n, i, false);
        atzr.c(parcel, a);
    }

    public RangingParametersParams(int i, int i2, byte[] bArr, UwbComplexChannelParams uwbComplexChannelParams, int i3, UwbDeviceParams[] uwbDeviceParamsArr, int i4, byte[] bArr2, UwbDeviceParams uwbDeviceParams, RangeDataNtfConfigParams rangeDataNtfConfigParams, int i5, int i6, boolean z, RangeLimitsConfigParams rangeLimitsConfigParams) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
        this.d = uwbComplexChannelParams;
        this.e = i3;
        this.f = uwbDeviceParamsArr;
        this.g = i4;
        this.h = bArr2;
        this.i = uwbDeviceParams;
        this.j = rangeDataNtfConfigParams;
        this.k = i5;
        this.l = i6;
        this.m = z;
        this.n = rangeLimitsConfigParams;
    }
}
