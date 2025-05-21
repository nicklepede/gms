package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aycu;
import defpackage.fvbo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GetDevicesResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aycu();
    public final List a;
    public final AnalyticsInfo b;

    public GetDevicesResult(List list, AnalyticsInfo analyticsInfo) {
        fvbo.f(list, "devices");
        fvbo.f(analyticsInfo, "analyticsInfo");
        this.a = list;
        this.b = analyticsInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetDevicesResult)) {
            return false;
        }
        GetDevicesResult getDevicesResult = (GetDevicesResult) obj;
        return fvbo.n(this.a, getDevicesResult.a) && fvbo.n(this.b, getDevicesResult.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
