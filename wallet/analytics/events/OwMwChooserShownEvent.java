package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.digi;
import defpackage.divi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OwMwChooserShownEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR = new digi();

    public OwMwChooserShownEvent(String str) {
        this.m = str;
    }

    public static void a(Context context, String str) {
        divi.a(context, new OwMwChooserShownEvent(str));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public OwMwChooserShownEvent(Parcel parcel) {
        super(parcel);
    }
}
