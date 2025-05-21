package com.google.android.gms.trustlet.place.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import defpackage.dgur;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public abstract class LightPlace implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dgur();

    public abstract LatLng a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(b());
        parcel.writeString(c());
        parcel.writeString(d());
        LatLng a = a();
        if (a != null) {
            parcel.writeDouble(a.a);
            parcel.writeDouble(a.b);
        }
    }
}
