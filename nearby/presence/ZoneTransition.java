package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmtk;
import defpackage.ekus;
import defpackage.elgo;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ZoneTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmtk();
    public final int a;
    public final int b;
    public final int c;
    private final List d;

    public ZoneTransition(int i, int i2, int i3, List list) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = list;
    }

    public final List a() {
        return elgo.i(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneTransition)) {
            return false;
        }
        ZoneTransition zoneTransition = (ZoneTransition) obj;
        return this.a == zoneTransition.a && this.b == zoneTransition.b && this.c == zoneTransition.c && ekus.a(this.d, zoneTransition.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    public final String toString() {
        int i = this.a;
        Locale locale = Locale.ENGLISH;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "RANGE_UNKNOWN" : "RANGE_TAP" : "RANGE_WITHIN_REACH" : "RANGE_CLOSE" : "RANGE_LONG" : "RANGE_FAR";
        Integer valueOf = Integer.valueOf(this.b);
        int i2 = this.c;
        return String.format(locale, "ZoneTransition{%s, confidence=%s, transitionType=%s, localDeviceMotions=%s}", str, valueOf, i2 != 1 ? i2 != 2 ? i2 != 3 ? "TRANSITION_UNKNOWN" : "TRANSITION_EXIT" : "TRANSITION_DWELL" : "TRANSITION_ENTER", this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.y(parcel, 4, a(), false);
        atzr.c(parcel, a);
    }
}
