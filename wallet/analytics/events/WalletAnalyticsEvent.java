package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public abstract class WalletAnalyticsEvent implements Parcelable {
    public String m;

    public WalletAnalyticsEvent() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
    }

    public WalletAnalyticsEvent(Parcel parcel) {
        this.m = parcel.readString();
    }
}
