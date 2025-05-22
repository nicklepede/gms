package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.awhk;
import defpackage.awhl;
import defpackage.flfm;
import defpackage.fxxm;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@flfm(a = true)
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat$Credential$BasicAuthCredential extends awhk {
    public final Set a;
    public final CredentialExchangeFormat$EditableField b;
    public final CredentialExchangeFormat$EditableField c;

    public CredentialExchangeFormat$Credential$BasicAuthCredential(Set set, CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField, CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField2) {
        fxxm.f(set, "urls");
        awhl awhlVar = awhl.a;
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
        return fxxm.n(this.a, credentialExchangeFormat$Credential$BasicAuthCredential.a) && fxxm.n(this.b, credentialExchangeFormat$Credential$BasicAuthCredential.b) && fxxm.n(this.c, credentialExchangeFormat$Credential$BasicAuthCredential.c);
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
