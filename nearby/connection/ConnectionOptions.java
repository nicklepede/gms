package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chlx;
import defpackage.cmly;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ConnectionOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chlx();
    public final boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public byte[] i;
    public boolean j;
    public boolean k;

    @Deprecated
    public boolean l;
    public int m;
    public int n;
    public int[] o;
    public int[] p;
    public byte[] q;
    public Strategy r;
    public int s;
    public long t;

    @Deprecated
    public final boolean u;
    public boolean v;
    public boolean w;

    public ConnectionOptions() {
        this.a = false;
        this.b = true;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = true;
        this.j = false;
        this.k = true;
        this.l = true;
        this.m = 0;
        this.n = 0;
        this.s = 0;
        this.t = 0L;
        this.u = false;
        this.v = true;
        this.w = true;
    }

    public static void a(int i, ConnectionOptions connectionOptions) {
        if (i != 12) {
            switch (i) {
                case 2:
                    connectionOptions.b = true;
                    break;
                case 3:
                    connectionOptions.g = true;
                    break;
                case 4:
                    connectionOptions.c = true;
                    break;
                case 5:
                    connectionOptions.d = true;
                    break;
                case 6:
                    connectionOptions.f = true;
                    break;
                case 7:
                    connectionOptions.e = true;
                    break;
                case 8:
                    connectionOptions.h = true;
                    break;
            }
            return;
        }
        connectionOptions.j = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionOptions) {
            ConnectionOptions connectionOptions = (ConnectionOptions) obj;
            if (atyq.b(Boolean.valueOf(this.a), Boolean.valueOf(connectionOptions.a)) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(connectionOptions.b)) && atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(connectionOptions.c)) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(connectionOptions.d)) && atyq.b(Boolean.valueOf(this.e), Boolean.valueOf(connectionOptions.e)) && atyq.b(Boolean.valueOf(this.f), Boolean.valueOf(connectionOptions.f)) && atyq.b(Boolean.valueOf(this.g), Boolean.valueOf(connectionOptions.g)) && atyq.b(Boolean.valueOf(this.h), Boolean.valueOf(connectionOptions.h)) && Arrays.equals(this.i, connectionOptions.i) && atyq.b(Boolean.valueOf(this.j), Boolean.valueOf(connectionOptions.j)) && atyq.b(Boolean.valueOf(this.k), Boolean.valueOf(connectionOptions.k)) && atyq.b(Boolean.valueOf(this.l), Boolean.valueOf(connectionOptions.l)) && atyq.b(Integer.valueOf(this.m), Integer.valueOf(connectionOptions.m)) && atyq.b(Integer.valueOf(this.n), Integer.valueOf(connectionOptions.n)) && Arrays.equals(this.o, connectionOptions.o) && Arrays.equals(this.p, connectionOptions.p) && Arrays.equals(this.q, connectionOptions.q) && atyq.b(this.r, connectionOptions.r) && atyq.b(Integer.valueOf(this.s), Integer.valueOf(connectionOptions.s)) && atyq.b(Long.valueOf(this.t), Long.valueOf(connectionOptions.t)) && atyq.b(Boolean.valueOf(this.u), Boolean.valueOf(connectionOptions.u)) && atyq.b(Boolean.valueOf(this.v), Boolean.valueOf(connectionOptions.v)) && atyq.b(Boolean.valueOf(this.w), Boolean.valueOf(connectionOptions.w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Integer.valueOf(Arrays.hashCode(this.i)), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(Arrays.hashCode(this.o)), Integer.valueOf(Arrays.hashCode(this.p)), Integer.valueOf(Arrays.hashCode(this.q)), this.r, Integer.valueOf(this.s), Long.valueOf(this.t), Boolean.valueOf(this.u), Boolean.valueOf(this.v), Boolean.valueOf(this.w)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        Boolean valueOf = Boolean.valueOf(this.a);
        Boolean valueOf2 = Boolean.valueOf(this.b);
        Boolean valueOf3 = Boolean.valueOf(this.c);
        Boolean valueOf4 = Boolean.valueOf(this.d);
        Boolean valueOf5 = Boolean.valueOf(this.e);
        Boolean valueOf6 = Boolean.valueOf(this.f);
        Boolean valueOf7 = Boolean.valueOf(this.g);
        Boolean valueOf8 = Boolean.valueOf(this.h);
        byte[] bArr = this.i;
        String b = bArr == null ? null : cmly.b(bArr);
        Boolean valueOf9 = Boolean.valueOf(this.j);
        Boolean valueOf10 = Boolean.valueOf(this.k);
        Boolean valueOf11 = Boolean.valueOf(this.l);
        byte[] bArr2 = this.q;
        return String.format(locale, "ConnectionOptions{lowPower: %s, enableBluetooth: %s, enableBle: %s, enableWifiLan: %s, enableNfc: %s, enableWifiAware: %s, enableWifiHotspot: %s, enableWifiDirect: %s, remoteBluetoothMacAddress: %s, enableWebRtc: %s, enforceTopologyConstraints: %s, disruptiveUpgrade: %s, deviceInfo: %s, strategy: %s, connectionType: %d, flowId: %d, connection mediums %s, upgrade mediums %s}", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, b, valueOf9, valueOf10, valueOf11, bArr2 != null ? cmly.b(bArr2) : null, this.r, Integer.valueOf(this.s), Long.valueOf(this.t), Arrays.toString(this.p), Arrays.toString(this.o));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.e(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.e(parcel, 6, this.f);
        atzr.e(parcel, 7, this.g);
        atzr.e(parcel, 8, this.h);
        atzr.i(parcel, 9, this.i, false);
        atzr.e(parcel, 10, this.j);
        atzr.e(parcel, 11, this.k);
        atzr.e(parcel, 12, this.l);
        atzr.o(parcel, 13, this.m);
        atzr.o(parcel, 14, this.n);
        atzr.p(parcel, 15, this.o, false);
        atzr.p(parcel, 16, this.p, false);
        atzr.i(parcel, 17, this.q, false);
        atzr.t(parcel, 18, this.r, i, false);
        atzr.o(parcel, 19, this.s);
        atzr.q(parcel, 20, this.t);
        atzr.e(parcel, 21, this.u);
        atzr.e(parcel, 22, this.v);
        atzr.e(parcel, 23, this.w);
        atzr.c(parcel, a);
    }

    public ConnectionOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, byte[] bArr, boolean z9, boolean z10, boolean z11, int i, int i2, int[] iArr, int[] iArr2, byte[] bArr2, Strategy strategy, int i3, long j, boolean z12, boolean z13, boolean z14) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = bArr;
        this.j = z9;
        this.k = z10;
        this.l = z11;
        this.m = i;
        this.n = i2;
        this.o = iArr;
        this.p = iArr2;
        this.q = bArr2;
        this.r = strategy;
        this.s = i3;
        this.t = j;
        this.u = z12;
        this.v = z13;
        this.w = z14;
    }
}
