package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bcqw;
import defpackage.eiib;
import defpackage.eiic;
import defpackage.ejtk;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = new bcqw();
    public final byte[] a;
    public final String b;
    public final byte[] c;
    public final byte[] d;

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        arwm.s(bArr);
        this.a = bArr;
        arwm.s(str);
        this.b = str;
        arwm.s(bArr2);
        this.c = bArr2;
        arwm.s(bArr3);
        this.d = bArr3;
    }

    private static final String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    @Override // defpackage.bbji
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
        return Arrays.equals(this.a, signResponseData.a) && arwb.b(this.b, signResponseData.b) && Arrays.equals(this.c, signResponseData.c) && Arrays.equals(this.d, signResponseData.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    public final String toString() {
        eiib b = eiic.b(this);
        b.b("keyHandle", ejtk.f.n(this.a));
        b.b("clientDataString", this.b);
        ejtk ejtkVar = ejtk.f;
        b.b("signatureData", ejtkVar.n(this.c));
        b.b("application", ejtkVar.n(this.d));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, bArr, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.i(parcel, 4, this.c, false);
        arxc.i(parcel, 5, this.d, false);
        arxc.c(parcel, a);
    }
}
