package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.dkqv;
import defpackage.dldv;
import defpackage.dlgt;
import defpackage.dlpb;
import defpackage.eorc;
import defpackage.eosb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CreditCardEntryLaunchedEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new dkqv();
    public final String c;
    public final BuyFlowConfig d;
    public final eosb e;
    public final int f;

    public CreditCardEntryLaunchedEvent(Parcel parcel) {
        super(parcel);
        this.c = parcel.readString();
        int a = eorc.a(parcel.readInt());
        if (a == 0) {
            this.f = 1;
        } else {
            this.f = a;
        }
        this.d = (BuyFlowConfig) BuyFlowConfig.CREATOR.createFromParcel(parcel);
        eosb b = eosb.b(parcel.readInt());
        if (b == null) {
            this.e = eosb.FLOW_TYPE_UNKNOWN;
        } else {
            this.e = b;
        }
    }

    public static String b(Context context, BuyFlowConfig buyFlowConfig, String str, eosb eosbVar) {
        CreditCardEntryLaunchedEvent creditCardEntryLaunchedEvent = new CreditCardEntryLaunchedEvent(buyFlowConfig, str, eosbVar);
        dlgt.a(context, creditCardEntryLaunchedEvent);
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
        dlpb.a(this.d, parcel, i);
        parcel.writeInt(this.e.s);
    }

    public CreditCardEntryLaunchedEvent(BuyFlowConfig buyFlowConfig, String str, eosb eosbVar) {
        this.m = dldv.a();
        this.c = "orchBuyFlow";
        this.d = buyFlowConfig;
        this.f = 7;
        this.e = eosbVar;
        this.a = str;
        this.b = a(buyFlowConfig, this.a);
    }
}
