package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkrs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OwMwAccountChangedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new dkrs();

    public OwMwAccountChangedEvent(String str, String str2) {
        this.m = str;
        this.a = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public OwMwAccountChangedEvent(Parcel parcel) {
        super(parcel);
    }
}
