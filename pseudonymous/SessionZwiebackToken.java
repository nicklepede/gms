package com.google.android.gms.pseudonymous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.cwwt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SessionZwiebackToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwwt();
    public final String a;
    public final String b;

    public SessionZwiebackToken(Parcel parcel) {
        this.a = parcel.readString();
        String readString = parcel.readString();
        arwm.s(readString);
        this.b = readString;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SessionZwiebackToken)) {
            return false;
        }
        SessionZwiebackToken sessionZwiebackToken = (SessionZwiebackToken) obj;
        return arwb.b(this.a, sessionZwiebackToken.a) && arwb.b(this.b, sessionZwiebackToken.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public SessionZwiebackToken(String str, String str2) {
        arwm.s(str);
        this.b = str;
        this.a = str2;
    }
}
