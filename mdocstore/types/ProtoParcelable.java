package com.google.android.gms.mdocstore.types;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.arxo;
import defpackage.cdfp;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ProtoParcelable extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    final byte[] a;
    final String b;

    static {
        new arxo("ProtoParcelable", new String[0]);
        CREATOR = new cdfp();
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
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
