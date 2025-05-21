package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
