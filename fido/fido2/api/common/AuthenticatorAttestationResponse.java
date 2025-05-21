package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.bbsh;
import defpackage.eiib;
import defpackage.eiic;
import defpackage.ejtk;
import defpackage.feay;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = new bbsh();
    public final feay a;
    public final feay b;
    public final String[] c;
    private final feay d;

    public AuthenticatorAttestationResponse(feay feayVar, feay feayVar2, feay feayVar3, String[] strArr) {
        arwm.s(feayVar);
        this.d = feayVar;
        arwm.s(feayVar2);
        this.a = feayVar2;
        arwm.s(feayVar3);
        this.b = feayVar3;
        arwm.s(strArr);
        this.c = strArr;
    }

    @Override // defpackage.bbji
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
        return arwb.b(this.d, authenticatorAttestationResponse.d) && arwb.b(this.a, authenticatorAttestationResponse.a) && arwb.b(this.b, authenticatorAttestationResponse.b);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public final byte[] h() {
        return arxd.n(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b}))});
    }

    public final String toString() {
        eiib b = eiic.b(this);
        b.b("keyHandle", ejtk.f.n(d()));
        ejtk ejtkVar = ejtk.f;
        b.b("clientDataJSON", ejtkVar.n(c()));
        b.b("attestationObject", ejtkVar.n(b()));
        b.b("transports", Arrays.toString(this.c));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, d(), false);
        arxc.i(parcel, 3, c(), false);
        arxc.i(parcel, 4, b(), false);
        arxc.w(parcel, 5, this.c, false);
        arxc.c(parcel, a);
    }
}
