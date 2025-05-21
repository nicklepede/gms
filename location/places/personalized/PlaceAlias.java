package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cahq;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes5.dex */
public class PlaceAlias extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cahq();
    public static final PlaceAlias a = new PlaceAlias("Home");
    public final String b;

    public PlaceAlias(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceAlias) {
            return arwb.b(this.b, ((PlaceAlias) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("alias", this.b, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a2 = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.c(parcel, a2);
    }
}
