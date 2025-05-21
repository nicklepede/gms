package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.fipp;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@fipp(a = true)
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat$Fido2Extensions {
    public final CredentialExchangeFormat$Fido2HmacSecret a;
    public final String b;
    public final CredentialExchangeFormat$Fido2LargeBlob c;
    public final Boolean d;
    public final CredentialExchangeFormat$Fido2SupplementalKeys e;

    public CredentialExchangeFormat$Fido2Extensions(CredentialExchangeFormat$Fido2HmacSecret credentialExchangeFormat$Fido2HmacSecret, String str, CredentialExchangeFormat$Fido2LargeBlob credentialExchangeFormat$Fido2LargeBlob, Boolean bool, CredentialExchangeFormat$Fido2SupplementalKeys credentialExchangeFormat$Fido2SupplementalKeys) {
        this.a = credentialExchangeFormat$Fido2HmacSecret;
        this.b = str;
        this.c = credentialExchangeFormat$Fido2LargeBlob;
        this.d = bool;
        this.e = credentialExchangeFormat$Fido2SupplementalKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialExchangeFormat$Fido2Extensions)) {
            return false;
        }
        CredentialExchangeFormat$Fido2Extensions credentialExchangeFormat$Fido2Extensions = (CredentialExchangeFormat$Fido2Extensions) obj;
        return fvbo.n(this.a, credentialExchangeFormat$Fido2Extensions.a) && fvbo.n(this.b, credentialExchangeFormat$Fido2Extensions.b) && fvbo.n(this.c, credentialExchangeFormat$Fido2Extensions.c) && fvbo.n(this.d, credentialExchangeFormat$Fido2Extensions.d) && fvbo.n(this.e, credentialExchangeFormat$Fido2Extensions.e);
    }

    public final int hashCode() {
        CredentialExchangeFormat$Fido2HmacSecret credentialExchangeFormat$Fido2HmacSecret = this.a;
        int hashCode = credentialExchangeFormat$Fido2HmacSecret == null ? 0 : credentialExchangeFormat$Fido2HmacSecret.hashCode();
        String str = this.b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int i = hashCode * 31;
        CredentialExchangeFormat$Fido2LargeBlob credentialExchangeFormat$Fido2LargeBlob = this.c;
        int hashCode3 = (((i + hashCode2) * 31) + (credentialExchangeFormat$Fido2LargeBlob == null ? 0 : credentialExchangeFormat$Fido2LargeBlob.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        CredentialExchangeFormat$Fido2SupplementalKeys credentialExchangeFormat$Fido2SupplementalKeys = this.e;
        return hashCode4 + (credentialExchangeFormat$Fido2SupplementalKeys != null ? credentialExchangeFormat$Fido2SupplementalKeys.hashCode() : 0);
    }

    public final String toString() {
        return "Fido2Extensions(hmacSecret=" + this.a + ", credBlob=" + this.b + ", largeBlob=" + this.c + ", payments=" + this.d + ", supplementalKeys=" + this.e + ")";
    }
}
