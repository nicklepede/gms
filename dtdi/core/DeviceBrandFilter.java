package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aycq;
import defpackage.fvbo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DeviceBrandFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aycq();
    public final List a;
    public final List b;

    public DeviceBrandFilter(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceBrandFilter)) {
            return false;
        }
        DeviceBrandFilter deviceBrandFilter = (DeviceBrandFilter) obj;
        return fvbo.n(this.a, deviceBrandFilter.a) && fvbo.n(this.b, deviceBrandFilter.b);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = list == null ? 0 : list.hashCode();
        List list2 = this.b;
        return (hashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceBrandFilter(manufacturers=" + this.a + ", models=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.x(parcel, 1, list, false);
        arxc.x(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
