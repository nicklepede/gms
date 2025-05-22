package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acpx;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DeviceFeatureStatusChange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acpx();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.e(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public DeviceFeatureStatusChange(DeviceFeatureStatus deviceFeatureStatus, boolean z) {
        this(1, deviceFeatureStatus, z);
    }
}
