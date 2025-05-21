package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.zdl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zdl();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String g;
    public final String h;
    public final PublicKeyCredential i;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        arwm.s(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = publicKeyCredential;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return arwb.b(this.a, signInCredential.a) && arwb.b(this.b, signInCredential.b) && arwb.b(this.c, signInCredential.c) && arwb.b(this.d, signInCredential.d) && arwb.b(this.e, signInCredential.e) && arwb.b(this.f, signInCredential.f) && arwb.b(this.g, signInCredential.g) && arwb.b(this.h, signInCredential.h) && arwb.b(this.i, signInCredential.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.c(parcel, a);
    }
}
