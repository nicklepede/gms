package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmrj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class DeviceMotion extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmrj();
    public final int a;
    public final Float b;

    public DeviceMotion(int i, Float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof DeviceMotion) && this.a == ((DeviceMotion) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public final String toString() {
        return "DeviceMotion[motionType=" + this.a + ", confidence=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.C(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
