package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.bdvy;
import defpackage.ekvg;
import defpackage.ekvh;
import defpackage.emgt;
import defpackage.fgpr;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = new bdvy();
    public final fgpr a;
    public final fgpr b;
    public final String[] c;
    private final fgpr d;

    public AuthenticatorAttestationResponse(fgpr fgprVar, fgpr fgprVar2, fgpr fgprVar3, String[] strArr) {
        atzb.s(fgprVar);
        this.d = fgprVar;
        atzb.s(fgprVar2);
        this.a = fgprVar2;
        atzb.s(fgprVar3);
        this.b = fgprVar3;
        atzb.s(strArr);
        this.c = strArr;
    }

    @Override // defpackage.bdnf
    public final JSONObject a() {
        throw new UnsupportedOperationException();
    }

    public final byte[] b() {
        return this.b.M();
    }

    public final byte[] c() {
        return this.a.M();
    }

    @Deprecated
    public final byte[] d() {
        return this.d.M();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return atyq.b(this.d, authenticatorAttestationResponse.d) && atyq.b(this.a, authenticatorAttestationResponse.a) && atyq.b(this.b, authenticatorAttestationResponse.b);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public final byte[] h() {
        return atzs.n(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b}))});
    }

    public final String toString() {
        ekvg b = ekvh.b(this);
        emgt emgtVar = emgt.f;
        b.b("keyHandle", emgtVar.n(d()));
        b.b("clientDataJSON", emgtVar.n(c()));
        b.b("attestationObject", emgtVar.n(b()));
        b.b("transports", Arrays.toString(this.c));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 2, d(), false);
        atzr.i(parcel, 3, c(), false);
        atzr.i(parcel, 4, b(), false);
        atzr.w(parcel, 5, this.c, false);
        atzr.c(parcel, a);
    }
}
