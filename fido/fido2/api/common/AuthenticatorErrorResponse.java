package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.bbsj;
import defpackage.bbsz;
import defpackage.eiib;
import defpackage.eiic;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = new bbsj();
    public final ErrorCode a;
    public final String b;
    public final int c;

    public AuthenticatorErrorResponse(int i, String str, int i2) {
        try {
            this.a = ErrorCode.a(i);
            this.b = str;
            this.c = i2;
        } catch (bbsz e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static AuthenticatorErrorResponse c(byte[] bArr) {
        return (AuthenticatorErrorResponse) arxd.a(bArr, CREATOR);
    }

    @Override // defpackage.bbji
    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", this.a.m);
            String str = this.b;
            if (str != null) {
                jSONObject.put("errorMessage", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
        }
    }

    public final int b() {
        return this.a.m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return arwb.b(this.a, authenticatorErrorResponse.a) && arwb.b(this.b, authenticatorErrorResponse.b) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(authenticatorErrorResponse.c));
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public final byte[] h() {
        return arxd.n(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        eiib b = eiic.b(this);
        b.f("errorCode", this.a.m);
        String str = this.b;
        if (str != null) {
            b.b("errorMessage", str);
        }
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, b());
        arxc.v(parcel, 3, this.b, false);
        arxc.o(parcel, 4, this.c);
        arxc.c(parcel, a);
    }
}
