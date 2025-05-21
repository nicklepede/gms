package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dkgo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AmsEntityUpdateParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkgo();
    public final byte a;
    public final byte b;
    public final String c;

    public AmsEntityUpdateParcelable(byte b, byte b2, String str) {
        this.a = b;
        this.b = b2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AmsEntityUpdateParcelable amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) obj;
        return this.a == amsEntityUpdateParcelable.a && this.b == amsEntityUpdateParcelable.b && this.c.equals(amsEntityUpdateParcelable.c);
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "AmsEntityUpdateParcelable{, mEntityId=" + ((int) this.a) + ", mAttributeId=" + ((int) this.b) + ", mValue='" + this.c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.h(parcel, 2, this.a);
        arxc.h(parcel, 3, this.b);
        arxc.v(parcel, 4, this.c, false);
        arxc.c(parcel, a);
    }
}
