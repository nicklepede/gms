package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.audf;
import defpackage.audg;
import defpackage.fipp;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@fipp(a = true)
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat$Credential$CreditCardCredential extends audf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public CredentialExchangeFormat$Credential$CreditCardCredential(String str, String str2, String str3, String str4, String str5, String str6) {
        audg audgVar = audg.a;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialExchangeFormat$Credential$CreditCardCredential)) {
            return false;
        }
        CredentialExchangeFormat$Credential$CreditCardCredential credentialExchangeFormat$Credential$CreditCardCredential = (CredentialExchangeFormat$Credential$CreditCardCredential) obj;
        return fvbo.n(this.a, credentialExchangeFormat$Credential$CreditCardCredential.a) && fvbo.n(this.b, credentialExchangeFormat$Credential$CreditCardCredential.b) && fvbo.n(this.c, credentialExchangeFormat$Credential$CreditCardCredential.c) && fvbo.n(this.d, credentialExchangeFormat$Credential$CreditCardCredential.d) && fvbo.n(this.e, credentialExchangeFormat$Credential$CreditCardCredential.e) && fvbo.n(this.f, credentialExchangeFormat$Credential$CreditCardCredential.f);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        int hashCode2 = ((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "CreditCardCredential(number=" + this.a + ", fullName=" + this.b + ", cardType=" + this.c + ", verificationNumber=" + this.d + ", expiryDate=" + this.e + ", validFrom=" + this.f + ")";
    }
}
