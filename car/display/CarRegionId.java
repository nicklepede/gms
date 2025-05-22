package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.anap;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class CarRegionId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anap();
    public final int a;
    public final CarDisplayId b;

    public CarRegionId(int i, CarDisplayId carDisplayId) {
        this.a = i;
        this.b = carDisplayId;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CarRegionId)) {
            return false;
        }
        CarRegionId carRegionId = (CarRegionId) obj;
        return this.b.equals(carRegionId.b) && carRegionId.a == this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        return "CarRegionId{regionId=" + this.a + " carDisplayId=" + String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
