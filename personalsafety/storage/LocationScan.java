package com.google.android.gms.personalsafety.storage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import defpackage.arxc;
import defpackage.cvwg;
import defpackage.eihn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class LocationScan extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cvwg();
    public final LatLng a;
    public final long b;

    public LocationScan(LatLng latLng, long j) {
        this.a = latLng;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationScan) {
            LocationScan locationScan = (LocationScan) obj;
            if (this.b == locationScan.b && eihn.a(this.a, locationScan.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b)});
    }

    public final String toString() {
        return String.format("LocationScan:<Location: %s, TimestampMillis: %s>", this.a, Long.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LatLng latLng = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, latLng, i, false);
        arxc.q(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
