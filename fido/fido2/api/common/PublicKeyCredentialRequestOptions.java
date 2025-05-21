package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.asnj;
import defpackage.bbtv;
import defpackage.bbtw;
import defpackage.bbup;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.fnzw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator CREATOR = new bbtw();
    public final byte[] a;
    public final Double b;
    public final String c;
    public final List d;
    public final Integer e;
    public final TokenBinding f;
    public final UserVerificationRequirement g;
    public final AuthenticationExtensions h;
    public final Long i;
    public ResultReceiver j;

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d, String str, List list, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l, String str3, ResultReceiver resultReceiver) {
        this.j = resultReceiver;
        if (str3 != null && fnzw.j()) {
            try {
                PublicKeyCredentialRequestOptions k = k(new JSONObject(str3));
                this.a = k.a;
                this.b = k.b;
                this.c = k.c;
                this.d = k.d;
                this.e = k.e;
                this.f = k.f;
                this.g = k.g;
                this.h = k.h;
                this.i = k.i;
                return;
            } catch (bbup | JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        arwm.s(bArr);
        this.a = bArr;
        this.b = d;
        arwm.s(str);
        this.c = str;
        this.d = list;
        this.e = num;
        this.f = tokenBinding;
        this.i = l;
        if (str2 != null) {
            try {
                this.g = UserVerificationRequirement.a(str2);
            } catch (bbup e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.g = null;
        }
        this.h = authenticationExtensions;
    }

    public static PublicKeyCredentialRequestOptions k(JSONObject jSONObject) {
        bbtv bbtvVar = new bbtv();
        bbtvVar.b(asnj.f(jSONObject.getString("challenge")));
        if (jSONObject.has("timeout")) {
            bbtvVar.a = Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d);
        } else if (jSONObject.has("timeoutSeconds")) {
            bbtvVar.a = Double.valueOf(jSONObject.getDouble("timeoutSeconds"));
        }
        bbtvVar.c(jSONObject.getString("rpId"));
        JSONArray jSONArray = jSONObject.has("allowList") ? jSONObject.getJSONArray("allowList") : jSONObject.has("allowCredentials") ? jSONObject.getJSONArray("allowCredentials") : null;
        if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(PublicKeyCredentialDescriptor.b(jSONArray.getJSONObject(i)));
            }
            bbtvVar.b = arrayList;
        }
        if (jSONObject.has("requestId")) {
            bbtvVar.c = Integer.valueOf(jSONObject.getInt("requestId"));
        }
        if (jSONObject.has("tokenBinding")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenBinding");
            bbtvVar.d = new TokenBinding(jSONObject2.getString("status"), jSONObject2.has("id") ? jSONObject2.getString("id") : null);
        }
        if (jSONObject.has("userVerification")) {
            bbtvVar.e = UserVerificationRequirement.a(jSONObject.getString("userVerification"));
        }
        if (jSONObject.has("authenticationExtensions")) {
            bbtvVar.f = AuthenticationExtensions.a(jSONObject.getJSONObject("authenticationExtensions"));
        } else if (jSONObject.has("extensions")) {
            bbtvVar.f = AuthenticationExtensions.a(jSONObject.getJSONObject("extensions"));
        }
        if (jSONObject.has("longRequestId")) {
            bbtvVar.g = Long.valueOf(jSONObject.getLong("longRequestId"));
        }
        return bbtvVar.a();
    }

    public final bbtv a() {
        bbtv bbtvVar = new bbtv();
        bbtvVar.h = this.j;
        bbtvVar.b(this.a);
        bbtvVar.a = this.b;
        bbtvVar.c(this.c);
        bbtvVar.b = this.d;
        bbtvVar.c = this.e;
        bbtvVar.d = this.f;
        bbtvVar.e = this.g;
        bbtvVar.f = this.h;
        bbtvVar.g = this.i;
        return bbtvVar;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final ResultReceiver b() {
        return this.j;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final AuthenticationExtensions c() {
        return this.h;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final TokenBinding d() {
        return this.f;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final eiid e() {
        return eigb.a;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        return Arrays.equals(this.a, publicKeyCredentialRequestOptions.a) && arwb.b(this.b, publicKeyCredentialRequestOptions.b) && arwb.b(this.c, publicKeyCredentialRequestOptions.c) && (((list = this.d) == null && publicKeyCredentialRequestOptions.d == null) || (list != null && (list2 = publicKeyCredentialRequestOptions.d) != null && list.containsAll(list2) && list2.containsAll(list))) && arwb.b(this.e, publicKeyCredentialRequestOptions.e) && arwb.b(this.f, publicKeyCredentialRequestOptions.f) && arwb.b(this.g, publicKeyCredentialRequestOptions.g) && arwb.b(this.h, publicKeyCredentialRequestOptions.h) && arwb.b(this.i, publicKeyCredentialRequestOptions.i);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final Double f() {
        return this.b;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final Integer g() {
        return this.e;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final void h(ResultReceiver resultReceiver) {
        this.j = resultReceiver;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i});
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final byte[] i() {
        return this.a;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final byte[] j() {
        if (!fnzw.p()) {
            return arxd.n(this);
        }
        bbtv bbtvVar = new bbtv(this);
        bbtvVar.h = null;
        return arxd.n(bbtvVar.a());
    }

    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.h;
        UserVerificationRequirement userVerificationRequirement = this.g;
        TokenBinding tokenBinding = this.f;
        List list = this.d;
        return "PublicKeyCredentialRequestOptions{\n challenge=" + asnj.c(this.a) + ", \n timeoutSeconds=" + this.b + ", \n rpId='" + this.c + "', \n allowList=" + String.valueOf(list) + ", \n requestId=" + this.e + ", \n tokenBinding=" + String.valueOf(tokenBinding) + ", \n userVerification=" + String.valueOf(userVerificationRequirement) + ", \n authenticationExtensions=" + String.valueOf(authenticationExtensions) + ", \n longRequestId=" + this.i + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, bArr, false);
        arxc.B(parcel, 3, this.b);
        arxc.v(parcel, 4, this.c, false);
        arxc.y(parcel, 5, this.d, false);
        arxc.F(parcel, 6, this.e);
        arxc.t(parcel, 7, this.f, i, false);
        UserVerificationRequirement userVerificationRequirement = this.g;
        arxc.v(parcel, 8, userVerificationRequirement == null ? null : userVerificationRequirement.d, false);
        arxc.t(parcel, 9, this.h, i, false);
        arxc.I(parcel, 10, this.i);
        arxc.v(parcel, 11, null, false);
        arxc.t(parcel, 12, this.j, i, false);
        arxc.c(parcel, a);
    }
}
