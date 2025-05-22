package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dgjg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WifiTransferResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dgjg();
    public final WifiNetworkDetails a;

    public WifiTransferResult(WifiNetworkDetails wifiNetworkDetails) {
        this.a = wifiNetworkDetails;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        WifiNetworkDetails wifiNetworkDetails = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, wifiNetworkDetails, i, false);
        atzr.c(parcel, a);
    }
}
