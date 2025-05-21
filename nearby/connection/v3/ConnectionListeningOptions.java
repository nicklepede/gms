package com.google.android.gms.nearby.connection.v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.Strategy;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cgcf;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ConnectionListeningOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgcf();
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
            if (arwb.b(this.a, connectionListeningOptions.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(connectionListeningOptions.b)) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(connectionListeningOptions.c)) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(connectionListeningOptions.d)) && arwb.b(Boolean.valueOf(this.e), Boolean.valueOf(connectionListeningOptions.e)) && arwb.b(Boolean.valueOf(this.f), Boolean.valueOf(connectionListeningOptions.f)) && Arrays.equals(this.g, connectionListeningOptions.g) && Arrays.equals(this.h, connectionListeningOptions.h) && arwb.b(Integer.valueOf(this.i), Integer.valueOf(connectionListeningOptions.i)) && arwb.b(this.j, connectionListeningOptions.j)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.o(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.e(parcel, 5, this.e);
        arxc.e(parcel, 6, this.f);
        arxc.p(parcel, 7, this.g, false);
        arxc.p(parcel, 8, this.h, false);
        arxc.o(parcel, 9, this.i);
        arxc.t(parcel, 10, this.j, i, false);
        arxc.c(parcel, a);
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
