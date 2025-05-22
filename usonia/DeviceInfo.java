package com.google.android.gms.usonia;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkex;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class DeviceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkex();
    public byte[] a;
    public String b;

    private DeviceInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceInfo) {
            DeviceInfo deviceInfo = (DeviceInfo) obj;
            if (Arrays.equals(this.a, deviceInfo.a) && atyq.b(this.b, deviceInfo.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b});
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public DeviceInfo(byte[] bArr, String str) {
        this.a = bArr;
        this.b = str;
    }
}
