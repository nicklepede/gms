package com.google.android.gms.nearby.common.ble;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.auur;
import defpackage.auvd;
import defpackage.chfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class BleSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chfo();
    public final int a;
    public final int b;
    public final long c;
    public final List d;
    public final WorkSource e;
    public final int f;

    public BleSettings(int i, int i2, long j, List list, WorkSource workSource, int i3) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = list;
        this.e = workSource;
        this.f = i3;
    }

    public static int a(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 4;
    }

    public static String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "NearbyDirect:BluetoothAdapterWrapper" : "NearbyDirect:BackgroundBleScanner" : "NearbyDirect:BleScan" : "NearbyMediums:Bluetooth_Low_Energy";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BleSettings)) {
            return false;
        }
        BleSettings bleSettings = (BleSettings) obj;
        return this.a == bleSettings.a && this.b == bleSettings.b && this.c == bleSettings.c && atyq.b(this.d, bleSettings.d) && atyq.b(this.e, bleSettings.e) && this.f == bleSettings.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f)});
    }

    public final String toString() {
        int i = this.a;
        String l = i != 0 ? i != 1 ? i != 2 ? i != 3 ? a.l(i, "UNKNOWN(", ")") : "ZERO_POWER" : "LOW_LATENCY" : "BALANCED" : "LOW_POWER";
        int i2 = this.b;
        String j = i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 == 6 ? "FIRST_MATCH | LOST" : a.j(i2, "UNKNOWN: ") : "LOST" : "FIRST_MATCH" : "ALL_MATCHES";
        long j2 = this.c;
        List list = this.d;
        WorkSource workSource = this.e;
        int size = list.size();
        Method method = auvd.a;
        ArrayList arrayList = new ArrayList();
        int a = workSource == null ? 0 : auvd.a(workSource);
        if (a != 0) {
            for (int i3 = 0; i3 < a; i3++) {
                String d = auvd.d(workSource, i3);
                if (!auur.d(d)) {
                    atzb.s(d);
                    arrayList.add(d);
                }
            }
        }
        return "BleSettings [scanMode=" + l + ", callbackType=" + j + ", reportDelayMillis=" + j2 + ", " + size + " filters, " + arrayList.size() + " clients, callingClientName=" + b(this.f) + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.o(parcel, 3, this.b);
        atzr.q(parcel, 4, this.c);
        atzr.y(parcel, 6, this.d, false);
        atzr.t(parcel, 7, this.e, i, false);
        atzr.o(parcel, 8, this.f);
        atzr.c(parcel, a);
    }
}
