package com.google.android.gms.dtdi.discovery;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.azer;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DevicePickerEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new azer();
    public final IBinder a;
    public final String b;
    public final String c;
    public final int d;

    public DevicePickerEntry(IBinder iBinder, String str, String str2, int i) {
        fvbo.f(iBinder, "internalToken");
        fvbo.f(str, "deviceName");
        fvbo.f(str2, "imageUrl");
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
        return fvbo.n(this.a, devicePickerEntry.a) && fvbo.n(this.b, devicePickerEntry.b) && fvbo.n(this.c, devicePickerEntry.c) && this.d == devicePickerEntry.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d;
    }

    public final String toString() {
        return "DevicePickerEntry(internalToken=" + this.a + ", deviceName=" + this.b + ", imageUrl=" + this.c + ", deviceType=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        IBinder iBinder = this.a;
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, iBinder);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.o(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
