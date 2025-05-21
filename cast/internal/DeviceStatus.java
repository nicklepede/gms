package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amxr;
import defpackage.amxs;
import defpackage.arxc;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class DeviceStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amxs();
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
        if (this.a == deviceStatus.a && this.b == deviceStatus.b && this.c == deviceStatus.c && amxr.u(this.d, deviceStatus.d) && this.e == deviceStatus.e) {
            EqualizerSettings equalizerSettings = this.f;
            if (amxr.u(equalizerSettings, equalizerSettings) && this.g == deviceStatus.g) {
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
        int a = arxc.a(parcel);
        arxc.j(parcel, 2, this.a);
        arxc.e(parcel, 3, this.b);
        arxc.o(parcel, 4, this.c);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.o(parcel, 6, this.e);
        arxc.t(parcel, 7, this.f, i, false);
        arxc.j(parcel, 8, this.g);
        arxc.c(parcel, a);
    }

    public DeviceStatus() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }
}
