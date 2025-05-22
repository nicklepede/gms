package com.google.android.gms.mdocstore.types;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.auad;
import defpackage.cfoo;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ProtoParcelable extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    final byte[] a;
    final String b;

    static {
        new auad("ProtoParcelable", new String[0]);
        CREATOR = new cfoo();
    }

    public ProtoParcelable(byte[] bArr, String str) {
        this.a = bArr;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoParcelable)) {
            return false;
        }
        ProtoParcelable protoParcelable = (ProtoParcelable) obj;
        if (Arrays.equals(this.a, protoParcelable.a)) {
            return Objects.equals(this.b, protoParcelable.b);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ProtoParcelable{protoBytes=" + Arrays.toString(this.a) + ", filename='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
