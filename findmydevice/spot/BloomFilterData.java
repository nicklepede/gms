package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bewf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class BloomFilterData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bewf();
    public byte[] a;
    public byte[] b;

    public BloomFilterData() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BloomFilterData) {
            BloomFilterData bloomFilterData = (BloomFilterData) obj;
            if (Arrays.equals(this.a, bloomFilterData.a) && Arrays.equals(this.b, bloomFilterData.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, this.a, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public BloomFilterData(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }
}
