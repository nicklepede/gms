package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.asnj;
import defpackage.bbse;
import defpackage.eiib;
import defpackage.eiic;
import defpackage.ejtk;
import defpackage.feay;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = new bbse();
    public final feay a;
    private final feay b;
    private final feay c;
    private final feay d;
    private final feay e;

    public AuthenticatorAssertionResponse(feay feayVar, feay feayVar2, feay feayVar3, feay feayVar4, feay feayVar5) {
        arwm.s(feayVar);
        this.b = feayVar;
        arwm.s(feayVar2);
        this.c = feayVar2;
        arwm.s(feayVar3);
        this.d = feayVar3;
        arwm.s(feayVar4);
        this.e = feayVar4;
        this.a = feayVar5;
    }

    public static AuthenticatorAssertionResponse b(byte[] bArr) {
        return (AuthenticatorAssertionResponse) arxd.a(bArr, CREATOR);
    }

    @Override // defpackage.bbji
    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", asnj.c(e()));
            jSONObject.put("clientDataJSON", asnj.c(d()));
            jSONObject.put("authenticatorData", asnj.c(c()));
            jSONObject.put("signature", asnj.c(f()));
            if (this.a != null) {
                jSONObject.put("userHandle", asnj.c(g()));
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e);
        }
    }

    public final byte[] c() {
        return this.d.M();
    }

    public final byte[] d() {
        return this.c.M();
    }

    @Deprecated
    public final byte[] e() {
        return this.b.M();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return arwb.b(this.b, authenticatorAssertionResponse.b) && arwb.b(this.c, authenticatorAssertionResponse.c) && arwb.b(this.d, authenticatorAssertionResponse.d) && arwb.b(this.e, authenticatorAssertionResponse.e) && arwb.b(this.a, authenticatorAssertionResponse.a);
    }

    public final byte[] f() {
        return this.e.M();
    }

    public final byte[] g() {
        feay feayVar = this.a;
        if (feayVar == null) {
            return null;
        }
        return feayVar.M();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public final byte[] h() {
        return arxd.n(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e})), Integer.valueOf(Arrays.hashCode(new Object[]{this.a}))});
    }

    public final String toString() {
        eiib b = eiic.b(this);
        b.b("keyHandle", ejtk.f.n(e()));
        ejtk ejtkVar = ejtk.f;
        b.b("clientDataJSON", ejtkVar.n(d()));
        b.b("authenticatorData", ejtkVar.n(c()));
        b.b("signature", ejtkVar.n(f()));
        byte[] g = g();
        if (g != null) {
            b.b("userHandle", ejtkVar.n(g));
        }
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, e(), false);
        arxc.i(parcel, 3, d(), false);
        arxc.i(parcel, 4, c(), false);
        arxc.i(parcel, 5, f(), false);
        arxc.i(parcel, 6, g(), false);
        arxc.c(parcel, a);
    }
}
