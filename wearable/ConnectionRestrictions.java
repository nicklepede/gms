package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dlvo;
import defpackage.ekvg;
import defpackage.ekvh;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ConnectionRestrictions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dlvo();
    public final List a;
    public final List b;
    public final List c;

    public ConnectionRestrictions(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final String toString() {
        ekvg b = ekvh.b(this);
        b.b("allowedDataItemFilters", this.a);
        b.b("allowedCapabilities", this.b);
        b.b("allowedPackages", this.c);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.x(parcel, 2, this.b, false);
        atzr.x(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
