package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.audh;
import defpackage.fipp;
import defpackage.fvbo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@fipp(a = true)
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat$Extension$SharedExtension extends audh {
    public final List a;

    public CredentialExchangeFormat$Extension$SharedExtension(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CredentialExchangeFormat$Extension$SharedExtension) && fvbo.n(this.a, ((CredentialExchangeFormat$Extension$SharedExtension) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedExtension(accessors=" + this.a + ")";
    }
}
