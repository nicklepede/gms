package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.fipp;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@fipp(a = true)
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat$Fido2SupplementalKeys {
    public final Boolean a;
    public final Boolean b;

    public CredentialExchangeFormat$Fido2SupplementalKeys(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialExchangeFormat$Fido2SupplementalKeys)) {
            return false;
        }
        CredentialExchangeFormat$Fido2SupplementalKeys credentialExchangeFormat$Fido2SupplementalKeys = (CredentialExchangeFormat$Fido2SupplementalKeys) obj;
        return fvbo.n(this.a, credentialExchangeFormat$Fido2SupplementalKeys.a) && fvbo.n(this.b, credentialExchangeFormat$Fido2SupplementalKeys.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.b;
        return (hashCode * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "Fido2SupplementalKeys(device=" + this.a + ", provider=" + this.b + ")";
    }
}
