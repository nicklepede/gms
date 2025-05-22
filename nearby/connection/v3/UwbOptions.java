package com.google.android.gms.nearby.connection.v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.UwbSenderInfo;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cikm;
import defpackage.cmly;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UwbOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cikm();
    public final boolean a;
    public final int b;
    public final int c;
    public final UwbSenderInfo[] d;
    private final byte[] e;

    public UwbOptions(boolean z, int i, int i2, byte[] bArr, UwbSenderInfo[] uwbSenderInfoArr) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.e = bArr;
        this.d = uwbSenderInfoArr;
    }

    public final byte[] a() {
        byte[] bArr = this.e;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UwbOptions) {
            UwbOptions uwbOptions = (UwbOptions) obj;
            if (atyq.b(Boolean.valueOf(this.a), Boolean.valueOf(uwbOptions.a)) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(uwbOptions.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(uwbOptions.c)) && Arrays.equals(this.e, uwbOptions.e) && Arrays.equals(this.d, uwbOptions.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    public final String toString() {
        Locale locale = Locale.US;
        Boolean valueOf = Boolean.valueOf(this.a);
        Integer valueOf2 = Integer.valueOf(this.b);
        Integer valueOf3 = Integer.valueOf(this.c);
        byte[] bArr = this.e;
        return String.format(locale, "AdvertisingOptions{enableUwbRanging: %s, uwbChannel: %d, uwbPreambleIndex: %d, remoteUwbAddress: %s, uwbSenderInfo: %s}", valueOf, valueOf2, valueOf3, bArr == null ? "null" : cmly.b(bArr), Arrays.toString(this.d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.i(parcel, 4, a(), false);
        atzr.J(parcel, 5, this.d, i);
        atzr.c(parcel, a);
    }
}
