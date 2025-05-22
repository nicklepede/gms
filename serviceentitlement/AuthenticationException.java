package com.google.android.gms.serviceentitlement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.ddzl;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class AuthenticationException extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ddzl();
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public AuthenticationException(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthenticationException) {
            AuthenticationException authenticationException = (AuthenticationException) obj;
            if (this.a == authenticationException.a && this.b == authenticationException.b && this.c.equals(authenticationException.c) && this.d.equals(authenticationException.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "AuthenticationException[errorCode=%d, httpStatusCode=%d, retryAfter=%s, message=%s]", Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }
}
