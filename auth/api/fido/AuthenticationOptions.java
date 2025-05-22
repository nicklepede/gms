package com.google.android.gms.auth.api.fido;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aazk;
import defpackage.aazl;
import defpackage.aazm;
import defpackage.aazu;
import defpackage.abac;
import defpackage.abao;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bomr;
import defpackage.jdd;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthenticationOptions extends AbstractSafeParcelable implements abao {
    public static final Parcelable.Creator CREATOR = new aazl();
    public final PublicKeyCredentialRequestOptions a;
    public final String b;
    public final String c;
    public final BrowserOptions d;
    public final bomr e;
    public final jdd f;
    public final boolean g;
    public final long h;
    public final ResultReceiver i;

    public AuthenticationOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, String str, String str2, BrowserOptions browserOptions, bomr bomrVar, jdd jddVar, boolean z, long j, ResultReceiver resultReceiver) {
        atzb.c(j > 0, "Must provide a valid endTime.");
        atzb.s(publicKeyCredentialRequestOptions);
        this.a = publicKeyCredentialRequestOptions;
        atzb.s(str);
        this.b = str;
        atzb.s(str2);
        this.c = str2;
        this.d = browserOptions;
        this.e = bomrVar;
        this.f = jddVar;
        this.g = z;
        this.h = j;
        this.i = resultReceiver;
    }

    public static aazk d() {
        aazk aazkVar = new aazk();
        aazkVar.c(false);
        return aazkVar;
    }

    @Override // defpackage.aazv
    public final /* synthetic */ Uri a() {
        return aazu.a(this);
    }

    @Override // defpackage.abao
    public final ResultReceiver b() {
        return this.i;
    }

    @Override // defpackage.aazo
    public final jdd c() {
        return this.f;
    }

    @Override // defpackage.aazv
    public final BrowserOptions e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationOptions)) {
            return false;
        }
        AuthenticationOptions authenticationOptions = (AuthenticationOptions) obj;
        return atyq.b(this.a, authenticationOptions.a) && atyq.b(this.b, authenticationOptions.b) && atyq.b(this.c, authenticationOptions.c) && atyq.b(this.d, authenticationOptions.d) && atyq.b(this.e, authenticationOptions.e) && atyq.b(this.f, authenticationOptions.f) && atyq.b(Boolean.valueOf(this.g), Boolean.valueOf(authenticationOptions.g)) && this.h == authenticationOptions.h && this.i == authenticationOptions.i;
    }

    @Override // defpackage.abae
    public final bomr f() {
        return this.e;
    }

    @Override // defpackage.abao
    public final String g() {
        return this.c;
    }

    @Override // defpackage.abao
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Boolean.valueOf(this.g), Long.valueOf(this.h), this.i});
    }

    @Override // defpackage.abao
    public final boolean i() {
        return this.g;
    }

    @Override // defpackage.aazv
    public final /* synthetic */ boolean j() {
        return aazu.e(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, publicKeyCredentialRequestOptions, i, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.o(parcel, 6, abac.a(this));
        atzr.g(parcel, 7, aazm.a(this), false);
        atzr.e(parcel, 8, this.g);
        atzr.q(parcel, 9, this.h);
        atzr.t(parcel, 10, this.i, i, false);
        atzr.c(parcel, a);
    }
}
