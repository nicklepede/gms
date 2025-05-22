package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.flfm;
import defpackage.fxrh;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@flfm(a = true)
/* loaded from: classes4.dex */
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
        return this.a == credentialExchangeFormat$Fido2LargeBlob.a && fxxm.n(this.b, credentialExchangeFormat$Fido2LargeBlob.b) && fxxm.n(this.c, credentialExchangeFormat$Fido2LargeBlob.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Fido2LargeBlob(size=" + fxrh.b(this.a) + ", alg=" + this.b + ", data=" + this.c + ")";
    }
}
