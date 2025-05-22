package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.awhq;
import defpackage.flfm;
import defpackage.fxxm;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@flfm(a = true)
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat$SharingAccessor {
    public final awhq a;
    public final String b;
    public final String c;
    public final Set d;

    public CredentialExchangeFormat$SharingAccessor(awhq awhqVar, String str, String str2, Set set) {
        this.a = awhqVar;
        this.b = str;
        this.c = str2;
        this.d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialExchangeFormat$SharingAccessor)) {
            return false;
        }
        CredentialExchangeFormat$SharingAccessor credentialExchangeFormat$SharingAccessor = (CredentialExchangeFormat$SharingAccessor) obj;
        return this.a == credentialExchangeFormat$SharingAccessor.a && fxxm.n(this.b, credentialExchangeFormat$SharingAccessor.b) && fxxm.n(this.c, credentialExchangeFormat$SharingAccessor.c) && fxxm.n(this.d, credentialExchangeFormat$SharingAccessor.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SharingAccessor(type=" + this.a + ", accountId=" + this.b + ", name=" + this.c + ", permissions=" + this.d + ")";
    }
}
