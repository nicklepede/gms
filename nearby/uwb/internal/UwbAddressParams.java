package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.crqw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class UwbAddressParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crqw();
    public byte[] a;
    public int b;

    public UwbAddressParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UwbAddressParams) {
            UwbAddressParams uwbAddressParams = (UwbAddressParams) obj;
            if (Arrays.equals(this.a, uwbAddressParams.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(uwbAddressParams.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, this.a, false);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public UwbAddressParams(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }
}
