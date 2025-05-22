package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.aurd;
import defpackage.bdxm;
import defpackage.bdxn;
import defpackage.bdyg;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.fqrs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator CREATOR = new bdxn();
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
        if (str3 != null && fqrs.i()) {
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
            } catch (bdyg | JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        atzb.s(bArr);
        this.a = bArr;
        this.b = d;
        atzb.s(str);
        this.c = str;
        this.d = list;
        this.e = num;
        this.f = tokenBinding;
        this.i = l;
        if (str2 != null) {
            try {
                this.g = UserVerificationRequirement.a(str2);
            } catch (bdyg e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.g = null;
        }
        this.h = authenticationExtensions;
    }

    public static PublicKeyCredentialRequestOptions k(JSONObject jSONObject) {
        bdxm bdxmVar = new bdxm();
        bdxmVar.b(aurd.f(jSONObject.getString("challenge")));
        if (jSONObject.has("timeout")) {
            bdxmVar.a = Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d);
        } else if (jSONObject.has("timeoutSeconds")) {
            bdxmVar.a = Double.valueOf(jSONObject.getDouble("timeoutSeconds"));
        }
        bdxmVar.c(jSONObject.getString("rpId"));
        JSONArray jSONArray = jSONObject.has("allowList") ? jSONObject.getJSONArray("allowList") : jSONObject.has("allowCredentials") ? jSONObject.getJSONArray("allowCredentials") : null;
        if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(PublicKeyCredentialDescriptor.b(jSONArray.getJSONObject(i)));
            }
            bdxmVar.b = arrayList;
        }
        if (jSONObject.has("requestId")) {
            bdxmVar.c = Integer.valueOf(jSONObject.getInt("requestId"));
        }
        if (jSONObject.has("tokenBinding")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenBinding");
            bdxmVar.d = new TokenBinding(jSONObject2.getString("status"), jSONObject2.has("id") ? jSONObject2.getString("id") : null);
        }
        if (jSONObject.has("userVerification")) {
            bdxmVar.e = UserVerificationRequirement.a(jSONObject.getString("userVerification"));
        }
        if (jSONObject.has("authenticationExtensions")) {
            bdxmVar.f = AuthenticationExtensions.a(jSONObject.getJSONObject("authenticationExtensions"));
        } else if (jSONObject.has("extensions")) {
            bdxmVar.f = AuthenticationExtensions.a(jSONObject.getJSONObject("extensions"));
        }
        if (jSONObject.has("longRequestId")) {
            bdxmVar.g = Long.valueOf(jSONObject.getLong("longRequestId"));
        }
        return bdxmVar.a();
    }

    public final bdxm a() {
        bdxm bdxmVar = new bdxm();
        bdxmVar.h = this.j;
        bdxmVar.b(this.a);
        bdxmVar.a = this.b;
        bdxmVar.c(this.c);
        bdxmVar.b = this.d;
        bdxmVar.c = this.e;
        bdxmVar.d = this.f;
        bdxmVar.e = this.g;
        bdxmVar.f = this.h;
        bdxmVar.g = this.i;
        return bdxmVar;
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
    public final ekvi e() {
        return ektg.a;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        return Arrays.equals(this.a, publicKeyCredentialRequestOptions.a) && atyq.b(this.b, publicKeyCredentialRequestOptions.b) && atyq.b(this.c, publicKeyCredentialRequestOptions.c) && (((list = this.d) == null && publicKeyCredentialRequestOptions.d == null) || (list != null && (list2 = publicKeyCredentialRequestOptions.d) != null && list.containsAll(list2) && list2.containsAll(list))) && atyq.b(this.e, publicKeyCredentialRequestOptions.e) && atyq.b(this.f, publicKeyCredentialRequestOptions.f) && atyq.b(this.g, publicKeyCredentialRequestOptions.g) && atyq.b(this.h, publicKeyCredentialRequestOptions.h) && atyq.b(this.i, publicKeyCredentialRequestOptions.i);
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
        if (!fqrs.o()) {
            return atzs.n(this);
        }
        bdxm bdxmVar = new bdxm(this);
        bdxmVar.h = null;
        return atzs.n(bdxmVar.a());
    }

    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.h;
        UserVerificationRequirement userVerificationRequirement = this.g;
        TokenBinding tokenBinding = this.f;
        List list = this.d;
        return "PublicKeyCredentialRequestOptions{\n challenge=" + aurd.c(this.a) + ", \n timeoutSeconds=" + this.b + ", \n rpId='" + this.c + "', \n allowList=" + String.valueOf(list) + ", \n requestId=" + this.e + ", \n tokenBinding=" + String.valueOf(tokenBinding) + ", \n userVerification=" + String.valueOf(userVerificationRequirement) + ", \n authenticationExtensions=" + String.valueOf(authenticationExtensions) + ", \n longRequestId=" + this.i + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 2, bArr, false);
        atzr.B(parcel, 3, this.b);
        atzr.v(parcel, 4, this.c, false);
        atzr.y(parcel, 5, this.d, false);
        atzr.F(parcel, 6, this.e);
        atzr.t(parcel, 7, this.f, i, false);
        UserVerificationRequirement userVerificationRequirement = this.g;
        atzr.v(parcel, 8, userVerificationRequirement == null ? null : userVerificationRequirement.d, false);
        atzr.t(parcel, 9, this.h, i, false);
        atzr.I(parcel, 10, this.i);
        atzr.v(parcel, 11, null, false);
        atzr.t(parcel, 12, this.j, i, false);
        atzr.c(parcel, a);
    }
}
