package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.asnj;
import defpackage.bbua;
import defpackage.feay;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbua();
    public final feay a;
    public final String b;
    public final String c;
    public final String d;

    public PublicKeyCredentialUserEntity(byte[] bArr, String str, String str2, String str3) {
        arwm.s(bArr);
        this.a = feay.w(bArr);
        arwm.s(str);
        this.b = str;
        this.c = str2;
        arwm.s(str3);
        this.d = str3;
    }

    public static PublicKeyCredentialUserEntity a(JSONObject jSONObject) {
        return new PublicKeyCredentialUserEntity(asnj.f(jSONObject.getString("id")), jSONObject.getString("name"), jSONObject.has("icon") ? jSONObject.optString("icon") : null, jSONObject.optString("displayName"));
    }

    public final byte[] b() {
        return this.a.M();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return arwb.b(this.a, publicKeyCredentialUserEntity.a) && arwb.b(this.b, publicKeyCredentialUserEntity.b) && arwb.b(this.c, publicKeyCredentialUserEntity.c) && arwb.b(this.d, publicKeyCredentialUserEntity.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        return "PublicKeyCredentialUserEntity{\n id=" + asnj.c(this.a.M()) + ", \n name='" + this.b + "', \n icon='" + this.c + "', \n displayName='" + this.d + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, b(), false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.c(parcel, a);
    }
}
