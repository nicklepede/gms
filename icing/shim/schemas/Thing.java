package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.dtfs;
import defpackage.ekvk;
import defpackage.elgo;
import defpackage.elpg;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        this.r = ekvk.b(str3);
        if (list != null) {
            list3 = DesugarCollections.unmodifiableList(list);
        } else {
            int i = elgo.d;
            list3 = elpg.a;
        }
        this.a = list3;
        if (list2 != null) {
            list4 = DesugarCollections.unmodifiableList(list2);
        } else {
            int i2 = elgo.d;
            list4 = elpg.a;
        }
        this.b = list4;
        this.s = g3AttributionInfo == null ? dtfs.a(null) : g3AttributionInfo;
    }

    public final List a() {
        List list = this.b;
        if (list != null) {
            return list;
        }
        int i = elgo.d;
        return elpg.a;
    }

    public final List b() {
        List list = this.a;
        if (list != null) {
            return list;
        }
        int i = elgo.d;
        return elpg.a;
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
