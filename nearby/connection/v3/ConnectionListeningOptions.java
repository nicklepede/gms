package com.google.android.gms.nearby.connection.v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.Strategy;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ciki;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ConnectionListeningOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ciki();
    public Strategy a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public int[] g;
    public int[] h;
    public final int i;
    public AnalyticOptions j;

    private ConnectionListeningOptions() {
        this.b = 0;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        this.i = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionListeningOptions) {
            ConnectionListeningOptions connectionListeningOptions = (ConnectionListeningOptions) obj;
            if (atyq.b(this.a, connectionListeningOptions.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(connectionListeningOptions.b)) && atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(connectionListeningOptions.c)) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(connectionListeningOptions.d)) && atyq.b(Boolean.valueOf(this.e), Boolean.valueOf(connectionListeningOptions.e)) && atyq.b(Boolean.valueOf(this.f), Boolean.valueOf(connectionListeningOptions.f)) && Arrays.equals(this.g, connectionListeningOptions.g) && Arrays.equals(this.h, connectionListeningOptions.h) && atyq.b(Integer.valueOf(this.i), Integer.valueOf(connectionListeningOptions.i)) && atyq.b(this.j, connectionListeningOptions.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Integer.valueOf(Arrays.hashCode(this.g)), Integer.valueOf(Arrays.hashCode(this.h)), Integer.valueOf(this.i), this.j});
    }

    public final String toString() {
        return String.format(Locale.US, "ConnectionListeningOptions{strategy: %s, connectionType: %s, allowBluetoothRadioToggling: %s, allowWifiRadioToggling: %s, autoUpgradeBandwidth: %s, enforceTopologyConstraints: %s, upgradeMediums: %s, listeningMediums: %s, listeningEndpointType: %d, analyticOptions: %s}", this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Arrays.toString(this.g), Arrays.toString(this.h), Integer.valueOf(this.i), this.j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.e(parcel, 6, this.f);
        atzr.p(parcel, 7, this.g, false);
        atzr.p(parcel, 8, this.h, false);
        atzr.o(parcel, 9, this.i);
        atzr.t(parcel, 10, this.j, i, false);
        atzr.c(parcel, a);
    }

    public ConnectionListeningOptions(Strategy strategy, int i, boolean z, boolean z2, boolean z3, boolean z4, int[] iArr, int[] iArr2, int i2, AnalyticOptions analyticOptions) {
        this.a = strategy;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = iArr;
        this.h = iArr2;
        this.i = i2;
        this.j = analyticOptions;
    }
}
