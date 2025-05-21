package com.google.android.gms.auth.api.fido;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bmfz;
import defpackage.jbn;
import defpackage.yzu;
import defpackage.yzv;
import defpackage.yzw;
import defpackage.zae;
import defpackage.zal;
import defpackage.zax;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthenticationOptions extends AbstractSafeParcelable implements zax {
    public static final Parcelable.Creator CREATOR = new yzv();
    public final PublicKeyCredentialRequestOptions a;
    public final String b;
    public final String c;
    public final BrowserOptions d;
    public final bmfz e;
    public final jbn f;
    public final boolean g;
    public final long h;

    public AuthenticationOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, String str, String str2, BrowserOptions browserOptions, bmfz bmfzVar, jbn jbnVar, boolean z, long j) {
        arwm.c(j > 0, "Must provide a valid endTime.");
        arwm.s(publicKeyCredentialRequestOptions);
        this.a = publicKeyCredentialRequestOptions;
        arwm.s(str);
        this.b = str;
        arwm.s(str2);
        this.c = str2;
        this.d = browserOptions;
        this.e = bmfzVar;
        this.f = jbnVar;
        this.g = z;
        this.h = j;
    }

    public static yzu c() {
        yzu yzuVar = new yzu();
        yzuVar.c(false);
        return yzuVar;
    }

    @Override // defpackage.zaf
    public final /* synthetic */ Uri a() {
        return zae.a(this);
    }

    @Override // defpackage.yzy
    public final jbn b() {
        return this.f;
    }

    @Override // defpackage.zaf
    public final BrowserOptions d() {
        return this.d;
    }

    @Override // defpackage.zan
    public final bmfz e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationOptions)) {
            return false;
        }
        AuthenticationOptions authenticationOptions = (AuthenticationOptions) obj;
        return arwb.b(this.a, authenticationOptions.a) && arwb.b(this.b, authenticationOptions.b) && arwb.b(this.c, authenticationOptions.c) && arwb.b(this.d, authenticationOptions.d) && arwb.b(this.e, authenticationOptions.e) && arwb.b(this.f, authenticationOptions.f) && arwb.b(Boolean.valueOf(this.g), Boolean.valueOf(authenticationOptions.g)) && this.h == authenticationOptions.h;
    }

    @Override // defpackage.zax
    public final String f() {
        return this.c;
    }

    @Override // defpackage.zax
    public final String g() {
        return this.b;
    }

    @Override // defpackage.zax
    public final boolean h() {
        return this.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Boolean.valueOf(this.g), Long.valueOf(this.h)});
    }

    @Override // defpackage.zaf
    public final /* synthetic */ boolean i() {
        return zae.e(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, publicKeyCredentialRequestOptions, i, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.o(parcel, 6, zal.a(this));
        arxc.g(parcel, 7, yzw.a(this), false);
        arxc.e(parcel, 8, this.g);
        arxc.q(parcel, 9, this.h);
        arxc.c(parcel, a);
    }
}
