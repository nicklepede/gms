package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bagu;
import defpackage.fxxm;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GetDevicesResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bagu();
    public final List a;
    public final AnalyticsInfo b;

    public GetDevicesResult(List list, AnalyticsInfo analyticsInfo) {
        fxxm.f(list, "devices");
        fxxm.f(analyticsInfo, "analyticsInfo");
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
        return fxxm.n(this.a, getDevicesResult.a) && fxxm.n(this.b, getDevicesResult.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
