package com.google.android.gms.mdocstore.types;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.arxo;
import defpackage.cdfs;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class UnencryptedData extends AbstractSafeParcelable implements ReflectedParcelable {
    final byte[] b;
    final String c;
    final int d;
    public static final arxo a = new arxo("UnencryptedData", new String[0]);
    public static final Parcelable.Creator CREATOR = new cdfs();

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
        int a2 = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.v(parcel, 2, this.c, false);
        arxc.o(parcel, 3, this.d);
        arxc.c(parcel, a2);
    }
}
