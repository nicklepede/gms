package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chna;
import defpackage.cmly;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class DiscoveryOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chna();
    public Strategy a;
    public final boolean b;
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
    public final boolean q;
    public boolean r;
    public boolean s;
    public int t;

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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscoveryOptions) {
            DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj;
            if (atyq.b(this.a, discoveryOptions.a) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(discoveryOptions.b)) && atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(discoveryOptions.c)) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(discoveryOptions.d)) && atyq.b(Boolean.valueOf(this.e), Boolean.valueOf(discoveryOptions.e)) && atyq.b(this.f, discoveryOptions.f) && atyq.b(Boolean.valueOf(this.g), Boolean.valueOf(discoveryOptions.g)) && atyq.b(Boolean.valueOf(this.h), Boolean.valueOf(discoveryOptions.h)) && atyq.b(Boolean.valueOf(this.i), Boolean.valueOf(discoveryOptions.i)) && atyq.b(Boolean.valueOf(this.j), Boolean.valueOf(discoveryOptions.j)) && atyq.b(Integer.valueOf(this.k), Integer.valueOf(discoveryOptions.k)) && atyq.b(Integer.valueOf(this.l), Integer.valueOf(discoveryOptions.l)) && Arrays.equals(this.m, discoveryOptions.m) && atyq.b(Long.valueOf(this.n), Long.valueOf(discoveryOptions.n)) && Arrays.equals(this.o, discoveryOptions.o) && atyq.b(Boolean.valueOf(this.p), Boolean.valueOf(discoveryOptions.p)) && atyq.b(Boolean.valueOf(this.q), Boolean.valueOf(discoveryOptions.q)) && atyq.b(Boolean.valueOf(this.r), Boolean.valueOf(discoveryOptions.r)) && atyq.b(Boolean.valueOf(this.s), Boolean.valueOf(discoveryOptions.s)) && atyq.b(Integer.valueOf(this.t), Integer.valueOf(discoveryOptions.t))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(Arrays.hashCode(this.m)), Long.valueOf(this.n), Integer.valueOf(Arrays.hashCode(this.o)), Boolean.valueOf(this.p), Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s), Integer.valueOf(this.t)});
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
        return String.format(locale, "DiscoveryOptions{strategy: %s, forwardUnrecognizedBluetoothDevices: %s, enableBluetooth: %s, enableBle: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, uwbAddress: %s, flowId: %d, discoveryMediums: %s, allowGattConnections: %s, enableV3Options: %s, allowBluetoothRadioToggling: %s, allowWifiRadioToggling: %s, powerLevel : %d}", strategy, valueOf, valueOf2, valueOf3, valueOf4, parcelUuid, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, bArr == null ? "null" : cmly.b(bArr), Long.valueOf(this.n), Arrays.toString(this.o), Boolean.valueOf(this.p), Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s), Integer.valueOf(this.t));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.e(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.e(parcel, 8, this.g);
        atzr.e(parcel, 9, this.h);
        atzr.e(parcel, 10, this.i);
        atzr.e(parcel, 11, this.j);
        atzr.o(parcel, 12, this.k);
        atzr.o(parcel, 13, this.l);
        atzr.i(parcel, 14, this.m, false);
        atzr.q(parcel, 15, this.n);
        atzr.p(parcel, 16, this.o, false);
        atzr.e(parcel, 17, this.p);
        atzr.e(parcel, 18, this.q);
        atzr.e(parcel, 19, this.r);
        atzr.e(parcel, 20, this.s);
        atzr.o(parcel, 21, this.t);
        atzr.c(parcel, a);
    }

    public DiscoveryOptions(Strategy strategy, boolean z, boolean z2, boolean z3, boolean z4, ParcelUuid parcelUuid, boolean z5, boolean z6, boolean z7, boolean z8, int i, int i2, byte[] bArr, long j, int[] iArr, boolean z9, boolean z10, boolean z11, boolean z12, int i3) {
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
    }
}
