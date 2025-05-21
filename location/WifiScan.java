package com.google.android.gms.location;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.bzjf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class WifiScan extends AbstractSafeParcelable {
    public final long c;
    final long[] d;
    final int[] e;
    final int[] f;
    final int[] g;
    final int[] h;
    final int[] i;
    final int[] j;
    public static final long[] a = new long[0];
    public static final int[] b = new int[0];
    public static final Parcelable.Creator CREATOR = new bzjf();

    public WifiScan(long j, long[] jArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6) {
        this.c = j;
        this.d = jArr == null ? a : jArr;
        this.e = iArr == null ? b : iArr;
        this.f = iArr2 == null ? b : iArr2;
        this.g = iArr3 == null ? b : iArr3;
        this.h = iArr4 == null ? b : iArr4;
        this.i = iArr5 == null ? b : iArr5;
        this.j = iArr6 == null ? b : iArr6;
    }

    public static WifiScan j(byte[] bArr) {
        return (WifiScan) arxd.a(bArr, CREATOR);
    }

    public static WifiScan k(Location location) {
        byte[] byteArray;
        Bundle extras = location.getExtras();
        if (extras == null || (byteArray = extras.getByteArray("wifiScan")) == null) {
            return null;
        }
        return j(byteArray);
    }

    private final void l(int i) {
        if (i < 0 || i >= c()) {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds: [0, " + c() + ")");
        }
    }

    public final byte a(int i) {
        l(i);
        return (byte) ((this.d[i] & 71776119061217280L) >>> 48);
    }

    public final int b(int i) {
        l(i);
        return this.e[i];
    }

    public final int c() {
        return this.d.length;
    }

    public final int d(int i) {
        l(i);
        int[] iArr = this.f;
        if (i < iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    public final int e(int i) {
        l(i);
        int[] iArr = this.j;
        if (i < iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WifiScan)) {
            return false;
        }
        WifiScan wifiScan = (WifiScan) obj;
        return wifiScan.c == this.c && Arrays.equals(wifiScan.d, this.d) && Arrays.equals(wifiScan.e, this.e) && Arrays.equals(wifiScan.f, this.f) && Arrays.equals(wifiScan.g, this.g) && Arrays.equals(wifiScan.h, this.h) && Arrays.equals(wifiScan.i, this.i) && Arrays.equals(wifiScan.j, this.j);
    }

    public final int f(int i) {
        l(i);
        int[] iArr = this.i;
        if (i < iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    public final int g(int i) {
        l(i);
        int[] iArr = this.h;
        if (i < iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    public final int h(int i) {
        l(i);
        int[] iArr = this.g;
        if (i < iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d);
    }

    public final long i(int i) {
        l(i);
        return this.d[i] & 281474976710655L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WifiScan[elapsed rt: ");
        sb.append(this.c);
        int c = c();
        for (int i = 0; i < c; i++) {
            sb.append(", Device[mac: ");
            sb.append(i(i));
            sb.append(", dbm: ");
            sb.append((int) a(i));
            sb.append(", mhz: ");
            sb.append(b(i));
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.c;
        int a2 = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.r(parcel, 2, this.d, false);
        arxc.p(parcel, 3, this.e, false);
        arxc.p(parcel, 4, this.f, false);
        arxc.p(parcel, 5, this.g, false);
        arxc.p(parcel, 6, this.h, false);
        arxc.p(parcel, 7, this.i, false);
        arxc.p(parcel, 8, this.j, false);
        arxc.c(parcel, a2);
    }
}
