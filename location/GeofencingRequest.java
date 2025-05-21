package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bzhw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bzhw();
    public final List a;
    public final int b;
    public final String c;

    public GeofencingRequest(List list, int i, String str) {
        this.a = list;
        this.b = i;
        this.c = str;
    }

    public final GeofencingRequest a(String str) {
        return new GeofencingRequest(this.a, this.b, str);
    }

    public final List b() {
        return new ArrayList(this.a);
    }

    public final String toString() {
        return "GeofencingRequest[geofences=" + String.valueOf(this.a) + ", initialTrigger=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.o(parcel, 2, this.b);
        arxc.v(parcel, 4, this.c, false);
        arxc.c(parcel, a);
    }
}
