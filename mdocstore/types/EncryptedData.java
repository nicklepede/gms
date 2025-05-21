package com.google.android.gms.mdocstore.types;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.arxo;
import defpackage.cdfn;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class EncryptedData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    public final String b;
    final int c;

    static {
        new arxo("EncryptedData", new String[0]);
        CREATOR = new cdfn();
    }

    public EncryptedData(byte[] bArr, String str, int i) {
        this.a = bArr;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptedData)) {
            return false;
        }
        EncryptedData encryptedData = (EncryptedData) obj;
        return this.c == encryptedData.c && Arrays.equals(this.a, encryptedData.a);
    }

    public final int hashCode() {
        return (Objects.hash(Integer.valueOf(this.c)) * 31) + Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "EncryptedData{data=" + Arrays.toString(this.a) + ", aad=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
