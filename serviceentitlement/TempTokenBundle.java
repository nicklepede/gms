package com.google.android.gms.serviceentitlement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dbpm;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TempTokenBundle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbpm();
    public final String a;
    public final AuthenticationException b;

    public TempTokenBundle(String str, AuthenticationException authenticationException) {
        this.a = str;
        this.b = authenticationException;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TempTokenBundle) {
            TempTokenBundle tempTokenBundle = (TempTokenBundle) obj;
            if (Objects.equals(this.a, tempTokenBundle.a) && Objects.equals(this.b, tempTokenBundle.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "TempTokenResult[tempToken=%s], authenticationException=%s]", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
