package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import defpackage.dkqt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CreditCardEntryActionUpdatedEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR = new dkqt();
    public CreditCardEntryAction a;

    public CreditCardEntryActionUpdatedEvent(CreditCardEntryAction creditCardEntryAction, String str) {
        this.m = str;
        this.a = creditCardEntryAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, i);
    }

    public CreditCardEntryActionUpdatedEvent(Parcel parcel) {
        super(parcel);
        this.a = new CreditCardEntryAction();
        this.a = (CreditCardEntryAction) parcel.readParcelable(CreditCardEntryActionUpdatedEvent.class.getClassLoader());
    }
}
