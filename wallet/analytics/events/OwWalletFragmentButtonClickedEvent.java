package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.digl;
import defpackage.disk;
import defpackage.djdi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OwWalletFragmentButtonClickedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new digl();
    public final BuyFlowConfig c;
    public final int d;

    public OwWalletFragmentButtonClickedEvent(Parcel parcel) {
        super(parcel);
        this.d = parcel.readInt();
        this.c = (BuyFlowConfig) BuyFlowConfig.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.d);
        djdi.a(this.c, parcel, i);
    }

    public OwWalletFragmentButtonClickedEvent(BuyFlowConfig buyFlowConfig, String str, int i) {
        this.m = disk.a();
        this.a = str;
        this.b = a(buyFlowConfig, this.a);
        this.d = i;
        this.c = buyFlowConfig;
    }
}
