package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmtg;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class UwbConnectivityCapability extends AbstractSafeParcelable {
    public final boolean b;
    public final boolean c;
    public static final UwbConnectivityCapability a = new UwbConnectivityCapability(false, false);
    public static final Parcelable.Creator CREATOR = new cmtg();

    public UwbConnectivityCapability(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    public final boolean a() {
        return this.b || this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UwbConnectivityCapability)) {
            return false;
        }
        UwbConnectivityCapability uwbConnectivityCapability = (UwbConnectivityCapability) obj;
        return this.b == uwbConnectivityCapability.b && this.c == uwbConnectivityCapability.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        return String.format(Locale.US, "UwbConnectivityCapability<S-STS: %s, P-STS: %s>", Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.b;
        int a2 = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.e(parcel, 2, this.c);
        atzr.c(parcel, a2);
    }
}
