package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkrv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OwUserFoundToHavePreAuthEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR = new dkrv();

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
