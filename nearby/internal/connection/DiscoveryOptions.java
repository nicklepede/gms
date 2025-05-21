package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.connection.v3.SafeParcelableDataElements;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cizs;
import defpackage.cizt;
import defpackage.ckdt;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class DiscoveryOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cizt();
    public Strategy a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public ParcelUuid f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public byte[] m;
    public long n;
    public int[] o;
    public boolean p;

    @Deprecated
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public SafeParcelableDataElements u;

    public DiscoveryOptions() {
        this.b = false;
        this.c = true;
        this.d = true;
        this.e = false;
        this.g = true;
        this.h = true;
        this.i = true;
        this.j = false;
        this.k = 0;
        this.l = 0;
        this.n = 0L;
        this.p = true;
        this.q = false;
        this.r = true;
        this.s = true;
        this.t = 0;
    }

    public static DiscoveryOptions a(com.google.android.gms.nearby.connection.DiscoveryOptions discoveryOptions) {
        DiscoveryOptions discoveryOptions2 = new DiscoveryOptions();
        discoveryOptions2.a = discoveryOptions.a;
        discoveryOptions2.b = discoveryOptions.b;
        discoveryOptions2.c = discoveryOptions.c;
        discoveryOptions2.d = discoveryOptions.d;
        discoveryOptions2.e = discoveryOptions.e;
        discoveryOptions2.f = discoveryOptions.f;
        discoveryOptions2.g = discoveryOptions.g;
        discoveryOptions2.h = discoveryOptions.h;
        discoveryOptions2.i = discoveryOptions.i;
        discoveryOptions2.j = discoveryOptions.j;
        discoveryOptions2.k = discoveryOptions.k;
        discoveryOptions2.l = discoveryOptions.l;
        discoveryOptions2.m = discoveryOptions.m;
        discoveryOptions2.n = discoveryOptions.n;
        discoveryOptions2.p = discoveryOptions.p;
        discoveryOptions2.q = discoveryOptions.q;
        discoveryOptions2.r = discoveryOptions.r;
        discoveryOptions2.s = discoveryOptions.s;
        discoveryOptions2.t = discoveryOptions.t;
        int[] iArr = discoveryOptions.o;
        if (iArr != null) {
            discoveryOptions2.o = iArr;
        }
        cizs.a(discoveryOptions2);
        return discoveryOptions2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscoveryOptions) {
            DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj;
            if (arwb.b(this.a, discoveryOptions.a) && arwb.b(Boolean.valueOf(this.b), Boolean.valueOf(discoveryOptions.b)) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(discoveryOptions.c)) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(discoveryOptions.d)) && arwb.b(Boolean.valueOf(this.e), Boolean.valueOf(discoveryOptions.e)) && arwb.b(this.f, discoveryOptions.f) && arwb.b(Boolean.valueOf(this.g), Boolean.valueOf(discoveryOptions.g)) && arwb.b(Boolean.valueOf(this.h), Boolean.valueOf(discoveryOptions.h)) && arwb.b(Boolean.valueOf(this.i), Boolean.valueOf(discoveryOptions.i)) && arwb.b(Boolean.valueOf(this.j), Boolean.valueOf(discoveryOptions.j)) && arwb.b(Integer.valueOf(this.k), Integer.valueOf(discoveryOptions.k)) && arwb.b(Integer.valueOf(this.l), Integer.valueOf(discoveryOptions.l)) && Arrays.equals(this.m, discoveryOptions.m) && arwb.b(Long.valueOf(this.n), Long.valueOf(discoveryOptions.n)) && Arrays.equals(this.o, discoveryOptions.o) && arwb.b(Boolean.valueOf(this.p), Boolean.valueOf(discoveryOptions.p)) && arwb.b(Boolean.valueOf(this.q), Boolean.valueOf(discoveryOptions.q)) && arwb.b(Boolean.valueOf(this.r), Boolean.valueOf(discoveryOptions.r)) && arwb.b(Boolean.valueOf(this.s), Boolean.valueOf(discoveryOptions.s)) && arwb.b(Integer.valueOf(this.t), Integer.valueOf(discoveryOptions.t)) && arwb.b(this.u, discoveryOptions.u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(Arrays.hashCode(this.m)), Long.valueOf(this.n), Integer.valueOf(Arrays.hashCode(this.o)), Boolean.valueOf(this.p), Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s), Integer.valueOf(this.t), this.u});
    }

    public final String toString() {
        Locale locale = Locale.US;
        Strategy strategy = this.a;
        Boolean valueOf = Boolean.valueOf(this.b);
        Boolean valueOf2 = Boolean.valueOf(this.c);
        Boolean valueOf3 = Boolean.valueOf(this.d);
        Boolean valueOf4 = Boolean.valueOf(this.e);
        ParcelUuid parcelUuid = this.f;
        Boolean valueOf5 = Boolean.valueOf(this.g);
        Boolean valueOf6 = Boolean.valueOf(this.h);
        Boolean valueOf7 = Boolean.valueOf(this.i);
        Boolean valueOf8 = Boolean.valueOf(this.j);
        Integer valueOf9 = Integer.valueOf(this.k);
        Integer valueOf10 = Integer.valueOf(this.l);
        byte[] bArr = this.m;
        return String.format(locale, "DiscoveryOptions{strategy: %s, forwardUnrecognizedBluetoothDevices: %s, enableBluetooth: %s, enableBle: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, uwbAddress: %s, flowId: %d, discoveryMediums: %s, allowGattConnections: %s, enableV3Options: %s, allowBluetoothRadioToggling: %s, allowWifiRadioToggling: %s, powerLevel : %d, dataElementsFilters: %s}", strategy, valueOf, valueOf2, valueOf3, valueOf4, parcelUuid, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, bArr == null ? "null" : ckdt.b(bArr), Long.valueOf(this.n), Arrays.toString(this.o), Boolean.valueOf(this.p), Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s), Integer.valueOf(this.t), String.valueOf(this.u));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.e(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.e(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.e(parcel, 8, this.g);
        arxc.e(parcel, 9, this.h);
        arxc.e(parcel, 10, this.i);
        arxc.e(parcel, 11, this.j);
        arxc.o(parcel, 12, this.k);
        arxc.o(parcel, 13, this.l);
        arxc.i(parcel, 14, this.m, false);
        arxc.q(parcel, 15, this.n);
        arxc.p(parcel, 16, this.o, false);
        arxc.e(parcel, 17, this.p);
        arxc.e(parcel, 18, this.q);
        arxc.e(parcel, 19, this.r);
        arxc.e(parcel, 20, this.s);
        arxc.o(parcel, 21, this.t);
        arxc.t(parcel, 22, this.u, i, false);
        arxc.c(parcel, a);
    }

    public DiscoveryOptions(Strategy strategy, boolean z, boolean z2, boolean z3, boolean z4, ParcelUuid parcelUuid, boolean z5, boolean z6, boolean z7, boolean z8, int i, int i2, byte[] bArr, long j, int[] iArr, boolean z9, boolean z10, boolean z11, boolean z12, int i3, SafeParcelableDataElements safeParcelableDataElements) {
        this.a = strategy;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = parcelUuid;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = i;
        this.l = i2;
        this.m = bArr;
        this.n = j;
        this.o = iArr;
        this.p = z9;
        this.q = z10;
        this.r = z11;
        this.s = z12;
        this.t = i3;
        this.u = safeParcelableDataElements;
    }
}
