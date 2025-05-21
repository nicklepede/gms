package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.cahs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes5.dex */
public class PlaceUserData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cahs();
    public final String a;
    public final String b;
    public final List c;

    public PlaceUserData(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceUserData)) {
            return false;
        }
        PlaceUserData placeUserData = (PlaceUserData) obj;
        return this.a.equals(placeUserData.a) && this.b.equals(placeUserData.b) && this.c.equals(placeUserData.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("accountName", this.a, arrayList);
        arwa.b("placeId", this.b, arrayList);
        arwa.b("placeAliases", this.c, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.y(parcel, 6, this.c, false);
        arxc.c(parcel, a);
    }
}
