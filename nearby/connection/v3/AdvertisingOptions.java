package com.google.android.gms.nearby.connection.v3;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.Strategy;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cgcd;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class AdvertisingOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgcd();
    public Strategy a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public int[] e;
    public int[] f;
    public final int g;
    public final int h;
    public AnalyticOptions i;
    public UwbOptions j;
    public final boolean k;
    public final boolean l;
    public ParcelUuid m;
    public final boolean n;
    public String o;
    public SafeParcelableDataElements p;

    private AdvertisingOptions() {
        this.b = true;
        this.c = true;
        this.d = false;
        this.g = 3;
        this.h = 0;
        this.k = true;
        this.l = true;
        this.n = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdvertisingOptions) {
            AdvertisingOptions advertisingOptions = (AdvertisingOptions) obj;
            if (arwb.b(this.a, advertisingOptions.a) && arwb.b(Boolean.valueOf(this.b), Boolean.valueOf(advertisingOptions.b)) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(advertisingOptions.c)) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(advertisingOptions.d)) && Arrays.equals(this.e, advertisingOptions.e) && Arrays.equals(this.f, advertisingOptions.f) && arwb.b(Integer.valueOf(this.g), Integer.valueOf(advertisingOptions.g)) && arwb.b(Integer.valueOf(this.h), Integer.valueOf(advertisingOptions.h)) && arwb.b(this.i, advertisingOptions.i) && arwb.b(this.j, advertisingOptions.j) && arwb.b(Boolean.valueOf(this.k), Boolean.valueOf(advertisingOptions.k)) && arwb.b(Boolean.valueOf(this.l), Boolean.valueOf(advertisingOptions.l)) && arwb.b(this.m, advertisingOptions.m) && arwb.b(Boolean.valueOf(this.n), Boolean.valueOf(advertisingOptions.n)) && arwb.b(this.o, advertisingOptions.o) && arwb.b(this.p, advertisingOptions.p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, this.j, Boolean.valueOf(this.k), Boolean.valueOf(this.l), this.m, Boolean.valueOf(this.n), this.o, this.p});
    }

    public final String toString() {
        return String.format(Locale.US, "AdvertisingOptions{strategy: %s, autoUpgradeBandwidth: %s, enforceTopologyConstraints: %s, enableBluetoothListening: %s, advertisingMediums:%s, upgradeMediums: %s, powerLevel: %d, connectionType: %d, analyticOptions: %s, uwbOptions: %s, allowBluetoothRadioToggling: %b, allowWifiRadioToggling: %b, fastAdvertisementServiceUuid: %s, enableBleL2capListening: %s, authenticationPassword: %s, customDataElements: %s }", this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Arrays.toString(this.e), Arrays.toString(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, this.j, Boolean.valueOf(this.k), Boolean.valueOf(this.l), this.m, Boolean.valueOf(this.n), this.o, this.p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.e(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.p(parcel, 5, this.e, false);
        arxc.p(parcel, 6, this.f, false);
        arxc.o(parcel, 7, this.g);
        arxc.o(parcel, 8, this.h);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.t(parcel, 10, this.j, i, false);
        arxc.e(parcel, 11, this.k);
        arxc.e(parcel, 12, this.l);
        arxc.t(parcel, 13, this.m, i, false);
        arxc.e(parcel, 14, this.n);
        arxc.v(parcel, 15, this.o, false);
        arxc.t(parcel, 16, this.p, i, false);
        arxc.c(parcel, a);
    }

    public AdvertisingOptions(Strategy strategy, boolean z, boolean z2, boolean z3, int[] iArr, int[] iArr2, int i, int i2, AnalyticOptions analyticOptions, UwbOptions uwbOptions, boolean z4, boolean z5, ParcelUuid parcelUuid, boolean z6, String str, SafeParcelableDataElements safeParcelableDataElements) {
        this.a = strategy;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = iArr;
        this.f = iArr2;
        this.g = i;
        this.h = i2;
        this.i = analyticOptions;
        this.j = uwbOptions;
        this.k = z4;
        this.l = z5;
        this.m = parcelUuid;
        this.n = z6;
        this.o = str;
        this.p = safeParcelableDataElements;
    }
}
