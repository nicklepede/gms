package com.google.android.gms.dtdi.discovery;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.DeviceFilter;
import defpackage.arxc;
import defpackage.azet;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new azet();
    public final DeviceFilter[] a;
    public final boolean b;
    public final int c;

    public DiscoveryParams(DeviceFilter[] deviceFilterArr, boolean z, int i) {
        fvbo.f(deviceFilterArr, "filters");
        this.a = deviceFilterArr;
        this.b = z;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        DeviceFilter[] deviceFilterArr = this.a;
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, deviceFilterArr, i);
        arxc.e(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
