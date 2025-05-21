package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.zdm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zdm();
    public final String a;
    public final String b;

    public SignInPassword(String str, String str2) {
        arwm.t(str, "Account identifier cannot be null");
        String trim = str.trim();
        arwm.r(trim, "Account identifier cannot be empty");
        this.a = trim;
        arwm.q(str2);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return arwb.b(this.a, signInPassword.a) && arwb.b(this.b, signInPassword.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
