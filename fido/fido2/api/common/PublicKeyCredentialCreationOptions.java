package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.aurd;
import defpackage.bdvo;
import defpackage.bdxg;
import defpackage.bdxh;
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
public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator CREATOR = new bdxh();
    public final PublicKeyCredentialRpEntity a;
    public final PublicKeyCredentialUserEntity b;
    public final byte[] c;
    public final List d;
    public final Double e;
    public final List f;
    public final AuthenticatorSelectionCriteria g;
    public final Integer h;
    public final TokenBinding i;
    public final AttestationConveyancePreference j;
    public final AuthenticationExtensions k;
    public final String l;
    public ResultReceiver m;
    public final List n;

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, List list, Double d, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions, String str2, ResultReceiver resultReceiver, List list3) {
        this.m = resultReceiver;
        if (str2 != null) {
            try {
                PublicKeyCredentialCreationOptions k = k(new JSONObject(str2));
                this.a = k.a;
                this.b = k.b;
                this.c = k.c;
                this.d = k.d;
                this.e = k.e;
                this.f = k.f;
                this.g = k.g;
                this.h = k.h;
                this.i = k.i;
                this.j = k.j;
                this.k = k.k;
                this.n = k.n;
                this.l = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        atzb.s(publicKeyCredentialRpEntity);
        this.a = publicKeyCredentialRpEntity;
        atzb.s(publicKeyCredentialUserEntity);
        this.b = publicKeyCredentialUserEntity;
        atzb.s(bArr);
        this.c = bArr;
        atzb.s(list);
        this.d = list;
        this.e = d;
        this.f = list2;
        this.g = authenticatorSelectionCriteria;
        this.h = num;
        this.i = tokenBinding;
        if (str != null) {
            try {
                this.j = AttestationConveyancePreference.a(str);
            } catch (bdvo e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.j = null;
        }
        this.k = authenticationExtensions;
        this.l = null;
        this.n = list3;
    }

    public static PublicKeyCredentialCreationOptions k(JSONObject jSONObject) {
        bdxg bdxgVar = new bdxg();
        bdxgVar.a = PublicKeyCredentialRpEntity.a(jSONObject.getJSONObject("rp"));
        bdxgVar.b = PublicKeyCredentialUserEntity.a(jSONObject.getJSONObject("user"));
        bdxgVar.b(aurd.f(jSONObject.getString("challenge")));
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            ekvi b = PublicKeyCredentialParameters.b(jSONArray.getJSONObject(i));
            if (b.h()) {
                arrayList.add(b.c());
            }
        }
        bdxgVar.c(arrayList);
        if (jSONObject.has("timeout")) {
            bdxgVar.c = Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d);
        }
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(PublicKeyCredentialDescriptor.b(jSONArray2.getJSONObject(i2)));
            }
            bdxgVar.d = arrayList2;
        }
        if (jSONObject.has("authenticatorSelection")) {
            bdxgVar.e = AuthenticatorSelectionCriteria.a(jSONObject.getJSONObject("authenticatorSelection"));
        }
        if (jSONObject.has("extensions")) {
            bdxgVar.i = AuthenticationExtensions.a(jSONObject.getJSONObject("extensions"));
        }
        if (jSONObject.has("attestation")) {
            try {
                bdxgVar.h = AttestationConveyancePreference.a(jSONObject.getString("attestation"));
            } catch (bdvo e) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e);
                bdxgVar.h = AttestationConveyancePreference.NONE;
            }
        }
        if (jSONObject.has("attestationFormats")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("attestationFormats");
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                arrayList3.add(jSONArray3.getString(i3));
            }
            bdxgVar.j = arrayList3;
        }
        return bdxgVar.a();
    }

    public final bdxg a() {
        bdxg bdxgVar = new bdxg();
        bdxgVar.a = this.a;
        bdxgVar.b = this.b;
        bdxgVar.b(this.c);
        bdxgVar.c(this.d);
        bdxgVar.c = this.e;
        bdxgVar.d = this.f;
        bdxgVar.e = this.g;
        bdxgVar.f = this.h;
        bdxgVar.g = this.i;
        bdxgVar.h = this.j;
        bdxgVar.i = this.k;
        bdxgVar.j = this.n;
        return bdxgVar;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final ResultReceiver b() {
        return this.m;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final AuthenticationExtensions c() {
        return this.k;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final TokenBinding d() {
        return this.i;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final ekvi e() {
        return ektg.a;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        List list3;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (atyq.b(this.a, publicKeyCredentialCreationOptions.a) && atyq.b(this.b, publicKeyCredentialCreationOptions.b) && Arrays.equals(this.c, publicKeyCredentialCreationOptions.c) && atyq.b(this.e, publicKeyCredentialCreationOptions.e)) {
            List list4 = this.d;
            List list5 = publicKeyCredentialCreationOptions.d;
            if (list4.containsAll(list5) && list5.containsAll(list4) && ((((list = this.f) == null && publicKeyCredentialCreationOptions.f == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.f) != null && list.containsAll(list2) && list2.containsAll(list))) && atyq.b(this.g, publicKeyCredentialCreationOptions.g) && atyq.b(this.h, publicKeyCredentialCreationOptions.h) && atyq.b(this.i, publicKeyCredentialCreationOptions.i) && atyq.b(this.j, publicKeyCredentialCreationOptions.j) && atyq.b(this.k, publicKeyCredentialCreationOptions.k) && atyq.b(this.l, publicKeyCredentialCreationOptions.l))) {
                List list6 = this.n;
                if (list6 == null && publicKeyCredentialCreationOptions.n == null) {
                    return true;
                }
                return list6 != null && (list3 = publicKeyCredentialCreationOptions.n) != null && list6.containsAll(list3) && list3.containsAll(list6);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final Double f() {
        return this.e;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final Integer g() {
        return this.h;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final void h(ResultReceiver resultReceiver) {
        this.m = resultReceiver;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.n});
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final byte[] i() {
        return this.c;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public final byte[] j() {
        return fqrs.o() ? atzs.n(a().a()) : atzs.n(this);
    }

    public final String l() {
        AttestationConveyancePreference attestationConveyancePreference = this.j;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.d;
    }

    public final String toString() {
        List list = this.n;
        AuthenticationExtensions authenticationExtensions = this.k;
        AttestationConveyancePreference attestationConveyancePreference = this.j;
        TokenBinding tokenBinding = this.i;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.g;
        List list2 = this.f;
        List list3 = this.d;
        byte[] bArr = this.c;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.b;
        return "PublicKeyCredentialCreationOptions{\n rp=" + this.a.toString() + ", \n user=" + publicKeyCredentialUserEntity.toString() + ", \n challenge=" + aurd.c(bArr) + ", \n parameters=" + list3.toString() + ", \n timeoutSeconds=" + this.e + ", \n excludeList=" + String.valueOf(list2) + ", \n authenticatorSelection=" + String.valueOf(authenticatorSelectionCriteria) + ", \n requestId=" + this.h + ", \n tokenBinding=" + String.valueOf(tokenBinding) + ", \n attestationConveyancePreference=" + String.valueOf(attestationConveyancePreference) + ", \n authenticationExtensions=" + String.valueOf(authenticationExtensions) + ", \n attestationFormats=" + String.valueOf(list) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, publicKeyCredentialRpEntity, i, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.i(parcel, 4, this.c, false);
        atzr.y(parcel, 5, this.d, false);
        atzr.B(parcel, 6, this.e);
        atzr.y(parcel, 7, this.f, false);
        atzr.t(parcel, 8, this.g, i, false);
        atzr.F(parcel, 9, this.h);
        atzr.t(parcel, 10, this.i, i, false);
        atzr.v(parcel, 11, l(), false);
        atzr.t(parcel, 12, this.k, i, false);
        atzr.v(parcel, 13, this.l, false);
        atzr.t(parcel, 14, this.m, i, false);
        atzr.x(parcel, 15, this.n, false);
        atzr.c(parcel, a);
    }
}
