package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.digr;
import defpackage.disk;
import defpackage.efdk;
import defpackage.emfs;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TapAndPayCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new digr();
    public final BuyFlowConfig c;
    public final emfs d;

    public TapAndPayCallEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) parcel.readParcelable(TapAndPayCallEvent.class.getClassLoader());
        this.d = (emfs) efdk.f(parcel, (feen) emfs.a.iB(7, null));
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

    public TapAndPayCallEvent(BuyFlowConfig buyFlowConfig, String str, emfs emfsVar) {
        this.m = disk.a();
        this.c = buyFlowConfig;
        this.a = str;
        this.d = emfsVar;
        this.b = a(buyFlowConfig, this.a);
    }
}
