package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkrt;
import defpackage.dlgt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OwMwChooserShownEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR = new dkrt();

    public OwMwChooserShownEvent(String str) {
        this.m = str;
    }

    public static void a(Context context, String str) {
        dlgt.a(context, new OwMwChooserShownEvent(str));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public OwMwChooserShownEvent(Parcel parcel) {
        super(parcel);
    }
}
