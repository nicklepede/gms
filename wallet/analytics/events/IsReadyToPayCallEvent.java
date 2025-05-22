package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.dkra;
import defpackage.dldv;
import defpackage.ehqn;
import defpackage.eoro;
import defpackage.eoso;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class IsReadyToPayCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new dkra();
    public final BuyFlowConfig c;
    public final eoro d;
    public final eoso e;

    public IsReadyToPayCallEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) parcel.readParcelable(IsReadyToPayCallEvent.class.getClassLoader());
        this.d = (eoro) ehqn.f(parcel, (fgtg) eoro.a.iQ(7, null));
        this.e = (eoso) ehqn.f(parcel, (fgtg) eoso.a.iQ(7, null));
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

    public IsReadyToPayCallEvent(BuyFlowConfig buyFlowConfig, eoro eoroVar, String str, eoso eosoVar) {
        this.m = dldv.a();
        this.c = buyFlowConfig;
        this.d = eoroVar;
        this.a = str;
        this.e = eosoVar;
        this.b = a(buyFlowConfig, str);
    }
}
