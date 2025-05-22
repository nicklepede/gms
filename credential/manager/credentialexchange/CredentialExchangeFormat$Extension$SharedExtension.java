package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.awhm;
import defpackage.flfm;
import defpackage.fxxm;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@flfm(a = true)
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat$Extension$SharedExtension extends awhm {
    public final List a;

    public CredentialExchangeFormat$Extension$SharedExtension(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CredentialExchangeFormat$Extension$SharedExtension) && fxxm.n(this.a, ((CredentialExchangeFormat$Extension$SharedExtension) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedExtension(accessors=" + this.a + ")";
    }
}
