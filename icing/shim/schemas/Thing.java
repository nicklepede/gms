package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.dqvk;
import defpackage.eiif;
import defpackage.eitj;
import defpackage.ejcb;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class Thing {
    private final List a;
    private final List b;
    public final String p;
    public final String q;
    public final String r;
    public final G3AttributionInfo s;

    public Thing(String str, String str2, String str3, List list, List list2, G3AttributionInfo g3AttributionInfo) {
        List list3;
        List list4;
        this.p = str2;
        this.q = str;
        this.r = eiif.b(str3);
        if (list != null) {
            list3 = DesugarCollections.unmodifiableList(list);
        } else {
            int i = eitj.d;
            list3 = ejcb.a;
        }
        this.a = list3;
        if (list2 != null) {
            list4 = DesugarCollections.unmodifiableList(list2);
        } else {
            int i2 = eitj.d;
            list4 = ejcb.a;
        }
        this.b = list4;
        this.s = g3AttributionInfo == null ? dqvk.a(null) : g3AttributionInfo;
    }

    public final List a() {
        List list = this.b;
        if (list != null) {
            return list;
        }
        int i = eitj.d;
        return ejcb.a;
    }

    public final List b() {
        List list = this.a;
        if (list != null) {
            return list;
        }
        int i = eitj.d;
        return ejcb.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Thing)) {
            return false;
        }
        Thing thing = (Thing) obj;
        return Objects.equals(this.p, thing.p) && Objects.equals(this.q, thing.q) && Objects.equals(this.r, thing.r) && Objects.equals(this.b, thing.b) && Objects.equals(this.a, thing.a) && Objects.equals(this.s, thing.s);
    }

    public int hashCode() {
        return Objects.hash(this.p, this.q, this.r, this.b, this.a, this.s);
    }

    public String toString() {
        G3AttributionInfo g3AttributionInfo = this.s;
        List list = this.a;
        return "id: '" + this.p + "namespace: " + this.q + "name: " + this.r + ", alternateNames: " + String.valueOf(this.b) + ", keywords: " + String.valueOf(list) + ", attributionInfo: " + g3AttributionInfo.toString();
    }
}
