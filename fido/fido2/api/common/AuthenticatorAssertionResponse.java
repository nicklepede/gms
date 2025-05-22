package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.aurd;
import defpackage.bdvv;
import defpackage.ekvg;
import defpackage.ekvh;
import defpackage.emgt;
import defpackage.fgpr;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = new bdvv();
    public final fgpr a;
    private final fgpr b;
    private final fgpr c;
    private final fgpr d;
    private final fgpr e;

    public AuthenticatorAssertionResponse(fgpr fgprVar, fgpr fgprVar2, fgpr fgprVar3, fgpr fgprVar4, fgpr fgprVar5) {
        atzb.s(fgprVar);
        this.b = fgprVar;
        atzb.s(fgprVar2);
        this.c = fgprVar2;
        atzb.s(fgprVar3);
        this.d = fgprVar3;
        atzb.s(fgprVar4);
        this.e = fgprVar4;
        this.a = fgprVar5;
    }

    public static AuthenticatorAssertionResponse b(byte[] bArr) {
        return (AuthenticatorAssertionResponse) atzs.a(bArr, CREATOR);
    }

    @Override // defpackage.bdnf
    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", aurd.c(e()));
            jSONObject.put("clientDataJSON", aurd.c(d()));
            jSONObject.put("authenticatorData", aurd.c(c()));
            jSONObject.put("signature", aurd.c(f()));
            if (this.a != null) {
                jSONObject.put("userHandle", aurd.c(g()));
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
        return atyq.b(this.b, authenticatorAssertionResponse.b) && atyq.b(this.c, authenticatorAssertionResponse.c) && atyq.b(this.d, authenticatorAssertionResponse.d) && atyq.b(this.e, authenticatorAssertionResponse.e) && atyq.b(this.a, authenticatorAssertionResponse.a);
    }

    public final byte[] f() {
        return this.e.M();
    }

    public final byte[] g() {
        fgpr fgprVar = this.a;
        if (fgprVar == null) {
            return null;
        }
        return fgprVar.M();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public final byte[] h() {
        return atzs.n(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e})), Integer.valueOf(Arrays.hashCode(new Object[]{this.a}))});
    }

    public final String toString() {
        ekvg b = ekvh.b(this);
        emgt emgtVar = emgt.f;
        b.b("keyHandle", emgtVar.n(e()));
        b.b("clientDataJSON", emgtVar.n(d()));
        b.b("authenticatorData", emgtVar.n(c()));
        b.b("signature", emgtVar.n(f()));
        byte[] g = g();
        if (g != null) {
            b.b("userHandle", emgtVar.n(g));
        }
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 2, e(), false);
        atzr.i(parcel, 3, d(), false);
        atzr.i(parcel, 4, c(), false);
        atzr.i(parcel, 5, f(), false);
        atzr.i(parcel, 6, g(), false);
        atzr.c(parcel, a);
    }
}
