package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acpy;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DeviceFeatureStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acpy();
    final int a;
    public final String b;
    public final boolean c;

    public DeviceFeatureStatus(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public final String toString() {
        return String.format("DeviceFeatureStatus{featureName=%s,enabled=%s}", this.b, Boolean.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public DeviceFeatureStatus(String str, boolean z) {
        this(1, str, z);
    }
}
