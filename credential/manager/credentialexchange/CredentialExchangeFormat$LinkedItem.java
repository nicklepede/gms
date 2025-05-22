package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.flfm;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@flfm(a = true)
/* loaded from: classes4.dex */
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
        return fxxm.n(this.a, credentialExchangeFormat$LinkedItem.a) && fxxm.n(this.b, credentialExchangeFormat$LinkedItem.b);
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
