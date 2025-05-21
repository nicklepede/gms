package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.crqq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RangingParametersParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crqq();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(rangingParametersParams.a)) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(rangingParametersParams.b)) && Arrays.equals(this.c, rangingParametersParams.c) && arwb.b(this.d, rangingParametersParams.d) && arwb.b(Integer.valueOf(this.e), Integer.valueOf(rangingParametersParams.e)) && Arrays.equals(this.f, rangingParametersParams.f) && arwb.b(Integer.valueOf(this.g), Integer.valueOf(rangingParametersParams.g)) && Arrays.equals(this.h, rangingParametersParams.h) && arwb.b(this.i, rangingParametersParams.i) && arwb.b(this.j, rangingParametersParams.j) && arwb.b(Integer.valueOf(this.k), Integer.valueOf(rangingParametersParams.k)) && arwb.b(Integer.valueOf(this.l), Integer.valueOf(rangingParametersParams.l)) && arwb.b(Boolean.valueOf(this.m), Boolean.valueOf(rangingParametersParams.m)) && arwb.b(this.n, rangingParametersParams.n)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.i(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.o(parcel, 5, this.e);
        arxc.J(parcel, 6, this.f, i);
        arxc.o(parcel, 7, this.g);
        arxc.i(parcel, 8, this.h, false);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.t(parcel, 10, this.j, i, false);
        arxc.o(parcel, 11, this.k);
        arxc.o(parcel, 12, this.l);
        arxc.e(parcel, 13, this.m);
        arxc.t(parcel, 14, this.n, i, false);
        arxc.c(parcel, a);
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
