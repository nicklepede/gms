package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bzjd;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class UserPreferredSleepWindow extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bzjd();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public UserPreferredSleepWindow(int i, int i2, int i3, int i4) {
        arwm.m(i >= 0 && i <= 23, "Start hour must be in range [0, 23].");
        arwm.m(i2 >= 0 && i2 <= 59, "Start minute must be in range [0, 59].");
        arwm.m(i3 >= 0 && i3 <= 23, "End hour must be in range [0, 23].");
        arwm.m(i4 >= 0 && i4 <= 59, "End minute must be in range [0, 59].");
        arwm.m(((i + i2) + i3) + i4 > 0, "Parameters can't be all 0.");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPreferredSleepWindow)) {
            return false;
        }
        UserPreferredSleepWindow userPreferredSleepWindow = (UserPreferredSleepWindow) obj;
        return this.a == userPreferredSleepWindow.a && this.b == userPreferredSleepWindow.b && this.c == userPreferredSleepWindow.c && this.d == userPreferredSleepWindow.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        return "UserPreferredSleepWindow [startHour=" + this.a + ", startMinute=" + this.b + ", endHour=" + this.c + ", endMinute=" + this.d + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        arwm.s(parcel);
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
