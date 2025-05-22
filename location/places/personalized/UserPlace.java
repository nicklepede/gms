package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.ccqk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class UserPlace extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccqk();
    public final String a;
    public final List b;

    public UserPlace(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPlace)) {
            return false;
        }
        UserPlace userPlace = (UserPlace) obj;
        return this.a.equals(userPlace.a) && this.b.equals(userPlace.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("placeId", this.a, arrayList);
        atyp.b("userPlaceTypes", this.b, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.E(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
