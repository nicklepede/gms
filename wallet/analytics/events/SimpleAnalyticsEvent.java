package com.google.android.gms.wallet.analytics.events;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.arwm;
import defpackage.digp;
import defpackage.disk;
import defpackage.divi;
import defpackage.efdk;
import defpackage.emef;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SimpleAnalyticsEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new digp();
    public final BuyFlowConfig c;
    public final emef d;

    public SimpleAnalyticsEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) parcel.readParcelable(IsReadyToPayCallEvent.class.getClassLoader());
        this.d = (emef) efdk.f(parcel, (feen) emef.a.iB(7, null));
    }

    public static void b(Context context, BuyFlowConfig buyFlowConfig, emef emefVar, Account account) {
        divi.a(context, new SimpleAnalyticsEvent(buyFlowConfig, emefVar, account));
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

    public SimpleAnalyticsEvent(BuyFlowConfig buyFlowConfig, emef emefVar, Account account) {
        arwm.c(1 == ((emefVar.b & 1) ^ 1), "Request info should not be specified!");
        this.m = disk.a();
        this.c = buyFlowConfig;
        this.d = emefVar;
        this.a = account != null ? account.name : null;
        this.b = a(buyFlowConfig, this.a);
    }
}
