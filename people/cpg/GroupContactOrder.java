package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctxe;
import defpackage.eihn;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GroupContactOrder extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctxe();
    public final String a;
    public final List b;
    public final long c;

    public GroupContactOrder(String str, List list, long j) {
        this.a = str;
        this.b = list;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GroupContactOrder groupContactOrder = (GroupContactOrder) obj;
            if (eihn.a(this.a, groupContactOrder.a) && eihn.a(this.b, groupContactOrder.b) && this.c == groupContactOrder.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.H(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
