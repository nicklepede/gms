package com.google.android.gms.nearby.messages.ble;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cmka;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class BleFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmka();
    public final int a;
    public final ParcelUuid b;
    public final ParcelUuid c;
    public final ParcelUuid d;
    public final byte[] e;
    public final byte[] f;
    public final int g;
    public final byte[] h;
    public final byte[] i;

    public BleFilter(int i, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        this.a = i;
        this.b = parcelUuid;
        this.c = parcelUuid2;
        this.d = parcelUuid3;
        this.e = bArr;
        this.f = bArr2;
        this.g = i2;
        this.h = bArr3;
        this.i = bArr4;
    }

    public static boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr3 == null || bArr3.length < bArr.length) {
            return false;
        }
        if (bArr2 == null) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr3[i] != bArr[i]) {
                    return false;
                }
            }
            return true;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b = bArr2[i2];
            if ((bArr3[i2] & b) != (b & bArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BleFilter bleFilter = (BleFilter) obj;
            if (this.g == bleFilter.g && Arrays.equals(this.h, bleFilter.h) && Arrays.equals(this.i, bleFilter.i) && atyq.b(this.d, bleFilter.d) && Arrays.equals(this.e, bleFilter.e) && Arrays.equals(this.f, bleFilter.f) && atyq.b(this.b, bleFilter.b) && atyq.b(this.c, bleFilter.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.g), Integer.valueOf(Arrays.hashCode(this.h)), Integer.valueOf(Arrays.hashCode(this.i)), this.d, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.t(parcel, 4, this.b, i, false);
        atzr.t(parcel, 5, this.c, i, false);
        atzr.t(parcel, 6, this.d, i, false);
        atzr.i(parcel, 7, this.e, false);
        atzr.i(parcel, 8, this.f, false);
        atzr.o(parcel, 9, this.g);
        atzr.i(parcel, 10, this.h, false);
        atzr.i(parcel, 11, this.i, false);
        atzr.c(parcel, a);
    }
}
