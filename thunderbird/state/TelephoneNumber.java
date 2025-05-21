package com.google.android.gms.thunderbird.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dfyn;
import defpackage.dfyo;
import defpackage.eihn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class TelephoneNumber extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfyo();
    public final String a;
    public final int b;

    public TelephoneNumber(String str, int i) {
        if (str == null || str.trim().isEmpty()) {
            this.a = null;
        } else {
            this.a = str.trim();
        }
        this.b = i;
    }

    public static TelephoneNumber b(String str) {
        return new TelephoneNumber(str, dfyn.CONSTELLATION.ordinal());
    }

    public static TelephoneNumber c(String str) {
        return new TelephoneNumber(str, dfyn.GETLINE1NUMBER.ordinal());
    }

    public final dfyn a() {
        return dfyn.values()[this.b];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TelephoneNumber telephoneNumber = (TelephoneNumber) obj;
            if (eihn.a(this.a, telephoneNumber.a) && this.b == telephoneNumber.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final String toString() {
        return "{Number=" + this.a + ", Source=" + String.valueOf(a()) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
