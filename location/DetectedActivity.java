package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.cbqc;
import defpackage.cbqd;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    final int d;
    public final int e;
    public static final Comparator a = new cbqc();
    public static final int[] b = {9, 10};
    public static final int[] c = {0, 1, 2, 4, 5, 6, 7, 8, 16, 17, 18, 19, 20, 21, 22};
    public static final Parcelable.Creator CREATOR = new cbqd();

    public DetectedActivity(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public static String b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 7 ? i != 8 ? i != 16 ? i != 17 ? Integer.toString(i) : "IN_RAIL_VEHICLE" : "IN_ROAD_VEHICLE" : "RUNNING" : "WALKING" : "TILTING" : "UNKNOWN" : "STILL" : "ON_FOOT" : "ON_BICYCLE" : "IN_VEHICLE";
    }

    public static boolean c(int i) {
        return d(i, true);
    }

    public static boolean d(int i, boolean z) {
        return (!z && i == 0) || i == 16 || i == 17;
    }

    public final int a() {
        int i = this.d;
        if (i > 22 || i < 0) {
            return 4;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.d == detectedActivity.d && this.e == detectedActivity.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        return "DetectedActivity [type=" + b(a()) + ", confidence=" + this.e + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        atzb.s(parcel);
        int a2 = atzr.a(parcel);
        atzr.o(parcel, 1, this.d);
        atzr.o(parcel, 2, this.e);
        atzr.c(parcel, a2);
    }
}
