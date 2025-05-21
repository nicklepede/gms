package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.audf;
import defpackage.audg;
import defpackage.fipp;
import defpackage.fvbo;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@fipp(a = true)
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat$Credential$BasicAuthCredential extends audf {
    public final Set a;
    public final CredentialExchangeFormat$EditableField b;
    public final CredentialExchangeFormat$EditableField c;

    public CredentialExchangeFormat$Credential$BasicAuthCredential(Set set, CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField, CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField2) {
        fvbo.f(set, "urls");
        audg audgVar = audg.a;
        this.a = set;
        this.b = credentialExchangeFormat$EditableField;
        this.c = credentialExchangeFormat$EditableField2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialExchangeFormat$Credential$BasicAuthCredential)) {
            return false;
        }
        CredentialExchangeFormat$Credential$BasicAuthCredential credentialExchangeFormat$Credential$BasicAuthCredential = (CredentialExchangeFormat$Credential$BasicAuthCredential) obj;
        return fvbo.n(this.a, credentialExchangeFormat$Credential$BasicAuthCredential.a) && fvbo.n(this.b, credentialExchangeFormat$Credential$BasicAuthCredential.b) && fvbo.n(this.c, credentialExchangeFormat$Credential$BasicAuthCredential.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField = this.b;
        int hashCode2 = (hashCode + (credentialExchangeFormat$EditableField == null ? 0 : credentialExchangeFormat$EditableField.hashCode())) * 31;
        CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField2 = this.c;
        return hashCode2 + (credentialExchangeFormat$EditableField2 != null ? credentialExchangeFormat$EditableField2.hashCode() : 0);
    }

    public final String toString() {
        return "BasicAuthCredential(urls=" + this.a + ", username=" + this.b + ", password=" + this.c + ")";
    }
}
