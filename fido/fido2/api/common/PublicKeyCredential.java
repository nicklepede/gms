package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.aurd;
import defpackage.bdxi;
import defpackage.fgpr;
import defpackage.fqrs;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdxi();
    public final String b;
    public final String c;
    public final fgpr d;
    public final AuthenticatorAttestationResponse e;
    public final AuthenticatorAssertionResponse f;
    public final AuthenticatorErrorResponse g;
    public final AuthenticationExtensionsClientOutputs h;
    public final String i;
    public String j;

    public PublicKeyCredential(String str, String str2, fgpr fgprVar, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        boolean z = true;
        atzb.c((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null), "Must provide a response object.");
        if (authenticatorErrorResponse == null && (str == null || fgprVar == null)) {
            z = false;
        }
        atzb.c(z, "Must provide id and rawId if not an error response.");
        this.b = str;
        this.c = str2;
        this.d = fgprVar;
        this.e = authenticatorAttestationResponse;
        this.f = authenticatorAssertionResponse;
        this.g = authenticatorErrorResponse;
        this.h = authenticationExtensionsClientOutputs;
        this.i = str3;
        this.j = null;
    }

    public static PublicKeyCredential b(byte[] bArr) {
        return (PublicKeyCredential) atzs.a(bArr, CREATOR);
    }

    public final AuthenticatorResponse a() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.e;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.g;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException("No response set.");
    }

    public final String c() {
        return d().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0302 A[Catch: JSONException -> 0x031e, TryCatch #8 {JSONException -> 0x031e, blocks: (B:3:0x0002, B:5:0x000b, B:7:0x0012, B:8:0x001f, B:10:0x0023, B:11:0x0028, B:13:0x002c, B:15:0x0030, B:16:0x0035, B:18:0x0039, B:19:0x003e, B:28:0x0302, B:29:0x0305, B:32:0x030b, B:36:0x0315, B:22:0x008d, B:24:0x02d5, B:45:0x02f6, B:46:0x02fd, B:152:0x02cd, B:153:0x02d4, B:161:0x0085, B:162:0x008c, B:155:0x0048, B:157:0x0074, B:39:0x02da, B:41:0x02ec, B:48:0x0091, B:49:0x00b4, B:51:0x00b9, B:53:0x00c5, B:55:0x00d0, B:56:0x00cb, B:59:0x00d3, B:61:0x00dc, B:63:0x00e4, B:65:0x00f5, B:66:0x00fb, B:68:0x00ff, B:70:0x0111, B:72:0x012f, B:73:0x0143, B:78:0x0165, B:85:0x025d, B:87:0x0271, B:89:0x0188, B:91:0x0199, B:96:0x01af, B:99:0x01cb, B:101:0x01df, B:103:0x01e5, B:105:0x0202, B:106:0x0209, B:107:0x020a, B:108:0x020f, B:113:0x021c, B:115:0x0229, B:117:0x0237, B:118:0x0251, B:119:0x0256, B:120:0x0257, B:121:0x025c, B:122:0x027f, B:123:0x0284, B:125:0x0286, B:126:0x028d, B:127:0x028e, B:128:0x0293, B:132:0x0297, B:133:0x029e, B:135:0x029f, B:136:0x02a6, B:138:0x02a8, B:139:0x02af, B:140:0x02b0, B:141:0x02b7, B:143:0x02b9, B:144:0x02c0, B:148:0x02c4, B:149:0x02cb), top: B:2:0x0002, inners: #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x030b A[Catch: JSONException -> 0x031e, TRY_ENTER, TryCatch #8 {JSONException -> 0x031e, blocks: (B:3:0x0002, B:5:0x000b, B:7:0x0012, B:8:0x001f, B:10:0x0023, B:11:0x0028, B:13:0x002c, B:15:0x0030, B:16:0x0035, B:18:0x0039, B:19:0x003e, B:28:0x0302, B:29:0x0305, B:32:0x030b, B:36:0x0315, B:22:0x008d, B:24:0x02d5, B:45:0x02f6, B:46:0x02fd, B:152:0x02cd, B:153:0x02d4, B:161:0x0085, B:162:0x008c, B:155:0x0048, B:157:0x0074, B:39:0x02da, B:41:0x02ec, B:48:0x0091, B:49:0x00b4, B:51:0x00b9, B:53:0x00c5, B:55:0x00d0, B:56:0x00cb, B:59:0x00d3, B:61:0x00dc, B:63:0x00e4, B:65:0x00f5, B:66:0x00fb, B:68:0x00ff, B:70:0x0111, B:72:0x012f, B:73:0x0143, B:78:0x0165, B:85:0x025d, B:87:0x0271, B:89:0x0188, B:91:0x0199, B:96:0x01af, B:99:0x01cb, B:101:0x01df, B:103:0x01e5, B:105:0x0202, B:106:0x0209, B:107:0x020a, B:108:0x020f, B:113:0x021c, B:115:0x0229, B:117:0x0237, B:118:0x0251, B:119:0x0256, B:120:0x0257, B:121:0x025c, B:122:0x027f, B:123:0x0284, B:125:0x0286, B:126:0x028d, B:127:0x028e, B:128:0x0293, B:132:0x0297, B:133:0x029e, B:135:0x029f, B:136:0x02a6, B:138:0x02a8, B:139:0x02af, B:140:0x02b0, B:141:0x02b7, B:143:0x02b9, B:144:0x02c0, B:148:0x02c4, B:149:0x02cb), top: B:2:0x0002, inners: #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0271 A[Catch: JSONException -> 0x02cc, TRY_LEAVE, TryCatch #5 {JSONException -> 0x02cc, blocks: (B:48:0x0091, B:49:0x00b4, B:51:0x00b9, B:53:0x00c5, B:55:0x00d0, B:56:0x00cb, B:59:0x00d3, B:61:0x00dc, B:63:0x00e4, B:65:0x00f5, B:66:0x00fb, B:68:0x00ff, B:70:0x0111, B:72:0x012f, B:73:0x0143, B:78:0x0165, B:85:0x025d, B:87:0x0271, B:89:0x0188, B:91:0x0199, B:96:0x01af, B:99:0x01cb, B:101:0x01df, B:103:0x01e5, B:105:0x0202, B:106:0x0209, B:107:0x020a, B:108:0x020f, B:113:0x021c, B:115:0x0229, B:117:0x0237, B:118:0x0251, B:119:0x0256, B:120:0x0257, B:121:0x025c, B:122:0x027f, B:123:0x0284, B:125:0x0286, B:126:0x028d, B:127:0x028e, B:128:0x0293, B:132:0x0297, B:133:0x029e, B:135:0x029f, B:136:0x02a6, B:138:0x02a8, B:139:0x02af, B:140:0x02b0, B:141:0x02b7, B:143:0x02b9, B:144:0x02c0, B:148:0x02c4, B:149:0x02cb), top: B:47:0x0091, outer: #8, inners: #0, #6, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject d() {
        /*
            Method dump skipped, instructions count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.d():org.json.JSONObject");
    }

    public final byte[] e() {
        fgpr fgprVar = this.d;
        if (fgprVar == null) {
            return null;
        }
        return fgprVar.M();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return atyq.b(this.b, publicKeyCredential.b) && atyq.b(this.c, publicKeyCredential.c) && atyq.b(this.d, publicKeyCredential.d) && atyq.b(this.e, publicKeyCredential.e) && atyq.b(this.f, publicKeyCredential.f) && atyq.b(this.g, publicKeyCredential.g) && atyq.b(this.h, publicKeyCredential.h) && atyq.b(this.i, publicKeyCredential.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.f, this.e, this.g, this.h, this.i});
    }

    public final String toString() {
        fgpr fgprVar = this.d;
        byte[] M = fgprVar == null ? null : fgprVar.M();
        String str = this.c;
        String str2 = this.b;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.e;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.g;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.h;
        String str3 = this.i;
        return "PublicKeyCredential{\n id='" + str2 + "', \n type='" + str + "', \n rawId=" + aurd.c(M) + ", \n registerResponse=" + String.valueOf(authenticatorAttestationResponse) + ", \n signResponse=" + String.valueOf(authenticatorAssertionResponse) + ", \n errorResponse=" + String.valueOf(authenticatorErrorResponse) + ", \n extensionsClientOutputs=" + String.valueOf(authenticationExtensionsClientOutputs) + ", \n authenticatorAttachment='" + str3 + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (fqrs.i()) {
            this.j = d().toString();
        }
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.b, false);
        atzr.v(parcel, 2, this.c, false);
        atzr.i(parcel, 3, e(), false);
        atzr.t(parcel, 4, this.e, i, false);
        atzr.t(parcel, 5, this.f, i, false);
        atzr.t(parcel, 6, this.g, i, false);
        atzr.t(parcel, 7, this.h, i, false);
        atzr.v(parcel, 8, this.i, false);
        atzr.v(parcel, 9, this.j, false);
        atzr.c(parcel, a);
        this.j = null;
    }
}
