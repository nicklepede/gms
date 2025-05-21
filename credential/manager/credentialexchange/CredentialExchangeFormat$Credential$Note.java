package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.audf;
import defpackage.audg;
import defpackage.fipp;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@fipp(a = true)
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat$Credential$Note extends audf {
    public final CredentialExchangeFormat$EditableField a;

    public CredentialExchangeFormat$Credential$Note(CredentialExchangeFormat$EditableField credentialExchangeFormat$EditableField) {
        audg audgVar = audg.a;
        this.a = credentialExchangeFormat$EditableField;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CredentialExchangeFormat$Credential$Note) && fvbo.n(this.a, ((CredentialExchangeFormat$Credential$Note) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Note(content=" + this.a + ")";
    }
}
