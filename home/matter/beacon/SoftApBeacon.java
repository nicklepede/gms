package com.google.android.gms.home.matter.beacon;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.home.matter.commissioning.DeviceInfo;
import defpackage.arxc;
import defpackage.blaa;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SoftApBeacon extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new blaa();
    public final DeviceInfo a;

    public SoftApBeacon(DeviceInfo deviceInfo) {
        this.a = deviceInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SoftApBeacon) {
            return this.a.equals(((SoftApBeacon) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DeviceInfo deviceInfo = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, deviceInfo, i, false);
        arxc.c(parcel, a);
    }
}
