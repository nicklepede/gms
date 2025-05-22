package com.google.android.gms.people.cpg.model;

import defpackage.ekus;
import defpackage.elgo;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GroupContactOrder {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final Long e;

    public GroupContactOrder(String str, String str2, List list, String str3, Long l) {
        this.b = str;
        this.a = str2;
        this.c = elgo.i(list);
        this.d = str3;
        this.e = l;
    }

    public final long a() {
        return this.e.longValue();
    }

    public final elgo b() {
        return elgo.i(this.c);
    }

    public final boolean c() {
        return Boolean.parseBoolean(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GroupContactOrder groupContactOrder = (GroupContactOrder) obj;
            if (ekus.a(this.b, groupContactOrder.b) && ekus.a(this.c, groupContactOrder.c) && this.d.equals(groupContactOrder.d) && ekus.a(this.e, groupContactOrder.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        return "rawGroupId: " + this.b + ", order: " + this.c + ", dirty: " + this.d + ", docVersion: " + this.e;
    }
}
