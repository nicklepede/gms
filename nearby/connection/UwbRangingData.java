package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cfgc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class UwbRangingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cfgc();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(uwbRangingData.a)) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(uwbRangingData.b)) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(uwbRangingData.c)) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(uwbRangingData.d))) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public UwbRangingData(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }
}
