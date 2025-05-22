package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.dksc;
import defpackage.dldv;
import defpackage.ehqn;
import defpackage.eotg;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TapAndPayCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new dksc();
    public final BuyFlowConfig c;
    public final eotg d;

    public TapAndPayCallEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) parcel.readParcelable(TapAndPayCallEvent.class.getClassLoader());
        this.d = (eotg) ehqn.f(parcel, (fgtg) eotg.a.iQ(7, null));
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

    public TapAndPayCallEvent(BuyFlowConfig buyFlowConfig, String str, eotg eotgVar) {
        this.m = dldv.a();
        this.c = buyFlowConfig;
        this.a = str;
        this.d = eotgVar;
        this.b = a(buyFlowConfig, this.a);
    }
}
