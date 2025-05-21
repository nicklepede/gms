package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.digf;
import defpackage.divi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OwMaskedWalletReceivedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new digf();
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;

    public OwMaskedWalletReceivedEvent(int i, String str, String str2, int i2) {
        this.m = str2;
        this.c = false;
        this.d = i;
        this.e = str;
        this.f = i2;
    }

    public static void b(Context context, int i, String str, String str2, int i2) {
        divi.a(context, new OwMaskedWalletReceivedEvent(i, str, str2, i2));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }

    public OwMaskedWalletReceivedEvent(Parcel parcel) {
        super(parcel);
        this.c = parcel.readByte() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.readInt();
    }
}
