package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aycr;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DeviceFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aycr();
    public final String a;
    public final Integer b;
    public final DeviceBrandFilter c;

    public DeviceFilter(String str, Integer num, DeviceBrandFilter deviceBrandFilter) {
        this.a = str;
        this.b = num;
        this.c = deviceBrandFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFilter)) {
            return false;
        }
        DeviceFilter deviceFilter = (DeviceFilter) obj;
        return fvbo.n(this.a, deviceFilter.a) && fvbo.n(this.b, deviceFilter.b) && fvbo.n(this.c, deviceFilter.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int i = hashCode * 31;
        DeviceBrandFilter deviceBrandFilter = this.c;
        return ((i + hashCode2) * 31) + (deviceBrandFilter != null ? deviceBrandFilter.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceFilter(featureFilter=" + this.a + ", trustRelationshipFilter=" + this.b + ", deviceBrandFilter=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.F(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}
