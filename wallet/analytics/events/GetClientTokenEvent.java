package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.dkqz;
import defpackage.dksd;
import defpackage.dldv;
import defpackage.ehqn;
import defpackage.eorl;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GetClientTokenEvent extends AnalyticsSessionStartEndEvent implements dksd {
    public static final Parcelable.Creator CREATOR = new dkqz();
    public final BuyFlowConfig c;
    public final eorl d;

    public GetClientTokenEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) parcel.readParcelable(GetClientTokenEvent.class.getClassLoader());
        this.d = (eorl) ehqn.f(parcel, (fgtg) eorl.a.iQ(7, null));
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

    public GetClientTokenEvent(BuyFlowConfig buyFlowConfig, eorl eorlVar) {
        this.m = dldv.a();
        this.c = buyFlowConfig;
        this.d = eorlVar;
        this.b = a(buyFlowConfig, this.a);
    }
}
