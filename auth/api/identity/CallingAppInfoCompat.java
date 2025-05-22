package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abcg;
import defpackage.atzr;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CallingAppInfoCompat extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abcg();
    public final String a;
    public final SigningInfoCompat b;
    public final String c;

    public CallingAppInfoCompat(String str, SigningInfoCompat signingInfoCompat, String str2) {
        this.a = str;
        this.b = signingInfoCompat;
        this.c = str2;
    }

    public final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallingAppInfoCompat)) {
            return false;
        }
        CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) obj;
        return this.a.equals(callingAppInfoCompat.a) && this.b.equals(callingAppInfoCompat.b) && Objects.equals(this.c, callingAppInfoCompat.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        return "CallingAppInfoCompat{packageName='" + this.a + "', signingInfo=" + this.b + ", origin='" + this.c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
