package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.connection.UwbSenderInfo;
import com.google.android.gms.nearby.connection.v3.SafeParcelableDataElements;
import defpackage.a;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clda;
import defpackage.cldb;
import defpackage.cmly;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class AdvertisingOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cldb();
    public int A;
    public byte[] B;
    public boolean C;
    public int D;

    @Deprecated
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public long I;
    public String J;
    public SafeParcelableDataElements K;
    public Strategy a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public byte[] f;
    public boolean g;
    public ParcelUuid h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public byte[] q;
    public long r;
    public UwbSenderInfo[] s;
    public boolean t;

    @Deprecated
    public boolean u;
    public boolean v;
    public boolean w;
    public int[] x;
    public int[] y;
    public boolean z;

    public AdvertisingOptions() {
        this.b = true;
        this.c = true;
        this.d = true;
        this.e = true;
        this.g = false;
        this.i = true;
        this.j = true;
        this.k = true;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = 0;
        this.p = 0;
        this.r = 0L;
        this.t = false;
        this.u = true;
        this.v = false;
        this.w = true;
        this.z = true;
        this.A = 0;
        this.C = true;
        this.D = 0;
        this.E = false;
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = 0L;
    }

    public static AdvertisingOptions a(com.google.android.gms.nearby.connection.AdvertisingOptions advertisingOptions) {
        AdvertisingOptions advertisingOptions2 = new AdvertisingOptions();
        advertisingOptions2.a = advertisingOptions.a;
        advertisingOptions2.b = advertisingOptions.b;
        advertisingOptions2.c = advertisingOptions.c;
        advertisingOptions2.d = advertisingOptions.d;
        advertisingOptions2.e = advertisingOptions.e;
        advertisingOptions2.f = advertisingOptions.f;
        advertisingOptions2.g = advertisingOptions.g;
        advertisingOptions2.h = advertisingOptions.h;
        advertisingOptions2.i = advertisingOptions.i;
        advertisingOptions2.j = advertisingOptions.j;
        advertisingOptions2.k = advertisingOptions.k;
        advertisingOptions2.l = advertisingOptions.l;
        advertisingOptions2.m = advertisingOptions.m;
        advertisingOptions2.n = advertisingOptions.n;
        advertisingOptions2.o = advertisingOptions.o;
        advertisingOptions2.p = advertisingOptions.p;
        advertisingOptions2.q = advertisingOptions.q;
        advertisingOptions2.r = advertisingOptions.r;
        advertisingOptions2.s = advertisingOptions.s;
        advertisingOptions2.t = advertisingOptions.t;
        advertisingOptions2.u = advertisingOptions.u;
        advertisingOptions2.v = advertisingOptions.v;
        advertisingOptions2.w = advertisingOptions.w;
        advertisingOptions2.z = advertisingOptions.z;
        advertisingOptions2.A = advertisingOptions.A;
        advertisingOptions2.B = advertisingOptions.B;
        advertisingOptions2.C = advertisingOptions.C;
        advertisingOptions2.D = advertisingOptions.D;
        advertisingOptions2.E = advertisingOptions.E;
        advertisingOptions2.F = advertisingOptions.F;
        advertisingOptions2.G = advertisingOptions.G;
        advertisingOptions2.H = advertisingOptions.H;
        advertisingOptions2.I = advertisingOptions.I;
        int[] iArr = advertisingOptions.x;
        if (iArr != null) {
            advertisingOptions2.x = iArr;
        }
        int[] iArr2 = advertisingOptions.y;
        if (iArr2 != null) {
            advertisingOptions2.y = iArr2;
        }
        clda.a(advertisingOptions2);
        return advertisingOptions2;
    }

    public static String b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? a.l(i, "UNKNOWN_CONNECTION_TYPE(", ")") : "NON_DISRUPTIVE" : "DISRUPTIVE" : "BALANCED";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdvertisingOptions) {
            AdvertisingOptions advertisingOptions = (AdvertisingOptions) obj;
            if (atyq.b(this.a, advertisingOptions.a) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(advertisingOptions.b)) && atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(advertisingOptions.c)) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(advertisingOptions.d)) && atyq.b(Boolean.valueOf(this.e), Boolean.valueOf(advertisingOptions.e)) && Arrays.equals(this.f, advertisingOptions.f) && atyq.b(Boolean.valueOf(this.g), Boolean.valueOf(advertisingOptions.g)) && atyq.b(this.h, advertisingOptions.h) && atyq.b(Boolean.valueOf(this.i), Boolean.valueOf(advertisingOptions.i)) && atyq.b(Boolean.valueOf(this.j), Boolean.valueOf(advertisingOptions.j)) && atyq.b(Boolean.valueOf(this.k), Boolean.valueOf(advertisingOptions.k)) && atyq.b(Boolean.valueOf(this.l), Boolean.valueOf(advertisingOptions.l)) && atyq.b(Boolean.valueOf(this.m), Boolean.valueOf(advertisingOptions.m)) && atyq.b(Boolean.valueOf(this.n), Boolean.valueOf(advertisingOptions.n)) && atyq.b(Integer.valueOf(this.o), Integer.valueOf(advertisingOptions.o)) && atyq.b(Integer.valueOf(this.p), Integer.valueOf(advertisingOptions.p)) && Arrays.equals(this.q, advertisingOptions.q) && atyq.b(Long.valueOf(this.r), Long.valueOf(advertisingOptions.r)) && Arrays.equals(this.s, advertisingOptions.s) && atyq.b(Boolean.valueOf(this.t), Boolean.valueOf(advertisingOptions.t)) && atyq.b(Boolean.valueOf(this.u), Boolean.valueOf(advertisingOptions.u)) && atyq.b(Boolean.valueOf(this.v), Boolean.valueOf(advertisingOptions.v)) && atyq.b(Boolean.valueOf(this.w), Boolean.valueOf(advertisingOptions.w)) && Arrays.equals(this.x, advertisingOptions.x) && Arrays.equals(this.y, advertisingOptions.y) && atyq.b(Boolean.valueOf(this.z), Boolean.valueOf(advertisingOptions.z)) && atyq.b(Integer.valueOf(this.A), Integer.valueOf(advertisingOptions.A)) && Arrays.equals(this.B, advertisingOptions.B) && atyq.b(Boolean.valueOf(this.C), Boolean.valueOf(advertisingOptions.C)) && atyq.b(Integer.valueOf(this.D), Integer.valueOf(advertisingOptions.D)) && atyq.b(Boolean.valueOf(this.E), Boolean.valueOf(advertisingOptions.E)) && atyq.b(Boolean.valueOf(this.F), Boolean.valueOf(advertisingOptions.F)) && atyq.b(Boolean.valueOf(this.G), Boolean.valueOf(advertisingOptions.G)) && atyq.b(Boolean.valueOf(this.H), Boolean.valueOf(advertisingOptions.H)) && atyq.b(Long.valueOf(this.I), Long.valueOf(advertisingOptions.I)) && atyq.b(this.J, advertisingOptions.J) && atyq.b(this.K, advertisingOptions.K)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.f)), Boolean.valueOf(this.g), this.h, Boolean.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), Boolean.valueOf(this.m), Boolean.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(Arrays.hashCode(this.q)), Long.valueOf(this.r), Integer.valueOf(Arrays.hashCode(this.s)), Boolean.valueOf(this.t), Boolean.valueOf(this.u), Boolean.valueOf(this.v), Boolean.valueOf(this.w), Integer.valueOf(Arrays.hashCode(this.x)), Integer.valueOf(Arrays.hashCode(this.y)), Boolean.valueOf(this.z), Integer.valueOf(this.A), Integer.valueOf(Arrays.hashCode(this.B)), Boolean.valueOf(this.C), Integer.valueOf(this.D), Boolean.valueOf(this.E), Boolean.valueOf(this.F), Boolean.valueOf(this.G), Boolean.valueOf(this.H), Long.valueOf(this.I), this.J, this.K});
    }

    public final String toString() {
        Locale locale = Locale.US;
        Strategy strategy = this.a;
        Boolean valueOf = Boolean.valueOf(this.b);
        Boolean valueOf2 = Boolean.valueOf(this.c);
        Boolean valueOf3 = Boolean.valueOf(this.d);
        Boolean valueOf4 = Boolean.valueOf(this.e);
        byte[] bArr = this.f;
        String b = bArr == null ? null : cmly.b(bArr);
        Boolean valueOf5 = Boolean.valueOf(this.g);
        ParcelUuid parcelUuid = this.h;
        Boolean valueOf6 = Boolean.valueOf(this.i);
        Boolean valueOf7 = Boolean.valueOf(this.j);
        Boolean valueOf8 = Boolean.valueOf(this.k);
        Boolean valueOf9 = Boolean.valueOf(this.l);
        Boolean valueOf10 = Boolean.valueOf(this.m);
        Boolean valueOf11 = Boolean.valueOf(this.n);
        Integer valueOf12 = Integer.valueOf(this.o);
        Integer valueOf13 = Integer.valueOf(this.p);
        byte[] bArr2 = this.q;
        String b2 = bArr2 == null ? "null" : cmly.b(bArr2);
        Long valueOf14 = Long.valueOf(this.r);
        String arrays = Arrays.toString(this.s);
        Boolean valueOf15 = Boolean.valueOf(this.t);
        Boolean valueOf16 = Boolean.valueOf(this.u);
        Boolean valueOf17 = Boolean.valueOf(this.w);
        byte[] bArr3 = this.B;
        return String.format(locale, "AdvertisingOptions{strategy: %s, autoUpgradeBandwidth: %s, enforceTopologyConstraints: %s, enableBluetooth: %s, enableBle: %s, nearbyNotificationsBeaconData: %s, lowPower: %s, fastAdvertisementServiceUuid: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableBluetoothListening: %s, enableWebRtcListening: %s, enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, remoteUwbAddress: %s, flowId: %d, uwbSenderInfo: %s, enableOutOfBandConnection: %s, disruptiveUpgrade: %s, useStableIdentifiers: %s, deviceInfo: %s,allowGattConnections: %s, connectionType: %d, enableBleL2capListening: %s, upgradeBandwidthTimeoutMillis: %d, authenticationPassword: %s, customDataElements: %s}", strategy, valueOf, valueOf2, valueOf3, valueOf4, b, valueOf5, parcelUuid, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, b2, valueOf14, arrays, valueOf15, valueOf16, valueOf17, bArr3 == null ? null : cmly.b(bArr3), Boolean.valueOf(this.C), Integer.valueOf(this.D), Boolean.valueOf(this.H), Long.valueOf(this.I), this.J, this.K);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.e(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.i(parcel, 6, this.f, false);
        atzr.e(parcel, 7, this.g);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.e(parcel, 9, this.i);
        atzr.e(parcel, 10, this.j);
        atzr.e(parcel, 11, this.k);
        atzr.e(parcel, 12, this.l);
        atzr.e(parcel, 13, this.m);
        atzr.e(parcel, 14, this.n);
        atzr.o(parcel, 15, this.o);
        atzr.o(parcel, 16, this.p);
        atzr.i(parcel, 17, this.q, false);
        atzr.q(parcel, 18, this.r);
        atzr.J(parcel, 19, this.s, i);
        atzr.e(parcel, 20, this.t);
        atzr.e(parcel, 21, this.u);
        atzr.e(parcel, 22, this.v);
        atzr.e(parcel, 23, this.w);
        atzr.p(parcel, 24, this.x, false);
        atzr.p(parcel, 25, this.y, false);
        atzr.e(parcel, 26, this.z);
        atzr.o(parcel, 27, this.A);
        atzr.i(parcel, 28, this.B, false);
        atzr.e(parcel, 29, this.C);
        atzr.o(parcel, 30, this.D);
        atzr.e(parcel, 31, this.E);
        atzr.e(parcel, 32, this.F);
        atzr.e(parcel, 33, this.G);
        atzr.e(parcel, 34, this.H);
        atzr.q(parcel, 35, this.I);
        atzr.v(parcel, 36, this.J, false);
        atzr.t(parcel, 37, this.K, i, false);
        atzr.c(parcel, a);
    }

    public AdvertisingOptions(Strategy strategy, boolean z, boolean z2, boolean z3, boolean z4, byte[] bArr, boolean z5, ParcelUuid parcelUuid, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, int i2, byte[] bArr2, long j, UwbSenderInfo[] uwbSenderInfoArr, boolean z12, boolean z13, boolean z14, boolean z15, int[] iArr, int[] iArr2, boolean z16, int i3, byte[] bArr3, boolean z17, int i4, boolean z18, boolean z19, boolean z20, boolean z21, long j2, String str, SafeParcelableDataElements safeParcelableDataElements) {
        this.a = strategy;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = bArr;
        this.g = z5;
        this.h = parcelUuid;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = z9;
        this.m = z10;
        this.n = z11;
        this.o = i;
        this.p = i2;
        this.q = bArr2;
        this.r = j;
        this.s = uwbSenderInfoArr;
        this.t = z12;
        this.u = z13;
        this.v = z14;
        this.w = z15;
        this.x = iArr;
        this.y = iArr2;
        this.z = z16;
        this.A = i3;
        this.B = bArr3;
        this.C = z17;
        this.D = i4;
        this.E = z18;
        this.F = z19;
        this.G = z20;
        this.H = z21;
        this.I = j2;
        this.J = str;
        this.K = safeParcelableDataElements;
    }
}
