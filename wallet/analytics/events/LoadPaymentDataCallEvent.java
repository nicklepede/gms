package com.google.android.gms.wallet.analytics.events;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.dkrb;
import defpackage.dldv;
import defpackage.dlgt;
import defpackage.ehqn;
import defpackage.eorp;
import defpackage.eoso;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LoadPaymentDataCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new dkrb();
    public final BuyFlowConfig c;
    public final eorp d;
    public final eoso e;

    public LoadPaymentDataCallEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) parcel.readParcelable(LoadPaymentDataCallEvent.class.getClassLoader());
        this.d = (eorp) ehqn.f(parcel, (fgtg) eorp.a.iQ(7, null));
        this.e = (eoso) ehqn.f(parcel, (fgtg) eoso.a.iQ(7, null));
    }

    public static void b(Context context, BuyFlowConfig buyFlowConfig, eorp eorpVar, eoso eosoVar) {
        dlgt.a(context, new LoadPaymentDataCallEvent(buyFlowConfig, eorpVar, eosoVar));
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
        ehqn.o(this.e, parcel);
    }

    public LoadPaymentDataCallEvent(BuyFlowConfig buyFlowConfig, eorp eorpVar, eoso eosoVar) {
        ApplicationParameters applicationParameters;
        this.m = dldv.a();
        this.c = buyFlowConfig;
        this.d = eorpVar;
        this.e = eosoVar;
        if (buyFlowConfig != null && (applicationParameters = buyFlowConfig.b) != null) {
            Account account = applicationParameters.b;
            this.a = account != null ? account.name : null;
        }
        this.b = a(buyFlowConfig, this.a);
    }
}
