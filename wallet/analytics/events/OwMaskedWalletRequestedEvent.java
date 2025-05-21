package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.digg;
import defpackage.disk;
import defpackage.divi;
import defpackage.djdi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OwMaskedWalletRequestedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new digg();
    public final BuyFlowConfig c;
    public final boolean d;

    public OwMaskedWalletRequestedEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) BuyFlowConfig.CREATOR.createFromParcel(parcel);
        this.d = parcel.readByte() == 1;
    }

    public static String b(Context context, String str, BuyFlowConfig buyFlowConfig, boolean z) {
        OwMaskedWalletRequestedEvent owMaskedWalletRequestedEvent = new OwMaskedWalletRequestedEvent(buyFlowConfig, str, z);
        divi.a(context, owMaskedWalletRequestedEvent);
        return owMaskedWalletRequestedEvent.m;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        djdi.a(this.c, parcel, i);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
    }

    public OwMaskedWalletRequestedEvent(BuyFlowConfig buyFlowConfig, String str, boolean z) {
        this.m = disk.a();
        this.a = str;
        this.b = a(buyFlowConfig, this.a);
        this.c = buyFlowConfig;
        this.d = z;
    }
}
