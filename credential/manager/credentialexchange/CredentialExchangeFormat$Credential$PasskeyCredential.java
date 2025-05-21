package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.audf;
import defpackage.audg;
import defpackage.fipp;
import defpackage.fvbo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@fipp(a = true)
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat$Credential$PasskeyCredential extends audf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final CredentialExchangeFormat$Fido2Extensions g;

    public CredentialExchangeFormat$Credential$PasskeyCredential(String str, String str2, String str3, String str4, String str5, String str6, CredentialExchangeFormat$Fido2Extensions credentialExchangeFormat$Fido2Extensions) {
        fvbo.f(str, "credentialId");
        fvbo.f(str2, "rpId");
        fvbo.f(str3, "userName");
        fvbo.f(str4, "userDisplayName");
        fvbo.f(str5, "userHandle");
        fvbo.f(str6, "key");
        audg audgVar = audg.a;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = credentialExchangeFormat$Fido2Extensions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialExchangeFormat$Credential$PasskeyCredential)) {
            return false;
        }
        CredentialExchangeFormat$Credential$PasskeyCredential credentialExchangeFormat$Credential$PasskeyCredential = (CredentialExchangeFormat$Credential$PasskeyCredential) obj;
        return fvbo.n(this.a, credentialExchangeFormat$Credential$PasskeyCredential.a) && fvbo.n(this.b, credentialExchangeFormat$Credential$PasskeyCredential.b) && fvbo.n(this.c, credentialExchangeFormat$Credential$PasskeyCredential.c) && fvbo.n(this.d, credentialExchangeFormat$Credential$PasskeyCredential.d) && fvbo.n(this.e, credentialExchangeFormat$Credential$PasskeyCredential.e) && fvbo.n(this.f, credentialExchangeFormat$Credential$PasskeyCredential.f) && fvbo.n(this.g, credentialExchangeFormat$Credential$PasskeyCredential.g);
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        CredentialExchangeFormat$Fido2Extensions credentialExchangeFormat$Fido2Extensions = this.g;
        return (hashCode * 31) + (credentialExchangeFormat$Fido2Extensions == null ? 0 : credentialExchangeFormat$Fido2Extensions.hashCode());
    }

    public final String toString() {
        return "PasskeyCredential(credentialId=" + this.a + ", rpId=" + this.b + ", userName=" + this.c + ", userDisplayName=" + this.d + ", userHandle=" + this.e + ", key=" + this.f + ", fido2Extensions=" + this.g + ")";
    }

    public /* synthetic */ CredentialExchangeFormat$Credential$PasskeyCredential(String str, String str2, String str3, String str4, String str5, String str6, CredentialExchangeFormat$Fido2Extensions credentialExchangeFormat$Fido2Extensions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : credentialExchangeFormat$Fido2Extensions);
    }
}
