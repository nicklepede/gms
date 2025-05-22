package com.google.android.gms.nearby.connection.v3;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.Strategy;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cikk;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class DiscoveryOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cikk();
    public Strategy a;
    public int[] b;
    public final int c;
    public AnalyticOptions d;
    public UwbOptions e;
    public final boolean f;
    public final boolean g;
    public ParcelUuid h;
    public SafeParcelableDataElements i;

    private DiscoveryOptions() {
        this.c = 3;
        this.f = true;
        this.g = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscoveryOptions) {
            DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj;
            if (atyq.b(this.a, discoveryOptions.a) && Arrays.equals(this.b, discoveryOptions.b) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(discoveryOptions.c)) && atyq.b(this.d, discoveryOptions.d) && atyq.b(this.e, discoveryOptions.e) && atyq.b(Boolean.valueOf(this.f), Boolean.valueOf(discoveryOptions.f)) && atyq.b(Boolean.valueOf(this.g), Boolean.valueOf(discoveryOptions.g)) && atyq.b(this.h, discoveryOptions.h) && atyq.b(this.i, discoveryOptions.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(this.c), this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.g), this.h, this.i});
    }

    public final String toString() {
        return String.format(Locale.US, "DiscoveryOptions{strategy: %s, discoveryMediums: %s, powerLevel: %d, analyticOptions: %s, uwbOptions: %s, allowBluetoothRadioToggling: %b, allowWifiRadioToggling: %b, fastAdvertisementServiceUuid: %s, dataElementsFilters: %s}", this.a, Arrays.toString(this.b), Integer.valueOf(this.c), this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.g), this.h, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.p(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.e(parcel, 6, this.f);
        atzr.e(parcel, 7, this.g);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.t(parcel, 9, this.i, i, false);
        atzr.c(parcel, a);
    }

    public DiscoveryOptions(Strategy strategy, int[] iArr, int i, AnalyticOptions analyticOptions, UwbOptions uwbOptions, boolean z, boolean z2, ParcelUuid parcelUuid, SafeParcelableDataElements safeParcelableDataElements) {
        this.a = strategy;
        this.b = iArr;
        this.c = i;
        this.d = analyticOptions;
        this.e = uwbOptions;
        this.f = z;
        this.g = z2;
        this.h = parcelUuid;
        this.i = safeParcelableDataElements;
    }
}
