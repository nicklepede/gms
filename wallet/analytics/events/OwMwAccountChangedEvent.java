package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.digh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OwMwAccountChangedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new digh();

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
