package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bzhp;
import defpackage.bzyx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes5.dex */
public class DeviceOrientationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bzyx();
    public static final DeviceOrientationRequest a = new bzhp().a();
    public final DeviceOrientationRequest b;

    public DeviceOrientationRequestInternal(DeviceOrientationRequest deviceOrientationRequest) {
        this.b = deviceOrientationRequest;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DeviceOrientationRequestInternal) {
            return arwb.b(this.b, ((DeviceOrientationRequestInternal) obj).b);
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
        int a2 = arxc.a(parcel);
        arxc.t(parcel, 1, this.b, i, false);
        arxc.c(parcel, a2);
    }
}
