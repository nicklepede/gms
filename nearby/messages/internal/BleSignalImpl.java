package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.cast.JGCastService;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmlx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class BleSignalImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmlx();
    final int a;
    public final int b;
    public final int c;

    public BleSignalImpl(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = a(i3);
    }

    public static int a(int i) {
        return (i <= -169 || i >= 87) ? JGCastService.FLAG_USE_TDLS : i;
    }

    public static int b(int i) {
        return a(i - 41);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSignalImpl)) {
            return false;
        }
        BleSignalImpl bleSignalImpl = (BleSignalImpl) obj;
        return this.b == bleSignalImpl.b && this.c == bleSignalImpl.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "BleSignal{rssi=" + this.b + ", txPower=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
