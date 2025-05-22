package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.chnn;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class Strategy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chnn();
    public static final Strategy a = new Strategy(1, 3);
    public static final Strategy b = new Strategy(1, 2);
    public static final Strategy c = new Strategy(1, 1);
    public final int d;
    public final int e;

    public Strategy(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.d == strategy.d && this.e == strategy.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        return String.format(Locale.US, "Strategy(%s){connectionType=%d, topology=%d}", a.equals(this) ? "P2P_CLUSTER" : b.equals(this) ? "P2P_STAR" : c.equals(this) ? "P2P_POINT_TO_POINT" : "UNKNOWN", Integer.valueOf(this.d), Integer.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.d;
        int a2 = atzr.a(parcel);
        atzr.o(parcel, 3, i2);
        atzr.o(parcel, 4, this.e);
        atzr.c(parcel, a2);
    }
}
