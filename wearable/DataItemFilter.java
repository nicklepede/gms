package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dlvx;
import defpackage.ekvg;
import defpackage.ekvh;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class DataItemFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dlvx();
    public final Uri a;
    public final int b;

    public DataItemFilter(Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataItemFilter)) {
            return false;
        }
        DataItemFilter dataItemFilter = (DataItemFilter) obj;
        return Objects.equals(this.a, dataItemFilter.a) && this.b == dataItemFilter.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        ekvg b = ekvh.b(this);
        b.b("uri", this.a);
        b.f("filterType", this.b);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, uri, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
