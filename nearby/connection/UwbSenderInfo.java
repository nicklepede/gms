package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chnp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UwbSenderInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chnp();
    public byte[] a;
    public int b;
    public int c;

    public UwbSenderInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UwbSenderInfo) {
            UwbSenderInfo uwbSenderInfo = (UwbSenderInfo) obj;
            if (Arrays.equals(this.a, uwbSenderInfo.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(uwbSenderInfo.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(uwbSenderInfo.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "UwbSenderInfo{address=" + Arrays.toString(this.a) + ", channel=" + this.b + ", preambleIndex=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, this.a, false);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public UwbSenderInfo(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }
}
