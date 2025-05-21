package com.google.android.gms.credential.manager.credentialexchange;

import defpackage.audj;
import defpackage.fipp;
import defpackage.fvbo;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@fipp(a = true)
/* loaded from: classes3.dex */
public final class CredentialExchangeFormat$Item {
    public final String a;
    public final Long b;
    public final Long c;
    public final audj d;
    public final String e;
    public final String f;
    public final boolean g;
    public final List h;
    public final Set i;
    public final List j;

    public CredentialExchangeFormat$Item(String str, Long l, Long l2, audj audjVar, String str2, String str3, boolean z, List list, Set set, List list2) {
        fvbo.f(str, "id");
        fvbo.f(audjVar, "type");
        fvbo.f(str2, "title");
        fvbo.f(list, "credentials");
        this.a = str;
        this.b = l;
        this.c = l2;
        this.d = audjVar;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = list;
        this.i = set;
        this.j = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialExchangeFormat$Item)) {
            return false;
        }
        CredentialExchangeFormat$Item credentialExchangeFormat$Item = (CredentialExchangeFormat$Item) obj;
        return fvbo.n(this.a, credentialExchangeFormat$Item.a) && fvbo.n(this.b, credentialExchangeFormat$Item.b) && fvbo.n(this.c, credentialExchangeFormat$Item.c) && this.d == credentialExchangeFormat$Item.d && fvbo.n(this.e, credentialExchangeFormat$Item.e) && fvbo.n(this.f, credentialExchangeFormat$Item.f) && this.g == credentialExchangeFormat$Item.g && fvbo.n(this.h, credentialExchangeFormat$Item.h) && fvbo.n(this.i, credentialExchangeFormat$Item.i) && fvbo.n(this.j, credentialExchangeFormat$Item.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int hashCode3 = (((((hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        String str = this.f;
        int hashCode4 = (((((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + (true != this.g ? 1237 : 1231)) * 31) + this.h.hashCode()) * 31;
        Set set = this.i;
        int hashCode5 = (hashCode4 + (set == null ? 0 : set.hashCode())) * 31;
        List list = this.j;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "Item(id=" + this.a + ", creationAt=" + this.b + ", modifiedAt=" + this.c + ", type=" + this.d + ", title=" + this.e + ", subtitle=" + this.f + ", favorite=" + this.g + ", credentials=" + this.h + ", tags=" + this.i + ", extensions=" + this.j + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CredentialExchangeFormat$Item(java.lang.String r14, java.lang.Long r15, java.lang.Long r16, defpackage.audj r17, java.lang.String r18, java.lang.String r19, boolean r20, java.util.List r21, java.util.Set r22, java.util.List r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto La
            fuwy r1 = defpackage.fuwy.a
            r11 = r1
            goto Lc
        La:
            r11 = r22
        Lc:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L14
            fuww r1 = defpackage.fuww.a
            r12 = r1
            goto L16
        L14:
            r12 = r23
        L16:
            r1 = r0 & 64
            r0 = r0 & 32
            if (r1 == 0) goto L1e
            r1 = 0
            goto L1f
        L1e:
            r1 = 1
        L1f:
            r9 = r1 & r20
            if (r0 == 0) goto L26
            r0 = 0
            r8 = r0
            goto L28
        L26:
            r8 = r19
        L28:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.credential.manager.credentialexchange.CredentialExchangeFormat$Item.<init>(java.lang.String, java.lang.Long, java.lang.Long, audj, java.lang.String, java.lang.String, boolean, java.util.List, java.util.Set, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
