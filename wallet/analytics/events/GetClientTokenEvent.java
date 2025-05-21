package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.difo;
import defpackage.digs;
import defpackage.disk;
import defpackage.efdk;
import defpackage.emdx;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GetClientTokenEvent extends AnalyticsSessionStartEndEvent implements digs {
    public static final Parcelable.Creator CREATOR = new difo();
    public final BuyFlowConfig c;
    public final emdx d;

    public GetClientTokenEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) parcel.readParcelable(GetClientTokenEvent.class.getClassLoader());
        this.d = (emdx) efdk.f(parcel, (feen) emdx.a.iB(7, null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent, com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
        efdk.o(this.d, parcel);
    }

    public GetClientTokenEvent(BuyFlowConfig buyFlowConfig, emdx emdxVar) {
        this.m = disk.a();
        this.c = buyFlowConfig;
        this.d = emdxVar;
        this.b = a(buyFlowConfig, this.a);
    }
}
