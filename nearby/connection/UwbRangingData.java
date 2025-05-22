package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chno;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UwbRangingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chno();
    public int a;
    public int b;
    public int c;
    public boolean d;

    public UwbRangingData() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UwbRangingData) {
            UwbRangingData uwbRangingData = (UwbRangingData) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(uwbRangingData.a)) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(uwbRangingData.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(uwbRangingData.c)) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(uwbRangingData.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        return "UwbRangingData{rawDistance=" + this.a + ", rawAngleOfArrivalAzimuth=" + this.b + ", rawAngleOfArrivalPolar=" + this.c + ", isValidAngleOfArrivalData=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public UwbRangingData(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }
}
