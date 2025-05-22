package com.google.android.gms.ads.cache.policy;

import com.google.android.gms.ads.cache.s;
import defpackage.atyq;
import defpackage.bsj;
import defpackage.buy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b {
    public static final com.google.android.gms.ads.internal.js.function.e a = new a();
    private Map b;

    public b(Map map) {
        this.b = map;
    }

    public final List a(String str) {
        List list = (List) this.b.get(str);
        return list == null ? new ArrayList() : list;
    }

    public final Set b() {
        return this.b.keySet();
    }

    public final void c(s sVar) {
        String str = sVar.c;
        List list = (List) this.b.get(str);
        if (list == null) {
            list = new ArrayList();
            this.b.put(str, list);
        }
        list.add(sVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return atyq.b(this.b, ((b) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }

    public b() {
        this.b = new bsj();
    }

    public b(b bVar) {
        this.b = new bsj(((buy) bVar.b).d);
        for (Map.Entry entry : bVar.b.entrySet()) {
            this.b.put((String) entry.getKey(), new ArrayList((List) entry.getValue()));
        }
    }
}
