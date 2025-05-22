package com.google.android.gms.dtdi.discovery;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bbit;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DevicePickerEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbit();
    public final IBinder a;
    public final String b;
    public final String c;
    public final int d;

    public DevicePickerEntry(IBinder iBinder, String str, String str2, int i) {
        fxxm.f(iBinder, "internalToken");
        fxxm.f(str, "deviceName");
        fxxm.f(str2, "imageUrl");
        this.a = iBinder;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevicePickerEntry)) {
            return false;
        }
        DevicePickerEntry devicePickerEntry = (DevicePickerEntry) obj;
        return fxxm.n(this.a, devicePickerEntry.a) && fxxm.n(this.b, devicePickerEntry.b) && fxxm.n(this.c, devicePickerEntry.c) && this.d == devicePickerEntry.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d;
    }

    public final String toString() {
        return "DevicePickerEntry(internalToken=" + this.a + ", deviceName=" + this.b + ", imageUrl=" + this.c + ", deviceType=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        IBinder iBinder = this.a;
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, iBinder);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
