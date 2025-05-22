package com.google.android.gms.activeunlock;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.fxxm;
import defpackage.uwr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class DeviceIdentifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uwr();
    public final String a;

    public DeviceIdentifier(String str) {
        fxxm.f(str, "bluetoothAddress");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeviceIdentifier) && fxxm.n(this.a, ((DeviceIdentifier) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeviceIdentifier(bluetoothAddress=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.c(parcel, a);
    }
}
