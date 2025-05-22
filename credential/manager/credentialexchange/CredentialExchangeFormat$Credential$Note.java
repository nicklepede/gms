package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.awhk;
import defpackage.awhl;
import defpackage.flfm;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@flfm(a = true)
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat$Credential$Note extends awhk {
    public final CredentialExchangeFormat$EditableField a;

    public CredentialExchangeFormat$Credential$Note(CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField) {
        awhl awhlVar = awhl.a;
        this.a = credentialExchangeFormat$EditableField;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CredentialExchangeFormat$Credential$Note) && fxxm.n(this.a, ((CredentialExchangeFormat$Credential$Note) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Note(content=" + this.a + ")";
    }
}
