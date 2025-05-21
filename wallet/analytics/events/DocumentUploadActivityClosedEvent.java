package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.difn;
import defpackage.diks;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class DocumentUploadActivityClosedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new difn();
    public final int c;

    public DocumentUploadActivityClosedEvent(int i, String str) {
        this.m = str;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c - 1);
    }

    public DocumentUploadActivityClosedEvent(Parcel parcel) {
        super(parcel);
        this.c = diks.a(parcel.readInt());
    }
}
