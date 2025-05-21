package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bcqq;
import defpackage.bcqt;
import defpackage.eiib;
import defpackage.eiic;
import defpackage.ejtk;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = new bcqt();
    public final byte[] a;
    public final ProtocolVersion b;
    public final String c;

    public RegisterResponseData(byte[] bArr, ProtocolVersion protocolVersion, String str) {
        arwm.s(bArr);
        this.a = bArr;
        arwm.s(protocolVersion);
        this.b = protocolVersion;
        arwm.b(protocolVersion != ProtocolVersion.UNKNOWN);
        if (protocolVersion == ProtocolVersion.V1) {
            arwm.b(str == null);
            this.c = null;
        } else {
            arwm.s(str);
            this.c = str;
        }
    }

    private static final String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    @Override // defpackage.bbji
    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("registrationData", b(this.a));
            jSONObject.put("version", this.b.d);
            String str = this.c;
            if (str != null) {
                jSONObject.put("clientData", b(str.getBytes()));
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return arwb.b(this.b, registerResponseData.b) && Arrays.equals(this.a, registerResponseData.a) && arwb.b(this.c, registerResponseData.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(Arrays.hashCode(this.a)), this.c});
    }

    public final String toString() {
        eiib b = eiic.b(this);
        b.b("protocolVersion", this.b);
        b.b("registerData", ejtk.f.n(this.a));
        String str = this.c;
        if (str != null) {
            b.b("clientDataString", str);
        }
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, bArr, false);
        arxc.v(parcel, 3, this.b.d, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.c(parcel, a);
    }

    public RegisterResponseData(byte[] bArr, String str, String str2) {
        this.a = bArr;
        try {
            this.b = ProtocolVersion.b(str);
            this.c = str2;
        } catch (bcqq e) {
            throw new IllegalArgumentException(e);
        }
    }
}
