package com.google.android.gms.wallet.analytics.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.difr;
import defpackage.disk;
import defpackage.divi;
import defpackage.efdk;
import defpackage.emec;
import defpackage.emfa;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LoadWebPaymentDataCallEvent extends AnalyticsSessionStartEndEvent {
    public static final Parcelable.Creator CREATOR = new difr();
    public final BuyFlowConfig c;
    public final emec d;
    public final emfa e;

    public LoadWebPaymentDataCallEvent(Parcel parcel) {
        super(parcel);
        this.c = (BuyFlowConfig) parcel.readParcelable(LoadWebPaymentDataCallEvent.class.getClassLoader());
        this.d = (emec) efdk.f(parcel, (feen) emec.a.iB(7, null));
        this.e = (emfa) efdk.f(parcel, (feen) emfa.a.iB(7, null));
    }

    public static void b(Context context, BuyFlowConfig buyFlowConfig, emec emecVar, String str, emfa emfaVar) {
        divi.a(context, new LoadWebPaymentDataCallEvent(buyFlowConfig, emecVar, str, emfaVar));
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

    public LoadWebPaymentDataCallEvent(BuyFlowConfig buyFlowConfig, emec emecVar, String str, emfa emfaVar) {
        this.m = disk.a();
        this.c = buyFlowConfig;
        this.d = emecVar;
        this.a = str;
        this.e = emfaVar;
        this.b = a(buyFlowConfig, str);
    }
}
