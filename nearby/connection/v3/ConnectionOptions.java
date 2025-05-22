package com.google.android.gms.nearby.connection.v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.Strategy;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cikj;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ConnectionOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cikj();
    public Strategy a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public int[] h;
    public int[] i;
    public AnalyticOptions j;
    public String k;

    private ConnectionOptions() {
        this.b = 0;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = 0;
        this.g = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionOptions) {
            ConnectionOptions connectionOptions = (ConnectionOptions) obj;
            if (atyq.b(this.a, connectionOptions.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(connectionOptions.b)) && atyq.b(Boolean.valueOf(this.e), Boolean.valueOf(connectionOptions.e)) && atyq.b(Integer.valueOf(this.f), Integer.valueOf(connectionOptions.f)) && atyq.b(Integer.valueOf(this.g), Integer.valueOf(connectionOptions.g)) && Arrays.equals(this.h, connectionOptions.h) && Arrays.equals(this.i, connectionOptions.i) && atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(connectionOptions.c)) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(connectionOptions.d)) && atyq.b(this.j, connectionOptions.j) && atyq.b(this.k, connectionOptions.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(Arrays.hashCode(this.h)), Integer.valueOf(Arrays.hashCode(this.i)), Boolean.valueOf(this.c), Boolean.valueOf(this.d), this.j});
    }

    public final String toString() {
        return String.format(Locale.US, "ConnectionOptions{strategy: %s,connectionType: %d,enforceTopologyConstraints: %s,keepAliveIntervalMillis: %d,keepAliveTimeoutMillis: %d,upgradeMediums: %s,connectionMediums: %s,allowBluetoothRadioToggling: %b,allowWifiRadioToggling: %b,analyticOptions: %sauthenticationPassword: %s}", this.a, Integer.valueOf(this.b), Boolean.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Arrays.toString(this.h), Arrays.toString(this.i), Boolean.valueOf(this.c), Boolean.valueOf(this.d), this.j, this.k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.o(parcel, 6, this.f);
        atzr.o(parcel, 7, this.g);
        atzr.p(parcel, 8, this.h, false);
        atzr.p(parcel, 9, this.i, false);
        atzr.t(parcel, 10, this.j, i, false);
        atzr.v(parcel, 11, this.k, false);
        atzr.c(parcel, a);
    }

    public ConnectionOptions(Strategy strategy, int i, boolean z, boolean z2, boolean z3, int i2, int i3, int[] iArr, int[] iArr2, AnalyticOptions analyticOptions, String str) {
        this.a = strategy;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = i2;
        this.g = i3;
        this.h = iArr;
        this.i = iArr2;
        this.j = analyticOptions;
        this.k = str;
    }
}
