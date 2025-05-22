package com.google.android.gms.wallet.analytics.events;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.atzb;
import defpackage.dksa;
import defpackage.dldv;
import defpackage.dlgt;
import defpackage.ehqn;
import defpackage.eort;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SimpleAnalyticsEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new dksa();
    public final BuyFlowConfig c;
    public final eort d;

    public SimpleAnalyticsEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) parcel.readParcelable(IsReadyToPayCallEvent.class.getClassLoader());
        this.d = (eort) ehqn.f(parcel, (fgtg) eort.a.iQ(7, null));
    }

    public static void b(Context context, BuyFlowConfig buyFlowConfig, eort eortVar, Account account) {
        dlgt.a(context, new SimpleAnalyticsEvent(buyFlowConfig, eortVar, account));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
        ehqn.o(this.d, parcel);
    }

    public SimpleAnalyticsEvent(BuyFlowConfig buyFlowConfig, eort eortVar, Account account) {
        atzb.c(1 == ((eortVar.b & 1) ^ 1), "Request info should not be specified!");
        this.m = dldv.a();
        this.c = buyFlowConfig;
        this.d = eortVar;
        this.a = account != null ? account.name : null;
        this.b = a(buyFlowConfig, this.a);
    }
}
