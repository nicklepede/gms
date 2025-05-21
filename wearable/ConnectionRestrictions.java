package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.djjv;
import defpackage.eiib;
import defpackage.eiic;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ConnectionRestrictions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djjv();
    public final List a;
    public final List b;
    public final List c;

    public ConnectionRestrictions(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final String toString() {
        eiib b = eiic.b(this);
        b.b("allowedDataItemFilters", this.a);
        b.b("allowedCapabilities", this.b);
        b.b("allowedPackages", this.c);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.x(parcel, 2, this.b, false);
        arxc.x(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
