package com.google.android.gms.dtdi.discovery;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.DeviceFilter;
import defpackage.atzr;
import defpackage.bbiv;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbiv();
    public final DeviceFilter[] a;
    public final boolean b;
    public final int c;

    public DiscoveryParams(DeviceFilter[] deviceFilterArr, boolean z, int i) {
        fxxm.f(deviceFilterArr, "filters");
        this.a = deviceFilterArr;
        this.b = z;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        DeviceFilter[] deviceFilterArr = this.a;
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, deviceFilterArr, i);
        atzr.e(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
