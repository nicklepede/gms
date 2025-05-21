package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bgdk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class Device extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgdk();
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public Device(String str, String str2, String str3, int i, int i2) {
        arwm.s(str);
        this.a = str;
        arwm.s(str2);
        this.b = str2;
        if (str3 == null) {
            arwm.m(true, "Device UID is null.  Did you forget to use LocalDeviceRule?");
            throw new IllegalStateException("Device UID is null.");
        }
        this.c = str3;
        this.d = i;
        this.e = i2;
    }

    final String a() {
        return String.format("%s:%s:%s", this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        return arwb.b(this.a, device.a) && arwb.b(this.b, device.b) && arwb.b(this.c, device.c) && this.d == device.d && this.e == device.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        return String.format("Device{%s:%s:%s}", a(), Integer.valueOf(this.d), Integer.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.o(parcel, 5, this.d);
        arxc.o(parcel, 6, this.e);
        arxc.c(parcel, a);
    }
}
