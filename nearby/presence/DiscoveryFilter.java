package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ckjn;
import defpackage.eihn;
import defpackage.eitj;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DiscoveryFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckjn();
    public final int a;
    private final List b;
    private final List c;
    private final List d;

    public DiscoveryFilter(List list, List list2, List list3, int i) {
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.a = i;
    }

    public final List a() {
        return eitj.i(this.b);
    }

    public final List b() {
        return eitj.i(this.d);
    }

    public final List c() {
        return eitj.i(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryFilter)) {
            return false;
        }
        DiscoveryFilter discoveryFilter = (DiscoveryFilter) obj;
        return eihn.a(this.b, discoveryFilter.b) && eihn.a(this.c, discoveryFilter.c) && eihn.a(this.d, discoveryFilter.d) && this.a == discoveryFilter.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, Integer.valueOf(this.a)});
    }

    public final String toString() {
        List list = this.d;
        List list2 = this.c;
        return "DiscoveryFilter{actions=" + String.valueOf(this.b) + ", zones=" + String.valueOf(list2) + ", identities=" + String.valueOf(list) + ", measurement accuracy=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, a(), false);
        arxc.y(parcel, 2, c(), false);
        arxc.y(parcel, 3, b(), false);
        arxc.o(parcel, 4, this.a);
        arxc.c(parcel, a);
    }
}
