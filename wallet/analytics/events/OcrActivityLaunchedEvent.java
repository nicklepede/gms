package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkre;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OcrActivityLaunchedEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR = new dkre();

    public OcrActivityLaunchedEvent(String str) {
        this.m = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public OcrActivityLaunchedEvent(Parcel parcel) {
        super(parcel);
    }
}
