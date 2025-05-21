package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.difv;
import defpackage.diks;
import defpackage.divi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class OcrResultReceivedEvent extends WalletAnalyticsEvent {
    public static final Parcelable.Creator CREATOR = new difv();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public OcrResultReceivedEvent(int i, boolean z, boolean z2, boolean z3, String str) {
        this.m = str;
        this.d = i;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static void a(Context context, int i, boolean z, boolean z2, boolean z3, String str) {
        divi.a(context, new OcrResultReceivedEvent(i, z, z2, z3, str));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.d - 1);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
    }

    public OcrResultReceivedEvent(Parcel parcel) {
        super(parcel);
        this.d = diks.a(parcel.readInt());
        this.a = parcel.readByte() != 0;
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
    }
}
