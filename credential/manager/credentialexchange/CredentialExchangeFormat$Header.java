package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.flfm;
import defpackage.fxrn;
import defpackage.fxxm;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@flfm(a = true)
/* loaded from: classes4.dex */
public final class CredentialExchangeFormat$Header {
    public final short a;
    public final String b;
    public final String c;
    public final long d;
    public final List e;

    public CredentialExchangeFormat$Header(short s, String str, String str2, long j, List list) {
        this.a = s;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialExchangeFormat$Header)) {
            return false;
        }
        CredentialExchangeFormat$Header credentialExchangeFormat$Header = (CredentialExchangeFormat$Header) obj;
        return this.a == credentialExchangeFormat$Header.a && fxxm.n(this.b, credentialExchangeFormat$Header.b) && fxxm.n(this.c, credentialExchangeFormat$Header.c) && this.d == credentialExchangeFormat$Header.d && fxxm.n(this.e, credentialExchangeFormat$Header.e);
    }

    public final int hashCode() {
        int hashCode = (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        long j = this.d;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Header(version=" + fxrn.a(this.a) + ", exporterRpId=" + this.b + ", exporterDisplayName=" + this.c + ", timestamp=" + this.d + ", accounts=" + this.e + ")";
    }
}
