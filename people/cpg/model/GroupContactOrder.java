package com.google.android.gms.people.cpg.model;

import defpackage.eihn;
import defpackage.eitj;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
        this.c = eitj.i(list);
        this.d = str3;
        this.e = l;
    }

    public final long a() {
        return this.e.longValue();
    }

    public final eitj b() {
        return eitj.i(this.c);
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
            if (eihn.a(this.b, groupContactOrder.b) && eihn.a(this.c, groupContactOrder.c) && this.d.equals(groupContactOrder.d) && eihn.a(this.e, groupContactOrder.e)) {
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
