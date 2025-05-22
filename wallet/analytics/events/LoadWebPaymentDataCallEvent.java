package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.dkrc;
import defpackage.dldv;
import defpackage.dlgt;
import defpackage.ehqn;
import defpackage.eorq;
import defpackage.eoso;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LoadWebPaymentDataCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new dkrc();
    public final BuyFlowConfig c;
    public final eorq d;
    public final eoso e;

    public LoadWebPaymentDataCallEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) parcel.readParcelable(LoadWebPaymentDataCallEvent.class.getClassLoader());
        this.d = (eorq) ehqn.f(parcel, (fgtg) eorq.a.iQ(7, null));
        this.e = (eoso) ehqn.f(parcel, (fgtg) eoso.a.iQ(7, null));
    }

    public static void b(Context context, BuyFlowConfig buyFlowConfig, eorq eorqVar, String str, eoso eosoVar) {
        dlgt.a(context, new LoadWebPaymentDataCallEvent(buyFlowConfig, eorqVar, str, eosoVar));
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

    public LoadWebPaymentDataCallEvent(BuyFlowConfig buyFlowConfig, eorq eorqVar, String str, eoso eosoVar) {
        this.m = dldv.a();
        this.c = buyFlowConfig;
        this.d = eorqVar;
        this.a = str;
        this.e = eosoVar;
        this.b = a(buyFlowConfig, str);
    }
}
