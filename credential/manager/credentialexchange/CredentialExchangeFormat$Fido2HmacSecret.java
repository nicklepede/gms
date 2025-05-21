package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.fipp;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@fipp(a = true)
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat$Fido2HmacSecret {
    public final String a;
    public final String b;

    public CredentialExchangeFormat$Fido2HmacSecret(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialExchangeFormat$Fido2HmacSecret)) {
            return false;
        }
        CredentialExchangeFormat$Fido2HmacSecret credentialExchangeFormat$Fido2HmacSecret = (CredentialExchangeFormat$Fido2HmacSecret) obj;
        return fvbo.n(this.a, credentialExchangeFormat$Fido2HmacSecret.a) && fvbo.n(this.b, credentialExchangeFormat$Fido2HmacSecret.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Fido2HmacSecret(algorithm=" + this.a + ", secret=" + this.b + ")";
    }
}
