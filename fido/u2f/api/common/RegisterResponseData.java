package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.besd;
import defpackage.besg;
import defpackage.ekvg;
import defpackage.ekvh;
import defpackage.emgt;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = new besg();
    public final byte[] a;
    public final ProtocolVersion b;
    public final String c;

    public RegisterResponseData(byte[] bArr, ProtocolVersion protocolVersion, String str) {
        atzb.s(bArr);
        this.a = bArr;
        atzb.s(protocolVersion);
        this.b = protocolVersion;
        atzb.b(protocolVersion != ProtocolVersion.UNKNOWN);
        if (protocolVersion == ProtocolVersion.V1) {
            atzb.b(str == null);
            this.c = null;
        } else {
            atzb.s(str);
            this.c = str;
        }
    }

    private static final String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    @Override // defpackage.bdnf
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
        return atyq.b(this.b, registerResponseData.b) && Arrays.equals(this.a, registerResponseData.a) && atyq.b(this.c, registerResponseData.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(Arrays.hashCode(this.a)), this.c});
    }

    public final String toString() {
        ekvg b = ekvh.b(this);
        b.b("protocolVersion", this.b);
        b.b("registerData", emgt.f.n(this.a));
        String str = this.c;
        if (str != null) {
            b.b("clientDataString", str);
        }
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 2, bArr, false);
        atzr.v(parcel, 3, this.b.d, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.c(parcel, a);
    }

    public RegisterResponseData(byte[] bArr, String str, String str2) {
        this.a = bArr;
        try {
            this.b = ProtocolVersion.b(str);
            this.c = str2;
        } catch (besd e) {
            throw new IllegalArgumentException(e);
        }
    }
}
