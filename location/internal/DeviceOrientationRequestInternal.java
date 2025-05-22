package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cbqg;
import defpackage.ccho;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes5.dex */
public class DeviceOrientationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccho();
    public static final DeviceOrientationRequest a = new cbqg().a();
    public final DeviceOrientationRequest b;

    public DeviceOrientationRequestInternal(DeviceOrientationRequest deviceOrientationRequest) {
        this.b = deviceOrientationRequest;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DeviceOrientationRequestInternal) {
            return atyq.b(this.b, ((DeviceOrientationRequestInternal) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = atzr.a(parcel);
        atzr.t(parcel, 1, this.b, i, false);
        atzr.c(parcel, a2);
    }
}
