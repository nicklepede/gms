package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.fipp;
import defpackage.fuww;
import defpackage.fvbo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@fipp(a = true)
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat$Account {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;

    public CredentialExchangeFormat$Account(String str, String str2, String str3, String str4, List list, List list2, List list3) {
        fvbo.f(str, "id");
        fvbo.f(str2, "username");
        fvbo.f(str3, "email");
        fvbo.f(list, "collections");
        fvbo.f(list2, "items");
        fvbo.f(list3, "extensions");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = list2;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialExchangeFormat$Account)) {
            return false;
        }
        CredentialExchangeFormat$Account credentialExchangeFormat$Account = (CredentialExchangeFormat$Account) obj;
        return fvbo.n(this.a, credentialExchangeFormat$Account.a) && fvbo.n(this.b, credentialExchangeFormat$Account.b) && fvbo.n(this.c, credentialExchangeFormat$Account.c) && fvbo.n(this.d, credentialExchangeFormat$Account.d) && fvbo.n(this.e, credentialExchangeFormat$Account.e) && fvbo.n(this.f, credentialExchangeFormat$Account.f) && fvbo.n(this.g, credentialExchangeFormat$Account.g);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        return (((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "Account(id=" + this.a + ", username=" + this.b + ", email=" + this.c + ", fullName=" + this.d + ", collections=" + this.e + ", items=" + this.f + ", extensions=" + this.g + ")";
    }

    public /* synthetic */ CredentialExchangeFormat$Account(String str, String str2, String str3, String str4, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, list, list2, (i & 64) != 0 ? fuww.a : list3);
    }
}
