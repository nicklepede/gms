package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.dkro;
import defpackage.dksd;
import defpackage.dkwd;
import defpackage.dldv;
import defpackage.dlgt;
import defpackage.dlpb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OwFullWalletRequestedEvent extends AnalyticsSessionStartEndEvent implements dksd {
    public static final Parcelable.Creator CREATOR = new dkro();
    public final BuyFlowConfig c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final long i;
    public final int j;
    public final String k;
    public final int l;

    public OwFullWalletRequestedEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) BuyFlowConfig.CREATOR.createFromParcel(parcel);
        this.l = dkwd.a(parcel.readInt());
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readByte() != 0;
        this.i = parcel.readLong();
        this.j = parcel.readInt();
        this.k = parcel.readString();
    }

    public static void b(Context context, BuyFlowConfig buyFlowConfig, int i, int i2, int i3, int i4, long j, int i5, String str, String str2) {
        dlgt.a(context, new OwFullWalletRequestedEvent(buyFlowConfig, i, i2, i3, i4, j, i5, str, str2));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        dlpb.a(this.c, parcel, i);
        parcel.writeInt(this.l - 1);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
    }

    public OwFullWalletRequestedEvent(BuyFlowConfig buyFlowConfig, int i, int i2, int i3, int i4, long j, int i5, String str, String str2) {
        this.l = i;
        this.d = i2;
        this.e = 1;
        this.f = i3;
        this.g = i4;
        this.h = false;
        this.i = j;
        this.j = i5;
        this.a = str;
        this.b = a(buyFlowConfig, this.a);
        this.m = dldv.a();
        this.c = buyFlowConfig;
        this.k = str2;
    }
}
