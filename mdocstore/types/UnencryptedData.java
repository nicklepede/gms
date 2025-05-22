package com.google.android.gms.mdocstore.types;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.auad;
import defpackage.cfor;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UnencryptedData extends AbstractSafeParcelable implements ReflectedParcelable {
    final byte[] b;
    final String c;
    final int d;
    public static final auad a = new auad("UnencryptedData", new String[0]);
    public static final Parcelable.Creator CREATOR = new cfor();

    public UnencryptedData(byte[] bArr, String str, int i) {
        this.b = bArr;
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnencryptedData)) {
            return false;
        }
        UnencryptedData unencryptedData = (UnencryptedData) obj;
        return this.d == unencryptedData.d && Arrays.equals(this.b, unencryptedData.b);
    }

    public final int hashCode() {
        return (Objects.hash(Integer.valueOf(this.d)) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "UnencryptedData{data=" + Arrays.toString(this.b) + ", aad=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.b;
        int a2 = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.v(parcel, 2, this.c, false);
        atzr.o(parcel, 3, this.d);
        atzr.c(parcel, a2);
    }
}
