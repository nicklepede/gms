package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.cahg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class AliasedPlace extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cahg();
    public final String a;
    public final List b;

    public AliasedPlace(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliasedPlace)) {
            return false;
        }
        AliasedPlace aliasedPlace = (AliasedPlace) obj;
        return this.a.equals(aliasedPlace.a) && this.b.equals(aliasedPlace.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("placeId", this.a, arrayList);
        arwa.b("placeAliases", this.b, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.x(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
