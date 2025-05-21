package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.digk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OwUserFoundToHavePreAuthEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR = new digk();

    public OwUserFoundToHavePreAuthEvent(String str) {
        this.m = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public OwUserFoundToHavePreAuthEvent(Parcel parcel) {
        super(parcel);
    }
}
