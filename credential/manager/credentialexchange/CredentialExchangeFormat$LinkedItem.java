package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.fipp;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@fipp(a = true)
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat$LinkedItem {
    public final String a;
    public final String b;

    public CredentialExchangeFormat$LinkedItem(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialExchangeFormat$LinkedItem)) {
            return false;
        }
        CredentialExchangeFormat$LinkedItem credentialExchangeFormat$LinkedItem = (CredentialExchangeFormat$LinkedItem) obj;
        return fvbo.n(this.a, credentialExchangeFormat$LinkedItem.a) && fvbo.n(this.b, credentialExchangeFormat$LinkedItem.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "LinkedItem(item=" + this.a + ", account=" + this.b + ")";
    }
}
