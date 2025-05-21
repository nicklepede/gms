package com.google.android.gms.location.places.fencing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cafs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PlacefencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cafs();
    public final String a;
    public final PlacefencingFilter b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public PlacefencingRequest(String str, PlacefencingFilter placefencingFilter, int i, int i2, int i3, int i4) {
        this.a = str;
        this.b = placefencingFilter;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.o(parcel, 6, this.f);
        arxc.c(parcel, a);
    }
}
