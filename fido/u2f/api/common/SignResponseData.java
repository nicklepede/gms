package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.besj;
import defpackage.ekvg;
import defpackage.ekvh;
import defpackage.emgt;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = new besj();
    public final byte[] a;
    public final String b;
    public final byte[] c;
    public final byte[] d;

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        atzb.s(bArr);
        this.a = bArr;
        atzb.s(str);
        this.b = str;
        atzb.s(bArr2);
        this.c = bArr2;
        atzb.s(bArr3);
        this.d = bArr3;
    }

    private static final String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    @Override // defpackage.bdnf
    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", b(this.a));
            jSONObject.put("clientData", b(this.b.getBytes()));
            jSONObject.put("signatureData", b(this.c));
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.a, signResponseData.a) && atyq.b(this.b, signResponseData.b) && Arrays.equals(this.c, signResponseData.c) && Arrays.equals(this.d, signResponseData.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    public final String toString() {
        ekvg b = ekvh.b(this);
        emgt emgtVar = emgt.f;
        b.b("keyHandle", emgtVar.n(this.a));
        b.b("clientDataString", this.b);
        b.b("signatureData", emgtVar.n(this.c));
        b.b("application", emgtVar.n(this.d));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 2, bArr, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.i(parcel, 4, this.c, false);
        atzr.i(parcel, 5, this.d, false);
        atzr.c(parcel, a);
    }
}
