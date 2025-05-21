package com.google.android.gms.smartdevice.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.deog;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ConnectToWifiNetworkResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new deog();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ConnectToWifiNetworkResponse);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        arxc.c(parcel, arxc.a(parcel));
    }
}
