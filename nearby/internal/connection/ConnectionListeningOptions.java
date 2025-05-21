package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.Strategy;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.civb;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ConnectionListeningOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new civb();
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
            if (arwb.b(this.a, connectionListeningOptions.a) && arwb.b(Boolean.valueOf(this.b), Boolean.valueOf(connectionListeningOptions.b)) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(connectionListeningOptions.c)) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(connectionListeningOptions.d)) && Arrays.equals(this.e, connectionListeningOptions.e) && arwb.b(Integer.valueOf(this.f), Integer.valueOf(connectionListeningOptions.f)) && arwb.b(Boolean.valueOf(this.g), Boolean.valueOf(connectionListeningOptions.g)) && arwb.b(Boolean.valueOf(this.h), Boolean.valueOf(connectionListeningOptions.h)) && arwb.b(Boolean.valueOf(this.i), Boolean.valueOf(connectionListeningOptions.i)) && arwb.b(Long.valueOf(this.j), Long.valueOf(connectionListeningOptions.j)) && Arrays.equals(this.k, connectionListeningOptions.k) && arwb.b(Boolean.valueOf(this.l), Boolean.valueOf(connectionListeningOptions.l)) && arwb.b(Integer.valueOf(this.m), Integer.valueOf(connectionListeningOptions.m)) && arwb.b(Boolean.valueOf(this.n), Boolean.valueOf(connectionListeningOptions.n)) && arwb.b(Boolean.valueOf(this.o), Boolean.valueOf(connectionListeningOptions.o))) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.e(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.p(parcel, 5, this.e, false);
        arxc.o(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        arxc.e(parcel, 8, this.h);
        arxc.e(parcel, 9, this.i);
        arxc.q(parcel, 10, this.j);
        arxc.p(parcel, 11, this.k, false);
        arxc.e(parcel, 12, this.l);
        arxc.o(parcel, 13, this.m);
        arxc.e(parcel, 14, this.n);
        arxc.e(parcel, 15, this.o);
        arxc.c(parcel, a);
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
