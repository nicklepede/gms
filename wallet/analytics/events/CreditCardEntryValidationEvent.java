package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkqx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CreditCardEntryValidationEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR = new dkqx();
    public final boolean a;
    public final boolean b;

    public CreditCardEntryValidationEvent(boolean z, boolean z2, String str) {
        this.m = str;
        this.a = z;
        this.b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
    }

    public CreditCardEntryValidationEvent(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() != 0;
        this.b = parcel.readByte() != 0;
    }
}
