package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aozc;
import defpackage.aozd;
import defpackage.atzr;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class DeviceStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aozd();
    public double a;
    public boolean b;
    public int c;
    public ApplicationMetadata d;
    public int e;
    public EqualizerSettings f;
    public double g;

    public DeviceStatus(double d, boolean z, int i, ApplicationMetadata applicationMetadata, int i2, EqualizerSettings equalizerSettings, double d2) {
        this.a = d;
        this.b = z;
        this.c = i;
        this.d = applicationMetadata;
        this.e = i2;
        this.f = equalizerSettings;
        this.g = d2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceStatus)) {
            return false;
        }
        DeviceStatus deviceStatus = (DeviceStatus) obj;
        if (this.a == deviceStatus.a && this.b == deviceStatus.b && this.c == deviceStatus.c && aozc.u(this.d, deviceStatus.d) && this.e == deviceStatus.e) {
            EqualizerSettings equalizerSettings = this.f;
            if (aozc.u(equalizerSettings, equalizerSettings) && this.g == deviceStatus.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Double.valueOf(this.g)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.j(parcel, 2, this.a);
        atzr.e(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.o(parcel, 6, this.e);
        atzr.t(parcel, 7, this.f, i, false);
        atzr.j(parcel, 8, this.g);
        atzr.c(parcel, a);
    }

    public DeviceStatus() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }
}
