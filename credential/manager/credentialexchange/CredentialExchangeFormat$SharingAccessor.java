package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.audl;
import defpackage.fipp;
import defpackage.fvbo;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@fipp(a = true)
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat$SharingAccessor {
    public final audl a;
    public final String b;
    public final String c;
    public final Set d;

    public CredentialExchangeFormat$SharingAccessor(audl audlVar, String str, String str2, Set set) {
        this.a = audlVar;
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
        return this.a == credentialExchangeFormat$SharingAccessor.a && fvbo.n(this.b, credentialExchangeFormat$SharingAccessor.b) && fvbo.n(this.c, credentialExchangeFormat$SharingAccessor.c) && fvbo.n(this.d, credentialExchangeFormat$SharingAccessor.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SharingAccessor(type=" + this.a + ", accountId=" + this.b + ", name=" + this.c + ", permissions=" + this.d + ")";
    }
}
