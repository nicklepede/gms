package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.aurd;
import defpackage.bdwi;
import defpackage.ekvi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator CREATOR = new bdwi();
    public final PublicKeyCredentialRequestOptions a;
    public final Uri b;
    public final byte[] c;

    public BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, Uri uri, byte[] bArr) {
        atzb.s(publicKeyCredentialRequestOptions);
        this.a = publicKeyCredentialRequestOptions;
        l(uri);
        this.b = uri;
        k(bArr);
        this.c = bArr;
    }

    public static void k(byte[] bArr) {
        boolean z = true;
        if (bArr != null && bArr.length != 32) {
            z = false;
        }
        atzb.c(z, "clientDataHash must be 32 bytes long");
    }

    public static void l(Uri uri) {
        atzb.s(uri);
        atzb.c(uri.getScheme() != null, "origin scheme must be non-empty");
        atzb.c(uri.getAuthority() != null, "origin authority must be non-empty");
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    public final Uri a() {
        return this.b;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final ResultReceiver b() {
        return this.a.j;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final AuthenticationExtensions c() {
        return this.a.h;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final TokenBinding d() {
        return this.a.f;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final ekvi e() {
        return ekvi.i(this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        return atyq.b(this.a, browserPublicKeyCredentialRequestOptions.a) && atyq.b(this.b, browserPublicKeyCredentialRequestOptions.b);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final Double f() {
        return this.a.b;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final Integer g() {
        return this.a.e;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final void h(ResultReceiver resultReceiver) {
        this.a.j = resultReceiver;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final byte[] i() {
        return this.a.a;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final byte[] j() {
        return atzs.n(this);
    }

    public final String toString() {
        byte[] bArr = this.c;
        Uri uri = this.b;
        return "BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=" + this.a.toString() + ", \n origin=" + String.valueOf(uri) + ", \n clientDataHash=" + aurd.c(bArr) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, publicKeyCredentialRequestOptions, i, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.i(parcel, 4, this.c, false);
        atzr.c(parcel, a);
    }
}
