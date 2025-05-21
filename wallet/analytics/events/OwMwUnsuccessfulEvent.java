package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.digj;
import defpackage.diks;
import defpackage.divi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OwMwUnsuccessfulEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new digj();
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final int g;

    public OwMwUnsuccessfulEvent(int i, int i2, int i3, int i4, String str, String str2) {
        this.m = str;
        this.c = i;
        this.g = i2;
        this.d = i3;
        this.e = i4;
        this.f = str2;
    }

    public static void b(Context context, int i, int i2, int i3, int i4, String str, String str2) {
        divi.a(context, new OwMwUnsuccessfulEvent(i, i2, i3, i4, str, str2));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.g - 1);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
    }

    public OwMwUnsuccessfulEvent(Parcel parcel) {
        super(parcel);
        this.c = parcel.readInt();
        this.g = diks.a(parcel.readInt());
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
    }
}
