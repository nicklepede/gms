package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.difk;
import defpackage.disk;
import defpackage.divi;
import defpackage.djdi;
import defpackage.emdo;
import defpackage.emen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CreditCardEntryLaunchedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new difk();
    public final String c;
    public final BuyFlowConfig d;
    public final emen e;
    public final int f;

    public CreditCardEntryLaunchedEvent(Parcel parcel) {
        super(parcel);
        this.c = parcel.readString();
        int a = emdo.a(parcel.readInt());
        if (a == 0) {
            this.f = 1;
        } else {
            this.f = a;
        }
        this.d = (BuyFlowConfig) BuyFlowConfig.CREATOR.createFromParcel(parcel);
        emen b = emen.b(parcel.readInt());
        if (b == null) {
            this.e = emen.FLOW_TYPE_UNKNOWN;
        } else {
            this.e = b;
        }
    }

    public static String b(Context context, BuyFlowConfig buyFlowConfig, String str, emen emenVar) {
        CreditCardEntryLaunchedEvent creditCardEntryLaunchedEvent = new CreditCardEntryLaunchedEvent(buyFlowConfig, str, emenVar);
        divi.a(context, creditCardEntryLaunchedEvent);
        return creditCardEntryLaunchedEvent.m;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.f - 1);
        djdi.a(this.d, parcel, i);
        parcel.writeInt(this.e.s);
    }

    public CreditCardEntryLaunchedEvent(BuyFlowConfig buyFlowConfig, String str, emen emenVar) {
        this.m = disk.a();
        this.c = "orchBuyFlow";
        this.d = buyFlowConfig;
        this.f = 7;
        this.e = emenVar;
        this.a = str;
        this.b = a(buyFlowConfig, this.a);
    }
}
