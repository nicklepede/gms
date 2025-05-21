package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.fipp;
import defpackage.fuww;
import defpackage.fvbo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@fipp(a = true)
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat$Collection {
    public final String a;
    public final Long b;
    public final Long c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final List h;

    public CredentialExchangeFormat$Collection(String str, Long l, Long l2, String str2, String str3, List list, List list2, List list3) {
        fvbo.f(str, "id");
        fvbo.f(str2, "title");
        fvbo.f(list, "items");
        this.a = str;
        this.b = l;
        this.c = l2;
        this.d = str2;
        this.e = str3;
        this.f = list;
        this.g = list2;
        this.h = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialExchangeFormat$Collection)) {
            return false;
        }
        CredentialExchangeFormat$Collection credentialExchangeFormat$Collection = (CredentialExchangeFormat$Collection) obj;
        return fvbo.n(this.a, credentialExchangeFormat$Collection.a) && fvbo.n(this.b, credentialExchangeFormat$Collection.b) && fvbo.n(this.c, credentialExchangeFormat$Collection.c) && fvbo.n(this.d, credentialExchangeFormat$Collection.d) && fvbo.n(this.e, credentialExchangeFormat$Collection.e) && fvbo.n(this.f, credentialExchangeFormat$Collection.f) && fvbo.n(this.g, credentialExchangeFormat$Collection.g) && fvbo.n(this.h, credentialExchangeFormat$Collection.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int hashCode3 = (((hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        int hashCode4 = (((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f.hashCode()) * 31;
        List list = this.g;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.h;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "Collection(id=" + this.a + ", creationAt=" + this.b + ", modifiedAt=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", items=" + this.f + ", subCollections=" + this.g + ", extensions=" + this.h + ")";
    }

    public /* synthetic */ CredentialExchangeFormat$Collection(String str, Long l, Long l2, String str2, String str3, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, l2, str2, str3, list, (i & 64) != 0 ? fuww.a : list2, (i & 128) != 0 ? fuww.a : list3);
    }
}
