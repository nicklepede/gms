package com.google.android.gms.nearby.connection.v3;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.Strategy;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cgch;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class DiscoveryOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgch();
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
            if (arwb.b(this.a, discoveryOptions.a) && Arrays.equals(this.b, discoveryOptions.b) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(discoveryOptions.c)) && arwb.b(this.d, discoveryOptions.d) && arwb.b(this.e, discoveryOptions.e) && arwb.b(Boolean.valueOf(this.f), Boolean.valueOf(discoveryOptions.f)) && arwb.b(Boolean.valueOf(this.g), Boolean.valueOf(discoveryOptions.g)) && arwb.b(this.h, discoveryOptions.h) && arwb.b(this.i, discoveryOptions.i)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.p(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.e(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        arxc.t(parcel, 8, this.h, i, false);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.c(parcel, a);
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
