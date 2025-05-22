package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmrk;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DeviceType extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmrk();
    public final int a;

    public DeviceType(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof DeviceType) && this.a == ((DeviceType) obj).a;
    }

    public final int hashCode() {
        return Objects.hash(22, Integer.valueOf(this.a));
    }

    public final String toString() {
        return String.format(Locale.US, "DataElement<type: %s, value: %d>", "DeviceType", Integer.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.c(parcel, a);
    }
}
