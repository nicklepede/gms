package com.google.android.gms.car.display;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.akzd;
import defpackage.arxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CarRegionGroup extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akzd();
    public final int a;
    public final CarDisplayId b;
    public final CarRegionId c;

    public CarRegionGroup(int i, CarDisplayId carDisplayId, CarRegionId carRegionId) {
        this.a = i;
        this.b = carDisplayId;
        this.c = carRegionId;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CarRegionGroup)) {
            return false;
        }
        CarRegionGroup carRegionGroup = (CarRegionGroup) obj;
        return this.b.equals(carRegionGroup.b) && this.c.equals(carRegionGroup.c) && carRegionGroup.a == this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    public final String toString() {
        CarRegionId carRegionId = this.c;
        return "CarRegionGroup{groupId=" + this.a + ", carDisplayId=" + String.valueOf(this.b) + ", primaryRegionOfGroup=" + String.valueOf(carRegionId) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}
