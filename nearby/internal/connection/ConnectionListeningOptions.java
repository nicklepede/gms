package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.Strategy;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cldg;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ConnectionListeningOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cldg();
    public Strategy a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int[] e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public int[] k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;

    public ConnectionListeningOptions() {
        this.b = true;
        this.c = true;
        this.d = false;
        this.f = 1;
        this.g = false;
        this.h = true;
        this.i = true;
        this.j = 0L;
        this.l = false;
        this.m = 0;
        this.n = true;
        this.o = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionListeningOptions) {
            ConnectionListeningOptions connectionListeningOptions = (ConnectionListeningOptions) obj;
            if (atyq.b(this.a, connectionListeningOptions.a) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(connectionListeningOptions.b)) && atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(connectionListeningOptions.c)) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(connectionListeningOptions.d)) && Arrays.equals(this.e, connectionListeningOptions.e) && atyq.b(Integer.valueOf(this.f), Integer.valueOf(connectionListeningOptions.f)) && atyq.b(Boolean.valueOf(this.g), Boolean.valueOf(connectionListeningOptions.g)) && atyq.b(Boolean.valueOf(this.h), Boolean.valueOf(connectionListeningOptions.h)) && atyq.b(Boolean.valueOf(this.i), Boolean.valueOf(connectionListeningOptions.i)) && atyq.b(Long.valueOf(this.j), Long.valueOf(connectionListeningOptions.j)) && Arrays.equals(this.k, connectionListeningOptions.k) && atyq.b(Boolean.valueOf(this.l), Boolean.valueOf(connectionListeningOptions.l)) && atyq.b(Integer.valueOf(this.m), Integer.valueOf(connectionListeningOptions.m)) && atyq.b(Boolean.valueOf(this.n), Boolean.valueOf(connectionListeningOptions.n)) && atyq.b(Boolean.valueOf(this.o), Boolean.valueOf(connectionListeningOptions.o))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), Long.valueOf(this.j), Integer.valueOf(Arrays.hashCode(this.k)), Boolean.valueOf(this.l), Integer.valueOf(this.m), Boolean.valueOf(this.n), Boolean.valueOf(this.o)});
    }

    public final String toString() {
        return String.format(Locale.US, "ConnectionListeningOptions{strategy: %s, enforceTopologyConstraints: %s, autoUpgradeBandwidth: %s, disruptiveUpgrade: %s,deviceProviderType: %s, enableBluetoothListening: %s, enableBleListening: %s, enableWifiLanListening: %s, flowId: %d, listeningMediums: %s, upgradeMediums: %s, }", this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Integer.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), Long.valueOf(this.j), Arrays.toString(this.k), Arrays.toString(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.e(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.p(parcel, 5, this.e, false);
        atzr.o(parcel, 6, this.f);
        atzr.e(parcel, 7, this.g);
        atzr.e(parcel, 8, this.h);
        atzr.e(parcel, 9, this.i);
        atzr.q(parcel, 10, this.j);
        atzr.p(parcel, 11, this.k, false);
        atzr.e(parcel, 12, this.l);
        atzr.o(parcel, 13, this.m);
        atzr.e(parcel, 14, this.n);
        atzr.e(parcel, 15, this.o);
        atzr.c(parcel, a);
    }

    public ConnectionListeningOptions(Strategy strategy, boolean z, boolean z2, boolean z3, int[] iArr, int i, boolean z4, boolean z5, boolean z6, long j, int[] iArr2, boolean z7, int i2, boolean z8, boolean z9) {
        this.a = strategy;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = iArr;
        this.f = i;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = j;
        this.k = iArr2;
        this.l = z7;
        this.m = i2;
        this.n = z8;
        this.o = z9;
    }
}
