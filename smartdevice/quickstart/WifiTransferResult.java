package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ddyc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WifiTransferResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ddyc();
    public final WifiNetworkDetails a;

    public WifiTransferResult(WifiNetworkDetails wifiNetworkDetails) {
        this.a = wifiNetworkDetails;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        WifiNetworkDetails wifiNetworkDetails = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, wifiNetworkDetails, i, false);
        arxc.c(parcel, a);
    }
}
