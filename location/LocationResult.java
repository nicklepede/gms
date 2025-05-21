package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.bzip;
import defpackage.bziw;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public final List b;
    public static final List a = Collections.EMPTY_LIST;
    public static final Parcelable.Creator CREATOR = new bzip();

    public LocationResult(List list) {
        this.b = list;
    }

    public static LocationResult b(List list) {
        if (list == null) {
            list = a;
        }
        return new LocationResult(list);
    }

    public static LocationResult c(Intent intent) {
        if (!d(intent)) {
            return null;
        }
        LocationResult locationResult = (LocationResult) arxd.b(intent, "com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES", CREATOR);
        return locationResult == null ? (LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") : locationResult;
    }

    public static boolean d(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") || intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES");
    }

    public final Location a() {
        List list = this.b;
        int size = list.size();
        if (size == 0) {
            return null;
        }
        return (Location) list.get(size - 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        List<Location> list = this.b;
        int size = list.size();
        List list2 = ((LocationResult) obj).b;
        if (size != list2.size()) {
            return false;
        }
        Iterator it = list2.iterator();
        for (Location location : list) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !arwb.b(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationResult");
        bziw.u(this.b, sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.b;
        int a2 = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.c(parcel, a2);
    }
}
