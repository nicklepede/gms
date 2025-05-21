package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.asnj;
import defpackage.bbsp;
import defpackage.eiid;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator CREATOR = new bbsp();
    public final PublicKeyCredentialCreationOptions a;
    public final Uri b;
    public final byte[] c;
    public final Bundle d;

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr, Bundle bundle) {
        arwm.s(publicKeyCredentialCreationOptions);
        this.a = publicKeyCredentialCreationOptions;
        l(uri);
        this.b = uri;
        k(bArr);
        this.c = bArr;
        this.d = bundle;
    }

    public static void k(byte[] bArr) {
        boolean z = true;
        if (bArr != null && bArr.length != 32) {
            z = false;
        }
        arwm.c(z, "clientDataHash must be 32 bytes long");
    }

    public static void l(Uri uri) {
        arwm.s(uri);
        arwm.c(uri.getScheme() != null, "origin scheme must be non-empty");
        arwm.c(uri.getAuthority() != null, "origin authority must be non-empty");
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    public final Uri a() {
        return this.b;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final ResultReceiver b() {
        return this.a.m;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final AuthenticationExtensions c() {
        return this.a.k;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final TokenBinding d() {
        return this.a.i;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final eiid e() {
        return eiid.i(this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        return arwb.b(this.a, browserPublicKeyCredentialCreationOptions.a) && arwb.b(this.b, browserPublicKeyCredentialCreationOptions.b) && arwb.b(this.d, browserPublicKeyCredentialCreationOptions.d);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final Double f() {
        return this.a.e;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final Integer g() {
        return this.a.h;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final void h(ResultReceiver resultReceiver) {
        this.a.m = resultReceiver;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d});
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final byte[] i() {
        return this.a.c;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final byte[] j() {
        return arxd.n(this);
    }

    public final String toString() {
        Bundle bundle = this.d;
        byte[] bArr = this.c;
        Uri uri = this.b;
        return "BrowserPublicKeyCredentialCreationOptions{\n publicKeyCredentialCreationOptions=" + this.a.toString() + ", \n origin=" + String.valueOf(uri) + ", \n clientDataHash=" + asnj.c(bArr) + ", \n chromeParameters=" + String.valueOf(bundle) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, publicKeyCredentialCreationOptions, i, false);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.i(parcel, 4, this.c, false);
        arxc.g(parcel, 5, this.d, false);
        arxc.c(parcel, a);
    }
}
