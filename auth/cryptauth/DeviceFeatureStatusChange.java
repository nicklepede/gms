package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aapx;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DeviceFeatureStatusChange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aapx();
    final int a;
    public final DeviceFeatureStatus b;
    public final boolean c;

    public DeviceFeatureStatusChange(int i, DeviceFeatureStatus deviceFeatureStatus, boolean z) {
        this.a = i;
        this.b = deviceFeatureStatus;
        this.c = z;
    }

    public final String toString() {
        return String.format("DeviceFeatureStatusChange{deviceFeatureStatus=%s,shouldEnableExclusively=%s}", this.b, Boolean.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.e(parcel, 3, this.c);
        arxc.c(parcel, a);
    }

    public DeviceFeatureStatusChange(DeviceFeatureStatus deviceFeatureStatus, boolean z) {
        this(1, deviceFeatureStatus, z);
    }
}
