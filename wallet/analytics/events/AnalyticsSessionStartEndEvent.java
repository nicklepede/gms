package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public abstract class AnalyticsSessionStartEndEvent extends WalletAnalyticsEvent {
    public String a;
    public String b;

    public AnalyticsSessionStartEndEvent() {
    }

    protected static String a(BuyFlowConfig buyFlowConfig, String str) {
        return (buyFlowConfig != null ? buyFlowConfig.c() : null) + str + (buyFlowConfig != null ? buyFlowConfig.d : null);
    }

    @Override // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public AnalyticsSessionStartEndEvent(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
