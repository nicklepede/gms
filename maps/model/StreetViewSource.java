package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ccer;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccer();
    public static final StreetViewSource a = new StreetViewSource(0);
    public final int b;

    public StreetViewSource(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.b == ((StreetViewSource) obj).b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b)});
    }

    public final String toString() {
        int i = this.b;
        return String.format("StreetViewSource:%s", i != 0 ? i != 1 ? String.format("UNKNOWN(%s)", Integer.valueOf(i)) : "OUTDOOR" : "DEFAULT");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        int a2 = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.c(parcel, a2);
    }
}
