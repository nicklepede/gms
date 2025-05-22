package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.aurd;
import defpackage.bdxr;
import defpackage.fgpr;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdxr();
    public final fgpr a;
    public final String b;
    public final String c;
    public final String d;

    public PublicKeyCredentialUserEntity(byte[] bArr, String str, String str2, String str3) {
        atzb.s(bArr);
        this.a = fgpr.w(bArr);
        atzb.s(str);
        this.b = str;
        this.c = str2;
        atzb.s(str3);
        this.d = str3;
    }

    public static PublicKeyCredentialUserEntity a(JSONObject jSONObject) {
        return new PublicKeyCredentialUserEntity(aurd.f(jSONObject.getString("id")), jSONObject.getString("name"), jSONObject.has("icon") ? jSONObject.optString("icon") : null, jSONObject.optString("displayName"));
    }

    public final byte[] b() {
        return this.a.M();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return atyq.b(this.a, publicKeyCredentialUserEntity.a) && atyq.b(this.b, publicKeyCredentialUserEntity.b) && atyq.b(this.c, publicKeyCredentialUserEntity.c) && atyq.b(this.d, publicKeyCredentialUserEntity.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        return "PublicKeyCredentialUserEntity{\n id=" + aurd.c(this.a.M()) + ", \n name='" + this.b + "', \n icon='" + this.c + "', \n displayName='" + this.d + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 2, b(), false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.c(parcel, a);
    }
}
