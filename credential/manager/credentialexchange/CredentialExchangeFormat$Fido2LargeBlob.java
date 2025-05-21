package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.fipp;
import defpackage.fuvj;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@fipp(a = true)
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat$Fido2LargeBlob {
    public final int a;
    public final String b;
    public final String c;

    public CredentialExchangeFormat$Fido2LargeBlob(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialExchangeFormat$Fido2LargeBlob)) {
            return false;
        }
        CredentialExchangeFormat$Fido2LargeBlob credentialExchangeFormat$Fido2LargeBlob = (CredentialExchangeFormat$Fido2LargeBlob) obj;
        return this.a == credentialExchangeFormat$Fido2LargeBlob.a && fvbo.n(this.b, credentialExchangeFormat$Fido2LargeBlob.b) && fvbo.n(this.c, credentialExchangeFormat$Fido2LargeBlob.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Fido2LargeBlob(size=" + fuvj.b(this.a) + ", alg=" + this.b + ", data=" + this.c + ")";
    }
}
