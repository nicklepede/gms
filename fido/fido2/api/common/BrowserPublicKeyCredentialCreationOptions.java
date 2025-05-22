package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.aurd;
import defpackage.bdwg;
import defpackage.ekvi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator CREATOR = new bdwg();
    public final PublicKeyCredentialCreationOptions a;
    public final Uri b;
    public final byte[] c;
    public final Bundle d;

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr, Bundle bundle) {
        atzb.s(publicKeyCredentialCreationOptions);
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
    public final ekvi e() {
        return ekvi.i(this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        return atyq.b(this.a, browserPublicKeyCredentialCreationOptions.a) && atyq.b(this.b, browserPublicKeyCredentialCreationOptions.b) && atyq.b(this.d, browserPublicKeyCredentialCreationOptions.d);
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
        return atzs.n(this);
    }

    public final String toString() {
        Bundle bundle = this.d;
        byte[] bArr = this.c;
        Uri uri = this.b;
        return "BrowserPublicKeyCredentialCreationOptions{\n publicKeyCredentialCreationOptions=" + this.a.toString() + ", \n origin=" + String.valueOf(uri) + ", \n clientDataHash=" + aurd.c(bArr) + ", \n chromeParameters=" + String.valueOf(bundle) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, publicKeyCredentialCreationOptions, i, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.i(parcel, 4, this.c, false);
        atzr.g(parcel, 5, this.d, false);
        atzr.c(parcel, a);
    }
}
