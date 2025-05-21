package com.google.android.gms.activeunlock;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.fvbo;
import defpackage.tar;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class DeviceIdentifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tar();
    public final String a;

    public DeviceIdentifier(String str) {
        fvbo.f(str, "bluetoothAddress");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeviceIdentifier) && fvbo.n(this.a, ((DeviceIdentifier) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeviceIdentifier(bluetoothAddress=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.c(parcel, a);
    }
}
