package com.google.android.gms.wallet.analytics.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.difp;
import defpackage.disk;
import defpackage.efdk;
import defpackage.emea;
import defpackage.emfa;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class IsReadyToPayCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new difp();
    public final BuyFlowConfig c;
    public final emea d;
    public final emfa e;

    public IsReadyToPayCallEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) parcel.readParcelable(IsReadyToPayCallEvent.class.getClassLoader());
        this.d = (emea) efdk.f(parcel, (feen) emea.a.iB(7, null));
        this.e = (emfa) efdk.f(parcel, (feen) emfa.a.iB(7, null));
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
        efdk.o(this.e, parcel);
    }

    public IsReadyToPayCallEvent(BuyFlowConfig buyFlowConfig, emea emeaVar, String str, emfa emfaVar) {
        this.m = disk.a();
        this.c = buyFlowConfig;
        this.d = emeaVar;
        this.a = str;
        this.e = emfaVar;
        this.b = a(buyFlowConfig, str);
    }
}
