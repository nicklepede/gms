package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cbra;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    final int c;
    public static final LocationAvailability a = new LocationAvailability(0);
    public static final LocationAvailability b = new LocationAvailability(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
    public static final Parcelable.Creator CREATOR = new cbra();

    @Deprecated
    public LocationAvailability(int i) {
        this.c = i;
    }

    public static LocationAvailability a(Intent intent) {
        if (!b(intent)) {
            return null;
        }
        try {
            return (LocationAvailability) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static boolean b(Intent intent) {
        return intent != null && intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public final boolean c() {
        return this.c < 1000;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof LocationAvailability) && this.c == ((LocationAvailability) obj).c;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return "LocationAvailability[" + c() + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = atzr.a(parcel);
        atzr.o(parcel, 4, this.c);
        atzr.e(parcel, 6, c());
        atzr.c(parcel, a2);
    }
}
