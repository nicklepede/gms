package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.flfm;
import defpackage.fxsu;
import defpackage.fxxm;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@flfm(a = true)
/* loaded from: classes4.dex */
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
        fxxm.f(str, "id");
        fxxm.f(str2, "title");
        fxxm.f(list, "items");
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
        return fxxm.n(this.a, credentialExchangeFormat$Collection.a) && fxxm.n(this.b, credentialExchangeFormat$Collection.b) && fxxm.n(this.c, credentialExchangeFormat$Collection.c) && fxxm.n(this.d, credentialExchangeFormat$Collection.d) && fxxm.n(this.e, credentialExchangeFormat$Collection.e) && fxxm.n(this.f, credentialExchangeFormat$Collection.f) && fxxm.n(this.g, credentialExchangeFormat$Collection.g) && fxxm.n(this.h, credentialExchangeFormat$Collection.h);
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
        this(str, l, l2, str2, str3, list, (i & 64) != 0 ? fxsu.a : list2, (i & 128) != 0 ? fxsu.a : list3);
    }
}
