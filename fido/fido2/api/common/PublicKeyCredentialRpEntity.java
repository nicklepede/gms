package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bbtx;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbtx();
    public final String a;
    public final String b;
    public final String c;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        arwm.s(str);
        this.a = str;
        arwm.s(str2);
        this.b = str2;
        this.c = str3;
    }

    public static PublicKeyCredentialRpEntity a(JSONObject jSONObject) {
        return new PublicKeyCredentialRpEntity(jSONObject.getString("id"), jSONObject.getString("name"), jSONObject.has("icon") ? jSONObject.optString("icon") : null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return arwb.b(this.a, publicKeyCredentialRpEntity.a) && arwb.b(this.b, publicKeyCredentialRpEntity.b) && arwb.b(this.c, publicKeyCredentialRpEntity.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return "PublicKeyCredentialRpEntity{\n id='" + this.a + "', \n name='" + this.b + "', \n icon='" + this.c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.c(parcel, a);
    }
}
