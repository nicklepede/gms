package com.google.android.gms.home.matter.beacon;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bngo;
import defpackage.elgo;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class BeaconData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bngo();
    public final List a;
    public final List b;
    public final List c;

    public BeaconData(List list, List list2, List list3) {
        this.a = elgo.i(list);
        this.b = elgo.i(list2);
        this.c = elgo.i(list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeaconData)) {
            return false;
        }
        BeaconData beaconData = (BeaconData) obj;
        return this.a.equals(beaconData.a) && this.b.equals(beaconData.b) && this.c.equals(beaconData.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.y(parcel, 2, this.b, false);
        atzr.y(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
