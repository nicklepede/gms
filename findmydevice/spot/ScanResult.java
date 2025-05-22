package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bexx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ScanResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bexx();
    public final Set a;
    public byte[] b;
    public int c;
    public String d;
    public long e;

    public ScanResult(Set set, byte[] bArr, int i, String str, long j) {
        this.a = set;
        this.b = bArr;
        this.c = i;
        this.d = str;
        this.e = j;
    }

    public final boolean a() {
        return this.a.contains(4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScanResult) {
            ScanResult scanResult = (ScanResult) obj;
            if (Arrays.equals(this.b, scanResult.b) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(scanResult.c)) && atyq.b(this.d, scanResult.d) && atyq.b(Long.valueOf(this.e), Long.valueOf(scanResult.e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(this.c), this.d, Long.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(1)) {
            atzr.i(parcel, 1, this.b, true);
        }
        if (set.contains(2)) {
            atzr.o(parcel, 2, this.c);
        }
        if (set.contains(3)) {
            atzr.v(parcel, 3, this.d, true);
        }
        if (set.contains(4)) {
            atzr.q(parcel, 4, this.e);
        }
        atzr.c(parcel, a);
    }

    public ScanResult() {
        this.a = new HashSet();
    }
}
